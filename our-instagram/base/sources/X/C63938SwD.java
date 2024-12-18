package X;

import android.os.Bundle;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome;
import java.util.HashMap;

/* renamed from: X.SwD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63938SwD implements InterfaceC65339TiK {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public C63938SwD(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    @Override // X.InterfaceC65339TiK
    public final void D3L(C63193Sev c63193Sev) {
        Bundle bundle;
        String str;
        Q5I q5i;
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        C62720SNk c62720SNk = defaultBrowserLiteChrome.A0F;
        InterfaceC172717mh interfaceC172717mh = defaultBrowserLiteChrome.A0D;
        if (interfaceC172717mh == null) {
            bundle = null;
        } else {
            bundle = ((BrowserLiteFragment) interfaceC172717mh).A09;
        }
        c62720SNk.A00(bundle);
        String str2 = c63193Sev.A02;
        if ("SHARE_TIMELINE".equals(str2)) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("action", "SHARE_TIMELINE");
            A1G.put("url", defaultBrowserLiteChrome.A0G.A05());
            if (defaultBrowserLiteChrome.A0I) {
                A1G.put(AbstractC58347Ptn.A00(9, 10, 87), defaultBrowserLiteChrome.A01.getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID"));
            }
            defaultBrowserLiteChrome.A0B.A07(defaultBrowserLiteChrome.A02, A1G);
        } else {
            InterfaceC172727mi interfaceC172727mi = defaultBrowserLiteChrome.A0E;
            InterfaceC172717mh interfaceC172717mh2 = defaultBrowserLiteChrome.A0D;
            c63193Sev.A03(defaultBrowserLiteChrome.A00, defaultBrowserLiteChrome.A02, interfaceC172717mh2, interfaceC172727mi);
        }
        if ("ACTION_GO_BACK".equals(str2)) {
            str = "menu_back_btn_press";
        } else {
            if ("ACTION_GO_FORWARD".equals(str2)) {
                str = "menu_forward_btn_press";
            }
            q5i = defaultBrowserLiteChrome.A0C;
            if (q5i == null && q5i.isShowing()) {
                defaultBrowserLiteChrome.A0C.dismiss();
                defaultBrowserLiteChrome.A0C = null;
                return;
            }
        }
        HashMap hashMap = defaultBrowserLiteChrome.A0J;
        int i = 1;
        if (hashMap.containsKey(str)) {
            i = AbstractC166987dD.A0H(hashMap.get(str)) + 1;
        }
        hashMap.put(str, Integer.valueOf(i));
        q5i = defaultBrowserLiteChrome.A0C;
        if (q5i == null) {
        }
    }
}
