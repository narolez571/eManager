/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.5.2</a>, using an XML
 * Schema.
 * $Id$
 */

package com.cisco.eManager.common.inventory2;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class PvRspGetChildren.
 * 
 * @version $Revision$ $Date$
 */
public class PvRspGetChildren implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _containerNodesList
     */
    private java.util.Vector _containerNodesList;

    /**
     * Field _hostNodesList
     */
    private java.util.Vector _hostNodesList;

    /**
     * Field _appInstanceNodesList
     */
    private java.util.Vector _appInstanceNodesList;


      //----------------/
     //- Constructors -/
    //----------------/

    public PvRspGetChildren() {
        super();
        _containerNodesList = new Vector();
        _hostNodesList = new Vector();
        _appInstanceNodesList = new Vector();
    } //-- com.cisco.eManager.common.inventory2.PvRspGetChildren()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAppInstanceNodes
     * 
     * @param vAppInstanceNodes
     */
    public void addAppInstanceNodes(com.cisco.eManager.common.inventory2.AppInstanceNode vAppInstanceNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        _appInstanceNodesList.addElement(vAppInstanceNodes);
    } //-- void addAppInstanceNodes(com.cisco.eManager.common.inventory2.AppInstanceNode) 

    /**
     * Method addAppInstanceNodes
     * 
     * @param index
     * @param vAppInstanceNodes
     */
    public void addAppInstanceNodes(int index, com.cisco.eManager.common.inventory2.AppInstanceNode vAppInstanceNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        _appInstanceNodesList.insertElementAt(vAppInstanceNodes, index);
    } //-- void addAppInstanceNodes(int, com.cisco.eManager.common.inventory2.AppInstanceNode) 

    /**
     * Method addContainerNodes
     * 
     * @param vContainerNodes
     */
    public void addContainerNodes(com.cisco.eManager.common.inventory2.ContainerNode vContainerNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        _containerNodesList.addElement(vContainerNodes);
    } //-- void addContainerNodes(com.cisco.eManager.common.inventory2.ContainerNode) 

    /**
     * Method addContainerNodes
     * 
     * @param index
     * @param vContainerNodes
     */
    public void addContainerNodes(int index, com.cisco.eManager.common.inventory2.ContainerNode vContainerNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        _containerNodesList.insertElementAt(vContainerNodes, index);
    } //-- void addContainerNodes(int, com.cisco.eManager.common.inventory2.ContainerNode) 

    /**
     * Method addHostNodes
     * 
     * @param vHostNodes
     */
    public void addHostNodes(com.cisco.eManager.common.inventory2.HostNode vHostNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        _hostNodesList.addElement(vHostNodes);
    } //-- void addHostNodes(com.cisco.eManager.common.inventory2.HostNode) 

    /**
     * Method addHostNodes
     * 
     * @param index
     * @param vHostNodes
     */
    public void addHostNodes(int index, com.cisco.eManager.common.inventory2.HostNode vHostNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        _hostNodesList.insertElementAt(vHostNodes, index);
    } //-- void addHostNodes(int, com.cisco.eManager.common.inventory2.HostNode) 

    /**
     * Method enumerateAppInstanceNodes
     */
    public java.util.Enumeration enumerateAppInstanceNodes()
    {
        return _appInstanceNodesList.elements();
    } //-- java.util.Enumeration enumerateAppInstanceNodes() 

    /**
     * Method enumerateContainerNodes
     */
    public java.util.Enumeration enumerateContainerNodes()
    {
        return _containerNodesList.elements();
    } //-- java.util.Enumeration enumerateContainerNodes() 

    /**
     * Method enumerateHostNodes
     */
    public java.util.Enumeration enumerateHostNodes()
    {
        return _hostNodesList.elements();
    } //-- java.util.Enumeration enumerateHostNodes() 

    /**
     * Method getAppInstanceNodes
     * 
     * @param index
     */
    public com.cisco.eManager.common.inventory2.AppInstanceNode getAppInstanceNodes(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _appInstanceNodesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.cisco.eManager.common.inventory2.AppInstanceNode) _appInstanceNodesList.elementAt(index);
    } //-- com.cisco.eManager.common.inventory2.AppInstanceNode getAppInstanceNodes(int) 

    /**
     * Method getAppInstanceNodes
     */
    public com.cisco.eManager.common.inventory2.AppInstanceNode[] getAppInstanceNodes()
    {
        int size = _appInstanceNodesList.size();
        com.cisco.eManager.common.inventory2.AppInstanceNode[] mArray = new com.cisco.eManager.common.inventory2.AppInstanceNode[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.cisco.eManager.common.inventory2.AppInstanceNode) _appInstanceNodesList.elementAt(index);
        }
        return mArray;
    } //-- com.cisco.eManager.common.inventory2.AppInstanceNode[] getAppInstanceNodes() 

    /**
     * Method getAppInstanceNodesCount
     */
    public int getAppInstanceNodesCount()
    {
        return _appInstanceNodesList.size();
    } //-- int getAppInstanceNodesCount() 

    /**
     * Method getContainerNodes
     * 
     * @param index
     */
    public com.cisco.eManager.common.inventory2.ContainerNode getContainerNodes(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _containerNodesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.cisco.eManager.common.inventory2.ContainerNode) _containerNodesList.elementAt(index);
    } //-- com.cisco.eManager.common.inventory2.ContainerNode getContainerNodes(int) 

    /**
     * Method getContainerNodes
     */
    public com.cisco.eManager.common.inventory2.ContainerNode[] getContainerNodes()
    {
        int size = _containerNodesList.size();
        com.cisco.eManager.common.inventory2.ContainerNode[] mArray = new com.cisco.eManager.common.inventory2.ContainerNode[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.cisco.eManager.common.inventory2.ContainerNode) _containerNodesList.elementAt(index);
        }
        return mArray;
    } //-- com.cisco.eManager.common.inventory2.ContainerNode[] getContainerNodes() 

    /**
     * Method getContainerNodesCount
     */
    public int getContainerNodesCount()
    {
        return _containerNodesList.size();
    } //-- int getContainerNodesCount() 

    /**
     * Method getHostNodes
     * 
     * @param index
     */
    public com.cisco.eManager.common.inventory2.HostNode getHostNodes(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _hostNodesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (com.cisco.eManager.common.inventory2.HostNode) _hostNodesList.elementAt(index);
    } //-- com.cisco.eManager.common.inventory2.HostNode getHostNodes(int) 

    /**
     * Method getHostNodes
     */
    public com.cisco.eManager.common.inventory2.HostNode[] getHostNodes()
    {
        int size = _hostNodesList.size();
        com.cisco.eManager.common.inventory2.HostNode[] mArray = new com.cisco.eManager.common.inventory2.HostNode[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (com.cisco.eManager.common.inventory2.HostNode) _hostNodesList.elementAt(index);
        }
        return mArray;
    } //-- com.cisco.eManager.common.inventory2.HostNode[] getHostNodes() 

    /**
     * Method getHostNodesCount
     */
    public int getHostNodesCount()
    {
        return _hostNodesList.size();
    } //-- int getHostNodesCount() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllAppInstanceNodes
     */
    public void removeAllAppInstanceNodes()
    {
        _appInstanceNodesList.removeAllElements();
    } //-- void removeAllAppInstanceNodes() 

    /**
     * Method removeAllContainerNodes
     */
    public void removeAllContainerNodes()
    {
        _containerNodesList.removeAllElements();
    } //-- void removeAllContainerNodes() 

    /**
     * Method removeAllHostNodes
     */
    public void removeAllHostNodes()
    {
        _hostNodesList.removeAllElements();
    } //-- void removeAllHostNodes() 

    /**
     * Method removeAppInstanceNodes
     * 
     * @param index
     */
    public com.cisco.eManager.common.inventory2.AppInstanceNode removeAppInstanceNodes(int index)
    {
        java.lang.Object obj = _appInstanceNodesList.elementAt(index);
        _appInstanceNodesList.removeElementAt(index);
        return (com.cisco.eManager.common.inventory2.AppInstanceNode) obj;
    } //-- com.cisco.eManager.common.inventory2.AppInstanceNode removeAppInstanceNodes(int) 

    /**
     * Method removeContainerNodes
     * 
     * @param index
     */
    public com.cisco.eManager.common.inventory2.ContainerNode removeContainerNodes(int index)
    {
        java.lang.Object obj = _containerNodesList.elementAt(index);
        _containerNodesList.removeElementAt(index);
        return (com.cisco.eManager.common.inventory2.ContainerNode) obj;
    } //-- com.cisco.eManager.common.inventory2.ContainerNode removeContainerNodes(int) 

    /**
     * Method removeHostNodes
     * 
     * @param index
     */
    public com.cisco.eManager.common.inventory2.HostNode removeHostNodes(int index)
    {
        java.lang.Object obj = _hostNodesList.elementAt(index);
        _hostNodesList.removeElementAt(index);
        return (com.cisco.eManager.common.inventory2.HostNode) obj;
    } //-- com.cisco.eManager.common.inventory2.HostNode removeHostNodes(int) 

    /**
     * Method setAppInstanceNodes
     * 
     * @param index
     * @param vAppInstanceNodes
     */
    public void setAppInstanceNodes(int index, com.cisco.eManager.common.inventory2.AppInstanceNode vAppInstanceNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _appInstanceNodesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _appInstanceNodesList.setElementAt(vAppInstanceNodes, index);
    } //-- void setAppInstanceNodes(int, com.cisco.eManager.common.inventory2.AppInstanceNode) 

    /**
     * Method setAppInstanceNodes
     * 
     * @param appInstanceNodesArray
     */
    public void setAppInstanceNodes(com.cisco.eManager.common.inventory2.AppInstanceNode[] appInstanceNodesArray)
    {
        //-- copy array
        _appInstanceNodesList.removeAllElements();
        for (int i = 0; i < appInstanceNodesArray.length; i++) {
            _appInstanceNodesList.addElement(appInstanceNodesArray[i]);
        }
    } //-- void setAppInstanceNodes(com.cisco.eManager.common.inventory2.AppInstanceNode) 

    /**
     * Method setContainerNodes
     * 
     * @param index
     * @param vContainerNodes
     */
    public void setContainerNodes(int index, com.cisco.eManager.common.inventory2.ContainerNode vContainerNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _containerNodesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _containerNodesList.setElementAt(vContainerNodes, index);
    } //-- void setContainerNodes(int, com.cisco.eManager.common.inventory2.ContainerNode) 

    /**
     * Method setContainerNodes
     * 
     * @param containerNodesArray
     */
    public void setContainerNodes(com.cisco.eManager.common.inventory2.ContainerNode[] containerNodesArray)
    {
        //-- copy array
        _containerNodesList.removeAllElements();
        for (int i = 0; i < containerNodesArray.length; i++) {
            _containerNodesList.addElement(containerNodesArray[i]);
        }
    } //-- void setContainerNodes(com.cisco.eManager.common.inventory2.ContainerNode) 

    /**
     * Method setHostNodes
     * 
     * @param index
     * @param vHostNodes
     */
    public void setHostNodes(int index, com.cisco.eManager.common.inventory2.HostNode vHostNodes)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _hostNodesList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _hostNodesList.setElementAt(vHostNodes, index);
    } //-- void setHostNodes(int, com.cisco.eManager.common.inventory2.HostNode) 

    /**
     * Method setHostNodes
     * 
     * @param hostNodesArray
     */
    public void setHostNodes(com.cisco.eManager.common.inventory2.HostNode[] hostNodesArray)
    {
        //-- copy array
        _hostNodesList.removeAllElements();
        for (int i = 0; i < hostNodesArray.length; i++) {
            _hostNodesList.addElement(hostNodesArray[i]);
        }
    } //-- void setHostNodes(com.cisco.eManager.common.inventory2.HostNode) 

    /**
     * Method unmarshalPvRspGetChildren
     * 
     * @param reader
     */
    public static java.lang.Object unmarshalPvRspGetChildren(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.cisco.eManager.common.inventory2.PvRspGetChildren) Unmarshaller.unmarshal(com.cisco.eManager.common.inventory2.PvRspGetChildren.class, reader);
    } //-- java.lang.Object unmarshalPvRspGetChildren(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}