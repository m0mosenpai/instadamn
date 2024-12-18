package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GEP implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0y = false;
        C189478aR A00 = A0y.A00();
        FragmentActivity fragmentActivity = this.A00;
        FVI.A01().A00();
        A00.A02(fragmentActivity, W6d.A01(AbstractC31171DnF.A0C(userSession), C66277U6x.A00("com.bloks.www.ig_subscriptions.creator_experience.welcome_message_send")));
    }

    public GEP(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
