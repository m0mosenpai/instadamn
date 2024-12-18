package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.1X9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1X9 {
    public InterfaceC71793Kc A00;
    public final C1X8 A01;
    public final C1Wr A02;
    public final C1WJ A03;
    public final InterfaceC19630xq A04;

    public C1X9(C1X8 c1x8, C1Wr c1Wr, C1WJ c1wj, InterfaceC19630xq interfaceC19630xq) {
        C14360o3.A0B(c1x8, 1);
        C14360o3.A0B(c1Wr, 4);
        this.A01 = c1x8;
        this.A03 = c1wj;
        this.A04 = interfaceC19630xq;
        this.A02 = c1Wr;
    }

    public final InterfaceC71793Kc A00(AbstractC12990ll abstractC12990ll) {
        InterfaceC71793Kc c71783Kb;
        C14360o3.A0B(abstractC12990ll, 0);
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C1AD.A06(c06090Tz, 18307822085285946L) || (AbstractC19730y1.A00(AbstractC12960li.A00).A00.getBoolean("notification_controller_cache_oversized", false) && C1AD.A06(c06090Tz, 18307822085220409L))) {
                        C1WJ c1wj = this.A03;
                        String Amb = c1wj.Amb();
                        long A01 = C18U.A01(c06090Tz, abstractC12990ll, 36602080663835183L);
                        boolean A0K = C14360o3.A0K(Amb, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
                        int i = 1;
                        if (A0K) {
                            i = 6;
                        }
                        InterfaceC19630xq interfaceC19630xq = this.A04;
                        C14360o3.A0A(Amb);
                        C3KZ c3kz = new C3KZ(interfaceC19630xq, Amb, new C206919Dw(this, 17), C3KY.A00, i, A01, !A0K);
                        C1X8 c1x8 = this.A01;
                        c71783Kb = new C71783Kb(c1x8, new C71773Ka(c1x8), this.A02, c3kz, c1wj, Amb, A0K);
                    } else {
                        c71783Kb = new C49526Luf(this.A01, this.A02, this.A03, this.A04);
                    }
                    this.A00 = c71783Kb;
                }
            }
        }
        InterfaceC71793Kc interfaceC71793Kc = this.A00;
        if (interfaceC71793Kc != null) {
            return interfaceC71793Kc;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
