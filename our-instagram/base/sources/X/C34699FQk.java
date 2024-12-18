package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import org.json.JSONObject;

/* renamed from: X.FQk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34699FQk {
    public final C32367ENr A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        C32367ENr c32367ENr = new C32367ENr();
        c32367ENr.setArguments(A05);
        return c32367ENr;
    }

    public final C32345EMr A01(UserSession userSession, ImageUrl imageUrl, EnumC33371Ep4 enumC33371Ep4, String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        C14360o3.A0B(enumC33371Ep4, 1);
        C32345EMr c32345EMr = new C32345EMr();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("target_user_id", str);
        A0b.putString("target_username", str2);
        A0b.putParcelable("target_profile_url", imageUrl);
        A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33371Ep4);
        A0b.putString("analytics_extra", AbstractC31180DnO.A0k(jSONObject));
        A0b.putBoolean("hide_action_button", z);
        A0b.putBoolean("dont_dismiss_on_restrict_success", z2);
        AbstractC03240Dh.A00(A0b, userSession);
        c32345EMr.setArguments(A0b);
        return c32345EMr;
    }
}
