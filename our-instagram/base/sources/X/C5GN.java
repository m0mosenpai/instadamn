package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5GN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GN {
    public final C61512rE A00;
    public final C61342qw A01;
    public final InterfaceC146336iW A02;
    public final InterfaceC673231x A03;
    public final V8K A04;

    public C5GN(UserSession userSession, C61512rE c61512rE, C61342qw c61342qw) {
        InterfaceC146336iW c146326iV;
        InterfaceC673231x c673131w;
        this.A00 = c61512rE;
        this.A01 = c61342qw;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320863385035725L) && C18U.A06(c06090Tz, userSession, 36320863385166799L)) {
            c146326iV = new C70985Wlv();
        } else {
            c146326iV = new C146326iV();
        }
        InterfaceC146336iW interfaceC146336iW = c146326iV;
        this.A02 = interfaceC146336iW;
        boolean isEnabled = interfaceC146336iW.isEnabled();
        if (isEnabled) {
            c673131w = new C71034Wmp(userSession, interfaceC146336iW);
        } else {
            c673131w = new C673131w();
        }
        this.A03 = c673131w;
        V8K v8k = new V8K(this);
        this.A04 = v8k;
        if (isEnabled) {
            c61512rE.A8m(c673131w);
            c61342qw.EDY(v8k);
        }
    }
}
