package X;

import android.view.View;
import com.facebook.R;
import com.facebook.browser.lite.chrome.container.BwPBrowserLiteChrome;

/* renamed from: X.SoB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63496SoB implements View.OnClickListener {
    public final /* synthetic */ BwPBrowserLiteChrome A00;

    public ViewOnClickListenerC63496SoB(BwPBrowserLiteChrome bwPBrowserLiteChrome) {
        this.A00 = bwPBrowserLiteChrome;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int A05 = C0f9.A05(-1238948325);
        BwPBrowserLiteChrome bwPBrowserLiteChrome = this.A00;
        if (bwPBrowserLiteChrome.A08 == null) {
            i = 1744043234;
        } else {
            if (view.getId() == R.id.ig_bwp_browser_close_button) {
                bwPBrowserLiteChrome.A08.AIE(1, null);
            }
            i = -2070466138;
        }
        C0f9.A0C(i, A05);
    }
}
