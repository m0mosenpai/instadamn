package X;

import android.app.Activity;
import android.content.pm.Signature;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.Sdp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63143Sdp {
    public static final String[] A03 = {".debug", ".canary", ".partners", ""};
    public static final String[] A04 = {"25a9b2d2745c098361edaa3b87936dc29a28e7f1", "80abdd17dcc4cb3a33815d354355bf87c9378624", "88df4d670ed5e01fc7b3eff13b63258628ff5a00", "d834ae340d1e854c5f4092722f9788216d9221e5", "1cbedd9e7345f64649bad2b493a20d9eea955352", "4b3d76a2de89033ea830f476a1f815692938e33b"};
    public final Activity A00;
    public final AuthorizationRequest A01;
    public final C62457SCk A02;

    public static boolean A00(C62457SCk c62457SCk, Signature[] signatureArr) {
        int length;
        String str;
        if (signatureArr != null && (length = signatureArr.length) != 0) {
            int i = 0;
            do {
                String charsString = signatureArr[i].toCharsString();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    byte[] bytes = charsString.getBytes(ReactWebViewManager.HTML_ENCODING);
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    int length2 = digest.length;
                    char[] cArr = new char[length2 * 2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        int i3 = digest[i2] & 255;
                        int i4 = i2 * 2;
                        char[] cArr2 = c62457SCk.A00;
                        cArr[i4] = cArr2[i3 >>> 4];
                        AbstractC58318PtA.A1Z(cArr2, cArr, i3, i4 + 1);
                    }
                    str = new String(cArr);
                } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
                    str = null;
                }
                String[] strArr = A04;
                int i5 = 0;
                while (!strArr[i5].equalsIgnoreCase(str)) {
                    i5++;
                    if (i5 < 6) {
                    }
                }
                i++;
            } while (i < length);
            return true;
        }
        return false;
    }

    public C63143Sdp(Activity activity, AuthorizationRequest authorizationRequest, C62457SCk c62457SCk) {
        this.A00 = activity;
        this.A01 = authorizationRequest;
        this.A02 = c62457SCk;
    }
}
