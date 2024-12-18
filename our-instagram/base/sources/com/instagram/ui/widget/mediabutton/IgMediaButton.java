package com.instagram.ui.widget.mediabutton;

import X.AbstractC001900j;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AbstractC31173DnH;
import X.AbstractC43592JPx;
import X.AbstractC56952jT;
import X.C128935sB;
import X.C14360o3;
import X.LLo;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class IgMediaButton extends ConstraintLayout {
    public static final Interpolator A0A = new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
    public final ObjectAnimator A00;
    public final ObjectAnimator A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgMediaButton(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public static final ObjectAnimator A00(ImageView imageView, float f, float f2, long j) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", f);
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", f);
        float[] A1b = AbstractC43592JPx.A1b();
        A1b[0] = f2;
        A1b[1] = 0.0f;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, ofFloat, ofFloat2, PropertyValuesHolder.ofFloat("alpha", A1b));
        ofPropertyValuesHolder.setDuration(1400L);
        ofPropertyValuesHolder.setStartDelay(j);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(1);
        ofPropertyValuesHolder.setInterpolator(new C128935sB());
        return ofPropertyValuesHolder;
    }

    public final void setLabel(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        TextView textView = this.A09;
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (AbstractC25225BEi.A1Y(charSequence)) {
            CharSequence contentDescription = getContentDescription();
            if (contentDescription == null || AbstractC001900j.A0T(contentDescription)) {
                setContentDescription(charSequence);
            }
        }
    }

    public final void setDrawableLarge(Drawable drawable) {
        ImageView imageView = this.A04;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    public final void setDrawableMedium(Drawable drawable) {
        ImageView imageView = this.A08;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgMediaButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.media_button_layout, (ViewGroup) this, true);
        ImageView A0I = AbstractC31173DnH.A0I(this, R.id.media_button_image_animated);
        this.A04 = A0I;
        this.A08 = AbstractC31173DnH.A0I(this, R.id.media_button_image_static);
        this.A09 = AbstractC166997dE.A0T(this, R.id.media_button_text);
        ImageView A0I2 = AbstractC31173DnH.A0I(this, R.id.media_button_image_bubble);
        this.A05 = A0I2;
        ImageView A0I3 = AbstractC31173DnH.A0I(this, R.id.media_button_image_ripple_stroke);
        this.A07 = A0I3;
        ImageView A0I4 = AbstractC31173DnH.A0I(this, R.id.media_button_image_ripple_shadow);
        this.A06 = A0I4;
        AbstractC56952jT.A01(this);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(A0I, PropertyValuesHolder.ofFloat("scaleX", 1.1f), PropertyValuesHolder.ofFloat("scaleY", 1.1f));
        ofPropertyValuesHolder.setDuration(700L);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator(5.0f));
        this.A00 = ofPropertyValuesHolder;
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(A0I2, PropertyValuesHolder.ofFloat("scaleX", 0.9f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.9f, 1.0f), PropertyValuesHolder.ofFloat("translationX", -18.0f), PropertyValuesHolder.ofFloat("translationY", -16.0f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("rotation", 0.0f, ((float) (Math.random() * 29.0d)) - 14.0f));
        ofPropertyValuesHolder2.setDuration(1400L);
        ofPropertyValuesHolder2.setStartDelay(750L);
        ofPropertyValuesHolder2.setRepeatCount(-1);
        ofPropertyValuesHolder2.setRepeatMode(1);
        ofPropertyValuesHolder2.setInterpolator(A0A);
        ofPropertyValuesHolder2.addListener(new LLo(2, ofPropertyValuesHolder2, this));
        this.A01 = ofPropertyValuesHolder2;
        this.A02 = A00(A0I4, 1.5f, 0.5f, 400L);
        this.A03 = A00(A0I3, 1.4f, 0.8f, 800L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgMediaButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
