package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KG3 extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public KG3(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00.getApplication();
        C14360o3.A07(application);
        return new C44452JlK(application, this.A01);
    }
}
