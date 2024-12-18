package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;

/* renamed from: X.Vry, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69595Vry {
    public String A00;
    public String A01;
    public String A02;
    public final UserSession A03;

    public C69595Vry(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
    }

    public final void A00(Activity activity) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        }
        String str2 = this.A02;
        if (str2 != null) {
            linkedHashMap.put("search_session_id", str2);
        }
        String str3 = this.A01;
        if (str3 != null) {
            linkedHashMap.put("query_text", str3);
        }
        C1VN c1vn = C1VN.A00;
        if (c1vn != null) {
            c1vn.A00(activity, this.A03, "1522452805152883", linkedHashMap);
        }
    }
}
