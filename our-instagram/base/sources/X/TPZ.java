package X;

import android.animation.ObjectAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* loaded from: classes10.dex */
public final class TPZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WebView A01;
    public final /* synthetic */ SDN A02;

    public TPZ(WebView webView, SDN sdn, int i) {
        this.A02 = sdn;
        this.A01 = webView;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SDN sdn = this.A02;
        WebView webView = this.A01;
        int i = this.A00 * 10;
        int i2 = 100;
        if (i <= 100) {
            i = 100;
        }
        String url = webView.getUrl();
        if (AbstractC116315Ok.A00(url) || !AbstractC63114SdI.A01(android.net.Uri.parse(url))) {
            i2 = i;
            if (i == 1000) {
                ProgressBar progressBar = sdn.A01;
                if (progressBar.getVisibility() == 0) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setInterpolator(new AccelerateInterpolator());
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new AnimationAnimationListenerC35726Fq0(progressBar, 0));
                    progressBar.startAnimation(alphaAnimation);
                    return;
                }
                if (progressBar.getVisibility() != 4) {
                    return;
                }
                progressBar.setVisibility(8);
                return;
            }
        }
        ProgressBar progressBar2 = sdn.A01;
        if (progressBar2.getVisibility() == 8) {
            progressBar2.setVisibility(0);
        }
        if (i2 < progressBar2.getProgress()) {
            progressBar2.setProgress(0);
        }
        if (i2 != progressBar2.getProgress()) {
            ObjectAnimator objectAnimator = sdn.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            sdn.A00 = ObjectAnimator.ofInt(progressBar2, ReactProgressBarViewManager.PROP_PROGRESS, progressBar2.getProgress(), i2);
            sdn.A00.setDuration((i2 - progressBar2.getProgress()) * 2);
            sdn.A00.setInterpolator(new LinearInterpolator());
            sdn.A00.start();
        }
    }
}
