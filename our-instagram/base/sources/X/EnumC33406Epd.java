package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33406Epd {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33406Epd[] A03;
    public static final EnumC33406Epd A04;
    public static final EnumC33406Epd A05;
    public static final EnumC33406Epd A06;
    public static final EnumC33406Epd A07;
    public static final EnumC33406Epd A08;
    public static final EnumC33406Epd A09;
    public static final EnumC33406Epd A0A;
    public static final EnumC33406Epd A0B;
    public static final EnumC33406Epd A0C;
    public static final EnumC33406Epd A0D;
    public final String A00;

    static {
        EnumC33406Epd enumC33406Epd = new EnumC33406Epd("STORE_FRONT_PRODUCT_GRID", 0, "store_front_product_grid");
        A0D = enumC33406Epd;
        EnumC33406Epd enumC33406Epd2 = new EnumC33406Epd("STORE_FRONT_MENU_MANAGE_PRODUCTS", 1, "store_front_menu_manage_products");
        A0A = enumC33406Epd2;
        EnumC33406Epd enumC33406Epd3 = new EnumC33406Epd("STORE_FRONT_NULL_STATE_ADD_PRODUCTS", 2, "store_front_null_state_add_products");
        A0B = enumC33406Epd3;
        EnumC33406Epd enumC33406Epd4 = new EnumC33406Epd("STORE_FRONT_NULL_STATE_MANAGE_PRODUCTS", 3, "store_front_null_state_manage_products");
        A0C = enumC33406Epd4;
        EnumC33406Epd enumC33406Epd5 = new EnumC33406Epd("SELLER_JOURNEY_EMAIL_NOTIFICATION", 4, "seller_journey_email_notification");
        A08 = enumC33406Epd5;
        EnumC33406Epd enumC33406Epd6 = new EnumC33406Epd("SELLER_JOURNEY_PUSH_NOTIFICATION", 5, "seller_journey_push_notification");
        A09 = enumC33406Epd6;
        EnumC33406Epd enumC33406Epd7 = new EnumC33406Epd("SELLER_JOURNEY_ACTIVITY_FEED_NOTIFICATION", 6, "seller_journey_activity_feed_notification");
        A07 = enumC33406Epd7;
        EnumC33406Epd enumC33406Epd8 = new EnumC33406Epd("ONBOARDING_FLOW", 7, "onboarding_flow");
        A04 = enumC33406Epd8;
        EnumC33406Epd enumC33406Epd9 = new EnumC33406Epd("POST_ONBOARDING_NUX", 8, "post_onboarding_nux");
        A05 = enumC33406Epd9;
        EnumC33406Epd enumC33406Epd10 = new EnumC33406Epd("PRODUCT_DETAILS_PAGE", 9, "product_details_page");
        A06 = enumC33406Epd10;
        EnumC33406Epd[] enumC33406EpdArr = {enumC33406Epd, enumC33406Epd2, enumC33406Epd3, enumC33406Epd4, enumC33406Epd5, enumC33406Epd6, enumC33406Epd7, enumC33406Epd8, enumC33406Epd9, enumC33406Epd10};
        A03 = enumC33406EpdArr;
        A02 = AbstractC12190kN.A00(enumC33406EpdArr);
        EnumC33406Epd[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33406Epd enumC33406Epd11 : values) {
            A18.put(enumC33406Epd11.A00, enumC33406Epd11);
        }
        A01 = A18;
    }

    public static EnumC33406Epd valueOf(String str) {
        return (EnumC33406Epd) Enum.valueOf(EnumC33406Epd.class, str);
    }

    public static EnumC33406Epd[] values() {
        return (EnumC33406Epd[]) A03.clone();
    }

    public EnumC33406Epd(String str, int i, String str2) {
        this.A00 = str2;
    }
}
