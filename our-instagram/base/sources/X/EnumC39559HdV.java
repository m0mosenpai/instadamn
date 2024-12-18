package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39559HdV {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39559HdV[] A02;
    public static final EnumC39559HdV A03;
    public static final EnumC39559HdV A04;
    public final int A00;

    static {
        EnumC39559HdV enumC39559HdV = new EnumC39559HdV("SET_REMINDER", 0, 489165898);
        A03 = enumC39559HdV;
        EnumC39559HdV enumC39559HdV2 = new EnumC39559HdV("UNSET_REMINDER", 1, 489167811);
        A04 = enumC39559HdV2;
        EnumC39559HdV[] enumC39559HdVArr = {enumC39559HdV, enumC39559HdV2};
        A02 = enumC39559HdVArr;
        A01 = AbstractC12190kN.A00(enumC39559HdVArr);
    }

    public static EnumC39559HdV valueOf(String str) {
        return (EnumC39559HdV) Enum.valueOf(EnumC39559HdV.class, str);
    }

    public static EnumC39559HdV[] values() {
        return (EnumC39559HdV[]) A02.clone();
    }

    public EnumC39559HdV(String str, int i, int i2) {
        this.A00 = i2;
    }
}
