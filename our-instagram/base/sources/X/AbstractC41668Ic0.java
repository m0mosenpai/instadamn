package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;

/* renamed from: X.Ic0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41668Ic0 {
    public static final void A01(Context context, android.net.Uri uri, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        HashMap A00 = A00(uri);
        if (A00 == null) {
            C0w9 c0w9 = C0w9.A01;
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Invalid serverParamsString or nativeAdType to open Bloks screen from %s", str);
            C14360o3.A07(formatStrLocaleSafe);
            c0w9.EmN("InstantShoppingInstagramBloksScreenUtil", formatStrLocaleSafe);
            return;
        }
        AbstractC191798eb.A04(context, new C191778eZ(userSession), "com.bloks.www.fam.native.ads.bloks.main.controller", A00, 7200L);
    }

    public static final boolean A02(android.net.Uri uri, String str) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        if (uri.getQueryParameter("use_bloks") != null && (queryParameter = uri.getQueryParameter("use_bloks")) != null && queryParameter.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
            if (uri.getQueryParameter("server_side_params") != null && (queryParameter2 = uri.getQueryParameter("server_side_params")) != null && queryParameter2.length() != 0 && uri.getQueryParameter("native_ad_type") != null && (queryParameter3 = uri.getQueryParameter("native_ad_type")) != null && queryParameter3.length() != 0) {
                return true;
            }
            C0w9 c0w9 = C0w9.A01;
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Invalid serverParamsString or nativeAdType to open Bloks screen from %s", str);
            C14360o3.A07(formatStrLocaleSafe);
            c0w9.EmN("InstantShoppingInstagramBloksScreenUtil", formatStrLocaleSafe);
        }
        return false;
    }

    public static final HashMap A00(android.net.Uri uri) {
        String queryParameter;
        String queryParameter2;
        if (uri.getQueryParameter("server_side_params") == null) {
            queryParameter = null;
        } else {
            queryParameter = uri.getQueryParameter("server_side_params");
        }
        if (uri.getQueryParameter("native_ad_type") == null) {
            queryParameter2 = null;
        } else {
            queryParameter2 = uri.getQueryParameter("native_ad_type");
        }
        if (queryParameter != null && queryParameter.length() != 0 && queryParameter2 != null && queryParameter2.length() != 0) {
            return AbstractC06930Yk.A02(AbstractC25229BEm.A1b("native_ad_type", queryParameter2, AbstractC166987dD.A1L("server_params_string", queryParameter)));
        }
        return null;
    }
}
