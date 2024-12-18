package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Wkb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70932Wkb implements GZ9 {
    public final /* synthetic */ V4E A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C102884kP A02;
    public final /* synthetic */ UserSession A03;

    public C70932Wkb(V4E v4e, C6FG c6fg, C102884kP c102884kP, UserSession userSession) {
        this.A00 = v4e;
        this.A01 = c6fg;
        this.A03 = userSession;
        this.A02 = c102884kP;
    }

    @Override // X.GZ9
    public final void D3r(Hashtag hashtag) {
        C6FG c6fg = this.A01;
        C14360o3.A0B(c6fg, 0);
        ((C1GL) c6fg.A00(R.id.bloks_ig_scheduler)).schedule(C63822v3.A00(this.A03, hashtag));
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE A09 = c102884kP.A09();
        if (A09 != null) {
            C6FX c6fx = new C6FX();
            c6fx.A03(c102884kP, 0);
            c6fx.A02(c6fg);
            AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, A09);
        }
    }

    @Override // X.GZ9
    public final void D4c(Hashtag hashtag) {
        C6FG c6fg = this.A01;
        C14360o3.A0B(c6fg, 0);
        ((C1GL) c6fg.A00(R.id.bloks_ig_scheduler)).schedule(C63822v3.A01(this.A03, hashtag));
        C102884kP c102884kP = this.A02;
        InterfaceC103384lE A0B = c102884kP.A0B(38);
        if (A0B != null) {
            C6FX c6fx = new C6FX();
            c6fx.A03(c102884kP, 0);
            c6fx.A02(c6fg);
            AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, A0B);
        }
    }
}
