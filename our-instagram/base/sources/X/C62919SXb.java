package X;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* renamed from: X.SXb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62919SXb {
    public static final C62919SXb A00 = new Object();

    public final void A00(C60782q2 c60782q2) {
        String str;
        try {
            String A0N = c60782q2.A0N("Xmp");
            if (A0N != null && A0N.length() != 0) {
                String A0N2 = c60782q2.A0N("Xmp");
                if (A0N2 != null && AbstractC001900j.A0a(A0N2, "trainedAlgorithmicMedia", false)) {
                    return;
                }
                try {
                    DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
                    StringReader stringReader = new StringReader(A0N);
                    try {
                        Document parse = newInstance.newDocumentBuilder().parse(new InputSource(stringReader));
                        C14360o3.A0A(parse);
                        Element createElement = parse.createElement("rdf:Description");
                        createElement.setAttribute("xmlns:iptcExt", "http://iptc.org/std/Iptc4xmpExt/2008-02-29/");
                        createElement.setAttribute("iptcExt:DigitalSourceType", "trainedAlgorithmicMedia");
                        NodeList elementsByTagName = parse.getElementsByTagName("rdf:RDF");
                        if (elementsByTagName.getLength() == 1) {
                            elementsByTagName.item(0).appendChild(createElement);
                        } else {
                            NodeList elementsByTagName2 = parse.getElementsByTagName("x:xmpmeta");
                            if (elementsByTagName2.getLength() == 1) {
                                Node item = elementsByTagName2.item(0);
                                Element createElement2 = parse.createElement("rdf:RDF");
                                createElement2.setAttribute("xmlns:rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
                                createElement2.appendChild(createElement);
                                item.appendChild(createElement2);
                            }
                        }
                        TransformerFactory newInstance2 = TransformerFactory.newInstance();
                        StringWriter stringWriter = new StringWriter();
                        try {
                            Transformer newTransformer = newInstance2.newTransformer();
                            C14360o3.A07(newTransformer);
                            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
                            newTransformer.transform(new DOMSource(parse), new StreamResult(stringWriter));
                            str = AbstractC166987dD.A19(stringWriter.getBuffer());
                            stringWriter.close();
                            stringReader.close();
                        } finally {
                        }
                    } catch (Exception e) {
                        throw new IOException(e);
                    }
                } finally {
                }
            } else {
                str = "<?xpacket begin=\"\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"XMP Core 4.4.0-Exiv2\">\n<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">\n<rdf:Description xmlns:iptcExt=\"http://iptc.org/std/Iptc4xmpExt/2008-02-29/\" iptcExt:DigitalSourceType=\"trainedAlgorithmicMedia\"/>\n</rdf:RDF>\n</x:xmpmeta>";
            }
            c60782q2.A0P("Xmp", str);
            c60782q2.A0O();
        } catch (IOException e2) {
            C0K8.A0F("GenAiMetadataWriter", "Failed to set XMP data", e2);
        }
    }
}
