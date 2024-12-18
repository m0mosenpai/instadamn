package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.NBo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52273NBo extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C52273NBo(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        Application application = this.A00.getApplication();
        if (application != null) {
            return new C50866Mdx(application, userSession);
        }
        throw AbstractC166997dE.A0g();
    }
}
