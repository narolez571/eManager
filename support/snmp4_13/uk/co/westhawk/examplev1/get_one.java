// NAME
//      $RCSfile: get_one.java,v $
// DESCRIPTION
//      [given below in javadoc format]
// DELTA
//      $Revision: 1.2 $
// CREATED
//      $Date: 2002/10/22 16:34:15 $
// COPYRIGHT
//      Westhawk Ltd
// TO DO
//

/*
 * Copyright (C) 1996, 1997, 1998, 1999, 2000, 2001, 2002 by Westhawk Ltd (www.westhawk.co.uk)
 *
 * Permission to use, copy, modify, and distribute this software
 * for any purpose and without fee is hereby granted, provided
 * that the above copyright notices appear in all copies and that
 * both the copyright notice and this permission notice appear in
 * supporting documentation.
 * This software is provided "as is" without express or implied
 * warranty.
 * author <a href="mailto:snmp@westhawk.co.uk">Tim Panton</a>
 */

package uk.co.westhawk.examplev1;

import java.awt.*; 
import java.awt.event.*; 
import java.util.*;
import javax.swing.*;

import uk.co.westhawk.snmp.stack.*;
import uk.co.westhawk.snmp.pdu.*;

/**
 * <p>
 * The get_one application will use the OneGetNextPdu to request a MIB
 * variable. 
 * </p>
 *
 * <p>
 * The user can configure all parameters in the 
 * properties file. 
 * The name of the properties file can be passed as first argument to
 * this application. If there is no such argument, it will look for
 * <code>get_one.properties</code>. If this file does not exist, the
 * application will use default parameters.
 * </p>
 *
 *
 * @see uk.co.westhawk.snmp.pdu.OneGetNextPdu
 * @author <a href="mailto:snmp@westhawk.co.uk">Birgit Arkesteijn</a>
 * @version $Revision: 1.2 $ $Date: 2002/10/22 16:34:15 $
 */
public class get_one extends JComponent 
        implements Runnable, Observer
{
    private static final String     version_id =
        "@(#)$Id: get_one.java,v 1.2 2002/10/22 16:34:15 birgit Exp $ Copyright Westhawk Ltd";

    public final static String NAME = "name";
    public final static String sysContactOid = "1.3.6.1.2.1.1.4.0";
    public final static String sysContactName = "sysContact";
    public final static int interval = 3000;

    private Thread kick = null;
    private boolean suspended = false;
    private SnmpContext context;
    private String oid = "";
    private JLabel valueL;
    private boolean isRunning = false;

    private Util util;

/**
 * Constructor.
 *
 * @param propertiesFilename The name of the properties file. Can be
 * null.
 */
public get_one(String propertiesFilename)
{
    util = new Util(propertiesFilename, this.getClass().getName());
}

public void init () 
{
    //AsnObject.setDebug(15);
    String host = util.getHost();
    String comm = util.getCommunity();
    String socketType = util.getSocketType();

    String name = util.getProperty(NAME, sysContactName);
    oid = util.getOid(sysContactOid);
    int port = util.getPort(SnmpContextBasisFace.DEFAULT_PORT);

    try 
    {
        context = new SnmpContext(host,port);
        context.setCommunity(comm);
        makeLayout(host, name, oid, port);
    }
    catch ( java.io.IOException e )
    {
        System.out.println("IO exception:" + e.getMessage());
        System.exit(0);
    }
}

/**
 * Implementing the Observer interface. Receiving the response from 
 * the Pdu.
 *
 * @param obs the OneGetNextPdu variable
 * @param ov the varbind
 *
 * @see uk.co.westhawk.snmp.pdu.OneGetNextPdu
 * @see uk.co.westhawk.snmp.stack.varbind
 */
public void update(Observable obs, Object ov)
{
    Pdu pdu = (Pdu) obs;
    if (pdu.getErrorStatus() == AsnObject.SNMP_ERR_NOERROR)
    {
        varbind var = (varbind) ov;
        if (var != null)
        {
            valueL.setText(var.toString());
        }
    }
}

public void run()
{
    while (isRunning)
    {
        try
        {
            OneGetNextPdu pdu = new OneGetNextPdu(context, oid, this);
        }
        catch (java.io.IOException exc)
        {
            valueL.setText("IOException " + exc.getMessage());
        }
        catch (uk.co.westhawk.snmp.stack.PduException exc)
        {
            valueL.setText("PduException " + exc.getMessage());
        }

        try 
        {
            Thread.sleep(interval);
        }
        catch (java.lang.InterruptedException e)
        {
        }
    }
    
}

public void start()
{
    if (kick == null)
    {
        isRunning = true;
        kick = new Thread(this);
        kick.setPriority(Thread.MIN_PRIORITY);
        kick.start();
    }
}

public synchronized void stop() 
{
    if (kick != null)
    {
        isRunning = false;
        kick = null;
    }
    context.destroy();
}


private void makeLayout(String host, String name, String oid, int port)
{
    JLabel lhost, lname, lstatus, lport;

    lhost = new JLabel("Host: " + host);
    lname = new JLabel("OID: " + name + " (" + oid + ")");
    lport =  new JLabel("Port: " + port);
    lstatus =  new JLabel("Value: ");

    valueL = new JLabel("unknown");

    setLayout(new GridLayout(6,1));

    this.add(lhost);
    this.add(lport);
    this.add(lname);
    this.add(lstatus);
    this.add(valueL);

    lstatus.setBackground(Color.red);
    valueL.setBackground(Color.yellow);
}

public static void main(String[] args)
{
    String propFileName = null;
    if (args.length > 0)
    {
        propFileName = args[0];
    }
    get_one application = new get_one(propFileName);

    JFrame frame = new JFrame();
    frame.setTitle(application.getClass().getName());
    frame.getContentPane().add(application, BorderLayout.CENTER);
    application.init();

    frame.addWindowListener(new WindowAdapter()
    {
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    });
    frame.setBounds(50, 50, 400, 150);
    frame.setVisible(true);
    application.start();
}

}
