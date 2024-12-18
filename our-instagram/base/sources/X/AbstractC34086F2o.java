package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.F2o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34086F2o {
    public static final void A00(View view, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee, boolean z) {
        String str;
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            AbstractC34082F2k.A00(findViewById);
            interfaceC148366m6.DWL();
            AbstractC167017dG.A0g(AbstractC166987dD.A0x(userSession), AbstractC111324zv.A00(4807)).apply();
            String C7I = c2ee.C7I();
            if (C7I != null) {
                if (z) {
                    str = "impression";
                } else {
                    str = "tap";
                }
                F8L.A00(userSession, C7I, "kindness_reminder_dismissed", str, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            }
        }
    }
}
