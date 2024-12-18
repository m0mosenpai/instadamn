package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KNg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45753KNg extends AbstractC148206lq {
    public final UserSession A00;

    public C45753KNg(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC150216pT
    public final int A01() {
        return 18;
    }

    @Override // X.AbstractC150216pT
    public final boolean A07() {
        return true;
    }

    @Override // X.AbstractC150216pT
    public final java.util.Set A03() {
        return AbstractC001800i.A0j(AbstractC001800i.A0X(C1AT.A01(this.A00).A03(C1AV.A38).C2v("reaction_sticker_recent_emojis")));
    }

    @Override // X.AbstractC150216pT
    public final void A06(java.util.Set set) {
        InterfaceC19610xo ARD = C1AT.A01(this.A00).A03(C1AV.A38).ARD();
        ARD.E7L("reaction_sticker_recent_emojis", set);
        ARD.apply();
    }
}
