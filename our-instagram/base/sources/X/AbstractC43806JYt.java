package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.instagram.common.session.UserSession;

/* renamed from: X.JYt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43806JYt {
    public static final boolean A00(Context context, UserSession userSession) {
        Resources resources;
        DisplayMetrics displayMetrics;
        if (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null || displayMetrics.widthPixels <= 360) {
            return false;
        }
        return AbstractC31176DnK.A1a(C06090Tz.A05, userSession, 36315894107934394L);
    }

    public static final boolean A01(UserSession userSession) {
        return C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36329796917019164L);
    }
}
