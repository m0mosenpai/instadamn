package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class MXX {
    public static final Integer A00(UserSession userSession) {
        if ((!AbstractC166987dD.A0x(userSession).getBoolean("clips_has_acknowledged_v2_nux", false)) || MSZ.A0i(userSession) != C05F.A01 || AbstractC166987dD.A0x(userSession).getBoolean("clips_remix_camera_nux_content_viewed", false)) {
            return null;
        }
        return C05F.A0Y;
    }

    public static final Integer A01(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (!z && !AbstractC166987dD.A0x(userSession).getBoolean("clips_has_acknowledged_v2_nux", false)) {
            Integer A0h = MSZ.A0h(userSession);
            Integer num = C05F.A01;
            if (A0h == num && AbstractC166997dE.A0Y(userSession).A06() == 0) {
                if (MSZ.A0h(userSession) == num && !AbstractC166987dD.A0x(userSession).getBoolean("clips_remix_camera_nux_content_viewed", false)) {
                    return C05F.A00;
                }
                return C05F.A0C;
            }
            return null;
        }
        return null;
    }

    public static final void A02(UserSession userSession, Integer num) {
        InterfaceC19610xo A0e;
        String str;
        C14360o3.A0B(userSession, 0);
        int A03 = AbstractC43592JPx.A03(num, 1);
        if (A03 != 2 && A03 != 1) {
            if (A03 != 0) {
                if (A03 != 3) {
                    if (A03 != 4) {
                        throw B4Z.A00();
                    }
                }
            } else {
                InterfaceC19610xo A0e2 = AbstractC31176DnK.A0e(userSession);
                A0e2.E77("clips_has_acknowledged_v2_nux", true);
                A0e2.apply();
            }
            A0e = AbstractC31176DnK.A0e(userSession);
            str = "clips_remix_camera_nux_content_viewed";
            A0e.E77(str, true);
            A0e.apply();
        }
        A0e = AbstractC31176DnK.A0e(userSession);
        str = "clips_has_acknowledged_v2_nux";
        A0e.E77(str, true);
        A0e.apply();
    }
}
