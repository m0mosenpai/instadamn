package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.arads.ui.FooterView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes4.dex */
public final class ANS implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ FooterView A04;

    public ANS(FooterView footerView, int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A04 = footerView;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        int i = this.A02;
        FooterView footerView = this.A04;
        IgTextView igTextView = footerView.A02;
        int A02 = AbstractC13950nL.A02(A00, i, igTextView.getCurrentTextColor());
        int i2 = this.A01;
        IgTextView igTextView2 = footerView.A01;
        int A022 = AbstractC13950nL.A02(A00, i2, igTextView2.getCurrentTextColor());
        int A023 = AbstractC13950nL.A02(A00, this.A00, this.A03);
        igTextView.setTextColor(A02);
        igTextView2.setTextColor(A022);
        Drawable background = footerView.A00.getBackground();
        C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(A023);
    }
}
