package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4I8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4I8 {
    public static final Long A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        String fbidV2 = C08730cb.A00(userSession).A00().A03.getFbidV2();
        if (fbidV2 != null) {
            return AbstractC003100w.A0k(10, fbidV2);
        }
        return null;
    }

    public final void A02(UserSession userSession, C4I7 c4i7, String str, String str2) {
        C14360o3.A0B(c4i7, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        Long A00 = A00(userSession);
        List singletonList = Collections.singletonList(C4I9.UNKNOWN);
        C14360o3.A07(singletonList);
        c4i7.A00(null, A00, "reconsider_prompt_cancel", str, str2, singletonList);
    }

    public final void A03(UserSession userSession, C4I7 c4i7, String str, String str2) {
        C14360o3.A0B(c4i7, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        Long A00 = A00(userSession);
        List singletonList = Collections.singletonList(C4I9.UNKNOWN);
        C14360o3.A07(singletonList);
        c4i7.A00(null, A00, "reconsider_prompt_impression", str, str2, singletonList);
    }

    public final void A04(UserSession userSession, C4I7 c4i7, String str, String str2) {
        C14360o3.A0B(c4i7, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        Long A00 = A00(userSession);
        List singletonList = Collections.singletonList(C4I9.UNKNOWN);
        C14360o3.A07(singletonList);
        c4i7.A00(null, A00, "reconsider_prompt_open_os_setting", str, str2, singletonList);
    }

    public final void A05(UserSession userSession, C4I7 c4i7, String str, String str2) {
        C14360o3.A0B(c4i7, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        Long A00 = A00(userSession);
        List singletonList = Collections.singletonList(C4I9.UNKNOWN);
        C14360o3.A07(singletonList);
        C9CH c9ch = new C9CH(null, null, 7);
        c9ch.A04 = str2;
        c4i7.A00(c9ch, A00, "try_to_request_location_permission", str, null, singletonList);
    }

    public final Activity A01(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            C14360o3.A07(baseContext);
            return A01(baseContext);
        }
        return null;
    }
}
