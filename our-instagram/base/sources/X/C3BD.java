package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.3BD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BD implements InterfaceC55932he {
    public static final C55942hf A0E = C55942hf.A04(12.0d, 5.0d);
    public int A00 = -1;
    public Drawable A01;
    public View A02;
    public AnimationSet A03;
    public AnimationSet A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public C55982hj A08;
    public final boolean A09;
    public final int A0A;
    public final Context A0B;
    public final View.OnClickListener A0C;
    public final String A0D;

    public C3BD(Context context, View.OnClickListener onClickListener, String str, int i, boolean z) {
        this.A0B = context;
        this.A0D = str;
        this.A0C = onClickListener;
        this.A09 = z;
        this.A0A = i;
        Resources resources = context.getResources();
        int integer = resources.getInteger(R.integer.config_mediumAnimTime);
        int integer2 = resources.getInteger(R.integer.config_shortAnimTime);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f));
        animationSet.setInterpolator(new OvershootInterpolator());
        animationSet.setStartOffset(integer / 3);
        animationSet.setDuration(integer);
        this.A03 = animationSet;
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet2.addAnimation(new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f));
        animationSet2.setDuration(integer2);
        this.A04 = animationSet2;
        if (z) {
            C55982hj A02 = AbstractC13560mi.A00().A02();
            A02.A09(A0E);
            A02.A0A(this);
            this.A08 = A02;
        }
    }

    public final void A07(FrameLayout frameLayout) {
        C14360o3.A0B(frameLayout, 0);
        Context context = this.A0B;
        int i = this.A0A;
        if (i != -1) {
            context = new ContextThemeWrapper(context, i);
        }
        View inflate = LayoutInflater.from(context).inflate(com.facebook.R.layout.new_feed_pill, (ViewGroup) frameLayout, false);
        inflate.setVisibility(8);
        C0fQ.A00(this.A0C, inflate);
        if (this.A00 != -1) {
            A00(inflate, this);
        }
        frameLayout.addView(inflate);
        this.A07 = (TextView) inflate.requireViewById(com.facebook.R.id.new_feed_pill_text);
        this.A06 = (TextView) inflate.requireViewById(com.facebook.R.id.new_feed_pill_badge);
        this.A05 = (ImageView) inflate.requireViewById(com.facebook.R.id.new_feed_pill_accessory);
        TextView textView = (TextView) inflate.requireViewById(com.facebook.R.id.new_feed_pill_text);
        textView.setText(this.A0D);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(com.facebook.R.dimen.abc_button_padding_horizontal_material));
        for (Drawable drawable : textView.getCompoundDrawablesRelative()) {
            if (drawable != null) {
                drawable.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A08(context))));
            }
        }
        AbstractC56952jT.A04(textView, C05F.A01);
        TextView textView2 = this.A06;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView = this.A05;
        if (imageView != null) {
            if (this.A01 != null) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(this.A01);
            } else {
                imageView.setVisibility(8);
            }
        }
        this.A07 = textView;
        this.A02 = inflate;
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        View view = this.A02;
        if (view != null) {
            view.setTranslationY((float) c55982hj.A09.A00);
        }
    }

    public static final void A00(View view, C3BD c3bd) {
        GradientDrawable gradientDrawable;
        LayerDrawable layerDrawable;
        if (view != null) {
            int i = c3bd.A00;
            if (i == -1) {
                i = -2;
            }
            AbstractC13880nE.A0W(view, i);
            Drawable background = view.getBackground();
            Drawable drawable = null;
            if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null) {
                drawable = layerDrawable.findDrawableByLayerId(com.facebook.R.id.background);
            }
            if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                gradientDrawable.setCornerRadius(c3bd.A00 / 2);
            }
        }
    }

    public final void A01() {
        View view = this.A02;
        if (view != null) {
            view.setOnClickListener(null);
        }
        this.A02 = null;
    }

    public final void A02(int i) {
        FrameLayout.LayoutParams layoutParams;
        View view = this.A02;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                if (layoutParams != null) {
                    layoutParams.gravity = i;
                }
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public final void A03(int i) {
        FrameLayout.LayoutParams layoutParams;
        View view = this.A02;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                if ((layoutParams.gravity & 80) == 80 && ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin != i) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
                } else if (((ViewGroup.MarginLayoutParams) layoutParams).topMargin == i) {
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public final void A04(Drawable drawable) {
        this.A01 = drawable;
        ImageView imageView = this.A05;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(this.A01);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public final void A05(Animation animation) {
        View view;
        View view2 = this.A02;
        if (view2 != null && view2.getVisibility() == 0) {
            View view3 = this.A02;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            if (animation != null && (view = this.A02) != null) {
                view.clearAnimation();
                view.startAnimation(animation);
            }
        }
    }

    public final void A06(Animation animation) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        C55982hj c55982hj;
        double d;
        View view2 = this.A02;
        if (view2 != null && view2.getVisibility() == 8) {
            View view3 = this.A02;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            if (animation != null && (view = this.A02) != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = null;
                }
                if (this.A09 && layoutParams != null && (c55982hj = this.A08) != null) {
                    int i = layoutParams.gravity & 80;
                    float translationY = view.getTranslationY();
                    if (i == 80) {
                        view.setTranslationY(translationY);
                        d = view.getTranslationY();
                    } else {
                        view.setTranslationY(-translationY);
                        d = -view.getTranslationY();
                    }
                    c55982hj.A08(d, true);
                    c55982hj.A06(0.0d);
                    return;
                }
                view.clearAnimation();
                view.startAnimation(animation);
            }
        }
    }
}
