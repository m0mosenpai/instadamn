package X;

import android.animation.ValueAnimator;
import com.facebook.smartcapture.components.DottedAlignmentView;

/* renamed from: X.LzL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49814LzL implements Runnable {
    public final /* synthetic */ DottedAlignmentView A00;

    public RunnableC49814LzL(DottedAlignmentView dottedAlignmentView) {
        this.A00 = dottedAlignmentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator = this.A00.A05;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
