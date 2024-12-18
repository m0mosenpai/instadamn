package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class GD5 implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        EnumC55212gM enumC55212gM = EnumC55212gM.A1Z;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (enumC55212gM.A00(userSession, obj)) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("usecase", "ecm_filtered_content_management");
            C66277U6x A01 = C66277U6x.A01("com.bloks.www.bloks.prcx.identity.selection", A1G);
            FragmentActivity fragmentActivity = this.A00;
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0U = "";
            AbstractC31173DnH.A14(fragmentActivity, A0C, A01);
        }
    }

    public GD5(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
