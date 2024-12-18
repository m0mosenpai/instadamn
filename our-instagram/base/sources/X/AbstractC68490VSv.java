package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VSv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68490VSv {
    public static String A00(List list) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0A.A0i(Long.parseLong((String) it.next()));
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return null;
        }
    }
}
