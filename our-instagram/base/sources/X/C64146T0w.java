package X;

import android.content.Context;
import android.webkit.WebView;

/* renamed from: X.T0w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64146T0w implements InterfaceC77833eB {
    public final /* synthetic */ C102884kP A00;

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC68323VMj.A00(this);
    }

    public C64146T0w(C102884kP c102884kP) {
        this.A00 = c102884kP;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        WebView webView = (WebView) obj;
        if (this.A00.A0S(43, false)) {
            webView.getSettings().setUserAgentString(C1FO.A01(webView.getSettings().getUserAgentString()));
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        WebView webView = (WebView) obj;
        if (this.A00.A0S(43, false)) {
            webView.getSettings().setUserAgentString(null);
        }
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
