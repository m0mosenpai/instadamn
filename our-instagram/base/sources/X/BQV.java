package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BQV extends AbstractC51572Yf {
    public final int A00;
    public final InterfaceC31043Dkh A01;
    public final BQU A02;
    public final C51722Yv A03;
    public final UserSession A04;

    public BQV(C51722Yv c51722Yv, UserSession userSession, InterfaceC31043Dkh interfaceC31043Dkh, BQU bqu, int i) {
        AbstractC25233BEq.A0w(1, userSession, bqu, interfaceC31043Dkh);
        this.A04 = userSession;
        this.A03 = c51722Yv;
        this.A02 = bqu;
        this.A01 = interfaceC31043Dkh;
        this.A00 = i;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A03;
        Integer num = C05F.A0C;
        C9CT A0m = AbstractC25225BEi.A0m(num, 0.0f, 1);
        C75933ay c75933ay = C51722Yv.A02;
        if (c51722Yv == c75933ay) {
            c51722Yv = null;
        }
        C51722Yv A0e = AbstractC25230BEn.A0e(AbstractC25233BEq.A0d(AbstractC25225BEi.A0h(c51722Yv, A0m), DRX.A00(this, 29)), C05F.A00, DRX.A00(this, 30), null);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        int i = this.A00;
        C51722Yv A00 = BPH.A00(A12);
        C9CT A0m2 = AbstractC25225BEi.A0m(num, 0.0f, 1);
        if (A00 == c75933ay) {
            A00 = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(A00, A0m2);
        C2Z0 A0K = AbstractC25233BEq.A0K(A12);
        AbstractC25230BEn.A1G(BPH.A02(A0K, null, AbstractC77623dm.A0G(A0K, Integer.valueOf(i), 2131971986), false), A0K, A12, A0h);
        return AbstractC76963ci.A0H(A12, c76223bS, A0e);
    }
}
