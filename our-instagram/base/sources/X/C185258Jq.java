package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8Jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185258Jq extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C185258Jq(UserSession userSession, FragmentActivity fragmentActivity) {
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
        C87D c87d = (C87D) new C52942bb(new C87C(userSession, fragmentActivity), fragmentActivity).A00(C87D.class);
        C87H A00 = ((C87G) new C52942bb(fragmentActivity).A00(new C87G().getClass())).A00("post_capture");
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        return new C8BE(userSession, AnonymousClass849.A00(application, userSession), c87d, clipsCreationViewModel, A00);
    }
}
