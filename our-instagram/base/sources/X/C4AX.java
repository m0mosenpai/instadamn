package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.4AX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AX {
    public static final C4AX A01 = new C4AX();
    public final java.util.Set A00 = new HashSet();

    public final void A00(C4AN c4an) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C4AX) it.next()).A00(c4an);
        }
    }

    public final void A01(C4AN c4an, long j) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C4AX) it.next()).A01(c4an, j);
        }
    }
}
