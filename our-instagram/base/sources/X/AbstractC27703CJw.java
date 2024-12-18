package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.CJw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27703CJw {
    public static final C26788BsC A00(UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        A0b.putBoolean("com.instagram.release.lockout.disable_back_press", z);
        A0b.putBoolean("com.instagram.release.lockout.expired_build", z2);
        C26788BsC c26788BsC = new C26788BsC();
        c26788BsC.setArguments(A0b);
        return c26788BsC;
    }
}
