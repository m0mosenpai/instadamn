package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.87C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87C extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C87C(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        Application application = fragmentActivity.getApplication();
        if (application != null) {
            Application application2 = fragmentActivity.getApplication();
            C14360o3.A07(application2);
            return new C87D(application, AnonymousClass849.A00(application2, userSession), clipsCreationViewModel);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
