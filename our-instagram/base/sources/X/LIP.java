package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LIP {
    public static final LIP A00 = new Object();

    public static final C83403nh A00(C83553nw c83553nw, String str, long j) {
        AbstractC167007dF.A1D(str, 0, c83553nw);
        C83403nh c83403nh = new C83403nh();
        c83403nh.A1D(AbstractC43593JPy.A0w());
        c83403nh.A1B(Long.valueOf(j));
        c83403nh.A1E(str);
        if (c83403nh.A2D) {
            c83403nh.A2D = false;
            c83403nh.A2C = true;
        }
        c83403nh.A1m(C05F.A0j);
        c83403nh.A18(C2EY.A0G, c83553nw);
        return c83403nh;
    }

    public final C160787Im A01(UserSession userSession, C7TT c7tt, C83553nw c83553nw, User user, long j) {
        C14360o3.A0B(c83553nw, 4);
        return new C160787Im(userSession, c7tt, A00(c83553nw, user.getId(), j), user);
    }
}
