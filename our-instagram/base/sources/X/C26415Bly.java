package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bly, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26415Bly extends AbstractC51572Yf {
    public final InterfaceC31137Dmc A00;
    public final C26243BjC A01;
    public final C51722Yv A02;
    public final UserSession A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51682Yq A02 = BPH.A02(c76223bS, null, AbstractC77623dm.A0F(c76223bS, 2131955337), false);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = AbstractC25233BEq.A0d(null, DRV.A00(this, 40)).A00(this.A02);
        C77863eE c77863eE = new C77863eE(C05F.A00, DRV.A00(this, 41), null);
        if (A00 == c75933ay) {
            A00 = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(A00, c77863eE);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        return AbstractC25227BEk.A0W(AbstractC76963ci.A0H(AbstractC25232BEp.A11(A02, A12.A00), A12, BPH.A00(A12)), A12, c76223bS, A0h);
    }

    public C26415Bly(C51722Yv c51722Yv, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, C26243BjC c26243BjC) {
        AbstractC167027dH.A13(userSession, c26243BjC, interfaceC31137Dmc);
        this.A03 = userSession;
        this.A01 = c26243BjC;
        this.A00 = interfaceC31137Dmc;
        this.A02 = c51722Yv;
    }
}
