package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4VU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4VU {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public final void A00(C4WB c4wb) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A00;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C72766Xmi c72766Xmi = (C72766Xmi) it.next();
            if (c72766Xmi.A02 == c4wb) {
                c72766Xmi.A00 = true;
                copyOnWriteArrayList.remove(c72766Xmi);
            }
        }
    }
}
