package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Jdy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44073Jdy {
    public static final List A00(String str) {
        Object c09540e5;
        List A0Q = AbstractC001900j.A0Q(str, new char[]{','}, 0);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0Q.iterator();
        while (it.hasNext()) {
            try {
                String upperCase = AbstractC001900j.A0B((String) it.next()).toString().toUpperCase(Locale.ROOT);
                C14360o3.A07(upperCase);
                c09540e5 = EnumC44072Jdx.valueOf(upperCase);
            } catch (Throwable th) {
                c09540e5 = new C09540e5(th);
            }
            if (c09540e5 instanceof C09540e5) {
                c09540e5 = null;
            }
            if (c09540e5 != null) {
                A1E.add(c09540e5);
            }
        }
        return A1E;
    }
}
