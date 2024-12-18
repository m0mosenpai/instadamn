package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P1X implements C62m {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C211849aB A03;
    public final /* synthetic */ C54622OAx A04;
    public final /* synthetic */ OFL A05;
    public final /* synthetic */ ENZ A06;

    public P1X(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C211849aB c211849aB, C54622OAx c54622OAx, OFL ofl, ENZ enz) {
        this.A03 = c211849aB;
        this.A05 = ofl;
        this.A04 = c54622OAx;
        this.A00 = context;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A06 = enz;
    }

    @Override // X.C62m
    public final void DFf() {
        C211849aB c211849aB = this.A03;
        OFL ofl = this.A05;
        C55628OnD.A02(this.A00, this.A01, this.A02, c211849aB, this.A04, ofl, this.A06);
    }

    @Override // X.C62m
    public final void onSuccess() {
        C211849aB c211849aB = this.A03;
        OFL ofl = this.A05;
        C55628OnD.A02(this.A00, this.A01, this.A02, c211849aB, this.A04, ofl, this.A06);
    }
}
