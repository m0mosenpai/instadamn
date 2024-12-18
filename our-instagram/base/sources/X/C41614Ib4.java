package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ib4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41614Ib4 {
    public Boolean A00;
    public final UserSession A01;

    public final boolean A01(Integer num) {
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 11:
                case 14:
                case 16:
                case 18:
                case Process.SIGSTOP /* 19 */:
                case 20:
                case 21:
                    return true;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                    Boolean bool = this.A00;
                    if (bool == null) {
                        bool = false;
                        this.A00 = bool;
                    }
                    return bool.booleanValue();
            }
        }
        return false;
    }

    public static C41614Ib4 A00(UserSession userSession) {
        C41614Ib4 c41614Ib4 = (C41614Ib4) userSession.A00(C41614Ib4.class);
        if (c41614Ib4 == null) {
            C41614Ib4 c41614Ib42 = new C41614Ib4(userSession);
            userSession.A04(C41614Ib4.class, c41614Ib42);
            return c41614Ib42;
        }
        return c41614Ib4;
    }

    public C41614Ib4(UserSession userSession) {
        this.A01 = userSession;
    }
}
