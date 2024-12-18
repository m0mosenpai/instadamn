package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ExQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33862ExQ {
    public static final C0eB A00(C6FQ c6fq) {
        String token;
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (A0B instanceof UserSession) {
            C023409i.A0A.A03(new C36697GFs(0));
            token = "IgSessionManager.LOGGED_OUT_TOKEN";
        } else {
            token = A0B.getToken();
        }
        C140966Yy A0N = AbstractC31177DnL.A0N(A04, A0B);
        Bundle A09 = AbstractC31176DnK.A09(token);
        A09.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", "");
        A09.putBoolean("com.instagram.android.login.fragment.ARGUMENT_USER_IS_VALID", true);
        AbstractC31175DnJ.A0t(A09, new ELH(), A0N);
        return C0eB.A00;
    }
}
