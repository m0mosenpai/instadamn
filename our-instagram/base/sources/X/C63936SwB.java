package X;

import android.os.Bundle;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.SwB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63936SwB implements InterfaceC65339TiK {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public C63936SwB(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    @Override // X.InterfaceC65339TiK
    public final void D3L(C63193Sev c63193Sev) {
        InterfaceC172717mh interfaceC172717mh;
        Bundle bundle;
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        InterfaceC172727mi interfaceC172727mi = defaultBrowserLiteChrome.A06;
        if (interfaceC172727mi != null && (interfaceC172717mh = defaultBrowserLiteChrome.A05) != null && (bundle = defaultBrowserLiteChrome.A01) != null) {
            c63193Sev.A03(defaultBrowserLiteChrome.getContext(), bundle, interfaceC172717mh, interfaceC172727mi);
            Q5I q5i = defaultBrowserLiteChrome.A04;
            if (q5i != null && q5i.isShowing()) {
                defaultBrowserLiteChrome.A04.dismiss();
                defaultBrowserLiteChrome.A04 = null;
            }
        }
    }
}
