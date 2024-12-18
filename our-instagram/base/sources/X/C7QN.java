package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7QN, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7QN {
    public static final boolean A00(UserSession userSession, C160787Im c160787Im) {
        Integer num;
        C7TT c7tt = c160787Im.A0G;
        if ((!c7tt.A1A && c7tt.A08 != 29) || c7tt.A1G) {
            return false;
        }
        C83403nh c83403nh = c160787Im.A0e;
        C7BW c7bw = c83403nh.A0Q;
        if (c7bw != null) {
            num = c7bw.A02;
        } else {
            num = null;
        }
        if (num == C05F.A01) {
            return false;
        }
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        if (!C7P5.A00().A01(c2ey).CWd(userSession, c83403nh) || c83403nh.A1F != C05F.A0j) {
            return false;
        }
        C7TT c7tt2 = c160787Im.A0G;
        if (c7tt2.A1G || c83403nh.A13 != null || c83403nh.C8i() < 1450137600000000L) {
            return false;
        }
        return c7tt2.A08 != 29 || (c7tt2.A0n && c7tt2.A07 == 7) || c7tt2.A07 == 0;
    }
}
