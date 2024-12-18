package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53217NgF {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53217NgF[] A02;
    public static final EnumC53217NgF A03;
    public static final EnumC53217NgF A04;
    public static final EnumC53217NgF A05;
    public static final EnumC53217NgF A06;
    public final int A00;

    static {
        EnumC53217NgF enumC53217NgF = new EnumC53217NgF("TOP", 0, 0);
        A06 = enumC53217NgF;
        EnumC53217NgF enumC53217NgF2 = new EnumC53217NgF("NEED_SOON", 1, 1);
        A05 = enumC53217NgF2;
        EnumC53217NgF enumC53217NgF3 = new EnumC53217NgF("LOW", 2, 2);
        A04 = enumC53217NgF3;
        EnumC53217NgF enumC53217NgF4 = new EnumC53217NgF("EVICT", 3, 3);
        A03 = enumC53217NgF4;
        EnumC53217NgF[] enumC53217NgFArr = {enumC53217NgF, enumC53217NgF2, enumC53217NgF3, enumC53217NgF4};
        A02 = enumC53217NgFArr;
        A01 = AbstractC12190kN.A00(enumC53217NgFArr);
    }

    public static EnumC53217NgF valueOf(String str) {
        return (EnumC53217NgF) Enum.valueOf(EnumC53217NgF.class, str);
    }

    public static EnumC53217NgF[] values() {
        return (EnumC53217NgF[]) A02.clone();
    }

    public EnumC53217NgF(String str, int i, int i2) {
        this.A00 = i2;
    }
}
