package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8NK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NK extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final ClipsCreationViewModel A02;

    public C8NK(FragmentActivity fragmentActivity, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragmentActivity, 2);
        C14360o3.A0B(clipsCreationViewModel, 3);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = clipsCreationViewModel;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00.getApplication();
        if (application != null) {
            return new C8NL(application, this.A01, this.A02);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
