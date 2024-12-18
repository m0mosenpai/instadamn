package X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* loaded from: classes10.dex */
public final class TJe implements Runnable {
    public final /* synthetic */ BrowserLiteFragment A00;

    public TJe(BrowserLiteFragment browserLiteFragment) {
        this.A00 = browserLiteFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BrowserLiteFragment browserLiteFragment = this.A00;
        BrowserLiteFragment.A0G(browserLiteFragment, "FROM_INTENT_SERVICE");
        browserLiteFragment.AIE(4, null);
    }
}
