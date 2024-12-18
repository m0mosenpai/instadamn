package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class GDG implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("event_source", "quick_promotion");
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2147), A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131952427);
        A0C.A0l = true;
        A01.A04(fragmentActivity, A0C);
    }

    public GDG(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
