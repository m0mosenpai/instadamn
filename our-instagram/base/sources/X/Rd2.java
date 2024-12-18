package X;

import android.os.Bundle;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class Rd2 extends Rb0 implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "OpenWebViewWithUrlChangeFragment";
    public WebView A00;
    public C62514SEq A01;
    public C62684SLx A02;
    public C64488TFy A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.Rb0
    public final boolean A03(android.net.Uri uri, WebView webView) {
        C62514SEq c62514SEq = this.A01;
        if (c62514SEq != null) {
            Boolean bool = (Boolean) C131845xK.A00(c62514SEq.A00, AbstractC58320PtC.A0g(AbstractC166987dD.A19(uri)), c62514SEq.A01);
            if (bool != null && bool.booleanValue()) {
                C62684SLx c62684SLx = this.A02;
                if (c62684SLx != null) {
                    c62684SLx.A00(AbstractC166987dD.A19(uri), false);
                }
                AbstractC25227BEk.A1B(this);
                return true;
            }
        }
        return super.A03(uri, webView);
    }

    @Override // X.Rb0, X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        WebView webView = this.A00;
        if (webView == null || (str = webView.getUrl()) == null) {
            str = "";
        }
        C62684SLx c62684SLx = this.A02;
        if (c62684SLx != null) {
            c62684SLx.A00(str, true);
            return false;
        }
        return false;
    }

    @Override // X.Rb0, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1890748346);
        super.onCreate(bundle);
        AbstractC12990ll A0M = AbstractC31178DnM.A0M(this.A04);
        C64488TFy c64488TFy = (C64488TFy) A0M.A01(C64488TFy.class, new C50150MDd(A0M, 25));
        this.A03 = c64488TFy;
        if (c64488TFy == null) {
            C14360o3.A0F("callbackHelper");
            throw C00O.createAndThrow();
        }
        this.A01 = c64488TFy.A00;
        this.A02 = c64488TFy.A01;
        C0f9.A09(-515673935, A02);
    }
}
