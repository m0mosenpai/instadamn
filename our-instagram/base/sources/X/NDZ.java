package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* loaded from: classes9.dex */
public final class NDZ extends AbstractC61132qb {
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final ClipsCreationViewModel A03;
    public final C187358Sd A04;
    public final InterfaceC16820sZ A05;

    public NDZ(FragmentActivity fragmentActivity, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, InterfaceC16820sZ interfaceC16820sZ, int i) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = c187358Sd;
        this.A03 = clipsCreationViewModel;
        this.A00 = i;
        this.A05 = interfaceC16820sZ;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application A06 = MSX.A06(this.A01);
        UserSession userSession = this.A02;
        C187358Sd c187358Sd = this.A04;
        return new NIX(A06, userSession, this.A03, c187358Sd, this.A05, this.A00);
    }
}
