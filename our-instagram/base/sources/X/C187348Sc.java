package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187348Sc extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final C2GT A01;
    public final C2GT A02;
    public final UserSession A03;

    public C187348Sc(FragmentActivity fragmentActivity, C2GT c2gt, C2GT c2gt2, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c2gt, 3);
        C14360o3.A0B(c2gt2, 4);
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = c2gt;
        this.A01 = c2gt2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00.getApplication();
        C14360o3.A07(application);
        return new C187358Sd(application, this.A02, this.A01, this.A03);
    }
}
