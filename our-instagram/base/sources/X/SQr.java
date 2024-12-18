package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;

/* loaded from: classes10.dex */
public abstract class SQr {
    public static void A01(StringBuilder sb, Object obj) {
        char[] charArray = obj.toString().toCharArray();
        sb.append(charArray, 0, Math.min(charArray.length, 100 - sb.length()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, X.400, java.io.IOException] */
    public static void A00(C16L c16l, Class cls, Exception exc) {
        String str;
        try {
            Object A1M = c16l.A1M();
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("current token: ");
            A1C.append(c16l.A1P());
            A1C.append("\n");
            if (A1M instanceof InputStream) {
                ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                c16l.A1G(A0U);
                A0U.flush();
                A01(A1C, A0U);
                A0U.close();
                InputStream inputStream = (InputStream) A1M;
                while (true) {
                    int read = inputStream.read();
                    if (read == -1 || A1C.length() >= 100) {
                        break;
                    } else {
                        A1C.append((char) read);
                    }
                }
            } else if (A1M instanceof Reader) {
                StringWriter stringWriter = new StringWriter();
                c16l.A0f(stringWriter);
                stringWriter.flush();
                A01(A1C, stringWriter);
                stringWriter.close();
                Reader reader = (Reader) A1M;
                while (true) {
                    int read2 = reader.read();
                    if (read2 == -1 || A1C.length() >= 100) {
                        break;
                    } else {
                        A1C.append((char) read2);
                    }
                }
                reader.close();
            } else if (A1M == null) {
                StringWriter stringWriter2 = new StringWriter();
                c16l.A0f(stringWriter2);
                stringWriter2.flush();
                A01(A1C, stringWriter2);
                stringWriter2.close();
            }
            if (A1C.length() == 100) {
                A1C.append("...");
            }
            str = A1C.toString();
        } catch (Exception unused) {
            str = "failed to get parser text";
        }
        String A0u = AnonymousClass001.A0u("Failed to deserialize to instance ", cls.getSimpleName(), "\n", str);
        TID A1H = c16l.A1H();
        ?? iOException = new IOException(A0u, exc);
        iOException.A00 = A1H;
        throw iOException;
    }
}
