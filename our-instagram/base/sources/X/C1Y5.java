package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.1Y5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y5 implements CallerContextable {
    public static C1Y5 A00 = null;
    public static final String __redex_internal_original_name = "PromoteLauncherImpl";

    public final WEX A00(Context context, UserSession userSession, String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(context, 3);
        return new WEX(context, this, userSession, str, str2);
    }
}
