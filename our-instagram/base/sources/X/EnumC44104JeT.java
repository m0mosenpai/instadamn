package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.JeT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44104JeT {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC44104JeT[] A03;
    public static final EnumC44104JeT A04;
    public static final EnumC44104JeT A05;
    public static final EnumC44104JeT A06;
    public final int A00;
    public final String A01;

    static {
        EnumC44104JeT enumC44104JeT = new EnumC44104JeT(0, 1, "PROMPT", "prompt");
        A06 = enumC44104JeT;
        EnumC44104JeT enumC44104JeT2 = new EnumC44104JeT(1, 2, "COMPOSER_BLOCK", "composer_block");
        A05 = enumC44104JeT2;
        EnumC44104JeT enumC44104JeT3 = new EnumC44104JeT(2, 3, "BOTTOM_SHEET", "thread_bottom_sheet");
        A04 = enumC44104JeT3;
        EnumC44104JeT[] enumC44104JeTArr = {enumC44104JeT, enumC44104JeT2, enumC44104JeT3};
        A03 = enumC44104JeTArr;
        A02 = AbstractC12190kN.A00(enumC44104JeTArr);
    }

    public static EnumC44104JeT valueOf(String str) {
        return (EnumC44104JeT) Enum.valueOf(EnumC44104JeT.class, str);
    }

    public static EnumC44104JeT[] values() {
        return (EnumC44104JeT[]) A03.clone();
    }

    public EnumC44104JeT(int i, int i2, String str, String str2) {
        this.A01 = str2;
        this.A00 = i2;
    }
}
