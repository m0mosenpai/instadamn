package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KNI extends AbstractC150216pT {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C50156MDj(this, 48));

    @Override // X.AbstractC150216pT
    public final java.util.Set A03() {
        return AbstractC001800i.A0k(AbstractC001800i.A0X(AbstractC25226BEj.A10(this.A01).A01.C2v("recent_nametag_emojis")));
    }

    @Override // X.AbstractC150216pT
    public final void A06(java.util.Set set) {
        InterfaceC19630xq interfaceC19630xq = AbstractC25226BEj.A10(this.A01).A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.EEj("recent_nametag_emojis");
        ARD.apply();
        AbstractC43594JPz.A1M(interfaceC19630xq, "recent_nametag_emojis", set);
    }

    public KNI(UserSession userSession) {
        this.A00 = userSession;
    }
}
