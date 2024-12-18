package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NMA extends C33H {
    public final /* synthetic */ C54970OTc A00;
    public final /* synthetic */ C46552Bt A01;
    public final /* synthetic */ String A02;

    public NMA(C54970OTc c54970OTc, C46552Bt c46552Bt, String str) {
        this.A01 = c46552Bt;
        this.A00 = c54970OTc;
        this.A02 = str;
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        this.A01.A07(true);
        UserSession userSession = this.A00.A01;
        boolean A1X = MSZ.A1X(C196068lw.A00(userSession), "ClipsShareSheetTooltipManager");
        AnonymousClass229.A01(userSession).A1N(EnumC50631MWs.A0L, true, this.A02);
        C82G c82g = C82G.A0S;
        C82H c82h = C82H.A10;
        EnumC201098ur enumC201098ur = EnumC201098ur.VIEW;
        C82I A0H = MSW.A0H();
        MSX.A1I(A0H, A1X);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
    }
}
