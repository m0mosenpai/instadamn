package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCQ extends AbstractC61132qb {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        FragmentActivity fragmentActivity = this.A00;
        Application A06 = MSX.A06(fragmentActivity);
        UserSession userSession = this.A01;
        C84F A00 = AnonymousClass849.A00(A06, userSession).A00(this.A02);
        return new C50986Mft(userSession, A00.A01, MSZ.A0Z(new C52942bb(fragmentActivity), C87G.class));
    }

    public NCQ(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AbstractC167017dG.A1Q(userSession, str);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }
}
