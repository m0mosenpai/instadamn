package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGW extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C43904JbF A02;
    public final MXI A03;

    public KGW(FragmentActivity fragmentActivity, UserSession userSession, C43904JbF c43904JbF, MXI mxi) {
        AbstractC25233BEq.A0w(2, userSession, c43904JbF, mxi);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = c43904JbF;
        this.A03 = mxi;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        Application application = fragmentActivity.getApplication();
        C14360o3.A07(application);
        UserSession userSession = this.A01;
        return new C44454JlM(application, userSession, C75L.A00(fragmentActivity, userSession), this.A02, this.A03);
    }
}
