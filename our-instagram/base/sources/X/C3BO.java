package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3BO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3BO {
    public static final void A00(Activity activity, C07X c07x, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 3);
        c07x.getLifecycle().A09(new C3BP(userSession, activity, str));
    }
}
