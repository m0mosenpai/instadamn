package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ng7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53209Ng7 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53209Ng7[] A02;
    public static final EnumC53209Ng7 A03;
    public static final EnumC53209Ng7 A04;
    public static final EnumC53209Ng7 A05;
    public final int A00;

    static {
        EnumC53209Ng7 enumC53209Ng7 = new EnumC53209Ng7("DEFAULT", 0, 0);
        A05 = enumC53209Ng7;
        EnumC53209Ng7 enumC53209Ng72 = new EnumC53209Ng7("CBR", 1, 1);
        A03 = enumC53209Ng72;
        EnumC53209Ng7 enumC53209Ng73 = new EnumC53209Ng7("CQ", 2, 2);
        A04 = enumC53209Ng73;
        EnumC53209Ng7[] enumC53209Ng7Arr = {enumC53209Ng7, enumC53209Ng72, enumC53209Ng73};
        A02 = enumC53209Ng7Arr;
        A01 = AbstractC12190kN.A00(enumC53209Ng7Arr);
    }

    public static EnumC53209Ng7 valueOf(String str) {
        return (EnumC53209Ng7) Enum.valueOf(EnumC53209Ng7.class, str);
    }

    public static EnumC53209Ng7[] values() {
        return (EnumC53209Ng7[]) A02.clone();
    }

    public EnumC53209Ng7(String str, int i, int i2) {
        this.A00 = i2;
    }
}
