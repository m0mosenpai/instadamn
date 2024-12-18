package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* loaded from: classes9.dex */
public final class NCR extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final ClipsCreationViewModel A02;

    public NCR(FragmentActivity fragmentActivity, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = clipsCreationViewModel;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00.getApplication();
        if (application != null) {
            return new C50864Mdv(application, this.A01, this.A02);
        }
        throw AbstractC166997dE.A0g();
    }
}
