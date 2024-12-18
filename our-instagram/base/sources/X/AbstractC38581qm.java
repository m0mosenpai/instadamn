package X;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.1qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38581qm {
    public static final String A00(Reader reader) {
        C14360o3.A0B(reader, 0);
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        while (true) {
            int read = reader.read(cArr);
            if (read >= 0) {
                stringWriter.write(cArr, 0, read);
            } else {
                String obj = stringWriter.toString();
                C14360o3.A07(obj);
                return obj;
            }
        }
    }

    public static final void A01(Reader reader, InterfaceC16660sJ interfaceC16660sJ) {
        BufferedReader bufferedReader = (BufferedReader) reader;
        try {
            Iterator it = new C2Z2(new C51742Yx(bufferedReader)).iterator();
            while (it.hasNext()) {
                interfaceC16660sJ.invoke(it.next());
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C20I.A00(bufferedReader, th);
                throw th2;
            }
        }
    }
}
