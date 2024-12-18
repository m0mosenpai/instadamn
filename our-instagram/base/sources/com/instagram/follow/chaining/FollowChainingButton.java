package com.instagram.follow.chaining;

import X.AbstractC53242c7;
import X.AbstractC56932jR;
import X.AbstractC56952jT;
import X.C00O;
import X.C02G;
import X.C05F;
import X.C14360o3;
import X.C154686xJ;
import X.C1QI;
import X.C1QL;
import X.C3DY;
import X.EnumC155676yw;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.R;

/* loaded from: classes3.dex */
public final class FollowChainingButton extends FrameLayout {
    public ImageView A00;
    public C154686xJ A01;
    public int A02;
    public ProgressBar A03;
    public EnumC155676yw A04;
    public boolean A05;
    public final C1QL A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowChainingButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A06 = C1QI.A0E();
        this.A01 = new C154686xJ(R.drawable.follow_chaining_button_following_selector, R.drawable.follow_chaining_button_not_following_selector, R.color.grey_9, R.color.design_dark_default_color_on_background);
        this.A04 = EnumC155676yw.A02;
        A00();
    }

    public final void A01(EnumC155676yw enumC155676yw, boolean z) {
        int i;
        ColorStateList A02;
        C14360o3.A0B(enumC155676yw, 0);
        EnumC155676yw enumC155676yw2 = this.A04;
        this.A04 = enumC155676yw;
        this.A05 = z;
        ProgressBar progressBar = this.A03;
        if (progressBar != null) {
            int i2 = 4;
            if (enumC155676yw == EnumC155676yw.A03) {
                i2 = 0;
            }
            progressBar.setVisibility(i2);
            setBackgroundColor(z);
            C154686xJ c154686xJ = this.A01;
            if (z) {
                i = c154686xJ.A01;
            } else {
                i = c154686xJ.A03;
            }
            if (this.A06.A00) {
                Context context = getContext();
                C14360o3.A07(context);
                A02 = C02G.A02(context, C1QI.A07(context, C1QI.A0E()));
                if (A02 == null) {
                    A02 = ColorStateList.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
                    C14360o3.A07(A02);
                }
            } else {
                A02 = C02G.A02(getContext(), i);
                if (A02 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            ColorFilter A00 = C3DY.A00(A02.getColorForState(getDrawableState(), 0));
            setImageButtonContent(enumC155676yw, A00);
            ProgressBar progressBar2 = this.A03;
            if (progressBar2 != null) {
                Drawable indeterminateDrawable = progressBar2.getIndeterminateDrawable();
                if (indeterminateDrawable != null) {
                    indeterminateDrawable.setColorFilter(A00);
                    if (enumC155676yw2 != enumC155676yw && !isFocused()) {
                        AbstractC56932jR.A06(this, 500L);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        C14360o3.A0F("progressBar");
        throw C00O.createAndThrow();
    }

    public final void setCustomButtonStyle(C154686xJ c154686xJ) {
        C14360o3.A0B(c154686xJ, 0);
        this.A01 = c154686xJ;
        A01(this.A04, this.A05);
    }

    private final void setBackgroundColor(boolean z) {
        int i;
        C1QL c1ql = this.A06;
        if (c1ql.A00) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Context context = getContext();
            C14360o3.A07(context);
            gradientDrawable.setColor(C1QI.A09(context));
            Resources resources = getResources();
            gradientDrawable.setCornerRadius(resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            if (c1ql == C1QL.A04) {
                gradientDrawable.setStroke(resources.getDimensionPixelSize(R.dimen.afi_segmented_pill_border_width), C02G.A02(context, R.color.igds_prism_secondary_button_border_A));
            }
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setBackground(gradientDrawable);
                return;
            }
        } else {
            C154686xJ c154686xJ = this.A01;
            if (z) {
                i = c154686xJ.A00;
            } else {
                i = c154686xJ.A02;
            }
            ImageView imageView2 = this.A00;
            if (imageView2 != null) {
                imageView2.setBackgroundResource(i);
                return;
            }
        }
        C14360o3.A0F("buttonImageView");
        throw C00O.createAndThrow();
    }

    private final void setButtonIcon(EnumC155676yw enumC155676yw, ColorFilter colorFilter) {
        Drawable mutate;
        EnumC155676yw enumC155676yw2 = EnumC155676yw.A02;
        int i = R.drawable.instagram_user_follow_pano_filled_24;
        if (enumC155676yw == enumC155676yw2) {
            i = R.drawable.instagram_user_follow_pano_outline_24;
        }
        Drawable drawable = getContext().getDrawable(i);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(colorFilter);
        }
        ImageView imageView = this.A00;
        if (imageView == null) {
            C14360o3.A0F("buttonImageView");
            throw C00O.createAndThrow();
        }
        imageView.setImageDrawable(drawable);
    }

    private final void setImageButtonContent(EnumC155676yw enumC155676yw, ColorFilter colorFilter) {
        ImageView imageView = this.A00;
        if (imageView != null) {
            int i = this.A02;
            imageView.setPadding(i, i, i, i);
            if (enumC155676yw == EnumC155676yw.A03) {
                ImageView imageView2 = this.A00;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(null);
                    return;
                }
            } else {
                setButtonIcon(enumC155676yw, colorFilter);
                return;
            }
        }
        C14360o3.A0F("buttonImageView");
        throw C00O.createAndThrow();
    }

    private final void A00() {
        Context context = getContext();
        LayoutInflater.from(context).inflate(R.layout.chaining_button, (ViewGroup) this, true);
        this.A03 = (ProgressBar) requireViewById(R.id.chaining_button_progress_bar);
        this.A00 = (ImageView) requireViewById(R.id.chaining_button_image);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
        AbstractC56952jT.A04(this, C05F.A01);
    }

    public final void setCustomImagePadding(int i) {
        this.A02 = getContext().getResources().getDimensionPixelSize(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowChainingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A06 = C1QI.A0E();
        this.A01 = new C154686xJ(R.drawable.follow_chaining_button_following_selector, R.drawable.follow_chaining_button_not_following_selector, R.color.grey_9, R.color.design_dark_default_color_on_background);
        this.A04 = EnumC155676yw.A02;
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowChainingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A06 = C1QI.A0E();
        this.A01 = new C154686xJ(R.drawable.follow_chaining_button_following_selector, R.drawable.follow_chaining_button_not_following_selector, R.color.grey_9, R.color.design_dark_default_color_on_background);
        this.A04 = EnumC155676yw.A02;
        A00();
    }
}
