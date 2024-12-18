package X;

import android.os.Parcelable;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABScreenshotImpressionEvent;

/* loaded from: classes10.dex */
public final class SO3 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C23016ACq A03;
    public final InterfaceC172717mh A04;

    public final void A01(VHg vHg, String str) {
        IABEvent iABScreenshotImpressionEvent;
        if (!this.A01) {
            this.A01 = true;
            C23016ACq c23016ACq = this.A03;
            if (c23016ACq != null) {
                if (!c23016ACq.A0p) {
                    iABScreenshotImpressionEvent = IABEvent.A04;
                } else {
                    Parcelable.Creator creator = IABEvent.CREATOR;
                    iABScreenshotImpressionEvent = new IABScreenshotImpressionEvent(vHg, c23016ACq.A0Z, c23016ACq.A0a, str, c23016ACq.A0m.now());
                }
                C63305ShB A00 = C63305ShB.A00();
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) this.A04;
                A00.A06(browserLiteFragment.A09, iABScreenshotImpressionEvent, browserLiteFragment.A0f);
            }
        }
    }

    public final void A00() {
        if (!this.A02) {
            this.A02 = true;
            C23016ACq c23016ACq = this.A03;
            if (c23016ACq != null) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = c23016ACq.A0p;
                if (z) {
                    c23016ACq.A0V = Long.valueOf(currentTimeMillis);
                }
                if (z) {
                    c23016ACq.A0S = true;
                }
            }
        }
    }

    public SO3(InterfaceC172717mh interfaceC172717mh) {
        this.A04 = interfaceC172717mh;
        this.A03 = ((BrowserLiteFragment) interfaceC172717mh).A0e;
    }
}
