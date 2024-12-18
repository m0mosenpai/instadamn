package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.VQq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68434VQq {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0P = AbstractC65702TsY.A0P(c6fw, 0);
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        User A01 = C17060sy.A01.A01(userSession);
        if (A0P.A06.indexOfKey(35) >= 0 || ((SparseArray) A0P.A07.A00()).indexOfKey(35) >= 0) {
            Boolean valueOf = Boolean.valueOf(A0P.A0S(35, false));
            if (!C14360o3.A0K(valueOf, A01.A03.CZk())) {
                A01.A03.EaA(valueOf);
                AnonymousClass189.A00(userSession).A03(A01);
                return null;
            }
            return null;
        }
        return null;
    }
}
