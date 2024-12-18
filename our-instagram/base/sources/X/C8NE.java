package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8NE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NE extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C1818484t A02;

    public C8NE(FragmentActivity fragmentActivity, UserSession userSession, C1818484t c1818484t) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragmentActivity, 2);
        C14360o3.A0B(c1818484t, 3);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = c1818484t;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00.getApplication();
        if (application != null) {
            return new C8NF(application, this.A01, this.A02);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
