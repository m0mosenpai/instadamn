package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes7.dex */
public abstract class I88 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ACCOUNT";
            case 2:
                return "ATTRIBUTES";
            case 3:
                return "BLOKS";
            case 4:
                return "CHECKOUT_CTA";
            case 5:
                return "DETAILS";
            case 6:
                return "EXTERNAL_LINK";
            case 7:
                return "GENERIC_CTA";
            case 8:
                return "HERO_CAROUSEL";
            case 9:
                return "IG_FUNDED_INCENTIVE";
            case 10:
                return "LAUNCH_COUNTDOWN_CTA";
            case 11:
                return "LINK";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "LOADING";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "MEDIA";
            case 14:
                return "MESSAGE_MERCHANT";
            case Process.SIGTERM /* 15 */:
                return "PRODUCTS";
            case 16:
                return "PRODUCT_DESCRIPTION";
            case 17:
                return "PRODUCT_FEED";
            case 18:
                return "SANDBOXED_SHOP_BANNER";
            case Process.SIGSTOP /* 19 */:
                return "SAVE_CTA";
            case 20:
                return "SELLER_BADGE";
            case 21:
                return "SHIPPING_RETURNS";
            case 22:
                return "SHOP";
            case 23:
                return "TEXT";
            case 24:
                return "TRY_IN_AR";
            case 25:
                return "VARIANT_SELECTOR";
            case 26:
                return "VIEW_INSIGHTS";
            case 27:
                return "RESTOCK_REMINDER";
            case 28:
                return "FEATURED_PRODUCT_PERMISSION";
            default:
                return "ABOUT_THIS_SHOP";
        }
    }
}
