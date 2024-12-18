package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ie8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41736Ie8 {
    public static boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (java.lang.Boolean.valueOf(r1) == null) goto L6;
     */
    static {
        /*
            X.0od r0 = X.C14650od.A03
            if (r0 == 0) goto L19
            com.instagram.common.session.UserSession r3 = X.C14650od.A00(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320296450203974(0x81091e000d2146, double:3.032439952979393E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L1a
        L19:
            r1 = 0
        L1a:
            X.AbstractC41736Ie8.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41736Ie8.<clinit>():void");
    }

    public static void A01(ImageView imageView, boolean z) {
        int i;
        boolean z2 = A00;
        int i2 = R.drawable.tag_carrot;
        if (z2) {
            i2 = R.drawable.prism_tag_carrot;
        }
        Context context = imageView.getContext();
        Drawable mutate = context.getDrawable(i2).mutate();
        if (A00) {
            AbstractC25231BEo.A0x(context, mutate, R.color.igds_prism_gray_10);
            i = 230;
        } else {
            AbstractC25231BEo.A0x(context, mutate, R.color.grey_10);
            i = 179;
        }
        mutate.setAlpha(i);
        imageView.setBackground(mutate);
        imageView.setPadding(0, 0, 0, 0);
        if (!z) {
            imageView.setRotation(180.0f);
        }
    }

    public static void A00(View view, UserSession userSession, C38321qM c38321qM, Boolean bool) {
        Drawable drawable;
        int i;
        int A04;
        Context context = view.getContext();
        boolean z = A00;
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AbstractC167017dG.A0E(context));
            drawable = gradientDrawable;
        } else {
            drawable = context.getDrawable(R.drawable.tag_bubble_new).mutate();
        }
        if (A00) {
            AbstractC25231BEo.A0x(context, drawable, R.color.igds_prism_gray_10);
            i = 230;
        } else {
            AbstractC25231BEo.A0x(context, drawable, R.color.grey_10);
            i = 179;
        }
        drawable.setAlpha(i);
        view.setBackground(drawable);
        boolean booleanValue = bool.booleanValue();
        if (z) {
            int A06 = AbstractC167017dG.A06(context);
            int A03 = AbstractC167017dG.A03(context);
            view.setPadding(A03, A06, A03, A06);
        }
        if (!booleanValue) {
            C14360o3.A0B(userSession, 1);
            if (c38321qM != null) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36327649433828091L)) {
                    if ((c38321qM.CdW() || C18U.A06(c06090Tz, userSession, 2342170658647915261L)) && (A04 = (int) AbstractC13880nE.A04(context, (int) C18U.A00(c06090Tz, userSession, 37172074364142136L))) > 0) {
                        AbstractC13880nE.A0j(view, A04, A04);
                    }
                }
            }
        }
    }

    public static void A02(TextView textView) {
        Context context = textView.getContext();
        textView.setTextSize(2, context.getResources().getInteger(R.integer.tag_text_size));
        textView.setGravity(17);
        AbstractC166987dD.A1O(context, textView, android.R.color.white);
    }

    public static void A03(TextView textView, int i, boolean z) {
        Context context = textView.getContext();
        Resources resources = context.getResources();
        int i2 = R.dimen.ad_tag_max_width;
        if (z) {
            i2 = R.dimen.avatar_powerups_avatar_height;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        int dimensionPixelSize2 = i - context.getResources().getDimensionPixelSize(R.dimen.bubble_external_padding);
        if (z) {
            textView.setTextAppearance(R.style.igds_emphasized_body_2);
            textView.setLineSpacing(6.0f, 1.2f);
        } else {
            textView.setTextSize(2, context.getResources().getInteger(R.integer.tag_text_size));
        }
        textView.setMinimumWidth(context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        if (A00) {
            AbstractC166987dD.A1O(context, textView, R.color.igds_prism_gray_03);
        }
        textView.setMaxWidth(dimensionPixelSize - (dimensionPixelSize2 * 2));
        textView.setGravity(16);
    }
}
