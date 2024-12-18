package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.Km5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46748Km5 {
    public static final KCT A00(UserSession userSession, DirectThreadKey directThreadKey, String str, String str2, String str3, List list, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(userSession, 0);
        KCT kct = new KCT();
        Bundle A0D = AbstractC31174DnI.A0D(userSession);
        A0D.putBoolean("BUNDLE_IS_EMBEDDED", z);
        A0D.putInt("MAX_MULTI_SELECT_COUNT", i);
        A0D.putInt("MAX_MULTI_VIDEO_COUNT", i2);
        A0D.putBoolean("BUNDLE_IS_CAPTURE_BUTTON_ENABLED", false);
        A0D.putString("BUNDLE_THREAD_TRANSPORT_TYPE", str);
        A0D.putBoolean("BUNDLE_SHOW_SELECT_BUTTON", z2);
        A0D.putFloat("BUNDLE_ASPECT_RATIO", f);
        A0D.putString("BUNDLE_FOLDER_NAME", str2);
        if (list != null) {
            A0D.putParcelableArrayList("BUNDLE_SELECTED_ITEMS", AbstractC166987dD.A1F(list));
        }
        A0D.putString("BUNDLE_SUBHEADER_TITLE", str3);
        A0D.putString("BUNDLE_SUBHEADER_SUBTITLE", null);
        A0D.putBoolean("BUNDLE_KEEP_FOLDER_SELECTION", z3);
        A0D.putBoolean("BUNDLE_SHOW_DONE_BUTTON", z4);
        A0D.putParcelable("DIRECT_THREAD_KEY", C0B1.A00(directThreadKey));
        A0D.putBoolean("BUNDLE_SHOW_MAGIC_MEDIA_REMIX", z5);
        kct.setArguments(A0D);
        return kct;
    }
}
