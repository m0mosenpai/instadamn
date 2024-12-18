package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rg7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61146Rg7 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61146Rg7[] A02;
    public static final EnumC61146Rg7 A03;
    public static final EnumC61146Rg7 A04;
    public final int A00;

    static {
        EnumC61146Rg7 enumC61146Rg7 = new EnumC61146Rg7("LOW_END", 0, 1);
        A03 = enumC61146Rg7;
        EnumC61146Rg7 enumC61146Rg72 = new EnumC61146Rg7("MID_END", 1, 2);
        A04 = enumC61146Rg72;
        EnumC61146Rg7[] enumC61146Rg7Arr = {enumC61146Rg7, enumC61146Rg72, new EnumC61146Rg7("HIGH_END", 2, 3)};
        A02 = enumC61146Rg7Arr;
        A01 = AbstractC12190kN.A00(enumC61146Rg7Arr);
    }

    public static EnumC61146Rg7 valueOf(String str) {
        return (EnumC61146Rg7) Enum.valueOf(EnumC61146Rg7.class, str);
    }

    public static EnumC61146Rg7[] values() {
        return (EnumC61146Rg7[]) A02.clone();
    }

    public EnumC61146Rg7(String str, int i, int i2) {
        this.A00 = i2;
    }
}
