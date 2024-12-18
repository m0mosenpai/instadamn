package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6s5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC151596s5 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC151596s5[] A02;
    public static final EnumC151596s5 A03;
    public static final EnumC151596s5 A04;
    public static final EnumC151596s5 A05;
    public static final EnumC151596s5 A06;
    public static final EnumC151596s5 A07;
    public static final EnumC151596s5 A08;
    public static final EnumC151596s5 A09;
    public static final EnumC151596s5 A0A;
    public static final EnumC151596s5 A0B;
    public static final EnumC151596s5 A0C;
    public static final EnumC151596s5 A0D;
    public final int A00;

    static {
        EnumC151596s5 enumC151596s5 = new EnumC151596s5("CONVERSION_FLOW", 0, 0);
        A04 = enumC151596s5;
        EnumC151596s5 enumC151596s52 = new EnumC151596s5("CREATOR_CONVERSION_FLOW", 1, 2);
        A05 = enumC151596s52;
        EnumC151596s5 enumC151596s53 = new EnumC151596s5("INTEREST_ACCOUNT_CONVERSION", 2, 3);
        A08 = enumC151596s53;
        EnumC151596s5 enumC151596s54 = new EnumC151596s5("SHOPPING_IN_APP_SIGNUP_FLOW", 3, 5);
        A0C = enumC151596s54;
        EnumC151596s5 enumC151596s55 = new EnumC151596s5("EDIT_PROFILE", 4, 6);
        A07 = enumC151596s55;
        EnumC151596s5 enumC151596s56 = new EnumC151596s5("PROFESSIONAL_SIGNUP_FLOW", 5, 7);
        A09 = enumC151596s56;
        EnumC151596s5 enumC151596s57 = new EnumC151596s5("BUSINESS_SIGNUP_FLOW", 6, 8);
        A03 = enumC151596s57;
        EnumC151596s5 enumC151596s58 = new EnumC151596s5("CREATOR_SIGNUP_FLOW", 7, 9);
        A06 = enumC151596s58;
        EnumC151596s5 enumC151596s59 = new EnumC151596s5("SERVICE_ONBOARDING_FLOW", 8, 10);
        A0B = enumC151596s59;
        EnumC151596s5 enumC151596s510 = new EnumC151596s5("RENEW_PROFESSIONAL_ACCOUNT", 9, 13);
        A0A = enumC151596s510;
        EnumC151596s5 enumC151596s511 = new EnumC151596s5("SHORTENED_CREATOR_CONVERSION_FLOW", 10, 14);
        A0D = enumC151596s511;
        EnumC151596s5[] enumC151596s5Arr = {enumC151596s5, enumC151596s52, enumC151596s53, enumC151596s54, enumC151596s55, enumC151596s56, enumC151596s57, enumC151596s58, enumC151596s59, enumC151596s510, enumC151596s511};
        A02 = enumC151596s5Arr;
        A01 = AbstractC12190kN.A00(enumC151596s5Arr);
    }

    public static EnumC151596s5 valueOf(String str) {
        return (EnumC151596s5) Enum.valueOf(EnumC151596s5.class, str);
    }

    public static EnumC151596s5[] values() {
        return (EnumC151596s5[]) A02.clone();
    }

    public EnumC151596s5(String str, int i, int i2) {
        this.A00 = i2;
    }
}
