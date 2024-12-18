package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nf4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53149Nf4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53149Nf4[] A01;
    public static final EnumC53149Nf4 A02;
    public static final EnumC53149Nf4 A03;
    public static final EnumC53149Nf4 A04;
    public static final EnumC53149Nf4 A05;

    static {
        EnumC53149Nf4 enumC53149Nf4 = new EnumC53149Nf4("HIDDEN", 0);
        A05 = enumC53149Nf4;
        EnumC53149Nf4 enumC53149Nf42 = new EnumC53149Nf4("DISMISSED", 1);
        A03 = enumC53149Nf42;
        EnumC53149Nf4 enumC53149Nf43 = new EnumC53149Nf4("DEFAULT", 2);
        A02 = enumC53149Nf43;
        EnumC53149Nf4 enumC53149Nf44 = new EnumC53149Nf4("EXPANDED", 3);
        A04 = enumC53149Nf44;
        EnumC53149Nf4[] enumC53149Nf4Arr = {enumC53149Nf4, enumC53149Nf42, enumC53149Nf43, enumC53149Nf44};
        A01 = enumC53149Nf4Arr;
        A00 = AbstractC12190kN.A00(enumC53149Nf4Arr);
    }

    public static EnumC53149Nf4 valueOf(String str) {
        return (EnumC53149Nf4) Enum.valueOf(EnumC53149Nf4.class, str);
    }

    public static EnumC53149Nf4[] values() {
        return (EnumC53149Nf4[]) A01.clone();
    }

    public EnumC53149Nf4(String str, int i) {
    }
}
