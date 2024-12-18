package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class MYR {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MYR[] A01;
    public static final MYR A02;
    public static final MYR A03;
    public static final MYR A04;
    public static final MYR A05;
    public static final MYR A06;
    public static final MYR A07;

    static {
        MYR myr = new MYR("DEGRADED", 0);
        A02 = myr;
        MYR myr2 = new MYR("POOR", 1);
        A06 = myr2;
        MYR myr3 = new MYR("MODERATE", 2);
        A05 = myr3;
        MYR myr4 = new MYR("GOOD", 3);
        A04 = myr4;
        MYR myr5 = new MYR("EXCELLENT", 4);
        A03 = myr5;
        MYR myr6 = new MYR("UNKNOWN", 5);
        A07 = myr6;
        MYR[] myrArr = {myr, myr2, myr3, myr4, myr5, myr6};
        A01 = myrArr;
        A00 = AbstractC12190kN.A00(myrArr);
    }

    public static MYR valueOf(String str) {
        return (MYR) Enum.valueOf(MYR.class, str);
    }

    public static MYR[] values() {
        return (MYR[]) A01.clone();
    }

    public MYR(String str, int i) {
    }
}
