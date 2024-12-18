package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kc1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46163Kc1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46163Kc1[] A01;
    public static final EnumC46163Kc1 A02;
    public static final EnumC46163Kc1 A03;
    public static final EnumC46163Kc1 A04;
    public static final EnumC46163Kc1 A05;
    public static final EnumC46163Kc1 A06;

    static {
        EnumC46163Kc1 enumC46163Kc1 = new EnumC46163Kc1("MODERN", 0);
        A04 = enumC46163Kc1;
        EnumC46163Kc1 enumC46163Kc12 = new EnumC46163Kc1("NEON", 1);
        A05 = enumC46163Kc12;
        EnumC46163Kc1 enumC46163Kc13 = new EnumC46163Kc1("TYPEWRITER", 2);
        A06 = enumC46163Kc13;
        EnumC46163Kc1 enumC46163Kc14 = new EnumC46163Kc1("CLASSIC", 3);
        A02 = enumC46163Kc14;
        EnumC46163Kc1 enumC46163Kc15 = new EnumC46163Kc1("LITERATURE", 4);
        A03 = enumC46163Kc15;
        EnumC46163Kc1[] enumC46163Kc1Arr = {enumC46163Kc1, enumC46163Kc12, enumC46163Kc13, enumC46163Kc14, enumC46163Kc15};
        A01 = enumC46163Kc1Arr;
        A00 = AbstractC12190kN.A00(enumC46163Kc1Arr);
    }

    public static EnumC46163Kc1 valueOf(String str) {
        return (EnumC46163Kc1) Enum.valueOf(EnumC46163Kc1.class, str);
    }

    public static EnumC46163Kc1[] values() {
        return (EnumC46163Kc1[]) A01.clone();
    }

    public EnumC46163Kc1(String str, int i) {
    }
}
