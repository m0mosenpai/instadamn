package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.846, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass846 extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public AnonymousClass846(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        Context applicationContext = fragmentActivity.getApplicationContext();
        if (applicationContext != null) {
            UserSession userSession = this.A01;
            C14360o3.A0B(userSession, 1);
            AnonymousClass825 anonymousClass825 = (AnonymousClass825) new C52942bb(new AnonymousClass824(applicationContext, userSession), fragmentActivity).A00(AnonymousClass825.class);
            C49602Pt A00 = C2Ps.A00(applicationContext, userSession);
            Application application = fragmentActivity.getApplication();
            if (application != null) {
                Application application2 = fragmentActivity.getApplication();
                C14360o3.A07(application2);
                return new ClipsCreationViewModel(application, userSession, AnonymousClass849.A00(application2, userSession), anonymousClass825, A00);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
