package X;

import java.util.Iterator;

/* renamed from: X.LHi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47962LHi {
    public static final java.util.Set A00 = AbstractC166987dD.A1H();

    public static void A01(android.net.Uri uri) {
        android.net.Uri uri2 = AbstractC47136KsV.A00;
        if ("res".equals(uri.getScheme())) {
            if (!uri.isAbsolute()) {
                throw new C50097M9l("Resource URI path must be absolute.");
            }
            if (uri.getPath().isEmpty()) {
                throw new C50097M9l("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(uri.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new C50097M9l("Resource URI path must be a resource id.");
            }
        }
        if ("asset".equals(uri.getScheme()) && !uri.isAbsolute()) {
            throw new C50097M9l("Asset URI path must be absolute.");
        }
    }

    public static void A00(android.net.Uri uri) {
        android.net.Uri uri2 = AbstractC47136KsV.A00;
        String scheme = uri.getScheme();
        if (!"https".equals(scheme) && !"http".equals(scheme)) {
            Iterator it = A00.iterator();
            while (it.hasNext() && !AbstractC166987dD.A1B(it).equals(uri.getScheme())) {
            }
        }
    }
}
