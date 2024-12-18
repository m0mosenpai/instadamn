package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FVP {
    public static EnumC33507Erg A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 4) {
                        return EnumC33507Erg.REMOVE_PROFILE_PICTURE;
                    }
                    return EnumC33507Erg.NAME_CHANGE_REMINDER;
                }
                return EnumC33507Erg.EDIT_PHOTO_REMINDER;
            }
            return EnumC33507Erg.SET_AVATAR_PROFILE_PICTURE;
        }
        return EnumC33507Erg.CHANGE_PROFILE_PICTURE_FIRST_TIME;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Ef2, X.Fby] */
    public static void A01(Fragment fragment, UserSession userSession, Integer num) {
        C35241Fga.A02(A00(num), userSession, "reminder_manage_settings");
        C28361Yx c28361Yx = C28361Yx.A02;
        if (c28361Yx != null) {
            C14360o3.A0B(userSession, 0);
            ?? abstractC35025Fby = new AbstractC35025Fby(fragment, userSession);
            abstractC35025Fby.A00 = 0;
            c28361Yx.A00 = abstractC35025Fby;
            abstractC35025Fby.A04("TOGGLE_CENTRAL_IDENTITY_SYNC");
            return;
        }
        AbstractC31171DnF.A0v();
        throw C00O.createAndThrow();
    }
}
