package X;

import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes10.dex */
public final class SND {
    public WebViewProviderBoundaryInterface A00;

    public final void A00() {
        this.A00.removeWebMessageListener("fbpayIAWIFrameBridge");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.TWs, java.lang.Object] */
    public final void A01(InterfaceC65304Thc interfaceC65304Thc, String str, String[] strArr) {
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterface = this.A00;
        ?? obj = new Object();
        obj.A00 = interfaceC65304Thc;
        webViewProviderBoundaryInterface.addWebMessageListener(str, strArr, new C64736TRu(obj));
    }

    public SND(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.A00 = webViewProviderBoundaryInterface;
    }
}
