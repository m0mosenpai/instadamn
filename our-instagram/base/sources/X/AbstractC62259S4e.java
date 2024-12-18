package X;

import java.net.HttpCookie;

/* renamed from: X.S4e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62259S4e {
    public static final String A00(HttpCookie httpCookie) {
        StringBuilder A0x = AbstractC43594JPz.A0x(httpCookie);
        A0x.append(AnonymousClass001.A0T(httpCookie.getName(), httpCookie.getValue(), '='));
        if (httpCookie.getMaxAge() >= 0) {
            A0x.append(AnonymousClass001.A0Q("; Max-Age=", httpCookie.getMaxAge()));
        }
        String domain = httpCookie.getDomain();
        if (domain != null) {
            AbstractC50523MSb.A1N("; Domain=", domain, A0x);
        }
        String path = httpCookie.getPath();
        if (path != null) {
            AbstractC50523MSb.A1N("; Path=", path, A0x);
        }
        if (httpCookie.getSecure()) {
            A0x.append("; Secure");
        }
        if (httpCookie.isHttpOnly()) {
            A0x.append("; HttpOnly");
        }
        return AbstractC166987dD.A19(A0x);
    }
}
