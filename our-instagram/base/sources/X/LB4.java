package X;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LB4 {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        boolean z = false;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        FragmentActivity A042 = C6BQ.A04(c6fq);
        if (Build.VERSION.SDK_INT >= 33) {
            z = true;
        }
        boolean A07 = AbstractC23451Ch.A07(A04, "android.permission.WRITE_EXTERNAL_STORAGE");
        if (!z && !A07) {
            AbstractC43592JPx.A1C(A04, new C44325JiI(new C50253MHi(A042, userSession, A0e, 20), 0), "android.permission.WRITE_EXTERNAL_STORAGE");
            return C0eB.A00;
        }
        A01(userSession, A042, A0e);
        return null;
    }

    public static final void A01(UserSession userSession, Context context, String str) {
        C121275eQ A04 = AbstractC50633MWu.A04(context, userSession, new OUQ(str, "image url", false, false, false), -1L, true);
        C43922JbX.A01(A04, context, 3);
        C1GJ.A04(A04, 103);
    }
}
