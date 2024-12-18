package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.J2x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43082J2x implements Runnable {
    public final /* synthetic */ C1IA A00;

    public RunnableC43082J2x(C1IA c1ia) {
        this.A00 = c1ia;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1IA c1ia = this.A00;
        Map map = c1ia.A01;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            ((C11Q) A16.next()).onCancel();
        }
        map.clear();
        ((C1IB) c1ia).A02.clear();
        c1ia.A00.clear();
    }
}
