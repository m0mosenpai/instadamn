package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.808, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass808 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final Drawable A05;
    public final Drawable A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final List A0A;
    public final List A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC16820sZ A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public AnonymousClass808(Drawable drawable, ImageView imageView, TextView textView, TextView textView2, List list, List list2, InterfaceC16820sZ interfaceC16820sZ, float f, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        float f2;
        float f3;
        GradientDrawable gradientDrawable;
        C14360o3.A0B(imageView, 4);
        this.A07 = imageView;
        this.A09 = textView;
        this.A08 = textView2;
        this.A0G = z;
        this.A0A = list;
        this.A0B = list2;
        this.A00 = f;
        this.A0F = z2;
        this.A0E = z3;
        this.A04 = j;
        this.A0D = interfaceC16820sZ;
        Context context = imageView.getContext();
        Drawable drawable2 = context.getDrawable(i);
        if (drawable2 == null) {
            drawable2 = imageView.getDrawable();
            C14360o3.A07(drawable2);
        }
        this.A06 = drawable2;
        if (drawable == null && (drawable = context.getDrawable(i2)) == null) {
            drawable = imageView.getDrawable();
            C14360o3.A07(drawable);
        }
        this.A05 = drawable;
        float f4 = 0.0f;
        if (textView != null) {
            f2 = textView.getTextSize();
        } else {
            f2 = 0.0f;
        }
        this.A03 = f2;
        if (textView2 != null) {
            f3 = textView2.getTextSize();
        } else {
            f3 = 0.0f;
        }
        this.A02 = f3;
        Drawable background = textView2 != null ? textView2.getBackground() : null;
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            f4 = gradientDrawable.getCornerRadius();
        }
        this.A01 = f4;
        this.A0C = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E0(this, 40));
    }

    public static final ValueAnimator A00(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, List list, float f, float f2, long j, boolean z) {
        TimeInterpolator linearInterpolator;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                if (animatorListener != null) {
                    ofFloat.addListener(animatorListener);
                }
            }
        }
        ofFloat.addUpdateListener(animatorUpdateListener);
        if (z) {
            linearInterpolator = new OvershootInterpolator(2.5f);
        } else {
            linearInterpolator = new LinearInterpolator();
        }
        ofFloat.setInterpolator(linearInterpolator);
        return ofFloat;
    }
}
