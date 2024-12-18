package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ng3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53205Ng3 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53205Ng3[] A02;
    public static final EnumC53205Ng3 A03;
    public static final EnumC53205Ng3 A04;
    public final int A00;

    static {
        EnumC53205Ng3 enumC53205Ng3 = new EnumC53205Ng3("VIEW_TYPE_ROW", 0, 0);
        A03 = enumC53205Ng3;
        EnumC53205Ng3 enumC53205Ng32 = new EnumC53205Ng3("VIEW_TYPE_ROW_FRX_V3", 1, 1);
        A04 = enumC53205Ng32;
        EnumC53205Ng3[] enumC53205Ng3Arr = {enumC53205Ng3, enumC53205Ng32};
        A02 = enumC53205Ng3Arr;
        A01 = AbstractC12190kN.A00(enumC53205Ng3Arr);
    }

    public static EnumC53205Ng3 valueOf(String str) {
        return (EnumC53205Ng3) Enum.valueOf(EnumC53205Ng3.class, str);
    }

    public static EnumC53205Ng3[] values() {
        return (EnumC53205Ng3[]) A02.clone();
    }

    public EnumC53205Ng3(String str, int i, int i2) {
        this.A00 = i2;
    }
}
