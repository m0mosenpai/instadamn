package X;

import android.net.Uri;
import android.webkit.CookieManager;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SSp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62817SSp {
    public static final synchronized void A00(AbstractC12990ll abstractC12990ll, List list) {
        String domain;
        synchronized (C62817SSp.class) {
            ArrayList A12 = AbstractC166997dE.A12(abstractC12990ll, 1);
            A12.addAll(C1QC.A00(abstractC12990ll));
            A12.addAll(FXQ.A01(abstractC12990ll));
            if (list != null) {
                A12.addAll(list);
            }
            Iterator A13 = AbstractC166997dE.A13(A12);
            while (A13.hasNext()) {
                HttpCookie httpCookie = (HttpCookie) AbstractC166997dE.A0l(A13);
                String A00 = AbstractC62259S4e.A00(httpCookie);
                if (httpCookie.getSecure()) {
                    domain = AbstractC58319PtB.A0q(new Uri.Builder().authority(httpCookie.getDomain()).scheme("https"));
                } else {
                    domain = httpCookie.getDomain();
                }
                C14360o3.A07(domain);
                CookieManager.getInstance().setCookie(domain, A00);
            }
        }
    }
}
