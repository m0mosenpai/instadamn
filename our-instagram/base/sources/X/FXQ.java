package X;

import java.net.HttpCookie;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FXQ {
    public static final HttpCookie A00(String str, String str2) {
        if (str.length() > 0) {
            HttpCookie httpCookie = new HttpCookie(str2, str);
            httpCookie.setPath("/");
            httpCookie.setDomain(AbstractC58317Pt9.A00(440));
            httpCookie.setSecure(true);
            httpCookie.setHttpOnly(true);
            return httpCookie;
        }
        return null;
    }

    public static final List A01(AbstractC12990ll abstractC12990ll) {
        C1JR A00 = C1JQ.A00(abstractC12990ll);
        HttpCookie[] httpCookieArr = {A00(A00.A00(), "ig-u-ig-direct-region-hint"), A00(A00.A03(), "ig-u-shbid"), A00(A00.A04(), "ig-u-shbts"), A00(A00.A01(), "ig-u-ds-user-id"), A00(A00.A02(), "ig-u-rur")};
        C14360o3.A0B(httpCookieArr, 0);
        return AbstractC009903n.A0I(httpCookieArr);
    }
}
