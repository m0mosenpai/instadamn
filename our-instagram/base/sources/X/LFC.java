package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class LFC {
    public static final KCY A00(UserSession userSession, EnumC92794Ds enumC92794Ds, DirectThreadKey directThreadKey, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        String str;
        KCY kcy = new KCY();
        Bundle A0D = AbstractC31174DnI.A0D(userSession);
        A0D.putBoolean("BUNDLE_IS_EMBEDDED", z);
        if (enumC92794Ds == null || (str = enumC92794Ds.A00) == null) {
            str = "";
        }
        A0D.putString("BUNDLE_THREAD_TRANSPORT_TYPE", str);
        A0D.putBoolean("BUNDLE_SHOW_SELECT_BUTTON", z2);
        A0D.putBoolean("BUNDLE_SHOW_MEDIA_THUMBNAILS", z3);
        A0D.putBoolean("BUNDLE_SHOW_NEXT_BUTTON", z4);
        A0D.putBoolean("BUNDLE_SHOW_VIEW_MODE_SELECTOR", z5);
        A0D.putFloat("BUNDLE_ASPECT_RATIO", f);
        A0D.putFloat("BUNDLE_INITIAL_HEIGHT_RATIO", f2);
        A0D.putFloat("BUNDLE_MAXIMUM_HEIGHT_RATIO", f3);
        A0D.putBoolean("BUNDLE_SHOW_DONE_BUTTON_IN_GALLERY", false);
        A0D.putBoolean("BUNDLE_SHOW_MAGIC_MEDIA_REMIX", z6);
        A0D.putParcelable("BUNDLE_DIRECT_THREAD_KEY", directThreadKey);
        A0D.putBoolean("BUNDLE_SHOW_SEND_BUTTON", z7);
        kcy.setArguments(A0D);
        return kcy;
    }

    public final KCY A01(UserSession userSession, EnumC92794Ds enumC92794Ds, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession, enumC92794Ds, directThreadKey, 1.0f, 0.7f, 1.0f, false, false, false, false, false, false, true);
    }
}
