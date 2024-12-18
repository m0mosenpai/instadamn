package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Pzw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC58683Pzw {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC58683Pzw[] A01;
    public static final EnumC58683Pzw A02;
    public static final EnumC58683Pzw A03;
    public static final EnumC58683Pzw A04;
    public static final EnumC58683Pzw A05;

    static {
        EnumC58683Pzw enumC58683Pzw = new EnumC58683Pzw("PARALLEL_FETCH", 0);
        A04 = enumC58683Pzw;
        EnumC58683Pzw enumC58683Pzw2 = new EnumC58683Pzw("PREFETCH", 1);
        A05 = enumC58683Pzw2;
        EnumC58683Pzw enumC58683Pzw3 = new EnumC58683Pzw("FETCH", 2);
        A02 = enumC58683Pzw3;
        EnumC58683Pzw enumC58683Pzw4 = new EnumC58683Pzw("HOISTED_PREFETCH", 3);
        A03 = enumC58683Pzw4;
        EnumC58683Pzw[] enumC58683PzwArr = {enumC58683Pzw, enumC58683Pzw2, enumC58683Pzw3, enumC58683Pzw4};
        A01 = enumC58683PzwArr;
        A00 = AbstractC12190kN.A00(enumC58683PzwArr);
    }

    public static EnumC58683Pzw valueOf(String str) {
        return (EnumC58683Pzw) Enum.valueOf(EnumC58683Pzw.class, str);
    }

    public static EnumC58683Pzw[] values() {
        return (EnumC58683Pzw[]) A01.clone();
    }

    public EnumC58683Pzw(String str, int i) {
    }
}
