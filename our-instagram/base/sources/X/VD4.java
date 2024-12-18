package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD4 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD4[] A01;
    public static final VD4 A02;
    public static final VD4 A03;
    public static final VD4 A04;
    public static final VD4 A05;
    public static final VD4 A06;
    public static final VD4 A07;

    static {
        VD4 vd4 = new VD4("A", 0);
        A02 = vd4;
        VD4 vd42 = new VD4("B", 1);
        A03 = vd42;
        VD4 vd43 = new VD4("C", 2);
        A04 = vd43;
        VD4 vd44 = new VD4("D", 3);
        A05 = vd44;
        VD4 vd45 = new VD4("E", 4);
        A07 = vd45;
        VD4 vd46 = new VD4("Drawable", 5);
        A06 = vd46;
        VD4[] vd4Arr = {vd4, vd42, vd43, vd44, vd45, vd46};
        A01 = vd4Arr;
        A00 = AbstractC12190kN.A00(vd4Arr);
    }

    public static VD4 valueOf(String str) {
        return (VD4) Enum.valueOf(VD4.class, str);
    }

    public static VD4[] values() {
        return (VD4[]) A01.clone();
    }

    public VD4(String str, int i) {
    }
}
