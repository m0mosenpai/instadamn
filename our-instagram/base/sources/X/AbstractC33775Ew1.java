package X;

import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ew1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33775Ew1 {
    public static final C31720DwP A00(UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, UserSession userSession, String str, boolean z, boolean z2, boolean z3) {
        C31720DwP c31720DwP = new C31720DwP();
        AbstractC25227BEk.A1C(c31720DwP, new C09530e4[]{AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.token), AbstractC166987dD.A1L("tab_type_key", updateProfilePicturePagerAdapter$UpdateProfileTabType), AbstractC166987dD.A1L("logging_surface_key", str), AbstractC166987dD.A1L("coin_flip_setting_value_key", Boolean.valueOf(z)), AbstractC166987dD.A1L("is_viewpager_scroll_enabled_key", Boolean.valueOf(z2)), AbstractC166987dD.A1L("is_enable_avatar_creation_flow", Boolean.valueOf(z3))});
        return c31720DwP;
    }
}
