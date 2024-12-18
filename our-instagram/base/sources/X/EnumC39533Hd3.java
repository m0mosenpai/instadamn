package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hd3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39533Hd3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39533Hd3[] A01;
    public static final EnumC39533Hd3 A02;
    public static final EnumC39533Hd3 A03;

    static {
        EnumC39533Hd3 enumC39533Hd3 = new EnumC39533Hd3("FREE_SHIPPING", 0);
        A02 = enumC39533Hd3;
        EnumC39533Hd3 enumC39533Hd32 = new EnumC39533Hd3("UNKNOWN", 1);
        A03 = enumC39533Hd32;
        EnumC39533Hd3[] enumC39533Hd3Arr = {enumC39533Hd3, enumC39533Hd32};
        A01 = enumC39533Hd3Arr;
        A00 = AbstractC12190kN.A00(enumC39533Hd3Arr);
    }

    public static EnumC39533Hd3 valueOf(String str) {
        return (EnumC39533Hd3) Enum.valueOf(EnumC39533Hd3.class, str);
    }

    public static EnumC39533Hd3[] values() {
        return (EnumC39533Hd3[]) A01.clone();
    }

    public EnumC39533Hd3(String str, int i) {
    }
}
