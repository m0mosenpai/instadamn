package X;

/* renamed from: X.Pv6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58427Pv6 {
    public final C58428Pv7 A00 = new C58428Pv7();

    public final void A00(Exception exc) {
        C58428Pv7 c58428Pv7 = this.A00;
        Object obj = c58428Pv7.A03;
        synchronized (obj) {
            if (c58428Pv7.A02) {
                return;
            }
            C58428Pv7.A01(c58428Pv7);
            c58428Pv7.A02 = true;
            c58428Pv7.A00 = exc;
            obj.notifyAll();
            C58428Pv7.A02(c58428Pv7);
        }
    }

    public final void A01(Object obj) {
        C58428Pv7 c58428Pv7 = this.A00;
        Object obj2 = c58428Pv7.A03;
        synchronized (obj2) {
            if (c58428Pv7.A02) {
                return;
            }
            C58428Pv7.A01(c58428Pv7);
            c58428Pv7.A02 = true;
            c58428Pv7.A01 = obj;
            obj2.notifyAll();
            C58428Pv7.A02(c58428Pv7);
        }
    }
}
