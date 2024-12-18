package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GED implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        String str;
        UserSession userSession = this.A01;
        if (!AbstractC166987dD.A10(userSession).A1a()) {
            str = AbstractC111324zv.A00(46);
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        AbstractC31181DnP.A0S(W6d.A00(AbstractC31171DnF.A0C(userSession), C66277U6x.A01(str, AbstractC31180DnO.A0p("ContactOptionsEntryPoint", "whatsapp_linking_in_quick_promotion"))), this.A00, userSession);
    }

    public GED(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
