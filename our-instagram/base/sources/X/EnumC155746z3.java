package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6z3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC155746z3 {
    public static final Map A01;
    public static final EnumC155746z3[] A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC155746z3[] A04;
    public static final EnumC155746z3 A05;
    public static final EnumC155746z3 A06;
    public static final EnumC155746z3 A07;
    public static final EnumC155746z3 A08;
    public static final EnumC155746z3 A09;
    public static final EnumC155746z3 A0A;
    public static final EnumC155746z3 A0B;
    public static final EnumC155746z3 A0C;
    public static final EnumC155746z3 A0D;
    public static final EnumC155746z3 A0E;
    public static final EnumC155746z3 A0F;
    public static final EnumC155746z3 A0G;
    public static final EnumC155746z3 A0H;
    public static final EnumC155746z3 A0I;
    public static final EnumC155746z3 A0J;
    public static final EnumC155746z3 A0K;
    public static final EnumC155746z3 A0L;
    public static final EnumC155746z3 A0M;
    public final int A00;

    public static EnumC155746z3 valueOf(String str) {
        return (EnumC155746z3) Enum.valueOf(EnumC155746z3.class, str);
    }

    public static EnumC155746z3[] values() {
        return (EnumC155746z3[]) A04.clone();
    }

    static {
        EnumC155746z3 enumC155746z3 = new EnumC155746z3("ITEM_TYPE_HEADER_REQUEST_BANNER", 0, 0);
        A0B = enumC155746z3;
        EnumC155746z3 enumC155746z32 = new EnumC155746z3("ITEM_TYPE_USER_INFO", 1, 1);
        A0J = enumC155746z32;
        EnumC155746z3 enumC155746z33 = new EnumC155746z3("ITEM_TYPE_USER_INFO_WITH_COBROADCAST", 2, 2);
        A0L = enumC155746z33;
        EnumC155746z3 enumC155746z34 = new EnumC155746z3("ITEM_TYPE_ACTION_BUTTONS", 3, 3);
        A05 = enumC155746z34;
        EnumC155746z3 enumC155746z35 = new EnumC155746z3("ITEM_TYPE_SHOP_ROW", 4, 4);
        A0H = enumC155746z35;
        EnumC155746z3 enumC155746z36 = new EnumC155746z3("ITEM_TYPE_REEL_TRAY", 5, 5);
        A0G = enumC155746z36;
        EnumC155746z3 enumC155746z37 = new EnumC155746z3("ITEM_TYPE_EMPTY_PROFILE_NOTICE", 6, 7);
        A08 = enumC155746z37;
        EnumC155746z3 enumC155746z38 = new EnumC155746z3("ITEM_TYPE_STANDALONE_USER_CHAINING", 7, 8);
        A0I = enumC155746z38;
        EnumC155746z3 enumC155746z39 = new EnumC155746z3("ITEM_TYPE_DIVIDER", 8, 9);
        A07 = enumC155746z39;
        EnumC155746z3 enumC155746z310 = new EnumC155746z3("ITEM_TYPE_USER_INFO_NOT_FOUND", 9, 10);
        A0K = enumC155746z310;
        EnumC155746z3 enumC155746z311 = new EnumC155746z3("ITEM_TYPE_BUSINESS_ONBOARDING_CHECKLIST", 10, 11);
        A06 = enumC155746z311;
        EnumC155746z3 enumC155746z312 = new EnumC155746z3("ITEM_TYPE_USER_PAY_FANCLUB_UPSELL", 11, 12);
        A0M = enumC155746z312;
        EnumC155746z3 enumC155746z313 = new EnumC155746z3("ITEM_TYPE_PRODASH_HYPERCARD", 12, 13);
        A0C = enumC155746z313;
        EnumC155746z3 enumC155746z314 = new EnumC155746z3("ITEM_TYPE_FAN_CLUB_GUIDED_ACTIVATION_BANNER", 13, 14);
        A09 = enumC155746z314;
        EnumC155746z3 enumC155746z315 = new EnumC155746z3("ITEM_TYPE_RECS_FROM_FRIENDS_BANNER", 14, 15);
        A0F = enumC155746z315;
        EnumC155746z3 enumC155746z316 = new EnumC155746z3("ITEM_TYPE_PUBLIC_HIGHLIGHTS_EMPTY_PROFILE_NOTICE", 15, 16);
        A0E = enumC155746z316;
        EnumC155746z3 enumC155746z317 = new EnumC155746z3("ITEM_TYPE_PROFILE_EMPTY_NOTICE_WITH_USER_ACTION", 16, 17);
        A0D = enumC155746z317;
        EnumC155746z3 enumC155746z318 = new EnumC155746z3("ITEM_TYPE_HEADER_LIMITS_OFF_BANNER", 17, 18);
        A0A = enumC155746z318;
        EnumC155746z3[] enumC155746z3Arr = {enumC155746z3, enumC155746z32, enumC155746z33, enumC155746z34, enumC155746z35, enumC155746z36, enumC155746z37, enumC155746z38, enumC155746z39, enumC155746z310, enumC155746z311, enumC155746z312, enumC155746z313, enumC155746z314, enumC155746z315, enumC155746z316, enumC155746z317, enumC155746z318};
        A04 = enumC155746z3Arr;
        A03 = AbstractC12190kN.A00(enumC155746z3Arr);
        EnumC155746z3[] values = values();
        A02 = values;
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (EnumC155746z3 enumC155746z319 : values) {
            linkedHashMap.put(Integer.valueOf(enumC155746z319.A00), enumC155746z319);
        }
        A01 = linkedHashMap;
    }

    public EnumC155746z3(String str, int i, int i2) {
        this.A00 = i2;
    }
}
