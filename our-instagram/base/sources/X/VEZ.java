package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VEZ[] A01;
    public static final VEZ A02;
    public static final VEZ A03;
    public static final VEZ A04;
    public static final VEZ A05;
    public static final VEZ A06;
    public static final VEZ A07;
    public static final VEZ A08;
    public static final VEZ A09;

    static {
        VEZ vez = new VEZ("CATEGORY", 0);
        A02 = vez;
        VEZ vez2 = new VEZ("HASHTAG", 1);
        A03 = vez2;
        VEZ vez3 = new VEZ("PLACE", 2);
        A05 = vez3;
        VEZ vez4 = new VEZ("POPULAR", 3);
        A06 = vez4;
        VEZ vez5 = new VEZ("SAVED", 4);
        A07 = vez5;
        VEZ vez6 = new VEZ("LOCATION_PAGE_TAKEOVER", 5);
        A04 = vez6;
        VEZ vez7 = new VEZ("SPOTS", 6);
        A08 = vez7;
        VEZ vez8 = new VEZ("TEXT", 7);
        A09 = vez8;
        VEZ[] vezArr = {vez, vez2, vez3, vez4, vez5, vez6, vez7, vez8};
        A01 = vezArr;
        A00 = AbstractC12190kN.A00(vezArr);
    }

    public static VEZ valueOf(String str) {
        return (VEZ) Enum.valueOf(VEZ.class, str);
    }

    public static VEZ[] values() {
        return (VEZ[]) A01.clone();
    }

    public VEZ(String str, int i) {
    }

    @Override // java.lang.Enum
    public final String toString() {
        return AbstractC167007dF.A0h(name());
    }
}
