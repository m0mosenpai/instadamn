package X;

import java.util.Locale;

/* renamed from: X.Kiv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46556Kiv {
    public static void A00(android.net.Uri uri) {
        android.net.Uri uri2 = AbstractC47136KsV.A00;
        String scheme = uri.getScheme();
        if (!"https".equals(scheme) && !"http".equals(scheme)) {
            if (uri.getPath() != null && "file".equals(uri.getScheme())) {
                String path = uri.getPath();
                C14360o3.A0B(path, 0);
                int length = path.length() - 1;
                int A05 = AbstractC001900j.A05(path, '.', length);
                if (A05 >= 0 && A05 != length) {
                    String A0z = AbstractC43592JPx.A0z(path, A05 + 1);
                    Locale locale = Locale.US;
                    C14360o3.A08(locale);
                    String A16 = AbstractC31172DnG.A16(locale, A0z);
                    Object obj = AbstractC47201Kta.A01.get(A16);
                    if (obj == null) {
                        obj = AbstractC47201Kta.A00.getMimeTypeFromExtension(A16);
                    }
                    if (obj == null) {
                        obj = AbstractC54323Nzh.A00.get(A16);
                    }
                    if (obj != null) {
                        C14360o3.A0B("video/", 1);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("content".equals(uri.getScheme()) || "asset".equals(uri.getScheme()) || "res".equals(uri.getScheme()) || "data".equals(uri.getScheme())) {
                return;
            }
            uri.getScheme();
        }
    }
}
