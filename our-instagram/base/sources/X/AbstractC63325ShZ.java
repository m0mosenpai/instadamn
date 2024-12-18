package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.ShZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63325ShZ {
    public static final java.util.Set A00;
    public static final java.util.Set A01;
    public static final java.util.Set A02;

    public static boolean A01(android.net.Uri uri) {
        boolean z;
        String fragment;
        android.net.Uri build;
        String str = null;
        String str2 = null;
        android.net.Uri uri2 = uri;
        if (uri != null && A02(uri) && uri.getHost() != null) {
            String host = uri.getHost();
            AbstractC05810Sj.A00(host);
            Locale locale = Locale.ENGLISH;
            str = host.toLowerCase(locale);
            String scheme = uri.getScheme();
            AbstractC05810Sj.A00(scheme);
            str2 = scheme.toLowerCase(locale);
            z = true;
        } else {
            uri2 = null;
            z = false;
        }
        if (!z || ((!str.equals(IGPixelRequestBuffer.URL_PREFIX) && !str.endsWith(AnonymousClass001.A0R(".", IGPixelRequestBuffer.URL_PREFIX))) || !str2.equals("https") || str.startsWith("apps") || (!uri2.getPathSegments().isEmpty() && AbstractC25226BEj.A1I(uri2.getPathSegments(), 0).equalsIgnoreCase("apps")))) {
            return false;
        }
        if (uri != null && A03(uri) && (fragment = uri.getFragment()) != null && fragment.startsWith("!/") && (build = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getHost()).path(fragment.substring(1)).build()) != null && !build.equals(uri)) {
            return A01(build);
        }
        return true;
    }

    public static boolean A02(android.net.Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https");
        }
        return false;
    }

    public static boolean A03(android.net.Uri uri) {
        if (uri != null && A02(uri) && uri.getHost() != null) {
            String host = uri.getHost();
            AbstractC05810Sj.A00(host);
            String lowerCase = host.toLowerCase(Locale.ENGLISH);
            AbstractC05810Sj.A00(uri.getScheme());
            if (!lowerCase.equals(IGPixelRequestBuffer.URL_PREFIX) && !lowerCase.endsWith(AnonymousClass001.A0R(".", IGPixelRequestBuffer.URL_PREFIX))) {
                return false;
            }
            return true;
        }
        return false;
    }

    static {
        HashSet A1H = AbstractC166987dD.A1H();
        A01 = A1H;
        A1H.add("dev");
        A1H.add("intern");
        A1H.add("alpha");
        A1H.add("beta");
        A1H.add("latest");
        A1H.add("prod");
        HashSet A1H2 = AbstractC166987dD.A1H();
        A00 = A1H2;
        A1H2.add("app");
        A1H2.add("developers");
        A1H2.add("partners");
        HashSet A1H3 = AbstractC166987dD.A1H();
        A02 = A1H3;
        A1H3.add("our");
        A1H3.add("tools");
        A1H3.add("fiddle");
        A1H3.add("interngraph");
    }

    public static boolean A00(android.net.Uri uri) {
        if (!A03(uri) || uri == null || TextUtils.isEmpty(uri.getPath())) {
            return false;
        }
        return AbstractC31175DnJ.A1Z(uri.getPath(), Pattern.compile(String.format(Locale.US, "^(/pg/([^/]+)/([^/]+)/?)*$", new Object[0])));
    }
}
