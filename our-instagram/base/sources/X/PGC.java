package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PGC implements InterfaceC57990Pna {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ OFL A04;
    public final /* synthetic */ ENZ A05;
    public final /* synthetic */ String A06;

    public PGC(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM, OFL ofl, ENZ enz, String str) {
        this.A03 = c38321qM;
        this.A00 = context;
        this.A04 = ofl;
        this.A05 = enz;
        this.A06 = str;
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
    }

    @Override // X.InterfaceC57990Pna
    public final void afterSelection(boolean z) {
        C38321qM c38321qM = this.A03;
        Context context = this.A00;
        OFL ofl = this.A04;
        ENZ enz = this.A05;
        String str = this.A06;
        C55628OnD.A01(context, this.A01, this.A02, c38321qM, ofl, enz, str, false);
    }
}
