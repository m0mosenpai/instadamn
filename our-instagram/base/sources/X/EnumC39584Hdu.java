package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39584Hdu {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39584Hdu[] A02;
    public static final EnumC39584Hdu A03;
    public static final EnumC39584Hdu A04;
    public static final EnumC39584Hdu A05;
    public static final EnumC39584Hdu A06;
    public static final EnumC39584Hdu A07;
    public static final EnumC39584Hdu A08;
    public static final EnumC39584Hdu A09;
    public static final EnumC39584Hdu A0A;
    public static final EnumC39584Hdu A0B;
    public static final EnumC39584Hdu A0C;
    public final String A00;

    static {
        EnumC39584Hdu enumC39584Hdu = new EnumC39584Hdu("AFFILIATE_DISCOVERY", 0, "affiliate_discovery");
        A03 = enumC39584Hdu;
        EnumC39584Hdu enumC39584Hdu2 = new EnumC39584Hdu("CLIPS_COMPOSER", 1, "clips_composer");
        A04 = enumC39584Hdu2;
        EnumC39584Hdu enumC39584Hdu3 = new EnumC39584Hdu("FEATURED_PRODUCT_MEDIA", 2, "featured_product_media");
        A05 = enumC39584Hdu3;
        EnumC39584Hdu enumC39584Hdu4 = new EnumC39584Hdu("FEED_SHARING", 3, "feed_sharing");
        A06 = enumC39584Hdu4;
        EnumC39584Hdu enumC39584Hdu5 = new EnumC39584Hdu("IGTV_COMPOSER", 4, "igtv_composer");
        A07 = enumC39584Hdu5;
        EnumC39584Hdu enumC39584Hdu6 = new EnumC39584Hdu("LIVE_BROADCAST_COMPOSER", 5, "live_broadcast_composer");
        A08 = enumC39584Hdu6;
        EnumC39584Hdu enumC39584Hdu7 = new EnumC39584Hdu("MULTI_PRODUCT_STORY_STICKER", 6, "multi_product_story_sticker");
        A09 = enumC39584Hdu7;
        EnumC39584Hdu enumC39584Hdu8 = new EnumC39584Hdu("SHOPPING_MANAGER", 7, "shopping_manager");
        A0A = enumC39584Hdu8;
        EnumC39584Hdu enumC39584Hdu9 = new EnumC39584Hdu("SHOPPING_PERMISSIONS", 8, "shopping_permissions");
        A0B = enumC39584Hdu9;
        EnumC39584Hdu enumC39584Hdu10 = new EnumC39584Hdu("STORY_STICKER", 9, "story_sticker");
        A0C = enumC39584Hdu10;
        EnumC39584Hdu[] enumC39584HduArr = {enumC39584Hdu, enumC39584Hdu2, enumC39584Hdu3, enumC39584Hdu4, enumC39584Hdu5, enumC39584Hdu6, enumC39584Hdu7, enumC39584Hdu8, enumC39584Hdu9, enumC39584Hdu10};
        A02 = enumC39584HduArr;
        A01 = AbstractC12190kN.A00(enumC39584HduArr);
    }

    public static EnumC39584Hdu valueOf(String str) {
        return (EnumC39584Hdu) Enum.valueOf(EnumC39584Hdu.class, str);
    }

    public static EnumC39584Hdu[] values() {
        return (EnumC39584Hdu[]) A02.clone();
    }

    public EnumC39584Hdu(String str, int i, String str2) {
        this.A00 = str2;
    }
}
