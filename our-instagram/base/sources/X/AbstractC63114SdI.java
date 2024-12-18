package X;

import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: X.SdI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63114SdI {
    public static final C223016j A00;
    public static final ThreadLocal A01;
    public static final java.util.Set A02;
    public static final Pattern A03 = Pattern.compile("^(z-.*)?(origincache.*|cdn).fbsbx.com$");

    public static boolean A00(android.net.Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) {
            return (host.endsWith(".facebook.com") || host.equals(IGPixelRequestBuffer.URL_PREFIX) || host.equals("fb.me")) && !host.startsWith("our.intern.");
        }
        return false;
    }

    static {
        HashSet hashSet = new HashSet(6);
        Collections.addAll(hashSet, "__gda__", "oh", "oe", "hdnea", "logcdn", "efg");
        A02 = Collections.unmodifiableSet(hashSet);
        A00 = new C223016j(100);
        A01 = new ThreadLocal();
    }

    public static boolean A01(android.net.Uri uri) {
        if (A00(uri) && uri.getPath().equals("/l.php")) {
            return true;
        }
        return false;
    }
}
