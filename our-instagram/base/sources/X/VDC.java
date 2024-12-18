package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VDC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VDC[] A01;
    public static final VDC A02;
    public static final VDC A03;
    public static final VDC A04;
    public static final VDC A05;
    public static final VDC A06;
    public static final VDC A07;
    public static final VDC A08;
    public static final VDC A09;
    public static final VDC A0A;
    public static final VDC A0B;
    public static final VDC A0C;
    public static final VDC A0D;

    public static VDC valueOf(String str) {
        return (VDC) Enum.valueOf(VDC.class, str);
    }

    public static VDC[] values() {
        return (VDC[]) A01.clone();
    }

    static {
        VDC vdc = new VDC("BORDER_RADIUS", 0);
        A08 = vdc;
        VDC vdc2 = new VDC("BORDER_TOP_LEFT_RADIUS", 1);
        A0B = vdc2;
        VDC vdc3 = new VDC("BORDER_TOP_RIGHT_RADIUS", 2);
        A0C = vdc3;
        VDC vdc4 = new VDC("BORDER_BOTTOM_RIGHT_RADIUS", 3);
        A04 = vdc4;
        VDC vdc5 = new VDC("BORDER_BOTTOM_LEFT_RADIUS", 4);
        A03 = vdc5;
        VDC vdc6 = new VDC("BORDER_TOP_START_RADIUS", 5);
        A0D = vdc6;
        VDC vdc7 = new VDC("BORDER_TOP_END_RADIUS", 6);
        A0A = vdc7;
        VDC vdc8 = new VDC("BORDER_BOTTOM_START_RADIUS", 7);
        A05 = vdc8;
        VDC vdc9 = new VDC("BORDER_BOTTOM_END_RADIUS", 8);
        A02 = vdc9;
        VDC vdc10 = new VDC("BORDER_END_END_RADIUS", 9);
        A06 = vdc10;
        VDC vdc11 = new VDC("BORDER_END_START_RADIUS", 10);
        A07 = vdc11;
        VDC vdc12 = new VDC("BORDER_START_END_RADIUS", 11);
        A09 = vdc12;
        VDC[] vdcArr = {vdc, vdc2, vdc3, vdc4, vdc5, vdc6, vdc7, vdc8, vdc9, vdc10, vdc11, vdc12, new VDC("BORDER_START_START_RADIUS", 12)};
        A01 = vdcArr;
        A00 = AbstractC12190kN.A00(vdcArr);
    }

    public VDC(String str, int i) {
    }
}
