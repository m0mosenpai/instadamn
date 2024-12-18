package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.8hK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC193398hK {
    public static final boolean A01(UserSession userSession) {
        if (Build.VERSION.SDK_INT >= 34 && C18U.A06(C06090Tz.A05, userSession, 2342162957770694509L)) {
            return true;
        }
        return false;
    }

    public static final boolean A00(Context context, UserSession userSession) {
        if (AbstractC93174Ft.A04(context) && C18U.A06(C06090Tz.A05, userSession, 2342162957770694509L)) {
            return true;
        }
        return false;
    }
}
