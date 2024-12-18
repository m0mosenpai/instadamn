package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JQo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43607JQo {
    public static boolean A00(UserSession userSession, Integer num) {
        InterfaceC19630xq interfaceC19630xq;
        String str;
        if (C3FU.A02(userSession, "ig_video_setting")) {
            return false;
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 4) {
                        if (intValue != 3) {
                            return true;
                        }
                        if (!C3FU.A02(userSession, "ig_video_nux")) {
                            return false;
                        }
                        interfaceC19630xq = A00.A01;
                        str = "zero_rating_direct_video_nux_count";
                    } else {
                        if (!C3FU.A02(userSession, "ig_video_nux") && !C3FU.A02(userSession, "ig_select_video_nux")) {
                            return false;
                        }
                        interfaceC19630xq = A00.A01;
                        str = "zero_rating_explore_video_nux_count";
                    }
                } else {
                    if (!C3FU.A02(userSession, "ig_live_nux")) {
                        return false;
                    }
                    interfaceC19630xq = A00.A01;
                    str = "zero_rating_live_nux_count";
                }
            } else {
                if (!C3FU.A02(userSession, "ig_story_nux")) {
                    return false;
                }
                interfaceC19630xq = A00.A01;
                str = "zero_rating_story_nux_count";
            }
        } else {
            if (!C3FU.A02(userSession, "ig_video_nux")) {
                return false;
            }
            interfaceC19630xq = A00.A01;
            str = "zero_rating_feed_video_nux_count";
        }
        if (interfaceC19630xq.getInt(str, 0) >= 1) {
            return false;
        }
        return true;
    }
}
