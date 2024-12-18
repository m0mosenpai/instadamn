package X;

import com.fasterxml.jackson.databind.ext.Java7HandlersImpl;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* loaded from: classes10.dex */
public final class TIE implements Serializable {
    public static final Java7HandlersImpl A02;
    public static final TIE A03;
    public final Map A00;
    public final Map A01;
    public static final Class A05 = Node.class;
    public static final Class A04 = Document.class;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        Java7HandlersImpl java7HandlersImpl = null;
        try {
            java7HandlersImpl = Java7HandlersImpl.A00;
        } catch (Throwable unused) {
        }
        A02 = java7HandlersImpl;
        A03 = new TIE();
    }

    public static Object A00(AbstractC910944l abstractC910944l, String str) {
        IllegalStateException A14;
        try {
            try {
                return C914045z.A03(Class.forName(str), false);
            } finally {
            }
        } catch (Throwable th) {
            throw AbstractC166987dD.A14(AnonymousClass001.A16("Failed to find class `", str, "` for handling values of type ", C914045z.A04(abstractC910944l), ", problem: (", MSY.A0h(th), ") ", th.getMessage()));
        }
    }

    public TIE() {
        HashMap A1G = AbstractC166987dD.A1G();
        this.A00 = A1G;
        A1G.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        A1G.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap A1G2 = AbstractC166987dD.A1G();
        this.A01 = A1G2;
        A1G2.put("java.sql.Timestamp", DateSerializer.A00);
        A1G2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        A1G2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        A1G2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        A1G2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }
}
