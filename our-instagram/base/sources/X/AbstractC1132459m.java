package X;

/* renamed from: X.59m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1132459m {
    public static final AbstractC1132959r A00;
    public static final AbstractC1132959r A01;
    public static final AbstractC1132959r A02;
    public static final C1132859q A03;
    public static final C1132859q A04;
    public static final C1132859q A05;
    public static final C1132859q A06;
    public static final C1132859q A07;
    public static final C1132859q A08;
    public static final C1132859q A09;
    public static final C1132859q A0A;
    public static final C1132859q A0B;
    public static final C1132859q A0C;
    public static final C1132859q A0D;
    public static final C1132859q A0E;
    public static final C1132859q A0F;
    public static final C1132859q A0G;
    public static final C1132859q A0H;
    public static final float[] A0I;
    public static final float[] A0J;
    public static final AbstractC1132959r[] A0K;
    public static final C1132559n A0L;
    public static final C1132559n A0M;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        A0J = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        A0I = fArr2;
        C1132559n c1132559n = new C1132559n(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A0M = c1132559n;
        C1132559n c1132559n2 = new C1132559n(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A0L = c1132559n2;
        C1132759p c1132759p = AbstractC1132659o.A03;
        C1132859q c1132859q = new C1132859q(c1132559n, c1132759p, "sRGB IEC61966-2.1", fArr, 0);
        A0G = c1132859q;
        C1132859q c1132859q2 = new C1132859q(c1132759p, "sRGB IEC61966-2.1 (Linear)", fArr, 1.0d, 0.0f, 1.0f, 1);
        A0C = c1132859q2;
        C1132859q c1132859q3 = new C1132859q(new InterfaceC1133159t() { // from class: X.5A1
            @Override // X.InterfaceC1133159t
            public final double CP0(double d) {
                double d2;
                double d3;
                C1132859q c1132859q4 = AbstractC1132459m.A03;
                if (d < 0.0d) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.04045d * 0.07739938080495357d) {
                    d3 = (Math.pow(d2, 1.0d / 2.4d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d3 = d2 / 0.07739938080495357d;
                }
                return Math.copySign(d3, d);
            }
        }, new InterfaceC1133159t() { // from class: X.5A2
            @Override // X.InterfaceC1133159t
            public final double CP0(double d) {
                double d2;
                double d3;
                C1132859q c1132859q4 = AbstractC1132459m.A03;
                if (d < 0.0d) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.04045d) {
                    d3 = Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d);
                } else {
                    d3 = d2 * 0.07739938080495357d;
                }
                return Math.copySign(d3, d);
            }
        }, c1132559n, c1132759p, "scRGB-nl IEC 61966-2-2:2003", fArr, null, -0.799f, 2.399f, 2);
        A0A = c1132859q3;
        C1132859q c1132859q4 = new C1132859q(c1132759p, "scRGB IEC 61966-2-2:2003", fArr, 1.0d, -0.5f, 7.499f, 3);
        A0B = c1132859q4;
        C1132859q c1132859q5 = new C1132859q(new C1132559n(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), c1132759p, "Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, 4);
        A07 = c1132859q5;
        C1132859q c1132859q6 = new C1132859q(new C1132559n(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), c1132759p, "Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, 5);
        A06 = c1132859q6;
        C1132859q c1132859q7 = new C1132859q(new C1132759p(0.314f, 0.351f), "SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, 2.6d, 0.0f, 1.0f, 6);
        A08 = c1132859q7;
        C1132859q c1132859q8 = new C1132859q(c1132559n, c1132759p, "Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, 7);
        A09 = c1132859q8;
        C1132859q c1132859q9 = new C1132859q(new C1132559n(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), AbstractC1132659o.A00, "NTSC (1953)", fArr2, 8);
        A0D = c1132859q9;
        C1132859q c1132859q10 = new C1132859q(new C1132559n(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), c1132759p, "SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, 9);
        A0F = c1132859q10;
        C1132859q c1132859q11 = new C1132859q(c1132759p, "Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, 2.2d, 0.0f, 1.0f, 10);
        A05 = c1132859q11;
        C1132759p c1132759p2 = AbstractC1132659o.A01;
        C1132859q c1132859q12 = new C1132859q(new C1132559n(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), c1132759p2, "ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, 11);
        A0E = c1132859q12;
        C1132759p c1132759p3 = AbstractC1132659o.A02;
        C1132859q c1132859q13 = new C1132859q(c1132759p3, "SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, 1.0d, -65504.0f, 65504.0f, 12);
        A03 = c1132859q13;
        C1132859q c1132859q14 = new C1132859q(c1132759p3, "Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, 1.0d, -65504.0f, 65504.0f, 13);
        A04 = c1132859q14;
        AbstractC1132959r abstractC1132959r = new AbstractC1132959r(14, "Generic XYZ", AbstractC1133459w.A03);
        A01 = abstractC1132959r;
        long j = AbstractC1133459w.A01;
        AbstractC1132959r abstractC1132959r2 = new AbstractC1132959r(15, "Generic L*a*b*", j);
        A00 = abstractC1132959r2;
        C1132859q c1132859q15 = new C1132859q(c1132559n2, c1132759p, "None", fArr, 16);
        A0H = c1132859q15;
        AbstractC1132959r abstractC1132959r3 = new AbstractC1132959r(17, "Oklab", j);
        A02 = abstractC1132959r3;
        A0K = new AbstractC1132959r[]{c1132859q, c1132859q2, c1132859q3, c1132859q4, c1132859q5, c1132859q6, c1132859q7, c1132859q8, c1132859q9, c1132859q10, c1132859q11, c1132859q12, c1132859q13, c1132859q14, abstractC1132959r, abstractC1132959r2, c1132859q15, abstractC1132959r3};
    }
}
