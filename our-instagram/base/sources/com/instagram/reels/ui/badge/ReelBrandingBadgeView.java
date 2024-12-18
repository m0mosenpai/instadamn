package com.instagram.reels.ui.badge;

import X.C50L;
import X.EnumC73093Pk;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.ui.widget.badgeicon.BadgeIconView;

/* loaded from: classes3.dex */
public class ReelBrandingBadgeView extends BadgeIconView {
    public int[] A00;
    public final int[] A01;

    public ReelBrandingBadgeView(Context context) {
        this(context, null);
    }

    public static int[] A00(Context context, int i) {
        int[] iArr = new int[5];
        C50L.A03(context, null, iArr, i);
        return new int[]{iArr[1], iArr[3]};
    }

    public void setActiveColorState(boolean z) {
        int[] iArr = this.A06;
        int[] iArr2 = this.A00;
        boolean z2 = false;
        if (iArr == iArr2) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                return;
            }
        } else if (!z2) {
            return;
        } else {
            iArr2 = this.A01;
        }
        setBackgroundColorGradient(iArr2);
    }

    public final void A02(Drawable drawable) {
        setIconDrawable(drawable);
        this.A08.setColor(getContext().getColor(R.color.fds_transparent));
        setIconSizeFactor(0.55f);
        setTranslationYFactor(0.25f);
        setBackgroundBorderColor(this.A07);
    }

    public final void A03(EnumC73093Pk enumC73093Pk) {
        int i;
        int i2 = R.style.GradientPatternStyle;
        switch (enumC73093Pk.ordinal()) {
            case 1:
                i = R.drawable.reel_location_branding_icon;
                break;
            case 2:
                i = R.drawable.reel_hash_branding_icon;
                break;
            case 3:
                i = R.drawable.instagram_trophy_filled_24;
                i2 = R.style.OrangeYellowGradientPatternStyle;
                break;
            case 4:
                i = R.drawable.reel_sticker_branding_icon;
                break;
            case 5:
                i = R.drawable.reel_pbia_branding_icon;
                break;
            case 6:
                i = R.drawable.instagram_shopping_bag_pano_filled_24;
                break;
            case 7:
                i = R.drawable.instagram_story_mention_filled_16;
                break;
            case 8:
                i = R.drawable.instagram_ads_pano_filled_24;
                break;
            default:
                i = 0;
                break;
        }
        setIconDrawable(i);
        setIconTintColorResource(R.color.design_dark_default_color_on_background);
        int[] A00 = A00(getContext(), i2);
        this.A00 = A00;
        setBackgroundColorGradient(A00);
        setIconSizeFactor(0.55f);
        setTranslationYFactor(0.25f);
        setBackgroundBorderColor(this.A07);
    }

    public void setDefaultBackgroundGradient(Context context) {
        int[] A00 = A00(getContext(), R.style.GradientPatternStyle);
        this.A00 = A00;
        setBackgroundColorGradient(A00);
    }

    public ReelBrandingBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color = getContext().getColor(R.color.baseline_neutral_80);
        this.A01 = new int[]{color, color};
        int[] A00 = A00(context, R.style.GradientPatternStyle);
        this.A00 = A00;
        setBackgroundColorGradient(A00);
        A01(getMeasuredWidth(), getMeasuredHeight());
    }

    public ReelBrandingBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
