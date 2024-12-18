package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome;

/* renamed from: X.SoU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC63501SoU implements View.OnClickListener {
    public long A00;
    public final int A01;
    public final Object A02;

    public ViewOnClickListenerC63501SoU(Object obj, int i) {
        this.A01 = i;
        this.A02 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A01 != 0) {
            A05 = C0f9.A05(1545538882);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A00 > 1000) {
                this.A00 = elapsedRealtime;
                C63305ShB.A00().A07((Bundle) this.A02, AbstractC167007dF.A0n("action", "ACTION_OPEN_LINK_HISTORY"));
            }
            i = 277428813;
        } else {
            A05 = C0f9.A05(1953431527);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (elapsedRealtime2 - this.A00 > 1000) {
                this.A00 = elapsedRealtime2;
                C63305ShB.A00().A07(((IGWatchAndBrowseLiteChrome) this.A02).A01, AbstractC167007dF.A0n("action", "ACTION_OPEN_LINK_HISTORY"));
            }
            i = -427319054;
        }
        C0f9.A0C(i, A05);
    }
}
