package X;

import com.instagram.realtimeclient.RealtimeConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2lY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC58162lY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC58162lY[] A02;
    public static final EnumC58162lY A03;
    public static final EnumC58162lY A04;
    public static final EnumC58162lY A05;
    public static final EnumC58162lY A06;
    public static final EnumC58162lY A07;
    public static final EnumC58162lY A08;
    public static final EnumC58162lY A09;
    public static final EnumC58162lY A0A;
    public static final EnumC58162lY A0B;
    public static final EnumC58162lY A0C;
    public static final EnumC58162lY A0D;
    public static final EnumC58162lY A0E;
    public static final EnumC58162lY A0F;
    public final String A00;

    static {
        EnumC58162lY enumC58162lY = new EnumC58162lY("BOTTOM_NAVIGATION_BAR", 0, "bottom_navigation_bar");
        A06 = enumC58162lY;
        EnumC58162lY enumC58162lY2 = new EnumC58162lY("TOP_NAVIGATION_BAR", 1, "top_navigation_bar");
        A0F = enumC58162lY2;
        EnumC58162lY enumC58162lY3 = new EnumC58162lY("PROFILE_PAGE", 2, "profile_page");
        A0E = enumC58162lY3;
        EnumC58162lY enumC58162lY4 = new EnumC58162lY("PROFILE_MENU", 3, "profile_menu");
        A0D = enumC58162lY4;
        EnumC58162lY enumC58162lY5 = new EnumC58162lY("ACCOUNT_SWITCHER", 4, "account_switcher");
        A03 = enumC58162lY5;
        EnumC58162lY enumC58162lY6 = new EnumC58162lY("ACTIVITY_FEED", 5, "activity_feed");
        A04 = enumC58162lY6;
        EnumC58162lY enumC58162lY7 = new EnumC58162lY("DIRECT", 6, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A0A = enumC58162lY7;
        EnumC58162lY enumC58162lY8 = new EnumC58162lY("BOTTOM_SHEET_VERTICAL", 7, "bottom_sheet_vertical");
        A09 = enumC58162lY8;
        EnumC58162lY enumC58162lY9 = new EnumC58162lY("BOTTOM_SHEET_HORIZONTAL", 8, "bottom_sheet_horizontal");
        A08 = enumC58162lY9;
        EnumC58162lY enumC58162lY10 = new EnumC58162lY("BOTTOM_SHEET", 9, "bottom_sheet");
        A07 = enumC58162lY10;
        EnumC58162lY enumC58162lY11 = new EnumC58162lY("PINNED_ROWS", 10, "pinned_rows");
        A0C = enumC58162lY11;
        EnumC58162lY enumC58162lY12 = new EnumC58162lY("APP_ICON", 11, "app_icon");
        A05 = enumC58162lY12;
        EnumC58162lY enumC58162lY13 = new EnumC58162lY("INVALID", 12, "invalid");
        A0B = enumC58162lY13;
        EnumC58162lY[] enumC58162lYArr = {enumC58162lY, enumC58162lY2, enumC58162lY3, enumC58162lY4, enumC58162lY5, enumC58162lY6, enumC58162lY7, enumC58162lY8, enumC58162lY9, enumC58162lY10, enumC58162lY11, enumC58162lY12, enumC58162lY13};
        A02 = enumC58162lYArr;
        A01 = AbstractC12190kN.A00(enumC58162lYArr);
    }

    public static EnumC58162lY valueOf(String str) {
        return (EnumC58162lY) Enum.valueOf(EnumC58162lY.class, str);
    }

    public static EnumC58162lY[] values() {
        return (EnumC58162lY[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC58162lY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
