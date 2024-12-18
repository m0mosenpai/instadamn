package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185268Jr extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C185268Jr(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00.getApplication();
        if (application != null) {
            return new C185278Js(application, this.A01);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
