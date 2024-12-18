package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.NDq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52327NDq extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final TargetViewSizeProvider A02;
    public final ClipsCreationViewModel A03;
    public final C187358Sd A04;
    public final C8NL A05;
    public final NIW A06;
    public final NIW A07;
    public final NIX A08;
    public final C87H A09;
    public final C183298Bb A0A;
    public final boolean A0B;

    public C52327NDq(FragmentActivity fragmentActivity, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C8NL c8nl, NIW niw, NIW niw2, NIX nix, C87H c87h, C183298Bb c183298Bb, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A04 = c187358Sd;
        this.A03 = clipsCreationViewModel;
        this.A09 = c87h;
        this.A0A = c183298Bb;
        this.A06 = niw;
        this.A07 = niw2;
        this.A08 = nix;
        this.A02 = targetViewSizeProvider;
        this.A05 = c8nl;
        this.A0B = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application A06 = MSX.A06(this.A00);
        UserSession userSession = this.A01;
        C187358Sd c187358Sd = this.A04;
        ClipsCreationViewModel clipsCreationViewModel = this.A03;
        C87H c87h = this.A09;
        C183298Bb c183298Bb = this.A0A;
        return new C50868Mdz(A06, userSession, this.A02, clipsCreationViewModel, c187358Sd, this.A05, this.A06, this.A07, this.A08, c87h, c183298Bb, this.A0B);
    }
}
