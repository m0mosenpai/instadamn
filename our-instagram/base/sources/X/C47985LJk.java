package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.LJk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47985LJk {
    public static final C47985LJk A00 = new Object();

    public static final void A00(IgImageView igImageView, IgImageView igImageView2, boolean z) {
        igImageView.setVisibility(8);
        igImageView.setImageDrawable(null);
        igImageView.setPivotX(50.0f);
        igImageView.setPivotY(50.0f);
        if (z) {
            igImageView2.setScaleY(1.0f);
            igImageView2.setScaleX(1.0f);
            igImageView2.setAlpha(1.0f);
        }
    }

    public final L2Y A02(Drawable drawable, IgImageView igImageView, IgImageView igImageView2, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(igImageView2, 1);
        AbstractC167007dF.A1E(drawable, 2, str);
        if (!(drawable instanceof C74O)) {
            interfaceC16820sZ.invoke();
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) View.SCALE_Y, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) View.SCALE_X, 0.0f, 1.0f);
        Property property = View.ALPHA;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(igImageView, (Property<IgImageView, Float>) property, 1.0f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) property, 0.0f, 1.0f);
        AbstractC43592JPx.A1B(animatorSet);
        animatorSet.setDuration(250L);
        animatorSet.playTogether(ofFloat2, ofFloat, ofFloat3, ofFloat4);
        ME5 me5 = new ME5(40, igImageView2, interfaceC16820sZ, igImageView);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) View.SCALE_Y, 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) property2, 0.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(igImageView, (Property<IgImageView, Float>) property, 0.0f, 1.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) property, 1.0f, 0.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(igImageView, (Property<IgImageView, Float>) property2, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(igImageView, (Property<IgImageView, Float>) View.SCALE_Y, 1.0f);
        animatorSet2.setInterpolator(new AccelerateInterpolator());
        animatorSet2.setDuration(250L);
        animatorSet2.playTogether(ofFloat6, ofFloat5, ofFloat7, ofFloat8, ofFloat9, ofFloat10);
        JX2.A00(animatorSet2, me5, 7);
        igImageView2.setPivotY(100.0f);
        igImageView2.setPivotX(50.0f);
        A01(igImageView2, (C74O) drawable, new C43603JQj(animatorSet, 7), new C43603JQj(animatorSet2, 8));
        return new L2Y(igImageView2, igImageView, str, z);
    }

    public final void A03(Drawable drawable, View view, IgImageView igImageView, IgImageView igImageView2) {
        int A1R = AbstractC167007dF.A1R(0, igImageView, igImageView2);
        if (drawable instanceof C74O) {
            igImageView.setVisibility(8);
            igImageView2.setImageDrawable(drawable);
            igImageView2.setVisibility(0);
            view.setVisibility(0);
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[A1R];
            fArr[0] = -120.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) property, fArr);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) View.SCALE_Y, 1.0f, 4.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) View.SCALE_X, 1.0f, 4.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, 1.0f);
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 0.0f, 1.0f);
            animatorSet.setDuration(280L);
            AbstractC43592JPx.A1B(animatorSet);
            animatorSet.playTogether(ofFloat, ofFloat3, ofFloat2, ofFloat5, ofFloat4);
            AnimatorSet animatorSet2 = new AnimatorSet();
            Property property3 = View.SCALE_Y;
            float[] fArr2 = new float[A1R];
            fArr2[0] = 1.0f;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) property3, fArr2);
            float[] fArr3 = new float[A1R];
            fArr3[0] = 1.0f;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) property2, fArr3);
            Property property4 = View.TRANSLATION_Y;
            float[] fArr4 = new float[2];
            fArr4[0] = igImageView2.getTranslationY() - 120.0f;
            fArr4[A1R] = -12.0f;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(igImageView2, (Property<IgImageView, Float>) property4, fArr4);
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.0f);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.0f);
            animatorSet2.setDuration(280L);
            animatorSet2.setInterpolator(new AccelerateInterpolator());
            animatorSet2.playTogether(ofFloat8, ofFloat7, ofFloat6, ofFloat10, ofFloat9);
            animatorSet2.addListener(new C66300U7y(3, igImageView2, igImageView));
            A01(igImageView2, (C74O) drawable, new C43603JQj(animatorSet, 5), new C43603JQj(animatorSet2, 6));
            igImageView2.post(new M0K(igImageView2));
        }
    }

    public static final void A01(IgImageView igImageView, C74O c74o, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        igImageView.setImageDrawable(c74o);
        igImageView.setVisibility(0);
        c74o.A06();
        c74o.A0A(1);
        c74o.A0I = interfaceC16820sZ2;
        if (c74o.isLoading()) {
            c74o.A9I(new C23669Ae4(1, interfaceC16820sZ, c74o));
        } else {
            c74o.A08();
            interfaceC16820sZ.invoke();
        }
    }
}
