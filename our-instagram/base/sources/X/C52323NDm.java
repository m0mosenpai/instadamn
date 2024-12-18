package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.NDm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52323NDm extends AbstractC61132qb {
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final ClipsCreationViewModel A03;
    public final C187418Sj A04;
    public final C187358Sd A05;
    public final InterfaceC16820sZ A06;
    public final boolean A07;

    public C52323NDm(FragmentActivity fragmentActivity, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C187418Sj c187418Sj, C187358Sd c187358Sd, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = clipsCreationViewModel;
        this.A05 = c187358Sd;
        this.A04 = c187418Sj;
        this.A00 = i;
        this.A07 = z;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application A06 = MSX.A06(this.A01);
        UserSession userSession = this.A02;
        ClipsCreationViewModel clipsCreationViewModel = this.A03;
        C187358Sd c187358Sd = this.A05;
        return new C50973Mfg(A06, userSession, clipsCreationViewModel, this.A04, c187358Sd, this.A06, this.A00, this.A07);
    }
}
