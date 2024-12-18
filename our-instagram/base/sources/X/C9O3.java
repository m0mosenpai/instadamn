package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9O3, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9O3 {
    public static final ArrayList A00(List list, int i) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24239Ap6 c24239Ap6 = (C24239Ap6) it.next();
            if (c24239Ap6.A03 < i) {
                A1E.add(c24239Ap6);
            }
        }
        return A1E;
    }
}
