package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Li, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8Li {
    public static final boolean A00(Context context) {
        Boolean bool = AbstractC177217uH.A00;
        if (bool == null) {
            bool = Boolean.valueOf(AbstractC115265Ix.A00(context, false));
            AbstractC177217uH.A00 = bool;
            if (bool == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bool.booleanValue();
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (Build.VERSION.SDK_INT >= 34 && C18U.A06(C06090Tz.A05, userSession, 36321623594772112L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        if (Build.VERSION.SDK_INT >= 34 && C18U.A06(C06090Tz.A05, userSession, 36321623594313355L)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(boolean z) {
        if (Build.VERSION.SDK_INT >= 33 && z) {
            return true;
        }
        return false;
    }
}
