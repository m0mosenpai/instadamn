package X;

import android.view.View;
import com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome;

/* renamed from: X.SoE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63499SoE implements View.OnClickListener {
    public final /* synthetic */ IGWatchAndBrowseLiteChrome A00;

    public ViewOnClickListenerC63499SoE(IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome) {
        this.A00 = iGWatchAndBrowseLiteChrome;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1937258502);
        IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome = this.A00;
        InterfaceC172717mh interfaceC172717mh = iGWatchAndBrowseLiteChrome.A0D;
        if (interfaceC172717mh != null) {
            interfaceC172717mh.AIO(1, iGWatchAndBrowseLiteChrome.A0G);
        }
        C0f9.A0C(330718977, A05);
    }
}
