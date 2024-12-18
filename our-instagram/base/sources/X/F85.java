package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public abstract class F85 {
    public static final C32343EMp A00(EnumC33481ErG enumC33481ErG, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        A0b.putString(AbstractC111324zv.A00(3255), str);
        A0b.putString("hall_pass_id", str2);
        A0b.putString("hall_pass_name", str3);
        A0b.putString("media_id", str4);
        A0b.putString("media_owner_id", str5);
        A0b.putString("view_session_id", str6);
        A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33481ErG);
        C32343EMp c32343EMp = new C32343EMp();
        c32343EMp.setArguments(A0b);
        return c32343EMp;
    }
}
