package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39543HdF {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39543HdF[] A01;
    public static final EnumC39543HdF A02;
    public static final EnumC39543HdF A03;
    public static final EnumC39543HdF A04;
    public static final EnumC39543HdF A05;

    static {
        EnumC39543HdF enumC39543HdF = new EnumC39543HdF("ACCOUNT", 0);
        A02 = enumC39543HdF;
        EnumC39543HdF enumC39543HdF2 = new EnumC39543HdF("PLACE", 1);
        A03 = enumC39543HdF2;
        EnumC39543HdF enumC39543HdF3 = new EnumC39543HdF("PRODUCT", 2);
        A04 = enumC39543HdF3;
        EnumC39543HdF enumC39543HdF4 = new EnumC39543HdF("UNKNOWN", 3);
        A05 = enumC39543HdF4;
        EnumC39543HdF[] enumC39543HdFArr = {enumC39543HdF, enumC39543HdF2, enumC39543HdF3, enumC39543HdF4};
        A01 = enumC39543HdFArr;
        A00 = AbstractC12190kN.A00(enumC39543HdFArr);
    }

    public static EnumC39543HdF valueOf(String str) {
        return (EnumC39543HdF) Enum.valueOf(EnumC39543HdF.class, str);
    }

    public static EnumC39543HdF[] values() {
        return (EnumC39543HdF[]) A01.clone();
    }

    public EnumC39543HdF(String str, int i) {
    }
}
