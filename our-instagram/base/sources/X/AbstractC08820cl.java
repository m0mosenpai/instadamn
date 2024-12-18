package X;

import android.util.LruCache;

/* renamed from: X.0cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08820cl {
    public static final InterfaceC08280bq A01 = new Object();
    public static final LruCache A00 = new LruCache(20);

    public static android.net.Uri A00(InterfaceC08100bW interfaceC08100bW, String str) {
        return A02(interfaceC08100bW, str, false);
    }

    public static android.net.Uri A01(InterfaceC08100bW interfaceC08100bW, String str) {
        return A02(interfaceC08100bW, str, true);
    }

    public static android.net.Uri A02(InterfaceC08100bW interfaceC08100bW, String str, boolean z) {
        if (str != null) {
            if (interfaceC08100bW != null) {
                try {
                    return A03(str);
                } catch (SecurityException e) {
                    interfaceC08100bW.EHA("UriParser", AnonymousClass001.A19("Parse uri <sanitized \"", A01.ELW(str), "\"> failed. Fail open: ", z), e);
                    if (z) {
                        return android.net.Uri.parse(str);
                    }
                    return null;
                }
            }
            throw new IllegalArgumentException("reporter is null");
        }
        throw new IllegalArgumentException("Url string is null");
    }

    public static boolean A06(String str, String str2) {
        if (str != null && !str.equals("")) {
            return str.equals(str2);
        }
        if (str2 != null && !str2.equals("")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x012c, code lost:
    
        if (r2.contains("_") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0117, code lost:
    
        if (r2.contains("_") != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri A03(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC08820cl.A03(java.lang.String):android.net.Uri");
    }

    public static void A04(android.net.Uri uri, String str, java.net.URI uri2) {
        boolean A06 = A06(uri2.getScheme(), uri.getScheme());
        boolean A062 = A06(uri2.getSchemeSpecificPart(), uri.getSchemeSpecificPart());
        if (A06 && A062) {
            return;
        }
        String obj = uri2.toString();
        InterfaceC08280bq interfaceC08280bq = A01;
        throw new SecurityException(AnonymousClass001.A15("java uri <sanitized \"", interfaceC08280bq.ELW(obj), "\"> not equal to android uri <sanitized \"", interfaceC08280bq.ELW(uri.toString()), "\"> from original <sanitized \"", interfaceC08280bq.ELW(str), "\">"));
    }

    public static void A05(android.net.Uri uri, java.net.URI uri2, boolean z) {
        boolean A06 = A06(uri2.getScheme(), uri.getScheme());
        boolean A062 = A06(uri2.getAuthority(), uri.getAuthority());
        boolean A063 = A06(uri2.getPath(), uri.getPath());
        if (A06 && A062 && A063) {
            return;
        }
        String str = "";
        if (!A06) {
            str = AnonymousClass001.A13("", "javaUri scheme: \"", uri2.getScheme(), "\". androidUri scheme: \"", uri.getScheme(), "\".");
        }
        if (!z && !A062) {
            str = AnonymousClass001.A13(str, "javaUri authority: \"", uri2.getAuthority(), "\". androidUri authority: \"", uri.getAuthority(), "\".");
        }
        if (!A063) {
            str = AnonymousClass001.A13(str, "javaUri path: \"", uri2.getPath(), "\". androidUri path: \"", uri.getPath(), "\".");
        }
        String obj = uri2.toString();
        InterfaceC08280bq interfaceC08280bq = A01;
        throw new SecurityException(AnonymousClass001.A15("java uri <sanitized \"", interfaceC08280bq.ELW(obj), "\"> not equal to android uri <sanitized \"", interfaceC08280bq.ELW(uri.toString()), "\">. Debug info ", str, "."));
    }
}
