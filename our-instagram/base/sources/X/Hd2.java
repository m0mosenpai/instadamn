package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Hd2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ Hd2[] A01;
    public static final Hd2 A02;
    public static final Hd2 A03;

    static {
        Hd2 hd2 = new Hd2("UNSELECTED", 0);
        A03 = hd2;
        Hd2 hd22 = new Hd2("SELECTED", 1);
        A02 = hd22;
        Hd2[] hd2Arr = {hd2, hd22};
        A01 = hd2Arr;
        A00 = AbstractC12190kN.A00(hd2Arr);
    }

    public static Hd2 valueOf(String str) {
        return (Hd2) Enum.valueOf(Hd2.class, str);
    }

    public static Hd2[] values() {
        return (Hd2[]) A01.clone();
    }

    public Hd2(String str, int i) {
    }
}
