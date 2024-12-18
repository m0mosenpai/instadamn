package X;

import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.RedactedString;

/* renamed from: X.F4k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34134F4k {
    public static final String A00(AuthData authData, Long l, String str, String str2) {
        if (str == null) {
            return null;
        }
        if (l != null && l.longValue() < System.currentTimeMillis()) {
            if (str2 == null) {
                return null;
            }
            RedactedString accessToken = authData.getAccessToken();
            String originalString = accessToken != null ? accessToken.getOriginalString() : null;
            String deviceID = authData.getDeviceID();
            String substring = str2.substring(1);
            C14360o3.A07(substring);
            return android.net.Uri.parse("https://web.facebook.com").buildUpon().appendEncodedPath(AnonymousClass001.A11(substring, "&access_token=", originalString, "&device_id=", deviceID)).build().toString();
        }
        return str;
    }
}
