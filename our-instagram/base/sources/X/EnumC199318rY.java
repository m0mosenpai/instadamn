package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8rY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC199318rY {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC199318rY[] A03;
    public static final EnumC199318rY A04;
    public static final EnumC199318rY A05;
    public static final EnumC199318rY A06;
    public static final EnumC199318rY A07;
    public static final EnumC199318rY A08;
    public static final EnumC199318rY A09;
    public static final EnumC199318rY A0A;
    public static final EnumC199318rY A0B;
    public static final EnumC199318rY A0C;
    public static final EnumC199318rY A0D;
    public static final EnumC199318rY A0E;
    public static final EnumC199318rY A0F;
    public static final EnumC199318rY A0G;
    public static final EnumC199318rY A0H;
    public static final EnumC199318rY A0I;
    public final String A00;

    static {
        EnumC199318rY enumC199318rY = new EnumC199318rY("POST_PRODUCT_TAG", 0, "post_product_tag");
        A08 = enumC199318rY;
        EnumC199318rY enumC199318rY2 = new EnumC199318rY("POST_PRODUCT_COLLECTION_TAG", 1, "post_product_collection_tag");
        A07 = enumC199318rY2;
        EnumC199318rY enumC199318rY3 = new EnumC199318rY("POST_DISCOUNT_TAG", 2, "post_discount_tag");
        A05 = enumC199318rY3;
        EnumC199318rY enumC199318rY4 = new EnumC199318rY("STORY_PRODUCT_STICKER", 3, "story_product_sticker");
        A0F = enumC199318rY4;
        EnumC199318rY enumC199318rY5 = new EnumC199318rY("STORY_MULTI_PRODUCT_STICKER", 4, "story_multi_product_sticker");
        A0B = enumC199318rY5;
        EnumC199318rY enumC199318rY6 = new EnumC199318rY("STORY_PRODUCT_COLLECTION_STICKER", 5, "story_seller_collection_sticker");
        A0E = enumC199318rY6;
        EnumC199318rY enumC199318rY7 = new EnumC199318rY("STORY_STOREFRONT_STICKER", 6, "story_storefront_sticker");
        A0I = enumC199318rY7;
        EnumC199318rY enumC199318rY8 = new EnumC199318rY("STORY_PRODUCT_SWIPEUP", 7, "story_product_swipeup");
        A0G = enumC199318rY8;
        EnumC199318rY enumC199318rY9 = new EnumC199318rY("STORY_MULTI_PRODUCT_SWIPEUP", 8, "story_multi_product_swipeup");
        A0C = enumC199318rY9;
        EnumC199318rY enumC199318rY10 = new EnumC199318rY("STORY_SHOP_SWIPEUP", 9, "story_shop_swipeup");
        A0H = enumC199318rY10;
        EnumC199318rY enumC199318rY11 = new EnumC199318rY("STORY_COLLECTION_SWIPEUP", 10, "story_collection_swipeup");
        A09 = enumC199318rY11;
        EnumC199318rY enumC199318rY12 = new EnumC199318rY("STORY_INCENTIVE_SWIPEUP", 11, "story_incentive_swipeup");
        A0A = enumC199318rY12;
        EnumC199318rY enumC199318rY13 = new EnumC199318rY("STORY_ORGANIC_PRODUCT_TAGGING_STICKER", 12, "story_opt_sticker");
        A0D = enumC199318rY13;
        EnumC199318rY enumC199318rY14 = new EnumC199318rY("POST_OPT_TAG", 13, "post_opt_tag");
        A06 = enumC199318rY14;
        EnumC199318rY enumC199318rY15 = new EnumC199318rY("CLIPS_OPT_TAG", 14, "clips_opt_tag");
        A04 = enumC199318rY15;
        EnumC199318rY[] enumC199318rYArr = {enumC199318rY, enumC199318rY2, enumC199318rY3, enumC199318rY4, enumC199318rY5, enumC199318rY6, enumC199318rY7, enumC199318rY8, enumC199318rY9, enumC199318rY10, enumC199318rY11, enumC199318rY12, enumC199318rY13, enumC199318rY14, enumC199318rY15};
        A03 = enumC199318rYArr;
        A02 = AbstractC12190kN.A00(enumC199318rYArr);
        EnumC199318rY[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC199318rY enumC199318rY16 : values) {
            linkedHashMap.put(enumC199318rY16.A00, enumC199318rY16);
        }
        A01 = linkedHashMap;
    }

    public static EnumC199318rY valueOf(String str) {
        return (EnumC199318rY) Enum.valueOf(EnumC199318rY.class, str);
    }

    public static EnumC199318rY[] values() {
        return (EnumC199318rY[]) A03.clone();
    }

    public EnumC199318rY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
