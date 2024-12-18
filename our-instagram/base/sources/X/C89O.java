package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.89O, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89O extends AbstractC61132qb {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public C89O(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        final FragmentActivity fragmentActivity = this.A00;
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        final UserSession userSession = this.A01;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        C89R c89r = (C89R) new C52942bb(new AbstractC61132qb(userSession, fragmentActivity) { // from class: X.89Q
            public final FragmentActivity A00;
            public final UserSession A01;

            @Override // X.AbstractC61132qb
            public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                UserSession userSession2 = this.A01;
                FragmentActivity fragmentActivity2 = this.A00;
                return new C89R((C89T) new C52942bb(new C89S(userSession2, fragmentActivity2), fragmentActivity2).A00(C89T.class), (C89Y) new C52942bb(new C89X(userSession2), fragmentActivity2).A00(C89Y.class), userSession2);
            }

            {
                this.A01 = userSession;
                this.A00 = fragmentActivity;
            }
        }, fragmentActivity).A00(C89R.class);
        C89N c89n = (C89N) new C52942bb(new C89M(userSession), fragmentActivity).A00(C89N.class);
        C14360o3.A07(c89n);
        final Application application2 = fragmentActivity.getApplication();
        C14360o3.A07(application2);
        return new C89P(application, c89r, (C1828189b) new C52942bb(new AbstractC61132qb(application2, userSession) { // from class: X.89a
            public final Application A00;
            public final UserSession A01;

            @Override // X.AbstractC61132qb
            public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                return new C1828189b(this.A00, this.A01);
            }

            {
                this.A00 = application2;
                this.A01 = userSession;
            }
        }, fragmentActivity).A00(C1828189b.class), userSession, clipsCreationViewModel, c89n);
    }
}
