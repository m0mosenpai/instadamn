package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;

/* loaded from: classes8.dex */
public final class KG2 extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;

    public KG2(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44450JlI(this.A00, SecurityAlertRepository.A04.A00(this.A01));
    }
}
