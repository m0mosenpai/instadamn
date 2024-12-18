package X;

import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;

/* loaded from: classes8.dex */
public final class LI0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public static final String[] A03 = {IGPixelRequestBuffer.URL_PREFIX, "www.facebook.com", "m.facebook.com"};
    public static final String[] A04 = {"fbwat.ch", "www.fbwat.ch", "fb.watch", "www.fb.watch"};
    public static final String[] A09 = {"streamable.com", "www.streamable.com"};
    public static final String[] A05 = {"instagram.com", "www.instagram.com"};
    public static final String[] A06 = {"lassovideos.com", "www.lassovideos.com"};
    public static final String[] A07 = {"netflix.com", "www.netflix.com"};
    public static final String[] A08 = {"sharechat.com", "www.sharechat.com"};

    public static boolean A00(android.net.Uri uri, String[] strArr) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        for (String str : strArr) {
            if (host.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public LI0(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = i;
    }
}
