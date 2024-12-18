package com.fasterxml.jackson.databind.ext;

import X.AbstractC166997dE;
import X.AnonymousClass469;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes10.dex */
public abstract class DOMDeserializer extends FromStringDeserializer {
    public static final DocumentBuilderFactory A00;

    /* loaded from: classes10.dex */
    public class DocumentDeserializer extends DOMDeserializer {
        public DocumentDeserializer() {
            super(Document.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final /* bridge */ /* synthetic */ Object A0z(AnonymousClass469 anonymousClass469, String str) {
            return A11(str);
        }
    }

    /* loaded from: classes10.dex */
    public class NodeDeserializer extends DOMDeserializer {
        public NodeDeserializer() {
            super(Node.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final /* bridge */ /* synthetic */ Object A0z(AnonymousClass469 anonymousClass469, String str) {
            return A11(str);
        }
    }

    public final Document A11(String str) {
        try {
            return A00.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e) {
            throw new IllegalArgumentException(AbstractC166997dE.A0y("Failed to parse JSON String as XML: ", e), e);
        }
    }

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setExpandEntityReferences(false);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Throwable unused2) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Throwable unused3) {
        }
        A00 = newInstance;
    }
}
