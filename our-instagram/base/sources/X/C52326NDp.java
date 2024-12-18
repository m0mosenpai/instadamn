package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.NDp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52326NDp extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final C185278Js A02;
    public final C50864Mdv A03;
    public final C87D A04;
    public final C8NF A05;
    public final ClipsCreationViewModel A06;
    public final C187358Sd A07;
    public final C8NL A08;
    public final C50868Mdz A09;
    public final NIX A0A;
    public final C183298Bb A0B;

    public C52326NDp(Application application, UserSession userSession, C185278Js c185278Js, C50864Mdv c50864Mdv, C87D c87d, C8NF c8nf, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C8NL c8nl, C50868Mdz c50868Mdz, NIX nix, C183298Bb c183298Bb) {
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A09 = c50868Mdz;
        this.A07 = c187358Sd;
        this.A05 = c8nf;
        this.A06 = clipsCreationViewModel;
        this.A0B = c183298Bb;
        this.A04 = c87d;
        this.A0A = nix;
        this.A08 = c8nl;
        this.A02 = c185278Js;
        this.A03 = c50864Mdv;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        C50868Mdz c50868Mdz = this.A09;
        C187358Sd c187358Sd = this.A07;
        C8NF c8nf = this.A05;
        ClipsCreationViewModel clipsCreationViewModel = this.A06;
        C183298Bb c183298Bb = this.A0B;
        C87D c87d = this.A04;
        C185278Js c185278Js = this.A02;
        NIX nix = this.A0A;
        return new C50865Mdw(application, userSession, c185278Js, this.A03, c87d, c8nf, clipsCreationViewModel, c187358Sd, this.A08, c50868Mdz, nix, c183298Bb);
    }
}
