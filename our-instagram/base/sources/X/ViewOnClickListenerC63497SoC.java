package X;

import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome;
import java.util.HashMap;

/* renamed from: X.SoC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63497SoC implements View.OnClickListener {
    public final /* synthetic */ BwPBrowserLiteChrome A00;

    public ViewOnClickListenerC63497SoC(BwPBrowserLiteChrome bwPBrowserLiteChrome) {
        this.A00 = bwPBrowserLiteChrome;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int A05 = C0f9.A05(2041236149);
        BwPBrowserLiteChrome bwPBrowserLiteChrome = this.A00;
        if (bwPBrowserLiteChrome.A09 == null) {
            i = 2051885182;
        } else {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("action", "bwp_more_options_menu_action");
            A1G.put("current_url", ((BrowserLiteFragment) bwPBrowserLiteChrome.A09).A0m);
            android.net.Uri uri = ((BrowserLiteFragment) bwPBrowserLiteChrome.A09).A08;
            if (uri != null) {
                A1G.put("url", uri.toString());
            }
            C63305ShB.A00().A07(bwPBrowserLiteChrome.A01, A1G);
            i = -656352307;
        }
        C0f9.A0C(i, A05);
    }
}
