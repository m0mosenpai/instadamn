package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.G7z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36501G7z implements GZA {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ E1Y A03;
    public final /* synthetic */ C35121FeO A04;

    public C36501G7z(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, E1Y e1y, C35121FeO c35121FeO) {
        this.A03 = e1y;
        this.A02 = userSession;
        this.A04 = c35121FeO;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }

    @Override // X.GZA
    public final void onActionClicked() {
        AbstractC167007dF.A0x(this.A03.A00);
        UserSession userSession = this.A02;
        FVL.A01(C35817Frt.A00, new C35831Fs7(0, this.A01, userSession, this.A00), userSession, C16930sl.A00, true);
        C35121FeO c35121FeO = this.A04;
        InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
        AbstractC31180DnO.A1G(EnumC33496ErV.BANNER, A00);
        C35121FeO.A01(A00, c35121FeO);
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        AbstractC167007dF.A0x(this.A03.A00);
        InterfaceC19610xo ARD = AbstractC31178DnM.A0S(this.A02, C35266Fh1.A00).ARD();
        ARD.E77("auto_follow_back_follow_prompt_dismissed", true);
        ARD.apply();
        C35121FeO c35121FeO = this.A04;
        InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
        AbstractC31180DnO.A1H(EnumC33496ErV.BANNER, A00);
        C35121FeO.A01(A00, c35121FeO);
    }
}
