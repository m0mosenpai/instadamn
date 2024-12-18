package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GcW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37328GcW {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC37328GcW[] A03;
    public static final EnumC37328GcW A04;
    public static final EnumC37328GcW A05;
    public final long A00 = 43200000;
    public final String A01;

    static {
        EnumC37328GcW enumC37328GcW = new EnumC37328GcW(0, "CLIPS", "clips");
        A04 = enumC37328GcW;
        EnumC37328GcW enumC37328GcW2 = new EnumC37328GcW(1, "EXPLORE", "explore");
        A05 = enumC37328GcW2;
        EnumC37328GcW[] enumC37328GcWArr = {enumC37328GcW, enumC37328GcW2};
        A03 = enumC37328GcWArr;
        A02 = AbstractC12190kN.A00(enumC37328GcWArr);
    }

    public static EnumC37328GcW valueOf(String str) {
        return (EnumC37328GcW) Enum.valueOf(EnumC37328GcW.class, str);
    }

    public static EnumC37328GcW[] values() {
        return (EnumC37328GcW[]) A03.clone();
    }

    public EnumC37328GcW(int i, String str, String str2) {
        this.A01 = str2;
    }
}
