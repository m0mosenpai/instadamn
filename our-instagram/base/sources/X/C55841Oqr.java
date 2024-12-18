package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.Oqr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55841Oqr implements InterfaceC57918PmO {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ C145176gc A02;

    public C55841Oqr(AbstractC59962oe abstractC59962oe, Reel reel, C145176gc c145176gc) {
        this.A02 = c145176gc;
        this.A00 = abstractC59962oe;
        this.A01 = reel;
    }

    @Override // X.InterfaceC57918PmO
    public final void Dw1() {
        C145176gc c145176gc = this.A02;
        UserSession userSession = c145176gc.A09;
        if (userSession != null) {
            AbstractC59962oe abstractC59962oe = this.A00;
            C1571673v.A05(abstractC59962oe, userSession, EnumC1571773w.A05, "unarchive_highlight_option_tap", userSession.userId);
            UserSession userSession2 = c145176gc.A09;
            if (userSession2 != null) {
                Reel reel = this.A01;
                AbstractC1571873x.A0A(new C55830Oqg(1, abstractC59962oe, reel, c145176gc), userSession2, AbstractC37301Gc2.A0i(reel));
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }
}
