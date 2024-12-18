package X;

/* renamed from: X.5BB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5BB {
    public static InterfaceC16660sJ A00 = C114135Cz.A00;

    public static final void A01(float[] fArr, float[] fArr2) {
        float A002 = A00(fArr2, fArr, 0, 0);
        float A003 = A00(fArr2, fArr, 0, 1);
        float A004 = A00(fArr2, fArr, 0, 2);
        float A005 = A00(fArr2, fArr, 0, 3);
        float A006 = A00(fArr2, fArr, 1, 0);
        float A007 = A00(fArr2, fArr, 1, 1);
        float A008 = A00(fArr2, fArr, 1, 2);
        float A009 = A00(fArr2, fArr, 1, 3);
        float A0010 = A00(fArr2, fArr, 2, 0);
        float A0011 = A00(fArr2, fArr, 2, 1);
        float A0012 = A00(fArr2, fArr, 2, 2);
        float A0013 = A00(fArr2, fArr, 2, 3);
        float A0014 = A00(fArr2, fArr, 3, 0);
        float A0015 = A00(fArr2, fArr, 3, 1);
        float A0016 = A00(fArr2, fArr, 3, 2);
        float A0017 = A00(fArr2, fArr, 3, 3);
        fArr[0] = A002;
        fArr[1] = A003;
        fArr[2] = A004;
        fArr[3] = A005;
        fArr[4] = A006;
        fArr[5] = A007;
        fArr[6] = A008;
        fArr[7] = A009;
        fArr[8] = A0010;
        fArr[9] = A0011;
        fArr[10] = A0012;
        fArr[11] = A0013;
        fArr[12] = A0014;
        fArr[13] = A0015;
        fArr[14] = A0016;
        fArr[15] = A0017;
    }

    public static final float A00(float[] fArr, float[] fArr2, int i, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[i2 + 4]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }
}
