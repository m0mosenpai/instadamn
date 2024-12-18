package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F3b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34099F3b {
    public static final ArrayList A00(List list) {
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C105954q9 c105954q9 = (C105954q9) it.next();
            if (c105954q9 != null && (str = c105954q9.A05) != null) {
                A1E.add(str);
            }
        }
        return A1E;
    }
}
