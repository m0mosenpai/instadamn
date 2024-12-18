package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.If2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41786If2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C37841Gkv A01;
    public final /* synthetic */ Integer A02;

    public C41786If2(C37841Gkv c37841Gkv, Integer num, int i) {
        this.A01 = c37841Gkv;
        this.A02 = num;
        this.A00 = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup viewGroup;
        float f;
        C14360o3.A0B(valueAnimator, 0);
        C37841Gkv c37841Gkv = this.A01;
        Integer num = this.A02;
        int i = this.A00;
        float A00 = AbstractC167017dG.A00(valueAnimator);
        Integer num2 = C05F.A00;
        IgImageView igImageView = c37841Gkv.A07;
        if (num == num2) {
            if (igImageView != null) {
                igImageView.setAlpha(1.0f - A00);
            }
            IgTextView igTextView = c37841Gkv.A06;
            if (igTextView != null) {
                igTextView.setAlpha(1.0f - A00);
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView = c37841Gkv.A08;
            if (gradientSpinnerAvatarView != null) {
                gradientSpinnerAvatarView.setAlpha(A00);
            }
            IgTextView igTextView2 = c37841Gkv.A05;
            if (igTextView2 != null) {
                igTextView2.setAlpha(A00);
            }
            IgImageView igImageView2 = c37841Gkv.A07;
            if (igImageView2 != null) {
                igImageView2.setRotation((-54.000004f) * A00);
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = c37841Gkv.A08;
            if (gradientSpinnerAvatarView2 != null) {
                gradientSpinnerAvatarView2.setRotation(54.000004f * (1.0f - A00));
            }
            ViewGroup viewGroup2 = c37841Gkv.A04;
            if (viewGroup2 != null) {
                InterfaceC09390do interfaceC09390do = c37841Gkv.A0P;
                AbstractC13880nE.A0a(viewGroup2, (int) (AbstractC167027dH.A01(interfaceC09390do) - ((AbstractC167027dH.A01(interfaceC09390do) - AbstractC167027dH.A01(c37841Gkv.A0O)) * (1.0f - A00))));
            }
            viewGroup = c37841Gkv.A03;
            if (viewGroup != null) {
                f = i - (c37841Gkv.A00 * A00);
            } else {
                return;
            }
        } else {
            if (igImageView != null) {
                igImageView.setAlpha(A00);
            }
            IgTextView igTextView3 = c37841Gkv.A06;
            if (igTextView3 != null) {
                igTextView3.setAlpha(A00);
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView3 = c37841Gkv.A08;
            if (gradientSpinnerAvatarView3 != null) {
                gradientSpinnerAvatarView3.setAlpha(1.0f - A00);
            }
            IgTextView igTextView4 = c37841Gkv.A05;
            if (igTextView4 != null) {
                igTextView4.setAlpha(1.0f - A00);
            }
            IgImageView igImageView3 = c37841Gkv.A07;
            if (igImageView3 != null) {
                igImageView3.setRotation((-54.000004f) * (1.0f - A00));
            }
            GradientSpinnerAvatarView gradientSpinnerAvatarView4 = c37841Gkv.A08;
            if (gradientSpinnerAvatarView4 != null) {
                gradientSpinnerAvatarView4.setRotation(54.000004f * A00);
            }
            ViewGroup viewGroup3 = c37841Gkv.A04;
            if (viewGroup3 != null) {
                InterfaceC09390do interfaceC09390do2 = c37841Gkv.A0P;
                AbstractC13880nE.A0a(viewGroup3, (int) (AbstractC167027dH.A01(interfaceC09390do2) - ((AbstractC167027dH.A01(interfaceC09390do2) - AbstractC167027dH.A01(c37841Gkv.A0O)) * A00)));
            }
            viewGroup = c37841Gkv.A03;
            if (viewGroup == null) {
                return;
            } else {
                f = i + (c37841Gkv.A00 * A00);
            }
        }
        AbstractC13880nE.A0g(viewGroup, (int) f);
    }
}
