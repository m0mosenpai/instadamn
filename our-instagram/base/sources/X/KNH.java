package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KNH extends AbstractC150216pT {
    public final UserSession A00;

    @Override // X.AbstractC150216pT
    public final java.util.Set A03() {
        return AbstractC001800i.A0k(AbstractC001800i.A0X(AbstractC166987dD.A0x(this.A00).C2v("recent_direct_emoji_reactions")));
    }

    @Override // X.AbstractC150216pT
    public final void A06(java.util.Set set) {
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(this.A00);
        InterfaceC19610xo ARD = A0x.ARD();
        ARD.EEj("recent_direct_emoji_reactions");
        ARD.apply();
        AbstractC43594JPz.A1M(A0x, "recent_direct_emoji_reactions", set);
    }

    public KNH(UserSession userSession) {
        this.A00 = userSession;
    }
}
