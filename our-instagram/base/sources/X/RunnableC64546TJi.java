package X;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome;

/* renamed from: X.TJi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64546TJi implements Runnable {
    public final /* synthetic */ IGWatchAndBrowseLiteChrome A00;

    public RunnableC64546TJi(IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome) {
        this.A00 = iGWatchAndBrowseLiteChrome;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IGWatchAndBrowseLiteChrome iGWatchAndBrowseLiteChrome = this.A00;
        ImageView imageView = iGWatchAndBrowseLiteChrome.A06;
        if (imageView != null) {
            int measuredWidth = imageView.getMeasuredWidth();
            LinearLayout linearLayout = iGWatchAndBrowseLiteChrome.A08;
            if (linearLayout != null) {
                linearLayout.setPadding(measuredWidth, linearLayout.getPaddingTop(), 0, linearLayout.getPaddingBottom());
            }
        }
    }
}
