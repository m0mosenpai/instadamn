package X;

import android.animation.AnimatorSet;
import com.instagram.creation.video.widget.scrubber.IgScrubberProgressIndicator;

/* loaded from: classes8.dex */
public final class M0J implements Runnable {
    public final /* synthetic */ IgScrubberProgressIndicator A00;

    public M0J(IgScrubberProgressIndicator igScrubberProgressIndicator) {
        this.A00 = igScrubberProgressIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgScrubberProgressIndicator igScrubberProgressIndicator = this.A00;
        if (igScrubberProgressIndicator.A01) {
            AnimatorSet animatorSet = igScrubberProgressIndicator.A00;
            C14360o3.A0A(animatorSet);
            if (!animatorSet.isStarted()) {
                C14360o3.A0A(animatorSet);
                animatorSet.start();
            }
        }
    }
}
