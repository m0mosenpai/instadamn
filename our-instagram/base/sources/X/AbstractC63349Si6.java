package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

/* renamed from: X.Si6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63349Si6 {
    public static android.net.Uri A00(Bundle bundle, String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            Iterator A14 = AbstractC58319PtB.A14(bundle);
            while (A14.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A14);
                Object obj = bundle.get(A1B);
                if (obj instanceof String) {
                    builder.appendQueryParameter(A1B, (String) obj);
                }
            }
        }
        return builder.build();
    }

    public static String A03(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder A1C = AbstractC166987dD.A1C();
            for (byte b : digest) {
                AbstractC58318PtA.A1T(A1C, (b >> 4) & 15);
                AbstractC58318PtA.A1T(A1C, (b >> 0) & 15);
            }
            return A1C.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static boolean A05(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static Bundle A01(String str) {
        android.net.Uri A03 = AbstractC08820cl.A03(str);
        Bundle A02 = A02(A03.getQuery());
        A02.putAll(A02(A03.getFragment()));
        return A02;
    }

    public static Bundle A02(String str) {
        String decode;
        String decode2;
        Bundle A0b = AbstractC166987dD.A0b();
        if (!A05(str)) {
            for (String str2 : str.split("&")) {
                String[] split = str2.split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                try {
                } catch (UnsupportedEncodingException e) {
                    e.toString();
                }
                if (split.length != 2) {
                    if (split.length == 1) {
                        decode = URLDecoder.decode(split[0], ReactWebViewManager.HTML_ENCODING);
                        decode2 = "";
                    }
                } else {
                    decode = URLDecoder.decode(split[0], ReactWebViewManager.HTML_ENCODING);
                    decode2 = URLDecoder.decode(split[1], ReactWebViewManager.HTML_ENCODING);
                }
                A0b.putString(decode, decode2);
            }
        }
        return A0b;
    }

    public static void A04(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie != null) {
            for (String str2 : cookie.split(";")) {
                String[] split = str2.split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                if (split.length > 0) {
                    cookieManager.setCookie(str, AnonymousClass001.A0R(split[0].trim(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                }
            }
            cookieManager.removeExpiredCookie();
        }
    }
}
