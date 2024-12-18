package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes7.dex */
public abstract class I9K {
    public static final String A00(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        C14360o3.A07(forName);
        byte[] bytes = str.getBytes(forName);
        C14360o3.A07(bytes);
        byte[] digest = messageDigest.digest(bytes);
        C14360o3.A07(digest);
        return AbstractC167007dF.A0h(SUX.A00(digest));
    }
}
