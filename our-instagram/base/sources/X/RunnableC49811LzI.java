package X;

import android.webkit.PermissionRequest;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;

/* renamed from: X.LzI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49811LzI implements Runnable {
    public final /* synthetic */ DialogInterfaceOnClickListenerC48022LMr A00;

    public RunnableC49811LzI(DialogInterfaceOnClickListenerC48022LMr dialogInterfaceOnClickListenerC48022LMr) {
        this.A00 = dialogInterfaceOnClickListenerC48022LMr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceOnClickListenerC48022LMr dialogInterfaceOnClickListenerC48022LMr = this.A00;
        BrowserLiteWebChromeClient browserLiteWebChromeClient = (BrowserLiteWebChromeClient) dialogInterfaceOnClickListenerC48022LMr.A01;
        if (browserLiteWebChromeClient.A0G) {
            PermissionRequest permissionRequest = (PermissionRequest) dialogInterfaceOnClickListenerC48022LMr.A03;
            permissionRequest.grant(permissionRequest.getResources());
            browserLiteWebChromeClient.A0G = false;
        }
    }
}
