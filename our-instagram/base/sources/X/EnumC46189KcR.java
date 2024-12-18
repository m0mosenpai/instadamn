package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46189KcR {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46189KcR[] A02;
    public static final EnumC46189KcR A03;
    public static final EnumC46189KcR A04;
    public static final EnumC46189KcR A05;
    public final Number A00;

    static {
        EnumC46189KcR enumC46189KcR = new EnumC46189KcR(0, "UNKNOWN", 0);
        A05 = enumC46189KcR;
        EnumC46189KcR enumC46189KcR2 = new EnumC46189KcR(1, "NOT_NORMALIZED", 1);
        A04 = enumC46189KcR2;
        EnumC46189KcR enumC46189KcR3 = new EnumC46189KcR(2, "NORMALIZED", 2);
        A03 = enumC46189KcR3;
        EnumC46189KcR[] enumC46189KcRArr = {enumC46189KcR, enumC46189KcR2, enumC46189KcR3};
        A02 = enumC46189KcRArr;
        A01 = AbstractC12190kN.A00(enumC46189KcRArr);
    }

    public static EnumC46189KcR valueOf(String str) {
        return (EnumC46189KcR) Enum.valueOf(EnumC46189KcR.class, str);
    }

    public static EnumC46189KcR[] values() {
        return (EnumC46189KcR[]) A02.clone();
    }

    public EnumC46189KcR(Number number, String str, int i) {
        this.A00 = number;
    }
}
