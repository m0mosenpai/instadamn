package X;

import android.view.View;
import com.facebook.R;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.SoD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63498SoD implements View.OnClickListener {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public ViewOnClickListenerC63498SoD(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int A05 = C0f9.A05(-1010635941);
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        if (defaultBrowserLiteChrome.A05 == null) {
            i = 1921912918;
        } else {
            if (view.getId() == R.id.ig_browser_close_button) {
                defaultBrowserLiteChrome.A05.AIE(1, defaultBrowserLiteChrome.A0C);
            }
            i = -1178825071;
        }
        C0f9.A0C(i, A05);
    }
}
