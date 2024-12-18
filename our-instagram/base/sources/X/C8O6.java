package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8O6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O6 extends AbstractC150216pT {
    public final UserSession A00;

    @Override // X.AbstractC150216pT
    public final java.util.Set A03() {
        return AbstractC001800i.A0k(AbstractC001800i.A0X(AbstractC23021Ah.A00(this.A00).A01.C2v("recent_emoji_and_stickers")));
    }

    @Override // X.AbstractC150216pT
    public final void A06(java.util.Set set) {
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A00).A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.EEj("recent_emoji_and_stickers");
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7L("recent_emoji_and_stickers", set);
        ARD2.apply();
    }

    public C8O6(UserSession userSession) {
        this.A00 = userSession;
    }
}
