package X;

import android.app.Activity;
import android.os.Build;
import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.CgX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28425CgX {
    public static final C28425CgX A00 = new Object();

    public static final boolean A01(Activity activity) {
        if (AbstractC72723Nt.A00(activity) || AbstractC56402iY.A00(activity) != -1) {
            return false;
        }
        return true;
    }

    public final void A02(ComponentActivity componentActivity, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        if (componentActivity != null) {
            int i = AbstractC28144Car.A00;
            C29941DIf c29941DIf = C29941DIf.A00;
            boolean A1U = AbstractC167007dF.A1U(c29941DIf);
            AbstractC28144Car.A00(componentActivity, new CS1(c29941DIf, A1U ? 1 : 0, A1U ? 1 : 0, A1U ? 1 : 0), new CS1(c29941DIf, AbstractC28144Car.A01, AbstractC28144Car.A00, A1U ? 1 : 0));
        }
        AbstractC56402iY.A06(componentActivity, false);
        if (componentActivity != null && z && A03(userSession)) {
            AbstractC56402iY.A02(componentActivity, -1);
        }
    }

    public final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A00() && C18U.A06(C06090Tz.A05, userSession, 36323096768883674L)) {
            return true;
        }
        return false;
    }

    public static final boolean A00() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return true;
    }
}
