package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IM6 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final CP4 A02;
    public final MSN A03;
    public final IC9 A04;

    public final C211739Zk A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        InterfaceC31134DmH BRQ = c38321qM.A0C.BRQ();
        if (BRQ != null) {
            String text = BRQ.getText();
            InterfaceC31134DmH BRQ2 = c38321qM.A0C.BRQ();
            if (BRQ2 != null) {
                DSA dsa = new DSA(24, BRQ2, this);
                C50268MHx c50268MHx = new C50268MHx(24, BRQ2, this);
                return new C211739Zk(new C38688GzT(12, dsa, new C50364MLq(30, BRQ2, c38321qM, this), new C50364MLq(29, BRQ2, c38321qM, this), c50268MHx), AbstractC85143r2.A00(this.A00, this.A01, c38321qM, this.A03.BS2(), c75113Zb), c75113Zb, text, AbstractC167007dF.A1P(c75113Zb.A0E, EnumC65592xv.A0M.ordinal()));
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public /* synthetic */ IM6(InterfaceC11380iw interfaceC11380iw, UserSession userSession, CP4 cp4, MSN msn) {
        IC9 ic9 = new IC9(userSession);
        C14360o3.A0B(msn, 2);
        this.A01 = userSession;
        this.A03 = msn;
        this.A00 = interfaceC11380iw;
        this.A02 = cp4;
        this.A04 = ic9;
    }
}
