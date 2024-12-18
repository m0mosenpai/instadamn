package X;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* loaded from: classes11.dex */
public final class WOH implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WOH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f;
        double d;
        float min;
        float height;
        switch (this.A00) {
            case 0:
                C67729Uwv c67729Uwv = (C67729Uwv) this.A02;
                ConstraintLayout constraintLayout = ((C67752UxP) c67729Uwv).A05;
                if (constraintLayout != null) {
                    if (constraintLayout.getMeasuredWidth() == 0) {
                        return;
                    }
                    ConstraintLayout constraintLayout2 = ((C67752UxP) c67729Uwv).A05;
                    if (constraintLayout2 != null) {
                        if (constraintLayout2.getMeasuredHeight() == 0) {
                            return;
                        }
                        ECPPaymentRequest eCPPaymentRequest = c67729Uwv.A01;
                        if (eCPPaymentRequest != null && WGr.A0L(eCPPaymentRequest)) {
                            d = 0.5d;
                        } else {
                            d = 0.75d;
                        }
                        BottomSheetBehavior A07 = ((Q5b) ((Dialog) this.A01)).A07();
                        if (((C67752UxP) c67729Uwv).A05 != null) {
                            A07.A0V((int) (r0.getMeasuredHeight() * d));
                            ConstraintLayout constraintLayout3 = ((C67752UxP) c67729Uwv).A05;
                            if (constraintLayout3 != null) {
                                AbstractC166997dE.A1K(constraintLayout3, this);
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F("viewContainer");
                throw C00O.createAndThrow();
            case 1:
                View view = (View) this.A02;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(WOJ.A00);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                float width = AbstractC43594JPz.A0E(view).getWidth();
                switch (((Number) this.A01).intValue()) {
                    case 1:
                        f = 0.53f;
                        break;
                    case 2:
                        f = 0.75f;
                        break;
                    case 3:
                        f = 0.85f;
                        break;
                    case 4:
                        f = 0.9f;
                        break;
                    default:
                        f = 0.45f;
                        break;
                }
                layoutParams.width = (int) (width * f);
                view.setLayoutParams(layoutParams);
                return;
            default:
                C71068WnQ c71068WnQ = (C71068WnQ) this.A01;
                c71068WnQ.A0A = false;
                IgTextView igTextView = c71068WnQ.A0G;
                c71068WnQ.A00 = igTextView.getHeight();
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = c71068WnQ.A0H;
                int height2 = touchInterceptorFrameLayout.getHeight();
                RoundedCornerConstraintLayout roundedCornerConstraintLayout = c71068WnQ.A0I;
                float height3 = height2 - roundedCornerConstraintLayout.getHeight();
                float f2 = c71068WnQ.A0C;
                float max = Math.max((height3 - f2) / 2.0f, c71068WnQ.A00);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) roundedCornerConstraintLayout.getLayoutParams();
                marginLayoutParams.topMargin = (int) max;
                marginLayoutParams.bottomMargin = (int) (max - igTextView.getHeight());
                roundedCornerConstraintLayout.setLayoutParams(marginLayoutParams);
                c71068WnQ.A03 = max;
                if (roundedCornerConstraintLayout.getHeight() == 0) {
                    min = 1.0f;
                } else {
                    min = Math.min(((touchInterceptorFrameLayout.getHeight() - (c71068WnQ.A00 * 2.0f)) - c71068WnQ.A0E.getMeasuredHeight()) / roundedCornerConstraintLayout.getHeight(), 1.0f);
                }
                c71068WnQ.A07 = min;
                float f3 = 1.0f;
                if (roundedCornerConstraintLayout.getHeight() != 0) {
                    float height4 = ((roundedCornerConstraintLayout.getHeight() + (c71068WnQ.A03 * 2.0f)) + f2) - touchInterceptorFrameLayout.getHeight();
                    if (height4 >= 0.0f) {
                        f3 = (roundedCornerConstraintLayout.getHeight() - height4) / roundedCornerConstraintLayout.getHeight();
                    }
                }
                c71068WnQ.A04 = f3;
                if (c71068WnQ.A07 < 1.0f) {
                    height = c71068WnQ.A00 - c71068WnQ.A03;
                } else {
                    height = (f2 - c71068WnQ.A0E.getHeight()) / 2.0f;
                }
                c71068WnQ.A05 = height;
                c71068WnQ.A06 = (height - (roundedCornerConstraintLayout.getHeight() * c71068WnQ.A04)) + (roundedCornerConstraintLayout.getHeight() * c71068WnQ.A07);
                c71068WnQ.A01 = (touchInterceptorFrameLayout.getWidth() - (roundedCornerConstraintLayout.getWidth() * c71068WnQ.A04)) / 2.0f;
                c71068WnQ.A02 = (roundedCornerConstraintLayout.getHeight() * c71068WnQ.A04) - roundedCornerConstraintLayout.getHeight();
                c71068WnQ.A08++;
                ((Runnable) this.A02).run();
                if (touchInterceptorFrameLayout.getHeight() > 0 && roundedCornerConstraintLayout.getHeight() > 0 && touchInterceptorFrameLayout.getViewTreeObserver().isAlive()) {
                    AbstractC166997dE.A1K(touchInterceptorFrameLayout, this);
                    c71068WnQ.A09 = null;
                    return;
                }
                return;
        }
    }
}
