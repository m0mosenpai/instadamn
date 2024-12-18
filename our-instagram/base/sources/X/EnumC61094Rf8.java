package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rf8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61094Rf8 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61094Rf8[] A01;
    public static final EnumC61094Rf8 A02;

    static {
        EnumC61094Rf8 enumC61094Rf8 = new EnumC61094Rf8("ENCRYPT", 0);
        A02 = enumC61094Rf8;
        EnumC61094Rf8[] enumC61094Rf8Arr = {enumC61094Rf8, new EnumC61094Rf8("DECRYPT", 1)};
        A01 = enumC61094Rf8Arr;
        A00 = AbstractC12190kN.A00(enumC61094Rf8Arr);
    }

    public static EnumC61094Rf8 valueOf(String str) {
        return (EnumC61094Rf8) Enum.valueOf(EnumC61094Rf8.class, str);
    }

    public static EnumC61094Rf8[] values() {
        return (EnumC61094Rf8[]) A01.clone();
    }

    public EnumC61094Rf8(String str, int i) {
    }
}
