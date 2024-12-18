package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27741Wc {
    public static boolean A03;
    public static C27741Wc A04;
    public final InterfaceC14020nS A00;
    public final C1Wr A02 = new C1Wr(C27781Wg.A00, C27801Wi.A00, C27831Wl.A00, C27841Wm.A00, C27871Wp.A00);
    public final Map A01 = new HashMap();

    public final void A02(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, Runnable runnable, String str, String str2) {
        InterfaceC71793Kc A00 = A00(abstractC12990ll, this, str);
        if (A00 != null) {
            this.A00.ATO(new KMT(c116155Nu, abstractC12990ll, A00, this, runnable, str2));
        }
    }

    public final void A04(final UserSession userSession, String str, final String str2) {
        final InterfaceC71793Kc A00 = A00(userSession, this, str);
        if (A00 != null) {
            final int i = 3;
            if (A03) {
                i = 2;
            }
            this.A00.ATO(new AbstractRunnableC14200nk(i) { // from class: X.7Ob
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC71793Kc interfaceC71793Kc = A00;
                    interfaceC71793Kc.ASk();
                    interfaceC71793Kc.EFs(userSession, str2);
                }
            });
        }
    }

    public static InterfaceC71793Kc A00(AbstractC12990ll abstractC12990ll, C27741Wc c27741Wc, String str) {
        C1X9 c1x9 = (C1X9) c27741Wc.A01.get(str);
        if (c1x9 != null) {
            return c1x9.A00(abstractC12990ll);
        }
        C0w9.A03("NotificationController", AnonymousClass001.A0g("Category ", str, " is not registered"));
        return null;
    }

    public static C27741Wc A01() {
        InterfaceC14020nS interfaceC14020nS;
        if (A04 == null) {
            synchronized (C27741Wc.class) {
                if (A04 == null) {
                    synchronized (C27761We.class) {
                        interfaceC14020nS = C27761We.A00;
                        if (interfaceC14020nS == null) {
                            C0o0 A00 = AbstractC14350nz.A00();
                            A00.A01 = "notifications";
                            A00.A00 = 60000;
                            interfaceC14020nS = new C18240vB(A00);
                            C27761We.A00 = interfaceC14020nS;
                        }
                    }
                    A04 = new C27741Wc(interfaceC14020nS);
                }
            }
        }
        return A04;
    }

    public final void A05(C1WJ c1wj, InterfaceC19630xq interfaceC19630xq, String str) {
        this.A01.put(str, new C1X9(C1X8.A00(), this.A02, c1wj, interfaceC19630xq));
    }

    public C27741Wc(InterfaceC14020nS interfaceC14020nS) {
        this.A00 = interfaceC14020nS;
    }

    public final void A03(AbstractC12990ll abstractC12990ll, String str, String str2) {
        InterfaceC71793Kc A00 = A00(abstractC12990ll, this, str);
        if (A00 != null) {
            this.A00.ATO(new KMI(A00, this, str2));
        }
    }
}
