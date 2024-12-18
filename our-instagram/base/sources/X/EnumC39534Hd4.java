package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hd4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39534Hd4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39534Hd4[] A01;
    public static final EnumC39534Hd4 A02;
    public static final EnumC39534Hd4 A03;

    static {
        EnumC39534Hd4 enumC39534Hd4 = new EnumC39534Hd4("PRODUCTS", 0);
        A03 = enumC39534Hd4;
        EnumC39534Hd4 enumC39534Hd42 = new EnumC39534Hd4("COLLECTIONS", 1);
        A02 = enumC39534Hd42;
        EnumC39534Hd4[] enumC39534Hd4Arr = {enumC39534Hd4, enumC39534Hd42};
        A01 = enumC39534Hd4Arr;
        A00 = AbstractC12190kN.A00(enumC39534Hd4Arr);
    }

    public static EnumC39534Hd4 valueOf(String str) {
        return (EnumC39534Hd4) Enum.valueOf(EnumC39534Hd4.class, str);
    }

    public static EnumC39534Hd4[] values() {
        return (EnumC39534Hd4[]) A01.clone();
    }

    public EnumC39534Hd4(String str, int i) {
    }
}
