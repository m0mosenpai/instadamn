package X;

import android.webkit.CookieManager;

/* renamed from: X.SwE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63939SwE implements InterfaceC65572Tn5 {
    public static CookieManager A00;

    @Override // X.InterfaceC65572Tn5
    public final void EEu(C62604SIi c62604SIi) {
        if (A00 == null) {
            C0K8.A0E("SystemCookieManager", "cookieManager is null");
        }
        CookieManager cookieManager = A00;
        if (cookieManager != null) {
            cookieManager.removeAllCookies(new C63523Soq(0));
        }
    }

    @Override // X.InterfaceC65572Tn5
    public final void ES9(String str, String str2) {
        if (A00 == null) {
            C0K8.A0E("SystemCookieManager", "cookieManager is null");
        }
        CookieManager cookieManager = A00;
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2);
        }
    }

    @Override // X.InterfaceC65572Tn5
    public final void ESA(C62604SIi c62604SIi, String str, String str2) {
        if (A00 == null) {
            C0K8.A0E("SystemCookieManager", "cookieManager is null");
        }
        CookieManager cookieManager = A00;
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2, new C63524Sor(c62604SIi, 0));
        }
    }

    @Override // X.InterfaceC65572Tn5
    public final void flush() {
        try {
            if (A00 == null) {
                C0K8.A0E("SystemCookieManager", "cookieManager is null");
            }
            CookieManager cookieManager = A00;
            if (cookieManager != null) {
                cookieManager.flush();
            }
        } catch (Exception e) {
            C0K8.A0J("SystemCookieManager", "error flushing cookies", e);
        }
    }

    @Override // X.InterfaceC65572Tn5
    public final void FBF() {
        A00 = CookieManager.getInstance();
    }
}
