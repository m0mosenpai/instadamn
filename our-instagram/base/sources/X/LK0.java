package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes8.dex */
public final class LK0 {
    public volatile Object A00;
    public volatile CountDownLatch A01 = new CountDownLatch(1);
    public volatile ArrayList A02 = AbstractC166987dD.A1E();

    public static LK0 A00() {
        return new LK0();
    }

    public static void A01(LK0 lk0, Object obj, int i) {
        lk0.A04(new LS9(obj, i));
    }

    public static void A02(LK0 lk0, Object obj, Object obj2, int i) {
        lk0.A04(new LSD(i, obj, obj2));
    }

    public final void A03() {
        this.A01.countDown();
        if (!this.A02.isEmpty()) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((InterfaceC50417MNt) it.next()).run(this.A00);
            }
        }
    }

    public final void A04(InterfaceC50417MNt interfaceC50417MNt) {
        if (this.A01.getCount() == 0) {
            interfaceC50417MNt.run(this.A00);
        } else {
            this.A02.add(interfaceC50417MNt);
        }
    }

    public final void A05(Object obj) {
        this.A00 = obj;
        A03();
    }
}
