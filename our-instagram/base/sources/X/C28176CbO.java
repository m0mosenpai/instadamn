package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* renamed from: X.CbO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28176CbO {
    public final C8k A00;
    public final InterfaceC09390do A01;
    public final String A02;

    public C28176CbO(C8k c8k, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = c8k;
        this.A02 = str;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37050GUg(userSession, 23));
    }

    public static final void A00(C8o c8o, C28176CbO c28176CbO, String str) {
        Map map;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) c28176CbO.A01.getValue(), AbstractC111324zv.A00(1111));
        if (A0f.isSampled()) {
            A0f.A8R(c8o, "event_type");
            A0f.A8R(c28176CbO.A00, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.AAP("surface_session_id", str);
            String str2 = c28176CbO.A02;
            if (str2 != null) {
                map = AbstractC167007dF.A0n("ig_mifu_ifysession_id", str2);
            } else {
                map = null;
            }
            A0f.A9M("app_context_data", map);
            A0f.AAP("thread_type", "1012");
            A0f.Cht();
        }
    }
}
