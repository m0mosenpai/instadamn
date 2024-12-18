package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.LiveUserPaySupportTier;

/* renamed from: X.OQc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54905OQc {
    public static final Integer A00(LiveUserPaySupportTier liveUserPaySupportTier, boolean z) {
        int i;
        C14360o3.A0B(liveUserPaySupportTier, 0);
        int ordinal = liveUserPaySupportTier.ordinal();
        if (z) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 0) {
                            return null;
                        }
                        throw B4Z.A00();
                    }
                    i = R.drawable.instagram_creator_experience_assets_badges3_12_android;
                } else {
                    i = R.drawable.instagram_creator_experience_assets_badges2_12_android;
                }
            } else {
                i = R.drawable.instagram_creator_experience_assets_badges1_12_android;
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 0) {
                        return null;
                    }
                    throw B4Z.A00();
                }
                i = R.drawable.instagram_creator_experience_assets_badges3_24_android;
            } else {
                i = R.drawable.instagram_creator_experience_assets_badges2_24_android;
            }
        } else {
            i = R.drawable.instagram_creator_experience_assets_badges1_24_android;
        }
        return Integer.valueOf(i);
    }

    public static final void A01(Context context, ImageView imageView, TextView textView, LiveUserPaySupportTier liveUserPaySupportTier, int i) {
        Drawable drawable;
        int[] iArr;
        int i2;
        int A0H;
        int A06 = AbstractC167007dF.A06(1, imageView, textView);
        imageView.setVisibility(0);
        Integer A00 = A00(liveUserPaySupportTier, true);
        if (A00 != null) {
            drawable = MSX.A07(context, A00);
        } else {
            drawable = null;
        }
        imageView.setBackground(drawable);
        if (i > 1) {
            textView.setVisibility(0);
            CharSequence A0O = AnonymousClass001.A0O("+", i - 1);
            C14360o3.A07(A0O);
            textView.setText(A0O);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
            int ordinal = liveUserPaySupportTier.ordinal();
            if (ordinal != 1) {
                if (ordinal != A06) {
                    if (ordinal != 3) {
                        if (ordinal == 0) {
                            iArr = null;
                            gradientDrawable.setColors(iArr);
                            gradientDrawable.setCornerRadius(AbstractC166987dD.A04(textView.getResources(), R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
                            textView.setBackground(gradientDrawable);
                            return;
                        }
                        throw B4Z.A00();
                    }
                    iArr = new int[A06];
                    iArr[0] = AbstractC167007dF.A09(context, R.attr.igds_color_gradient_purple);
                    A0H = R.color.igds_sticker_text_vibrant_gradient_purple;
                    iArr[1] = context.getColor(A0H);
                    gradientDrawable.setColors(iArr);
                    gradientDrawable.setCornerRadius(AbstractC166987dD.A04(textView.getResources(), R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
                    textView.setBackground(gradientDrawable);
                    return;
                }
                iArr = new int[A06];
                iArr[0] = AbstractC167007dF.A09(context, R.attr.igds_color_gradient_red);
                i2 = R.attr.igds_color_gradient_purple;
            } else {
                iArr = new int[A06];
                iArr[0] = context.getColor(R.color.activator_card_progress_bad);
                i2 = R.attr.igds_color_gradient_red;
            }
            A0H = AbstractC53242c7.A0H(context, i2);
            iArr[1] = context.getColor(A0H);
            gradientDrawable.setColors(iArr);
            gradientDrawable.setCornerRadius(AbstractC166987dD.A04(textView.getResources(), R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
            textView.setBackground(gradientDrawable);
            return;
        }
        textView.setVisibility(8);
    }
}
