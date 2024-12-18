package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Iq8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42407Iq8 implements InterfaceC196338mP {
    public final /* synthetic */ C82G A00;
    public final /* synthetic */ C42090Ikx A01;
    public final /* synthetic */ C211849aB A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;

    @Override // X.InterfaceC196338mP
    public final /* synthetic */ void DeN() {
    }

    public C42407Iq8(C82G c82g, C42090Ikx c42090Ikx, C211849aB c211849aB, Integer num, String str) {
        this.A01 = c42090Ikx;
        this.A02 = c211849aB;
        this.A00 = c82g;
        this.A03 = num;
        this.A04 = str;
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        C42090Ikx c42090Ikx = this.A01;
        C211849aB c211849aB = this.A02;
        C82G c82g = this.A00;
        C42090Ikx.A01(c82g, c42090Ikx, c211849aB, this.A03);
        if (c82g == C82G.A0G) {
            C131975xX c131975xX = C131965xW.A05;
            UserSession userSession = c42090Ikx.A0A;
            if (C131975xX.A01(userSession)) {
                C131975xX.A00(userSession).A08(null);
            }
        }
    }
}
