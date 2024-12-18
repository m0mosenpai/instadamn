package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.views.BrowserLiteErrorScreen;
import com.facebook.browser.lite.views.BrowserLiteGestureDelegateView;

/* loaded from: classes11.dex */
public final class UA4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ BrowserLiteGestureDelegateView A00;

    public UA4(BrowserLiteGestureDelegateView browserLiteGestureDelegateView) {
        this.A00 = browserLiteGestureDelegateView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        BrowserLiteGestureDelegateView browserLiteGestureDelegateView = this.A00;
        if ((browserLiteGestureDelegateView.A04 == C05F.A0C && browserLiteGestureDelegateView.A03.getWebViewScrollY() > 0) || f2 > 0.0f) {
            return false;
        }
        browserLiteGestureDelegateView.A03.A05(null, f2, 0.0f, true);
        browserLiteGestureDelegateView.A06 = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        BrowserLiteErrorScreen browserLiteErrorScreen;
        BrowserLiteGestureDelegateView browserLiteGestureDelegateView = this.A00;
        int webViewScrollY = browserLiteGestureDelegateView.A03.getWebViewScrollY();
        if (browserLiteGestureDelegateView.A04 == C05F.A0C && browserLiteGestureDelegateView.A02.getTranslationY() == 0.0f) {
            if (webViewScrollY <= 0 || browserLiteGestureDelegateView.A05) {
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) browserLiteGestureDelegateView.A03.A05;
                BrowserLiteErrorScreen browserLiteErrorScreen2 = browserLiteFragment.A0b;
                if ((browserLiteErrorScreen2 == null || browserLiteErrorScreen2.getVisibility() != 0) && (((browserLiteErrorScreen = browserLiteFragment.A0c) == null || browserLiteErrorScreen.getVisibility() != 0) && browserLiteGestureDelegateView.A05 && (f2 > 0.0f || webViewScrollY > 0))) {
                    browserLiteGestureDelegateView.A03.setWebViewScrollY((int) Math.max(webViewScrollY + f2, 0.0f));
                    browserLiteGestureDelegateView.A05 = true;
                    return false;
                }
            }
            return false;
        }
        browserLiteGestureDelegateView.A05 = true;
        if (!browserLiteGestureDelegateView.A07) {
            float translationY = browserLiteGestureDelegateView.A02.getTranslationY() - (f2 * 0.5f);
            browserLiteGestureDelegateView.A03.A05(null, 0.0d, translationY, false);
            if (translationY > browserLiteGestureDelegateView.A00) {
                return true;
            }
            return false;
        }
        return false;
    }
}
