package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13590ml {
    public static final String A00(List list) {
        C14360o3.A0B(list, 0);
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0A.A0u((String) it.next());
        }
        A0A.A0Z();
        A0A.close();
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }
}
