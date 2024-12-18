package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.NwB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54113NwB {
    public static final C52169N6y A00(UserSession userSession, String str, String str2) {
        C52169N6y c52169N6y = new C52169N6y();
        Bundle A08 = MSX.A08(userSession);
        A08.putString("ProfileNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", str);
        A08.putBoolean("ProfileNotificationsSettingsFragment.ARG_IS_FOR_IGTV_PROFILE", false);
        A08.putString("ProfileNotificationsSettingsFragment.CLICK_POINT", str2);
        c52169N6y.setArguments(A08);
        return c52169N6y;
    }
}
