package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5tC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC129475tC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC129475tC[] A01;
    public static final EnumC129475tC A02;

    static {
        EnumC129475tC enumC129475tC = new EnumC129475tC("DP40", 0);
        A02 = enumC129475tC;
        EnumC129475tC[] enumC129475tCArr = {enumC129475tC, new EnumC129475tC("DP60", 1)};
        A01 = enumC129475tCArr;
        A00 = AbstractC12190kN.A00(enumC129475tCArr);
    }

    public static EnumC129475tC valueOf(String str) {
        return (EnumC129475tC) Enum.valueOf(EnumC129475tC.class, str);
    }

    public static EnumC129475tC[] values() {
        return (EnumC129475tC[]) A01.clone();
    }

    public EnumC129475tC(String str, int i) {
    }
}
