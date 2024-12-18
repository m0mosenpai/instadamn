package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46191KcT {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46191KcT[] A02;
    public static final EnumC46191KcT A03;
    public static final EnumC46191KcT A04;
    public static final EnumC46191KcT A05;
    public final int A00;

    static {
        EnumC46191KcT enumC46191KcT = new EnumC46191KcT("THREE_HOURS", 0, 180);
        A04 = enumC46191KcT;
        EnumC46191KcT enumC46191KcT2 = new EnumC46191KcT("TWENTY_FOUR_HOURS", 1, 1440);
        A05 = enumC46191KcT2;
        EnumC46191KcT enumC46191KcT3 = new EnumC46191KcT("INDEFINITE", 2, 0);
        A03 = enumC46191KcT3;
        EnumC46191KcT[] enumC46191KcTArr = {enumC46191KcT, enumC46191KcT2, enumC46191KcT3};
        A02 = enumC46191KcTArr;
        A01 = AbstractC12190kN.A00(enumC46191KcTArr);
    }

    public static EnumC46191KcT valueOf(String str) {
        return (EnumC46191KcT) Enum.valueOf(EnumC46191KcT.class, str);
    }

    public static EnumC46191KcT[] values() {
        return (EnumC46191KcT[]) A02.clone();
    }

    public EnumC46191KcT(String str, int i, int i2) {
        this.A00 = i2;
    }
}
