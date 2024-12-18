package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VG3 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VG3[] A03;
    public static final VG3 A04;
    public static final VG3 A05;
    public static final VG3 A06;
    public static final VG3 A07;
    public static final VG3 A08;
    public static final VG3 A09;
    public static final VG3 A0A;
    public static final VG3 A0B;
    public static final VG3 A0C;
    public static final VG3 A0D;
    public static final VG3 A0E;
    public static final VG3 A0F;
    public static final VG3 A0G;
    public static final VG3 A0H;
    public static final VG3 A0I;
    public static final VG3 A0J;
    public static final VG3 A0K;
    public static final VG3 A0L;
    public static final VG3 A0M;
    public static final VG3 A0N;
    public static final VG3 A0O;
    public static final VG3 A0P;
    public static final VG3 A0Q;
    public static final VG3 A0R;
    public static final VG3 A0S;
    public static final VG3 A0T;
    public static final VG3 A0U;
    public static final VG3 A0V;
    public static final VG3 A0W;
    public static final VG3 A0X;
    public static final VG3 A0Y;
    public static final VG3 A0Z;
    public static final VG3 A0a;
    public static final VG3 A0b;
    public static final VG3 A0c;
    public static final VG3 A0d;
    public static final VG3 A0e;
    public static final VG3 A0f;
    public static final VG3 A0g;
    public static final VG3 A0h;
    public static final VG3 A0i;
    public static final VG3 A0j;
    public static final VG3 A0k;
    public static final VG3 A0l;
    public static final VG3 A0m;
    public static final VG3 A0n;
    public static final VG3 A0o;
    public static final VG3 A0p;
    public static final VG3 A0q;
    public static final VG3 A0r;
    public static final VG3 A0s;
    public static final VG3 A0t;
    public static final VG3 A0u;
    public final int A00;

    static {
        VG3 vg3 = new VG3("ITEM_TYPE_PUX_BANNER", 0, 0);
        A0b = vg3;
        VG3 vg32 = new VG3("ITEM_TYPE_PUX_RECEIVER_HEADER", 1, 1);
        A0k = vg32;
        VG3 vg33 = new VG3("ITEM_TYPE_PUX_PAYMENT_METHOD", 2, 2);
        A0h = vg33;
        VG3 vg34 = new VG3("ITEM_TYPE_PUX_SHIPPING_ADDRESS", 3, 3);
        A0l = vg34;
        VG3 vg35 = new VG3("ITEM_TYPE_PUX_CONTACT_INFO", 4, 4);
        A0c = vg35;
        VG3 vg36 = new VG3("ITEM_TYPE_PUX_FULFILLMENT_OPTION", 5, 5);
        A0e = vg36;
        VG3 vg37 = new VG3("ITEM_TYPE_PUX_ENTITY", 6, 6);
        A0d = vg37;
        VG3 vg38 = new VG3("ITEM_TYPE_PUX_PROMO_CODE", 7, 7);
        A0j = vg38;
        VG3 vg39 = new VG3("ITEM_TYPE_PUX_PRICE_TABLE", 8, 8);
        A0i = vg39;
        VG3 vg310 = new VG3("ITEM_TYPE_PUX_TERMS_CONDITION", 9, 9);
        A0m = vg310;
        VG3 vg311 = new VG3("ITEM_TYPE_PUX_INCENTIVE", 10, 10);
        A0f = vg311;
        VG3 vg312 = new VG3("ITEM_TYPE_PUX_ORDER_SUMMARY", 11, 11);
        A0g = vg312;
        VG3 vg313 = new VG3("ITEM_TYPE_PUX_ACCORDION_PAYMENT_METHOD", 12, 12);
        A0Y = vg313;
        VG3 vg314 = new VG3("ITEM_TYPE_PUX_ACCORDION_SHIPPING_ADDRESS", 13, 13);
        A0a = vg314;
        VG3 vg315 = new VG3("ITEM_TYPE_PUX_ACCORDION_CONTACT_INFO", 14, 14);
        A0V = vg315;
        VG3 vg316 = new VG3("ITEM_TYPE_PUX_ACCORDION_FULFILLMENT_OPTION", 15, 15);
        A0W = vg316;
        VG3 vg317 = new VG3("ITEM_TYPE_PUX_ACCORDION_ORDER_SUMMARY", 16, 16);
        A0X = vg317;
        VG3 vg318 = new VG3("ITEM_TYPE_PUX_ACCORDION_PICKUP_INFO", 17, 17);
        A0Z = vg318;
        VG3 vg319 = new VG3("ITEM_TYPE_NUX_MERCHANT_HEADER", 18, 18);
        A0P = vg319;
        VG3 vg320 = new VG3("ITEM_TYPE_NUX_SHIPPING_ADDRESS", 19, 19);
        A0S = vg320;
        VG3 vg321 = new VG3("ITEM_TYPE_NUX_CONTACT_INFO", 20, 20);
        A0N = vg321;
        VG3 vg322 = new VG3("ITEM_TYPE_NUX_DISCLAIMER", 21, 21);
        A0O = vg322;
        VG3 vg323 = new VG3("ITEM_TYPE_NUX_PRICE_TABLE", 22, 22);
        A0R = vg323;
        VG3 vg324 = new VG3("ITEM_TYPE_NUX_ORDER_SUMMARY", 23, 23);
        A0Q = vg324;
        VG3 vg325 = new VG3("ITEM_TYPE_PAY_BUTTON", 24, 24);
        A0T = vg325;
        VG3 vg326 = new VG3("ITEM_TYPE_PROGRESS_ICON_BUTTON", 25, 25);
        A0U = vg326;
        VG3 vg327 = new VG3("ITEM_TYPE_AUTO_ADVANCE_BUTTON", 26, 26);
        A0C = vg327;
        VG3 vg328 = new VG3("ITEM_TYPE_SELECTION_HEADER", 27, 27);
        A0p = vg328;
        VG3 vg329 = new VG3("ITEM_TYPE_SELECTION_ACTION_BUTTON", 28, 28);
        A0n = vg329;
        VG3 vg330 = new VG3("ITEM_TYPE_SELECTION_NAME", 29, 29);
        A0q = vg330;
        VG3 vg331 = new VG3("ITEM_TYPE_SELECTION_EMAIL", 30, 30);
        A0o = vg331;
        VG3 vg332 = new VG3("ITEM_TYPE_SELECTION_PHONE", 31, 31);
        A0s = vg332;
        VG3 vg333 = new VG3("ITEM_TYPE_SELECTION_PROMO_CODE", 32, 32);
        A0t = vg333;
        VG3 vg334 = new VG3("ITEM_TYPE_SELECTION_TEXT", 33, 33);
        A0u = vg334;
        VG3 vg335 = new VG3("ITEM_TYPE_ACCORDION_SELECTION_SHIPPING_ADDRESS", 34, 34);
        A08 = vg335;
        VG3 vg336 = new VG3("ITEM_TYPE_ACCORDION_SELECTION_FULFILLMENT_OPTION", 35, 35);
        A06 = vg336;
        VG3 vg337 = new VG3("ITEM_TYPE_ACCORDION_SELECTION_PAYMENT_METHOD", 36, 36);
        A07 = vg337;
        VG3 vg338 = new VG3("ITEM_TYPE_CONFIRMATION_PAYMENT_SECTION", 37, 37);
        A0E = vg338;
        VG3 vg339 = new VG3("ITEM_TYPE_CONFIRMATION_PRODUCT_UPSELL_SECTION_HEADER", 38, 38);
        A0F = vg339;
        VG3 vg340 = new VG3("ITEM_TYPE_CONFIRMATION_PRODUCT_UPSELL_VIEW", 39, 39);
        A0G = vg340;
        VG3 vg341 = new VG3("ITEM_TYPE_ANON_CHECKOUT_PUX_LINK", 40, 40);
        A09 = vg341;
        VG3 vg342 = new VG3("ITEM_TYPE_ANON_CHECKOUT_TOGGLE", 41, 41);
        A0A = vg342;
        VG3 vg343 = new VG3("ITEM_TYPE_SELECTION_OFFER", 42, 42);
        A0r = vg343;
        VG3 vg344 = new VG3("ITEM_TYPE_INLINE_ACTION_MENU", 43, 43);
        A0K = vg344;
        VG3 vg345 = new VG3("ITEM_TYPE_ACCORDION_INLINE_FORM", 44, 44);
        A05 = vg345;
        VG3 vg346 = new VG3("ITEM_TYPE_INLINE_BACK_BUTTON", 45, 45);
        A0L = vg346;
        VG3 vg347 = new VG3("ITEM_TYPE_APM", 46, 46);
        A0B = vg347;
        VG3 vg348 = new VG3("ITEM_TYPE_EMAIL_OPT_IN", 47, 47);
        A0H = vg348;
        VG3 vg349 = new VG3("ITEM_TYPE_INVISIBLE_HEADER", 48, 48);
        A0M = vg349;
        VG3 vg350 = new VG3("ITEM_TYPE_INCENTIVE_SUMMARY", 49, 49);
        A0J = vg350;
        VG3 vg351 = new VG3("ITEM_TYPE_ACCORDION_INCENTIVE", 50, 50);
        A04 = vg351;
        VG3 vg352 = new VG3("ITEM_TYPE_INCENTIVE_EMBEDDED", 51, 51);
        A0I = vg352;
        VG3 vg353 = new VG3("ITEM_TYPE_CHECKOUT_OPTIONALITY", 52, 52);
        A0D = vg353;
        VG3[] vg3Arr = new VG3[53];
        System.arraycopy(new VG3[]{vg3, vg32, vg33, vg34, vg35, vg36, vg37, vg38, vg39, vg310, vg311, vg312, vg313, vg314, vg315, vg316, vg317, vg318, vg319, vg320, vg321, vg322, vg323, vg324, vg325, vg326, vg327}, 0, vg3Arr, 0, 27);
        System.arraycopy(new VG3[]{vg328, vg329, vg330, vg331, vg332, vg333, vg334, vg335, vg336, vg337, vg338, vg339, vg340, vg341, vg342, vg343, vg344, vg345, vg346, vg347, vg348, vg349, vg350, vg351, vg352, vg353}, 0, vg3Arr, 27, 26);
        A03 = vg3Arr;
        A02 = AbstractC12190kN.A00(vg3Arr);
        VG3[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (VG3 vg354 : values) {
            AbstractC25227BEk.A1O(vg354, linkedHashMap, vg354.A00);
        }
        A01 = linkedHashMap;
    }

    public static VG3 valueOf(String str) {
        return (VG3) Enum.valueOf(VG3.class, str);
    }

    public static VG3[] values() {
        return (VG3[]) A03.clone();
    }

    public VG3(String str, int i, int i2) {
        this.A00 = i2;
    }

    public final String A00() {
        switch (ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "PAYMENT_METHOD";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS;
            case 14:
                return "CONTACT_INFORMATION";
            case Process.SIGTERM /* 15 */:
                return "FULFILLMENT_OPTIONS";
            case 16:
                return "ORDER_SUMMARY";
            case 17:
                return "PICKUP_CONTACT_INFO";
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return "INCENTIVES";
            default:
                throw AbstractC37303Gc4.A0M(this, "ItemType is not found for identifier => ", new StringBuilder());
        }
    }
}
