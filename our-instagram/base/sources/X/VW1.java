package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes11.dex */
public abstract class VW1 {
    public static void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69447VnW c69447VnW, C69425VnA c69425VnA) {
        TextView textView;
        CharSequence charSequence;
        int ordinal;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c69425VnA.A08;
        gradientSpinnerAvatarView.setVisibility(8);
        CircularImageView circularImageView = c69425VnA.A03;
        circularImageView.setVisibility(8);
        IgImageView igImageView = c69425VnA.A04;
        igImageView.setVisibility(8);
        VJU vju = c69447VnW.A02;
        int intValue = vju.A02.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    gradientSpinnerAvatarView.setVisibility(0);
                    ImageUrl imageUrl = vju.A01;
                    if (imageUrl != null) {
                        gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, imageUrl);
                    } else {
                        gradientSpinnerAvatarView.A04();
                    }
                }
            } else {
                circularImageView.setVisibility(0);
                Drawable drawable = vju.A00;
                if (drawable != null) {
                    circularImageView.setImageDrawable(drawable);
                    AbstractC31177DnL.A0p(context, circularImageView, AbstractC53242c7.A08(context));
                } else {
                    circularImageView.A09();
                }
            }
        } else {
            igImageView.setVisibility(0);
            ImageUrl imageUrl2 = vju.A01;
            if (imageUrl2 != null) {
                igImageView.setUrl(imageUrl2, interfaceC11380iw);
            } else {
                igImageView.setPlaceHolderColor(AbstractC167007dF.A09(context, R.attr.igds_color_elevated_separator));
                igImageView.A09();
            }
        }
        WNU.A00(c69425VnA.A00, 59, c69447VnW);
        Reel reel = c69447VnW.A00;
        if (reel != null) {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
            gradientSpinnerAvatarView.setGradientColorRes(R.style.GradientPatternStyle);
            gradientSpinnerAvatarView.setGradientSpinnerActivated(!reel.A16(userSession));
            C1NB c1nb = reel.A0W;
            if (c1nb != null && ((ordinal = c1nb.Ai9().ordinal()) == 2 || ordinal == 3 || ordinal == 1)) {
                ReelBrandingBadgeView reelBrandingBadgeView = c69425VnA.A07;
                reelBrandingBadgeView.setVisibility(0);
                reelBrandingBadgeView.A03(reel.A0W.Ai9());
            }
            if (c69447VnW.A03 != null) {
                gradientSpinnerAvatarView.setClickable(true);
                WNP.A00(gradientSpinnerAvatarView, 62, c69447VnW, c69425VnA);
            }
        } else {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
            c69425VnA.A07.setVisibility(8);
            gradientSpinnerAvatarView.setOnClickListener(null);
            gradientSpinnerAvatarView.setClickable(false);
        }
        TextView textView2 = c69425VnA.A02;
        CharSequence charSequence2 = c69447VnW.A06;
        textView2.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            c69425VnA.A01.setVisibility(0);
        }
        if (c69447VnW.A08) {
            C57012jc c57012jc = c69425VnA.A05;
            c57012jc.A03(0);
            View A01 = c57012jc.A01();
            textView = AbstractC31176DnK.A0E(A01);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) A01.requireViewById(R.id.subtitle_shimmer_container_one);
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) A01.requireViewById(R.id.subtitle_shimmer_container_two);
            textView.setVisibility(8);
            shimmerFrameLayout.setVisibility(8);
            shimmerFrameLayout2.setVisibility(8);
            if (c69447VnW.A0A) {
                shimmerFrameLayout.setVisibility(0);
                shimmerFrameLayout.A02();
                shimmerFrameLayout2.setVisibility(0);
                shimmerFrameLayout2.A02();
                return;
            }
            charSequence = c69447VnW.A07;
        } else {
            C57012jc c57012jc2 = c69425VnA.A06;
            c57012jc2.A03(0);
            View A012 = c57012jc2.A01();
            TextView textView3 = (TextView) A012.requireViewById(R.id.subtitleOne);
            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) A012.requireViewById(R.id.subtitleOne_shimmer_container);
            textView3.setVisibility(8);
            shimmerFrameLayout3.setVisibility(8);
            if (c69447VnW.A09) {
                shimmerFrameLayout3.setVisibility(0);
                shimmerFrameLayout3.A02();
            } else {
                CharSequence charSequence3 = c69447VnW.A04;
                if (!TextUtils.isEmpty(charSequence3)) {
                    textView3.setVisibility(0);
                    textView3.setText(charSequence3);
                }
            }
            View A013 = c57012jc2.A01();
            textView = (TextView) A013.requireViewById(R.id.subtitleTwo);
            View requireViewById = A013.requireViewById(R.id.subtitleTwo_shimmer_container);
            textView.setVisibility(8);
            requireViewById.setVisibility(8);
            charSequence = c69447VnW.A05;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }
}
