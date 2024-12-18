package X;

import android.animation.ValueAnimator;
import com.facebook.smartcapture.components.DottedAlignmentView;

/* renamed from: X.LzM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49815LzM implements Runnable {
    public final /* synthetic */ DottedAlignmentView A00;

    public RunnableC49815LzM(DottedAlignmentView dottedAlignmentView) {
        this.A00 = dottedAlignmentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueAnimator valueAnimator = this.A00.A05;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
