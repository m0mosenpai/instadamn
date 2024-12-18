package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.89S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89S extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C89S(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragmentActivity, 2);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        UserSession userSession = this.A01;
        Context applicationContext = fragmentActivity.getApplicationContext();
        C14360o3.A07(applicationContext);
        return new C89T(application, AbstractC142256bi.A00(applicationContext, userSession), userSession, ((C87G) new C52942bb(fragmentActivity).A00(C87G.class)).A00("post_capture"));
    }
}
