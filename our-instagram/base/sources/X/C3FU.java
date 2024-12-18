package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3FU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3FU {
    public static boolean A01(UserSession userSession, C23031Ai c23031Ai) {
        if (!A02(userSession, "ig_olympus_disable_video_autoplay")) {
            InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
            String A00 = AbstractC111324zv.A00(3329);
            if (interfaceC19630xq.getInt(A00, 0) == 0) {
                if (!A02(userSession, "ig_autoplay_disabled_default")) {
                    return false;
                }
            } else if (interfaceC19630xq.getInt(A00, 0) != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean A00(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!A02(userSession, "ig_olympus_disable_video_autoplay")) {
            if (A02(userSession, "ig_disable_video_autoplay")) {
                if (!A02(userSession, "ig_video_setting") || A01(userSession, A00)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean A02(UserSession userSession, String str) {
        return C26661Qv.A00(userSession).C98().A0C.contains(str);
    }
}
