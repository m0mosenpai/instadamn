package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.Rsu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61739Rsu {
    public static void A00(Context context, String str) {
        CookieSyncManager createInstance = CookieSyncManager.createInstance(context);
        C63940SwF A00 = AbstractC61712RsT.A00();
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie != null) {
            for (String str2 : cookie.split(";")) {
                A00.ES9(str, AnonymousClass001.A0R(str2.split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR)[0].trim(), "=; Expires=Wed, 31 Dec 2095 23:59:59 GMT"));
            }
            createInstance.sync();
        }
    }
}
