package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1tX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40061tX {
    public final java.util.Set A02 = new HashSet();
    public final java.util.Set A01 = new HashSet();
    public final List A00 = new CopyOnWriteArrayList();

    public final C84923qg A00(String str) {
        C14360o3.A0B(str, 0);
        Object obj = null;
        if (!this.A02.contains(str)) {
            return null;
        }
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (str.equals(((C84923qg) next).A0G)) {
                obj = next;
                break;
            }
        }
        return (C84923qg) obj;
    }

    public final void A02(C84923qg c84923qg) {
        C14360o3.A0B(c84923qg, 0);
        String str = c84923qg.A0G;
        String A00 = c84923qg.A00();
        java.util.Set set = this.A02;
        if (!set.contains(str)) {
            java.util.Set set2 = this.A01;
            if (!set2.contains(A00)) {
                set.add(str);
                set2.add(A00);
                this.A00.add(c84923qg);
            }
        }
    }

    public final void A03(C84923qg c84923qg) {
        C14360o3.A0B(c84923qg, 0);
        String str = c84923qg.A0G;
        String A00 = c84923qg.A00();
        java.util.Set set = this.A02;
        if (!set.contains(str)) {
            java.util.Set set2 = this.A01;
            if (!set2.contains(A00)) {
                set.add(str);
                set2.add(A00);
                this.A00.add(0, c84923qg);
            }
        }
    }

    public final void A01() {
        this.A02.clear();
        this.A01.clear();
        this.A00.clear();
    }

    public final void A04(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A02((C84923qg) it.next());
        }
    }
}
