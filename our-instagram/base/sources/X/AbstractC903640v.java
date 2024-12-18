package X;

import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.40v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC903640v {
    public static final int A00(UserSession userSession, C38321qM c38321qM) {
        int A0p;
        boolean z;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(userSession, 1);
        if (C18U.A06(C06090Tz.A05, userSession, 36327662318271250L)) {
            A0p = c38321qM.A0q();
        } else {
            A0p = c38321qM.A0p();
        }
        boolean[] zArr = new boolean[A0p];
        for (int i = 0; i < A0p; i++) {
            C38321qM A1e = c38321qM.A1e(i);
            if (A1e != null) {
                z = A1e.A5n();
            } else {
                z = false;
            }
            zArr[i] = z;
        }
        return Arrays.hashCode(new Object[]{c38321qM.A3M(), Boolean.valueOf(c38321qM.A4o()), c38321qM.A3j(), Integer.valueOf(A0p), c38321qM.A0C.BZ5(), Boolean.valueOf(c38321qM.A5G()), Integer.valueOf(Arrays.hashCode(zArr))});
    }
}
