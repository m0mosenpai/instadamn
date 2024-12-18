package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0IL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IL {
    public static final C0IL A00 = new Object();
    public static final ArrayList A01 = new ArrayList();

    public static final void A00(C0IG c0ig) {
        synchronized (A00) {
            Iterator it = A01.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                ((C0IK) next).DRO(c0ig);
            }
        }
    }

    public static final void A01(C0IK c0ik) {
        synchronized (A00) {
            A01.add(c0ik);
        }
    }

    public static final boolean A02() {
        boolean z;
        synchronized (A00) {
            z = !A01.isEmpty();
        }
        return z;
    }
}
