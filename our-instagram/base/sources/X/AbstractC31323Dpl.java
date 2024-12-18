package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dpl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31323Dpl {
    public static final boolean A00(UserSession userSession, C83403nh c83403nh) {
        if (!AbstractC162597Pw.A01(c83403nh, userSession.userId)) {
            C2EY c2ey = c83403nh.A10;
            F38 f38 = F38.$redex_init_class;
            int ordinal = c2ey.ordinal();
            if (ordinal == 2 || ordinal == 11 || ordinal == 98) {
                return true;
            }
        }
        return false;
    }
}
