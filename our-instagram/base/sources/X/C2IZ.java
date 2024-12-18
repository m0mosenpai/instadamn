package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2IZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2IZ {
    public C71943Kr A00;
    public final String A01;
    public final Map A02 = new HashMap();
    public static final C47912Ia A04 = new Object();
    public static final C005001p A03 = new C005001p(0);

    public final java.util.Set A01() {
        java.util.Set set = (java.util.Set) this.A02.get(-1);
        if (set != null) {
            return set;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C71943Kr A00() {
        C71943Kr c71943Kr = this.A00;
        if (c71943Kr == null) {
            String str = this.A01;
            C1AV c1av = C1AV.A3X;
            int i = C1AT.A00(c1av, str).getInt("direct_inbox_badge_count", 0);
            if (i == -1) {
                i = 0;
            }
            c71943Kr = new C71943Kr(new C71933Kq(i, C1AT.A00(c1av, str).getInt("direct_open_thread_badge_count", -1), C1AT.A00(c1av, str).getInt("direct_armadillo_thread_badge_count", -1)), null, null);
            this.A00 = c71943Kr;
        }
        C14360o3.A0A(c71943Kr);
        return c71943Kr;
    }

    public final void A02(C4JH c4jh) {
        C71943Kr c71943Kr = c4jh.A01;
        this.A00 = c71943Kr;
        String str = this.A01;
        int i = c4jh.A00;
        C1AV c1av = C1AV.A3X;
        InterfaceC19610xo ARD = C1AT.A00(c1av, str).ARD();
        ARD.E7D("direct_inbox_badge_count", i);
        ARD.apply();
        C71933Kq c71933Kq = c71943Kr.A00;
        int i2 = c71933Kq.A00;
        InterfaceC19610xo ARD2 = C1AT.A00(c1av, str).ARD();
        ARD2.E7D("direct_open_thread_badge_count", i2);
        ARD2.apply();
        int i3 = c71933Kq.A01;
        InterfaceC19610xo ARD3 = C1AT.A00(c1av, str).ARD();
        ARD3.E7D("direct_armadillo_thread_badge_count", i3);
        ARD3.apply();
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            ((C2KV) it.next()).Cz5(c4jh);
        }
    }

    public C2IZ(String str) {
        this.A01 = str;
    }
}
