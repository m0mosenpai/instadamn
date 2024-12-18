package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* renamed from: X.DwO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31719DwO {
    public static final void A00(EnumC69993Ci enumC69993Ci, UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "fx_growth_identity_syncing");
        if (A0f.isSampled()) {
            A0f.AAP("event_name", str);
            if (enumC69993Ci == null) {
                enumC69993Ci = EnumC69993Ci.FX_UNKNOWN;
            }
            A0f.A8R(enumC69993Ci, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.AAP("flow_type", str2);
            A0f.A9K("initiator_account_id", AbstractC25231BEo.A0j(0, userSession.userId));
            A0f.A8R(EnumC31511Dsv.INSTAGRAM, "initiator_account_type");
            A0f.AAP("origin", str3);
            A0f.AAP("from_value", null);
            A0f.AAP("to_value", str4);
            A0f.A9M("additional_info", map);
            A0f.Cht();
        }
    }
}
