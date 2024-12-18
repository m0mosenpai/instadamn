package X;

import android.webkit.PermissionRequest;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;

/* loaded from: classes6.dex */
public final class GKW implements Runnable {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC35296FhV A00;

    public GKW(DialogInterfaceOnCancelListenerC35296FhV dialogInterfaceOnCancelListenerC35296FhV) {
        this.A00 = dialogInterfaceOnCancelListenerC35296FhV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnCancelListenerC35296FhV dialogInterfaceOnCancelListenerC35296FhV = this.A00;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = (BrowserLiteWebChromeClient) dialogInterfaceOnCancelListenerC35296FhV.A01;
        if (browserLiteWebChromeClient.A0G) {
            ((PermissionRequest) dialogInterfaceOnCancelListenerC35296FhV.A03).deny();
            browserLiteWebChromeClient.A0G = false;
        }
    }
}
