package X;

import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes8.dex */
public final class Ld8 implements InterfaceC13000lm {
    public final FanClubApi A00;
    public final C19L A01;
    public final InterfaceC19390xP A02;
    public final C05A A03;
    public final C0UO A04;

    public Ld8(C12N c12n, FanClubApi fanClubApi) {
        C14360o3.A0B(c12n, 2);
        this.A00 = fanClubApi;
        this.A01 = AbstractC43594JPz.A13(c12n, 210647125);
        C008002u A00 = C10E.A00(null);
        this.A03 = A00;
        this.A04 = AbstractC208910l.A02(A00);
        this.A02 = new M9S(A00, 11);
    }

    public final void A00() {
        MBp.A01(this, this.A01, 16);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AnonymousClass194.A05(null, this.A01);
    }
}
