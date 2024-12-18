package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ND1 extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C87D A02;
    public final String A03;

    public ND1(FragmentActivity fragmentActivity, UserSession userSession, C87D c87d, String str) {
        AbstractC25233BEq.A0w(1, userSession, str, c87d);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A02 = c87d;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        Application A06 = MSX.A06(fragmentActivity);
        UserSession userSession = this.A01;
        C84F A00 = AnonymousClass849.A00(A06, userSession).A00(this.A03);
        return new C50858Mdp(MSX.A06(fragmentActivity), userSession, A00.A01, A00.A05, this.A02);
    }
}
