package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61140Rfu {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61140Rfu[] A01;
    public static final EnumC61140Rfu A02;
    public static final EnumC61140Rfu A03;
    public static final EnumC61140Rfu A04;
    public static final EnumC61140Rfu A05;
    public static final EnumC61140Rfu A06;
    public static final EnumC61140Rfu A07;
    public static final EnumC61140Rfu A08;
    public static final EnumC61140Rfu A09;
    public static final EnumC61140Rfu A0A;

    static {
        EnumC61140Rfu enumC61140Rfu = new EnumC61140Rfu("LOG_IN", 0);
        A03 = enumC61140Rfu;
        EnumC61140Rfu enumC61140Rfu2 = new EnumC61140Rfu("SIGN_UP", 1);
        A09 = enumC61140Rfu2;
        EnumC61140Rfu enumC61140Rfu3 = new EnumC61140Rfu("NUX_ADD_PROFILE_PICTURE_SCREEN", 2);
        A04 = enumC61140Rfu3;
        EnumC61140Rfu enumC61140Rfu4 = new EnumC61140Rfu("NUX_DISCOVER_PEOPLE_SCREEN", 3);
        A05 = enumC61140Rfu4;
        EnumC61140Rfu enumC61140Rfu5 = new EnumC61140Rfu("NUX_FIND_FRIENDS", 4);
        A06 = enumC61140Rfu5;
        EnumC61140Rfu enumC61140Rfu6 = new EnumC61140Rfu("NUX_FIND_FRIENDS_DIALOG", 5);
        A07 = enumC61140Rfu6;
        EnumC61140Rfu enumC61140Rfu7 = new EnumC61140Rfu("PROMOTE_PRO2PRO", 6);
        A08 = enumC61140Rfu7;
        EnumC61140Rfu enumC61140Rfu8 = new EnumC61140Rfu("ACCOUNT_RECOVERY", 7);
        A02 = enumC61140Rfu8;
        EnumC61140Rfu enumC61140Rfu9 = new EnumC61140Rfu("UNKNOWN", 8);
        A0A = enumC61140Rfu9;
        EnumC61140Rfu[] enumC61140RfuArr = {enumC61140Rfu, enumC61140Rfu2, enumC61140Rfu3, enumC61140Rfu4, enumC61140Rfu5, enumC61140Rfu6, enumC61140Rfu7, enumC61140Rfu8, enumC61140Rfu9};
        A01 = enumC61140RfuArr;
        A00 = AbstractC12190kN.A00(enumC61140RfuArr);
    }

    public static EnumC61140Rfu valueOf(String str) {
        return (EnumC61140Rfu) Enum.valueOf(EnumC61140Rfu.class, str);
    }

    public static EnumC61140Rfu[] values() {
        return (EnumC61140Rfu[]) A01.clone();
    }

    public EnumC61140Rfu(String str, int i) {
    }
}
