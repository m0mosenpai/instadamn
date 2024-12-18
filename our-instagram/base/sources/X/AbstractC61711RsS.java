package X;

import java.net.URISyntaxException;

/* renamed from: X.RsS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61711RsS {
    public static final String A00(String str) {
        C14360o3.A0B(str, 0);
        try {
            String host = new java.net.URI(str).getHost();
            if (host == null) {
                return str;
            }
            if (AbstractC43592JPx.A1a("www.", 1, host)) {
                return AbstractC43592JPx.A0z(host, 4);
            }
            return host;
        } catch (URISyntaxException unused) {
            return str;
        }
    }
}
