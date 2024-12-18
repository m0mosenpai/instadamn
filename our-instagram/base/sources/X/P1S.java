package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P1S implements InterfaceC196338mP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public P1S(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.A00 = i;
        this.A07 = obj3;
        this.A03 = obj4;
        this.A05 = obj6;
        this.A06 = obj5;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj7;
    }

    @Override // X.InterfaceC196338mP
    public final /* synthetic */ void DeN() {
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        if (this.A00 != 0) {
            C54722OEz c54722OEz = (C54722OEz) this.A05;
            C54472O5a c54472O5a = (C54472O5a) this.A06;
            C54563O8p c54563O8p = new C54563O8p(c54472O5a.A00, false);
            Context context = (Context) this.A01;
            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A04;
            UserSession userSession = (UserSession) this.A07;
            ENZ enz = (ENZ) this.A02;
            C55202OeD.A01(context, abstractC59962oe, userSession, c54563O8p, c54722OEz, enz);
            C55202OeD.A00(context, abstractC59962oe, userSession, (C211849aB) this.A03, c54472O5a, c54722OEz, enz);
            return;
        }
        C131975xX c131975xX = C131965xW.A05;
        UserSession userSession2 = (UserSession) this.A07;
        if (C131975xX.A01(userSession2)) {
            C131965xW A00 = C131975xX.A00(userSession2);
            C211849aB c211849aB = (C211849aB) this.A03;
            OFL ofl = (OFL) this.A05;
            A00.A08(new P1X((Context) this.A01, (AbstractC59962oe) this.A04, userSession2, c211849aB, (C54622OAx) this.A06, ofl, (ENZ) this.A02));
            return;
        }
        C211849aB c211849aB2 = (C211849aB) this.A03;
        OFL ofl2 = (OFL) this.A05;
        C55628OnD.A02((Context) this.A01, (AbstractC59962oe) this.A04, userSession2, c211849aB2, (C54622OAx) this.A06, ofl2, (ENZ) this.A02);
    }
}
