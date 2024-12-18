package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebookpay.widget.accordion.AccordionView;

/* loaded from: classes11.dex */
public final class WOI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AccordionView A02;
    public final /* synthetic */ boolean A03;

    public WOI(View view, ViewGroup viewGroup, AccordionView accordionView, boolean z) {
        this.A02 = accordionView;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A03 = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AccordionView accordionView = this.A02;
        AbstractC166997dE.A1K(accordionView, this);
        View view = this.A00;
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup viewGroup = this.A01;
        AbstractC65702TsY.A12(viewGroup, view.getHeight(), 0, View.MeasureSpec.makeMeasureSpec(view.getWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
        ValueAnimator duration = ValueAnimator.ofInt(measuredHeight, viewGroup.getMeasuredHeight() + (accordionView.A0A * 2)).setDuration((long) ((Math.abs(r2 - measuredHeight) * 1.5d) / AbstractC65702TsY.A00(view.getContext())));
        viewGroup.getLayoutParams().height = viewGroup.getMeasuredHeight();
        AccordionView.A00(accordionView, this.A03);
        C65759TtZ.A00(duration, view, 2);
        duration.addListener(new C66300U7y(2, view, viewGroup));
        duration.start();
    }
}
