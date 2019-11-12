/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing;

import KeywordDrivenTestFramework.Utilities.WebServiceDriverUtility;
import KeywordDrivenTestFramework.Utilities.XMLUtility;
import org.junit.Test;

/**
 *
 * @author sbeck
 */
public class SoapUITest
{

    @Test
    public void WSDLConnect()
    {
        //Saves the WSDL
        String WSDL = "http://graphical.weather.gov/xml/SOAP_server/ndfdXMLserver.php?wsdl";
        //Initialises Utilities
        WebServiceDriverUtility wsUtil = new WebServiceDriverUtility();
        XMLUtility xmlUtil = new XMLUtility();
        //Imports the WSDL
        wsUtil.ImportWSDL(WSDL);
        //Gets the Operations in the WSDL
        wsUtil.GetWSDLOperation("CornerPoints");

        System.out.println("[Info]Attempting to submit a request");
        //Creates an XML doc using the XML string
        xmlUtil.parseSOAPXML("<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ndf=\"http://graphical.weather.gov/xml/DWMLgen/wsdl/ndfdXML.wsdl\">\n"
                + "   <soapenv:Header/>\n"
                + "   <soapenv:Body>\n"
                + "      <ndf:LatLonListCityNames soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n"
                + "         <displayLevel xsi:type=\"xsd:integer\">Boston</displayLevel>\n"
                + "      </ndf:LatLonListCityNames>\n"
                + "   </soapenv:Body>\n"
                + "</soapenv:Envelope>");
        
        System.out.println("[Info]Attempting to submit a request");
        //Submits the doc as a request, and receives a response
        xmlUtil.parseSOAPXML(wsUtil.SubmitRequest(xmlUtil.returnDocumentXMLAsString()));

        System.out.println("[Info]Request submitted successfully ");
    }
}
