package com.fasterxml.jackson.databind.ext;

import X.AbstractC166997dE;
import X.AbstractC58319PtB;
import X.AbstractC913245l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C102314j6;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

/* loaded from: classes10.dex */
public class DOMSerializer extends StdSerializer {
    public final TransformerFactory A00;

    public DOMSerializer() {
        super(Node.class);
        try {
            TransformerFactory newInstance = TransformerFactory.newInstance();
            this.A00 = newInstance;
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
            throw new IllegalStateException(AbstractC166997dE.A0y("Could not instantiate `TransformerFactory`: ", e), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Node node = (Node) obj;
        try {
            Transformer newTransformer = this.A00.newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.setOutputProperty("indent", "no");
            StreamResult streamResult = new StreamResult(new StringWriter());
            newTransformer.transform(new DOMSource(node), streamResult);
            anonymousClass182.A0u(streamResult.getWriter().toString());
        } catch (TransformerConfigurationException e) {
            throw new IllegalStateException(AbstractC166997dE.A0y("Could not create XML Transformer for writing DOM `Node` value: ", e), e);
        } catch (TransformerException e2) {
            throw new C102314j6(((AbstractC913245l) abstractC913345m).A00, String.format("DOM `Node` value serialization failed: %s", AbstractC58319PtB.A1Z(e2)), e2);
        }
    }
}
