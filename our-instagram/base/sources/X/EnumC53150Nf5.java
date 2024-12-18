package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nf5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53150Nf5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53150Nf5[] A01;
    public static final EnumC53150Nf5 A02;
    public static final EnumC53150Nf5 A03;
    public static final EnumC53150Nf5 A04;
    public static final EnumC53150Nf5 A05;

    static {
        EnumC53150Nf5 enumC53150Nf5 = new EnumC53150Nf5("INITIALIZED", 0);
        A03 = enumC53150Nf5;
        EnumC53150Nf5 enumC53150Nf52 = new EnumC53150Nf5("IN_PROGRESS", 1);
        A04 = enumC53150Nf52;
        EnumC53150Nf5 enumC53150Nf53 = new EnumC53150Nf5("SUCCESS", 2);
        A05 = enumC53150Nf53;
        EnumC53150Nf5 enumC53150Nf54 = new EnumC53150Nf5("ERROR", 3);
        A02 = enumC53150Nf54;
        EnumC53150Nf5[] enumC53150Nf5Arr = {enumC53150Nf5, enumC53150Nf52, enumC53150Nf53, enumC53150Nf54};
        A01 = enumC53150Nf5Arr;
        A00 = AbstractC12190kN.A00(enumC53150Nf5Arr);
    }

    public static EnumC53150Nf5 valueOf(String str) {
        return (EnumC53150Nf5) Enum.valueOf(EnumC53150Nf5.class, str);
    }

    public static EnumC53150Nf5[] values() {
        return (EnumC53150Nf5[]) A01.clone();
    }

    public EnumC53150Nf5(String str, int i) {
    }
}
