package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KqX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47014KqX {
    public static boolean A00(UserSession userSession, C83403nh c83403nh, String str) {
        if (!C4GU.A01(c83403nh.A1F)) {
            return false;
        }
        for (C45035JwQ c45035JwQ : AbstractC61362qy.A00(userSession).A00(String.valueOf(c83403nh.A0g()))) {
            if (C14360o3.A0K(c45035JwQ.A03, str) && c45035JwQ.A01 == 1) {
                return true;
            }
        }
        return false;
    }
}
