package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

/* renamed from: X.1ZC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZC {
    public final Fragment A00(Context context, UserSession userSession, Integer num) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        if (C18U.A06(C06090Tz.A05, userSession, 36318664362760593L)) {
            return FBR.A00(EnumC72365Xc1.A06, AbstractC22722A0s.A00(num));
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        boolean z = false;
        if ((C18U.A06(c06090Tz, userSession, 36315383006760111L) || C18U.A06(c06090Tz, userSession, 36314743058402086L)) && (!F7A.A00(userSession) || (F7A.A00(userSession) && AbstractC23043ADz.A01(userSession)))) {
            z = true;
        }
        C131305wJ c131305wJ = new C131305wJ(userSession);
        HashMap hashMap = new HashMap();
        hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC22722A0s.A00(num));
        String str = "True";
        Object obj = "False";
        if (z) {
            obj = "True";
        }
        hashMap.put("is_spam_filter_enabled", obj);
        if (c131305wJ.A04()) {
            Object obj2 = "False";
            if (c131305wJ.A03.A01(2)) {
                obj2 = "True";
            }
            hashMap.put("is_predefined_list_enabled", obj2);
        }
        if (c131305wJ.A03()) {
            if (!c131305wJ.A03.A01(3)) {
                str = "False";
            }
            hashMap.put("is_custom_list_enabled", str);
        }
        C66277U6x A01 = C66277U6x.A01("com.instagram.mwb.si.content_filter.settings", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0U = context.getString(2131968102);
        return W6d.A02(igBloksScreenConfig, A01);
    }
}
