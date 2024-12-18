package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2LU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LU implements C2LP {
    public final C006802i A00;
    public final C2LR A01;
    public final boolean A02;

    public C2LU(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C006802i.A0p;
        this.A01 = (C2LR) userSession.A01(C2LR.class, new DGZ(userSession, 14));
        this.A02 = C18U.A06(C06090Tz.A05, userSession, 36315206913100913L);
    }

    @Override // X.C2LP
    public final void AI5() {
        this.A00.A0G.AHu(485);
    }

    @Override // X.C2LP
    public final void E3A() {
        if (this.A02) {
            C19360xL A00 = C19360xL.A00();
            A00.A04.add(new InterfaceC10200gc() { // from class: X.46q
                @Override // X.InterfaceC10200gc
                public final void DtB(Integer num, Integer num2) {
                    C2LU c2lu = C2LU.this;
                    if (num2 == C05F.A00) {
                        c2lu.A00.A0G.E39(485, 1);
                        return;
                    }
                    C2LR c2lr = c2lu.A01;
                    if (c2lr.A02 && c2lr.A01) {
                        return;
                    }
                    c2lu.A00.A0G.AHu(485);
                }
            });
        }
    }
}
