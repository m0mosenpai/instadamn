package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Hd1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ Hd1[] A01;
    public static final Hd1 A02;
    public static final Hd1 A03;

    static {
        Hd1 hd1 = new Hd1("FUNDRAISER_DONATE_BOTTOM_SHEET", 0);
        A02 = hd1;
        Hd1 hd12 = new Hd1("FUNDRAISER_PAGE", 1);
        A03 = hd12;
        Hd1[] hd1Arr = {hd1, hd12};
        A01 = hd1Arr;
        A00 = AbstractC12190kN.A00(hd1Arr);
    }

    public static Hd1 valueOf(String str) {
        return (Hd1) Enum.valueOf(Hd1.class, str);
    }

    public static Hd1[] values() {
        return (Hd1[]) A01.clone();
    }

    public Hd1(String str, int i) {
    }
}
