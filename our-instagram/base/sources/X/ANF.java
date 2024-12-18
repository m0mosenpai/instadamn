package X;

import android.animation.ValueAnimator;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;

/* loaded from: classes4.dex */
public final class ANF implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C8RR A00;

    public ANF(C8RR c8rr) {
        this.A00 = c8rr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
            C8RR c8rr = this.A00;
            CameraToolMenuItem cameraToolMenuItem = c8rr.A0C;
            if (cameraToolMenuItem.getVisibility() == 0) {
                cameraToolMenuItem.setLabelDisplayPercentage(number.floatValue());
            }
            CameraToolMenuItem cameraToolMenuItem2 = c8rr.A0A;
            if (cameraToolMenuItem2.getVisibility() == 0) {
                cameraToolMenuItem2.setLabelDisplayPercentage(number.floatValue());
            }
            CameraToolMenuItem cameraToolMenuItem3 = c8rr.A0B;
            if (cameraToolMenuItem3.getVisibility() == 0) {
                cameraToolMenuItem3.setLabelDisplayPercentage(number.floatValue());
            }
        }
    }
}
