package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ng8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53210Ng8 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53210Ng8[] A02;
    public static final EnumC53210Ng8 A03;
    public static final EnumC53210Ng8 A04;
    public static final EnumC53210Ng8 A05;
    public final int A00;

    static {
        EnumC53210Ng8 enumC53210Ng8 = new EnumC53210Ng8("Disabled", 0, 0);
        A03 = enumC53210Ng8;
        EnumC53210Ng8 enumC53210Ng82 = new EnumC53210Ng8("EnabledWithMemoryStorage", 1, 1);
        A05 = enumC53210Ng82;
        EnumC53210Ng8 enumC53210Ng83 = new EnumC53210Ng8("EnabledWithFileStorage", 2, 2);
        A04 = enumC53210Ng83;
        EnumC53210Ng8[] enumC53210Ng8Arr = {enumC53210Ng8, enumC53210Ng82, enumC53210Ng83};
        A02 = enumC53210Ng8Arr;
        A01 = AbstractC12190kN.A00(enumC53210Ng8Arr);
    }

    public static EnumC53210Ng8 valueOf(String str) {
        return (EnumC53210Ng8) Enum.valueOf(EnumC53210Ng8.class, str);
    }

    public static EnumC53210Ng8[] values() {
        return (EnumC53210Ng8[]) A02.clone();
    }

    public EnumC53210Ng8(String str, int i, int i2) {
        this.A00 = i2;
    }
}
