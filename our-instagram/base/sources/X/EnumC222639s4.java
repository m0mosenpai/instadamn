package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222639s4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222639s4[] A01;
    public static final EnumC222639s4 A02;
    public static final EnumC222639s4 A03;

    static {
        EnumC222639s4 enumC222639s4 = new EnumC222639s4("ENCRYPTED", 0);
        A02 = enumC222639s4;
        EnumC222639s4 enumC222639s42 = new EnumC222639s4("OPEN", 1);
        A03 = enumC222639s42;
        EnumC222639s4[] enumC222639s4Arr = {enumC222639s4, enumC222639s42};
        A01 = enumC222639s4Arr;
        A00 = AbstractC12190kN.A00(enumC222639s4Arr);
    }

    public static EnumC222639s4 valueOf(String str) {
        return (EnumC222639s4) Enum.valueOf(EnumC222639s4.class, str);
    }

    public static EnumC222639s4[] values() {
        return (EnumC222639s4[]) A01.clone();
    }

    public EnumC222639s4(String str, int i) {
    }
}
