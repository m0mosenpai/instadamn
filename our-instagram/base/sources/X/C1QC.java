package X;

import android.webkit.URLUtil;
import com.instagram.common.session.UserSession;
import java.net.HttpCookie;
import java.util.List;

/* renamed from: X.1QC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1QC {
    public static final List A00(AbstractC12990ll abstractC12990ll) {
        C01L A1I = C0eM.A1I();
        C1FA A00 = C1F8.A00(abstractC12990ll);
        HttpCookie httpCookie = new HttpCookie("x-mid", A00.A01.A00);
        httpCookie.setPath("/");
        httpCookie.setDomain(".instagram.com");
        httpCookie.setSecure(true);
        httpCookie.setHttpOnly(true);
        A1I.add(httpCookie);
        if (abstractC12990ll instanceof UserSession) {
            HttpCookie httpCookie2 = new HttpCookie("authorization", A00.A04);
            httpCookie2.setPath("/");
            httpCookie2.setDomain(".instagram.com");
            httpCookie2.setSecure(true);
            httpCookie2.setHttpOnly(true);
            A1I.add(httpCookie2);
        }
        return C0eM.A1J(A1I);
    }

    public static final boolean A01(java.net.URI uri) {
        if (URLUtil.isHttpsUrl(uri.toString())) {
            if (C1QD.A01(uri.toString()) || "rupload.facebook.com".equals(uri.getHost())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
