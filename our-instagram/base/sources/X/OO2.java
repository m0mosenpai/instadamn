package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class OO2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Context context, View view, Fragment fragment, UserSession userSession, Map map) {
        C14360o3.A0B(userSession, 1);
        if (view.isEnabled()) {
            view.setEnabled(false);
            AbstractC192798gL A05 = C192108fB.A05(userSession, "com.instagram.branded_content.screens.post_level_age_geo_gating_load_screen", map);
            A05.A00(new C67906V1v(1, context, view, fragment, userSession));
            ((C1GL) fragment).schedule(A05);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(Context context, View view, Fragment fragment, UserSession userSession, Map map) {
        boolean A1Y = AbstractC25229BEm.A1Y(userSession);
        if (view.isEnabled()) {
            view.setEnabled(A1Y);
            AbstractC192798gL A05 = C192108fB.A05(userSession, "com.instagram.branded_content.screens.post_level_country_gating_load_screen", map);
            A05.A00(new C67906V1v(2, context, view, fragment, userSession));
            ((C1GL) fragment).schedule(A05);
        }
    }
}
