package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC141996bI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC141996bI[] A01;
    public static final EnumC141996bI A02;
    public static final EnumC141996bI A03;
    public static final EnumC141996bI A04;
    public static final EnumC141996bI A05;
    public static final EnumC141996bI A06;

    static {
        EnumC141996bI enumC141996bI = new EnumC141996bI("DEFAULT", 0);
        A04 = enumC141996bI;
        EnumC141996bI enumC141996bI2 = new EnumC141996bI("ERROR", 1);
        A05 = enumC141996bI2;
        EnumC141996bI enumC141996bI3 = new EnumC141996bI("SUCCESS", 2);
        A06 = enumC141996bI3;
        EnumC141996bI enumC141996bI4 = new EnumC141996bI("BANNER", 3);
        A02 = enumC141996bI4;
        EnumC141996bI enumC141996bI5 = new EnumC141996bI("BANNER_IMMERSIVE", 4);
        A03 = enumC141996bI5;
        EnumC141996bI[] enumC141996bIArr = {enumC141996bI, enumC141996bI2, enumC141996bI3, enumC141996bI4, enumC141996bI5};
        A01 = enumC141996bIArr;
        A00 = AbstractC12190kN.A00(enumC141996bIArr);
    }

    public static EnumC141996bI valueOf(String str) {
        return (EnumC141996bI) Enum.valueOf(EnumC141996bI.class, str);
    }

    public static EnumC141996bI[] values() {
        return (EnumC141996bI[]) A01.clone();
    }

    public EnumC141996bI(String str, int i) {
    }
}
