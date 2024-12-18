package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3iM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80323iM extends AbstractC51572Yf {
    public final C9C6 A00;
    public final C75113Zb A01;
    public final C51722Yv A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final InterfaceC60442pS A05;

    public C80323iM(C9C6 c9c6, C51722Yv c51722Yv, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 3);
        C14360o3.A0B(c75113Zb, 5);
        this.A03 = userSession;
        this.A00 = c9c6;
        this.A05 = interfaceC60442pS;
        this.A04 = c38321qM;
        this.A01 = c75113Zb;
        this.A02 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C9C6 c9c6 = this.A00;
        if (c9c6.A04) {
            int A00 = AbstractC86543tS.A00(AbstractC77363dM.A00(c76223bS), this.A03, this.A04, this.A05.getModuleName(), c9c6.A03);
            if (A00 > 0) {
                C51722Yv c51722Yv = this.A02;
                C9CT c9ct = new C9CT(C05F.A00, 100.0f, 0);
                if (c51722Yv == C51722Yv.A02) {
                    c51722Yv = null;
                }
                return AbstractC76963ci.A06(null, c76223bS, new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv, c9ct), new C9CU(C05F.A01, 0, A00 | 9221401712017801216L)), new C9CV(C05F.A04, new C206849Dp(this, 31), 4)), null, null, null, false);
            }
        }
        return null;
    }
}
