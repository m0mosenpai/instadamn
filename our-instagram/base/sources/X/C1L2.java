package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import kotlin.Deprecated;

/* renamed from: X.1L2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1L2 implements CallerContextable {
    public static final CallerContext A00 = new CallerContext(C1L2.class);
    public static final String __redex_internal_original_name = "FacebookAccount";

    public static final void A01(Intent intent, AbstractC12990ll abstractC12990ll, GYL gyl) {
        Bundle extras;
        LoginClient$Result loginClient$Result;
        C14360o3.A0B(gyl, 3);
        String str = null;
        boolean z = false;
        if (intent != null && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.facebook.LoginFragment:Result");
            if ((obj instanceof LoginClient$Result) && (loginClient$Result = (LoginClient$Result) obj) != null) {
                LoginClient$Request loginClient$Request = loginClient$Result.A01;
                str = loginClient$Request.A01;
                z = loginClient$Request.A02;
            }
        }
        C34876FYl.A00();
        HashMap hashMap = new HashMap();
        hashMap.put("fb4a_installed", String.valueOf(AbstractC23851Es.A03()));
        hashMap.put("exception", null);
        AbstractC62273S4s.A00(abstractC12990ll, "facebook_auth_cancel", str, hashMap, z);
        gyl.onCancel();
    }

    @Deprecated(message = "")
    public static final void A02(AbstractC12990ll abstractC12990ll, boolean z) {
        if (z && (abstractC12990ll instanceof UserSession)) {
            AbstractC49092Nc.A00((UserSession) abstractC12990ll).A02(A00, null, "ig_android_linking_cache_legacy_unlink_cache_refresh");
        }
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            C14360o3.A0B(userSession, 0);
            C1AU A01 = C1AT.A01(userSession);
            C1AV c1av = C1AV.A1K;
            boolean z2 = A01.A03(c1av).getBoolean("cal_migration_show_destination_picker", false);
            String A02 = AbstractC03270Dk.A02(abstractC12990ll);
            if (A02 != null) {
                InterfaceC19610xo ARD = C1AT.A00(c1av, A02).ARD();
                ARD.AHW();
                ARD.apply();
            }
            if (z2) {
                InterfaceC19610xo ARD2 = C1AT.A01(userSession).A03(c1av).ARD();
                ARD2.E77("cal_migration_show_destination_picker", true);
                ARD2.apply();
            }
        } else {
            AbstractC63252Sg8.A01();
            FBS.A00(abstractC12990ll).A00 = null;
        }
        AbstractC63252Sg8.A01();
    }

    public static final void A03(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = C1AT.A00(C1AV.A1K, str).ARD();
        ARD.AHW();
        ARD.apply();
        AbstractC63252Sg8.A01();
    }

    public static final void A00() {
        AbstractC63252Sg8.A01();
    }
}
