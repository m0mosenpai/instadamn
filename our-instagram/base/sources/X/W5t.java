package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebookpay.widget.listcell.ListCell;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes11.dex */
public final class W5t {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (r0 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (r0 == false) goto L46;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02(android.content.Context r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            r0 = 51
            if (r4 == r0) goto L8f
            switch(r4) {
                case 0: goto L7e;
                case 1: goto L7a;
                case 2: goto L76;
                case 3: goto L72;
                case 4: goto L6e;
                case 5: goto L6a;
                case 6: goto L66;
                case 7: goto L30;
                case 8: goto L62;
                case 9: goto L8f;
                case 10: goto L54;
                case 11: goto L50;
                case 12: goto L4c;
                case 13: goto L72;
                case 14: goto L72;
                case 15: goto L7e;
                case 16: goto L8b;
                case 17: goto L48;
                case 18: goto L44;
                case 19: goto L34;
                case 20: goto L40;
                case 21: goto L3c;
                case 22: goto L76;
                case 23: goto L50;
                case 24: goto L7a;
                case 25: goto L72;
                case 26: goto L38;
                case 27: goto L7a;
                case 28: goto L72;
                case 29: goto L8f;
                default: goto Lb;
            }
        Lb:
            switch(r4) {
                case 34: goto L7e;
                case 35: goto L28;
                case 36: goto L2c;
                case 37: goto L34;
                default: goto Le;
            }
        Le:
            switch(r4) {
                case 41: goto L66;
                case 42: goto L72;
                case 43: goto L72;
                case 44: goto L8b;
                case 45: goto L20;
                case 46: goto L30;
                case 47: goto L24;
                default: goto L11;
            }
        L11:
            switch(r4) {
                case 56: goto L2c;
                case 57: goto L82;
                case 58: goto L7e;
                case 59: goto L1b;
                case 60: goto L34;
                case 61: goto L34;
                case 62: goto La5;
                case 63: goto L3c;
                case 64: goto L34;
                case 65: goto L34;
                case 66: goto L93;
                default: goto L14;
            }
        L14:
            java.lang.String r0 = "Invalid color type: "
            java.lang.IllegalArgumentException r0 = X.AbstractC25230BEn.A0n(r0, r4)
            throw r0
        L1b:
            r1 = 2131100467(0x7f060333, float:1.7813316E38)
            goto La0
        L20:
            r1 = 2130970316(0x7f0406cc, float:1.7549339E38)
            goto L9c
        L24:
            r1 = 2131100052(0x7f060194, float:1.7812475E38)
            goto La0
        L28:
            r1 = 2131100202(0x7f06022a, float:1.7812779E38)
            goto La0
        L2c:
            r1 = 2131100479(0x7f06033f, float:1.781334E38)
            goto La0
        L30:
            r1 = 2131099690(0x7f06002a, float:1.781174E38)
            goto La0
        L34:
            r1 = 2131100475(0x7f06033b, float:1.7813332E38)
            goto La0
        L38:
            r1 = 2131100375(0x7f0602d7, float:1.781313E38)
            goto La0
        L3c:
            r1 = 2131100480(0x7f060340, float:1.7813343E38)
            goto La0
        L40:
            r1 = 2130970255(0x7f04068f, float:1.7549215E38)
            goto L9c
        L44:
            r1 = 2131100341(0x7f0602b5, float:1.781306E38)
            goto La0
        L48:
            r1 = 2131100461(0x7f06032d, float:1.7813304E38)
            goto La0
        L4c:
            r1 = 2131099990(0x7f060156, float:1.7812349E38)
            goto La0
        L50:
            r1 = 2131099949(0x7f06012d, float:1.7812266E38)
            goto La0
        L54:
            r0 = 2131100374(0x7f0602d6, float:1.7813128E38)
            int r1 = r3.getColor(r0)
            r0 = 77
            int r0 = X.AbstractC56842jH.A06(r1, r0)
            return r0
        L62:
            r1 = 2131100369(0x7f0602d1, float:1.7813118E38)
            goto La0
        L66:
            r1 = 2131100340(0x7f0602b4, float:1.7813059E38)
            goto La0
        L6a:
            r1 = 2131100360(0x7f0602c8, float:1.78131E38)
            goto La0
        L6e:
            r1 = 2131100175(0x7f06020f, float:1.7812724E38)
            goto La0
        L72:
            r1 = 2131100472(0x7f060338, float:1.7813326E38)
            goto La0
        L76:
            r1 = 2131100338(0x7f0602b2, float:1.7813055E38)
            goto La0
        L7a:
            r1 = 2131100474(0x7f06033a, float:1.781333E38)
            goto La0
        L7e:
            r1 = 2131100376(0x7f0602d8, float:1.7813132E38)
            goto La0
        L82:
            boolean r0 = X.AbstractC72723Nt.A00(r3)
            r1 = 2130970331(0x7f0406db, float:1.754937E38)
            if (r0 == 0) goto L9c
        L8b:
            r1 = 2130970167(0x7f040637, float:1.7549036E38)
            goto L9c
        L8f:
            r1 = 2131100374(0x7f0602d6, float:1.7813128E38)
            goto La0
        L93:
            boolean r0 = X.AbstractC72723Nt.A00(r3)
            if (r0 != 0) goto Lae
            r1 = 2130970324(0x7f0406d4, float:1.7549355E38)
        L9c:
            int r1 = X.AbstractC53242c7.A0H(r3, r1)
        La0:
            int r0 = r3.getColor(r1)
            return r0
        La5:
            boolean r0 = X.AbstractC72723Nt.A00(r3)
            r1 = 2131100036(0x7f060184, float:1.7812442E38)
            if (r0 != 0) goto La0
        Lae:
            r1 = 2131099780(0x7f060084, float:1.7811923E38)
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W5t.A02(android.content.Context, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final Drawable A04(Context context, int i, int i2) {
        Drawable drawable;
        Drawable drawable2;
        C14360o3.A0B(context, 2);
        switch (i) {
            case 0:
                drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_16);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 1:
                drawable = context.getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 2:
                drawable = context.getDrawable(R.drawable.instagram_lock_filled_12);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 3:
            case 33:
                drawable = context.getDrawable(R.drawable.instagram_lock_pano_filled_16);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 4:
            case 9:
            case 40:
                drawable = context.getDrawable(R.drawable.instagram_lock_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 5:
                drawable = context.getDrawable(R.drawable.instagram_payments_icons_radio);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 6:
                drawable = context.getDrawable(R.drawable.instagram_circle_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 7:
                drawable = context.getDrawable(R.drawable.instagram_circle_x_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 8:
            case 10:
            case 21:
            case 25:
            case 26:
            case 28:
            case 32:
            case 35:
            case 38:
            case Seq.NULL_REFNUM /* 41 */:
            case 54:
            default:
                throw AbstractC25230BEn.A0n("Invalid icon type: ", i);
            case 11:
                drawable = context.getDrawable(R.drawable.instagram_facebook_circle_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                drawable = context.getDrawable(R.drawable.fbpay_ic_checkmark_anim);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                drawable = context.getDrawable(R.drawable.instagram_circle_x_pano_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 14:
                drawable = context.getDrawable(R.drawable.instagram_shield_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case Process.SIGTERM /* 15 */:
                Drawable drawable3 = context.getDrawable(R.drawable.instagram_payments_pano_outline_24);
                if (drawable3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable3;
            case 16:
                Drawable drawable4 = context.getDrawable(R.drawable.instagram_shield_pano_outline_24);
                if (drawable4 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable4;
            case 17:
                Drawable drawable5 = context.getDrawable(R.drawable.instagram_report_pano_outline_24);
                if (drawable5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable5;
            case 18:
                Drawable drawable6 = context.getDrawable(R.drawable.instagram_lock_pano_outline_24);
                if (drawable6 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable6;
            case Process.SIGSTOP /* 19 */:
                Drawable drawable7 = context.getDrawable(R.drawable.instagram_questions_pano_outline_24);
                if (drawable7 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable7;
            case 20:
                drawable = context.getDrawable(R.drawable.instagram_x_pano_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 22:
                Drawable drawable8 = context.getDrawable(R.drawable.instagram_payments_icons_illo_lock_qp);
                if (drawable8 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable8;
            case 23:
                drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 24:
                drawable = context.getDrawable(R.drawable.instagram_circle_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 27:
                Drawable drawable9 = context.getDrawable(R.drawable.payment_ecp_checkmark);
                if (drawable9 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable9;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                drawable = context.getDrawable(R.drawable.instagram_sms_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 30:
                drawable = context.getDrawable(R.drawable.instagram_link_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 31:
                drawable = context.getDrawable(R.drawable.instagram_direct_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 34:
                Drawable drawable10 = context.getDrawable(R.drawable.default_entity_drawable);
                if (drawable10 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable10;
            case 36:
                Drawable drawable11 = context.getDrawable(R.drawable.layout_border_drawable);
                if (drawable11 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable11;
            case 37:
                drawable = context.getDrawable(R.drawable.instagram_payments_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 39:
                Drawable drawable12 = context.getDrawable(R.drawable.payment_mp_ecp_logo_small);
                if (drawable12 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable12;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                drawable2 = context.getDrawable(R.drawable.instagram_chevron_down_pano_outline_24);
                if (drawable2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int A02 = A02(context, i2);
                drawable2.mutate();
                drawable2.setColorFilter(A02, PorterDuff.Mode.SRC_IN);
                return drawable2;
            case 43:
                drawable = context.getDrawable(R.drawable.instagram_chevron_up_pano_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 44:
                drawable = context.getDrawable(R.drawable.instagram_clock_dotted_pano_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 45:
                drawable = context.getDrawable(R.drawable.instagram_circle_x_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                drawable2 = context.getDrawable(R.drawable.instagram_error_pano_filled_24);
                if (drawable2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int A022 = A02(context, i2);
                drawable2.mutate();
                drawable2.setColorFilter(A022, PorterDuff.Mode.SRC_IN);
                return drawable2;
            case 47:
                Drawable drawable13 = context.getDrawable(R.drawable.payment_mp_ecp_logo_med);
                if (drawable13 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable13;
            case 48:
                Drawable drawable14 = context.getDrawable(R.drawable.company_brand_meta_lockup_primary_12);
                if (drawable14 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return drawable14;
            case 49:
                Drawable drawable15 = context.getDrawable(R.drawable.instagram_chevron_left_pano_filled_24);
                if (drawable15 != null) {
                    drawable15.setTint(A02(context, i2));
                    int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_stroke);
                    int A00 = WFM.A00(context, R.attr.fbpay_inline_back_button_icon_background_padding);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(A09);
                    gradientDrawable.setShape(1);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawable15});
                    layerDrawable.setLayerInset(1, A00, A00, A00, A00);
                    return layerDrawable;
                }
                throw new IllegalStateException("Required value was null.");
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                drawable2 = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
                if (drawable2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int A0222 = A02(context, i2);
                drawable2.mutate();
                drawable2.setColorFilter(A0222, PorterDuff.Mode.SRC_IN);
                return drawable2;
            case 51:
                drawable = context.getDrawable(R.drawable.instagram_shopping_cart_pano_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 52:
                drawable = context.getDrawable(R.drawable.instagram_lock_pano_outline_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 53:
                drawable = context.getDrawable(R.drawable.instagram_info_filled_16);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
            case 55:
                drawable = context.getDrawable(R.drawable.instagram_tag_pano_filled_24);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                drawable.setTint(A02(context, i2));
                return drawable;
        }
    }

    public final Drawable A03(Context context) {
        return A04(context, 45, 41);
    }

    public static TypedArray A00(Context context, ListCell listCell) {
        return context.obtainStyledAttributes(C2FP.A0A().A01(listCell.getFbpayWidgetStyleType()), AbstractC55922hc.A0e);
    }

    public final int A01(int i) {
        switch (i) {
            case 0:
                return R.style.FBPayUIListCell;
            case 1:
                return R.style.FBPayUIListCellLeftAddOnLabel;
            case 2:
                return R.style.FBPayUIButton;
            case 3:
                return R.style.FBPayUINavigationBar;
            case 4:
                return R.style.FBPayUIPriceTable;
            case 5:
                return R.style.FBPayUIListCell_Entity;
            case 6:
                return R.style.FBPayUITerms_Pux;
            case 7:
                return R.style.FBPayUITerms_Nux;
            case 8:
                return R.style.FbPayProgressSpinner;
            case 9:
                return R.style.FbPayUIPayButtonAnimation;
            case 10:
                return R.style.FBPayUITextButtonBackground;
            case 11:
                return R.style.FbPayUICheckbox;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 21:
            default:
                return R.style.FBPayAnimationButtonContainer;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return R.style.FbpayNuxContinueButtonStyle;
            case 14:
                return R.style.FBPayUIWidget_BottomSheets;
            case Process.SIGTERM /* 15 */:
                return R.style.FbpayBannerPrimaryTextStyle;
            case 16:
                return R.style.FbPayFulfillmentOptionsListStyle;
            case 17:
                return R.style.FBPayUINavigationBarContainer_Custom;
            case 18:
                return R.style.FbpayFormSaveButtonStyle;
            case Process.SIGSTOP /* 19 */:
                return R.style.FbpayFormContainerStyle;
            case 20:
                return R.style.FbpayFormContainerElevatedStyle;
            case 22:
                return R.style.FbpayNUXFormContainerElevatedStyle;
            case 23:
                return R.style.FbpayStickyFooterNuxContinueButtonStyle;
            case 24:
                return R.style.FbPayNuxFormLayoutStyle;
            case 25:
                return R.style.FbPayAccordionStyle;
            case 26:
                return R.style.FbPayAccordionStyle_Expanded;
            case 27:
                return R.style.FbPayAccordionStyle_ContractedWithGap;
            case 28:
                return R.style.FbPayListSelectionComponent;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return R.style.FBPayUIListCellElement_TertiaryLink;
            case 30:
                return R.style.FbpayNUXFormContainerElevatedStyle_APMLink;
            case 31:
                return R.style.FbpayAutoAdvanceButton;
            case 32:
                return R.style.FbpayBannerStyle;
            case 33:
                return R.style.FbpayBannerStyle_Incentive;
            case 34:
                return R.style.FbPayIncentiveInlineSummaryIconStyle;
            case 35:
                return R.style.FbPayIncentiveInlineStyle;
        }
    }
}
