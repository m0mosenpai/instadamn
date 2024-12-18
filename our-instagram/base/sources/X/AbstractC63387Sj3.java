package X;

import android.text.TextUtils;
import android.util.LruCache;
import android.webkit.MimeTypeMap;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Sj3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63387Sj3 {
    public static final C08270bp A00;
    public static final java.util.Set A04 = AbstractC58319PtB.A13(new String[]{"https", "http"});
    public static final java.util.Set A02 = AbstractC58319PtB.A13(new String[]{"www.facebook.com", "m.facebook.com", IGPixelRequestBuffer.URL_PREFIX, "fb.watch", "m.alpha.facebook.com", "www.alpha.facebook.com"});
    public static final List A01 = Arrays.asList("dialog/share", "share.php", "dialog/share_open_graph", "dialog/feed", "sharer.php");
    public static final List A03 = Arrays.asList("/home.php", "/login.php");
    public static final Pattern A05 = Pattern.compile("(?:w{2,3}[0-9]*?\\.)?(([a-z0-9-]+\\.)+([a-z]{2,}))");

    public static String A02(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = A05.matcher(str.trim().toLowerCase(Locale.US));
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static boolean A04(android.net.Uri uri) {
        String scheme;
        return (uri == null || (scheme = uri.getScheme()) == null || !A04.contains(scheme.toLowerCase())) ? false : true;
    }

    static {
        C08260bo c08260bo = new C08260bo();
        c08260bo.A02 = true;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(Pattern.compile(".*"));
        A1E.add(Pattern.compile(".*"));
        A1E.add(Pattern.compile(".*"));
        c08260bo.A01.add(A1E);
        c08260bo.A01(new String[]{"fbclid"});
        A00 = c08260bo.A00();
    }

    public static android.net.Uri A01(String str) {
        LruCache lruCache = AbstractC08820cl.A00;
        android.net.Uri parse = android.net.Uri.parse(str);
        if (A04(parse) || (parse != null && "data".equals(parse.getScheme()))) {
            String host = parse.getHost();
            String scheme = parse.getScheme();
            if (host != null && scheme != null) {
                Locale locale = Locale.US;
                String lowerCase = host.toLowerCase(locale);
                String lowerCase2 = scheme.toLowerCase(locale);
                if ((lowerCase.endsWith(".facebook.com") || lowerCase.equals(IGPixelRequestBuffer.URL_PREFIX)) && !lowerCase.startsWith("h.") && !lowerCase.startsWith("l.") && lowerCase2.equals("http")) {
                    return parse.buildUpon().scheme("https").build();
                }
            }
            return parse;
        }
        return null;
    }

    public static boolean A06(String str) {
        if (str != null) {
            if (str.endsWith("/css") || str.endsWith("/javascript")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static android.net.Uri A00(android.net.Uri uri, C0NO c0no) {
        String queryParameter;
        android.net.Uri A012;
        if (A05(uri) && (queryParameter = uri.getQueryParameter("u")) != null && (A012 = AbstractC08820cl.A01(c0no, queryParameter)) != null) {
            return A012;
        }
        return uri;
    }

    public static String A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return "";
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r2.equals("https") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r5.getPath().startsWith("/linkshim") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(android.net.Uri r5) {
        /*
            java.lang.String r1 = r5.getHost()
            java.lang.String r0 = "l.instagram.com"
            boolean r4 = r0.equals(r1)
            boolean r0 = X.AbstractC63325ShZ.A02(r5)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r5.getHost()
            if (r0 == 0) goto L4b
            java.lang.String r0 = r5.getHost()
            X.AbstractC05810Sj.A00(r0)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r3 = r0.toLowerCase(r1)
            java.lang.String r0 = r5.getScheme()
            X.AbstractC05810Sj.A00(r0)
            java.lang.String r2 = r0.toLowerCase(r1)
            java.lang.String r1 = "instagram.com"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L4b
        L42:
            java.lang.String r0 = "https"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L4c
        L4b:
            r1 = 0
        L4c:
            r2 = 1
            if (r1 == 0) goto L62
            java.lang.String r0 = r5.getPath()
            if (r0 == 0) goto L62
            java.lang.String r1 = r5.getPath()
            java.lang.String r0 = "/linkshim"
            boolean r0 = r1.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L63
        L62:
            r1 = 0
        L63:
            boolean r0 = X.AbstractC63114SdI.A01(r5)
            if (r4 != 0) goto L6e
            if (r1 != 0) goto L6e
            if (r0 != 0) goto L6e
            r2 = 0
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63387Sj3.A05(android.net.Uri):boolean");
    }

    public static boolean A07(String str, String str2) {
        int length = str.length() - str2.length();
        if (str.endsWith(str2)) {
            if (length == 0 || str.codePointAt(length - 1) == 46) {
                return true;
            }
            return false;
        }
        return false;
    }
}
