package X;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DarkenedFrameView;
import com.facebook.smartcapture.components.DottedAlignmentView;
import com.facebook.smartcapture.docauth.CaptureState;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes8.dex */
public final class M67 implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ ContourView A01;
    public final /* synthetic */ CaptureState A02;
    public final /* synthetic */ boolean A03;

    public M67(Rect rect, ContourView contourView, CaptureState captureState, boolean z) {
        this.A01 = contourView;
        this.A02 = captureState;
        this.A00 = rect;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ContourView contourView = this.A01;
        CaptureState captureState = this.A02;
        Rect rect = this.A00;
        boolean z = this.A03;
        if (captureState == CaptureState.CAPTURING_AUTOMATIC) {
            DottedAlignmentView dottedAlignmentView = contourView.A0C;
            float f = contourView.A03;
            dottedAlignmentView.setX(rect.left + f);
            dottedAlignmentView.setY(rect.top + f);
            ViewGroup.LayoutParams layoutParams = dottedAlignmentView.getLayoutParams();
            int i2 = ((int) f) * 2;
            layoutParams.width = rect.width() - i2;
            layoutParams.height = rect.height() - i2;
            dottedAlignmentView.requestLayout();
            dottedAlignmentView.setVisibility(0);
            AbstractC43594JPz.A0H(dottedAlignmentView).start();
            dottedAlignmentView.post(new RunnableC49814LzL(dottedAlignmentView));
        } else {
            DottedAlignmentView dottedAlignmentView2 = contourView.A0C;
            if (z) {
                C14360o3.A0A(dottedAlignmentView2.animate().alpha(0.0f).withEndAction(new RunnableC49813LzK(contourView)));
            } else {
                dottedAlignmentView2.post(new RunnableC49815LzM(dottedAlignmentView2));
                dottedAlignmentView2.setAlpha(0.0f);
                dottedAlignmentView2.setVisibility(8);
            }
        }
        DarkenedFrameView darkenedFrameView = contourView.A0B;
        C14360o3.A0B(rect, 0);
        RectF rectF = darkenedFrameView.A04;
        float f2 = rect.left;
        float f3 = darkenedFrameView.A01;
        rectF.set(f2 + f3, rect.top + f3, rect.right - f3, rect.bottom - f3);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setDuration(300L);
            RectF rectF2 = darkenedFrameView.A03;
            valueAnimator.setValues(PropertyValuesHolder.ofFloat("left", rectF2.left, rectF.left), PropertyValuesHolder.ofFloat("top", rectF2.top, rectF.top), PropertyValuesHolder.ofFloat("right", rectF2.right, rectF.right), PropertyValuesHolder.ofFloat("bottom", rectF2.bottom, rectF.bottom));
            LMA.A01(valueAnimator, darkenedFrameView, 1);
            valueAnimator.start();
        } else {
            RectF rectF3 = darkenedFrameView.A03;
            rectF3.set(rectF);
            Path path = darkenedFrameView.A02;
            path.reset();
            float f4 = darkenedFrameView.A00;
            path.addRoundRect(rectF3, f4, f4, Path.Direction.CW);
            darkenedFrameView.invalidate();
        }
        switch (captureState.ordinal()) {
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = contourView.A05;
                break;
            default:
                i = 0;
                break;
        }
        if (contourView.A01 != i) {
            contourView.A01 = i;
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setIntValues(contourView.A00, contourView.A01);
            valueAnimator2.setEvaluator(new ArgbEvaluator());
            LMA.A01(valueAnimator2, contourView, 0);
            valueAnimator2.start();
        }
        int i3 = rect.left;
        int i4 = rect.right;
        ImageView imageView = contourView.A08;
        int width = i4 - imageView.getWidth();
        int i5 = rect.top;
        int height = rect.bottom - imageView.getHeight();
        ImageView imageView2 = contourView.A06;
        float height2 = imageView2.getHeight() + height;
        float A08 = height2 + ((AbstractC166987dD.A08(contourView) - height2) / 2.0f);
        TextView textView = contourView.A0A;
        float A082 = A08 - (AbstractC166987dD.A08(textView) / 2.0f);
        int i6 = (int) contourView.A04;
        int i7 = i3 - i6;
        int i8 = i5 - i6;
        int i9 = width + i6;
        int i10 = height + i6;
        if (z) {
            AbstractC46571KjA.A00(imageView, i7, i8);
            AbstractC46571KjA.A00(contourView.A09, i9, i8);
            AbstractC46571KjA.A00(imageView2, i7, i10);
            AbstractC46571KjA.A00(contourView.A07, i9, i10);
            textView.animate().y(A082).setDuration(300L);
        } else {
            float f5 = i7;
            imageView.setX(f5);
            float f6 = i8;
            imageView.setY(f6);
            ImageView imageView3 = contourView.A09;
            float f7 = i9;
            imageView3.setX(f7);
            imageView3.setY(f6);
            imageView2.setX(f5);
            float f8 = i10;
            imageView2.setY(f8);
            ImageView imageView4 = contourView.A07;
            imageView4.setX(f7);
            imageView4.setY(f8);
            if (textView.getY() != A082) {
                textView.setY(A082);
                textView.requestLayout();
            }
        }
        if (contourView.A02) {
            AbstractC43594JPz.A0H(contourView).start();
            contourView.A02 = false;
        }
    }
}
