package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ACr {
    public int[] A07 = new int[10];
    public int[] A09 = new int[10];
    public int A02 = 0;
    public int[] A06 = new int[10];
    public float[] A04 = new float[10];
    public int A01 = 0;
    public int[] A08 = new int[5];
    public String[] A0A = new String[5];
    public int A03 = 0;
    public int[] A05 = new int[4];
    public boolean[] A0B = new boolean[4];
    public int A00 = 0;

    public final void A00(int type, float value) {
        int i = this.A01;
        int[] iArr = this.A06;
        int length = iArr.length;
        if (i >= length) {
            this.A06 = Arrays.copyOf(iArr, length * 2);
            float[] fArr = this.A04;
            this.A04 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.A06;
        int i2 = this.A01;
        iArr2[i2] = type;
        float[] fArr2 = this.A04;
        this.A01 = i2 + 1;
        fArr2[i2] = value;
    }

    public final void A01(int type, int value) {
        int i = this.A02;
        int[] iArr = this.A07;
        int length = iArr.length;
        if (i >= length) {
            this.A07 = Arrays.copyOf(iArr, length * 2);
            int[] iArr2 = this.A09;
            this.A09 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.A07;
        int i2 = this.A02;
        iArr3[i2] = type;
        int[] iArr4 = this.A09;
        this.A02 = i2 + 1;
        iArr4[i2] = value;
    }

    public final void A02(int type, String value) {
        int i = this.A03;
        int[] iArr = this.A08;
        int length = iArr.length;
        if (i >= length) {
            this.A08 = Arrays.copyOf(iArr, length * 2);
            String[] strArr = this.A0A;
            this.A0A = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.A08;
        int i2 = this.A03;
        iArr2[i2] = type;
        String[] strArr2 = this.A0A;
        this.A03 = i2 + 1;
        strArr2[i2] = value;
    }

    public final void A03(int type, boolean value) {
        int i = this.A00;
        int[] iArr = this.A05;
        int length = iArr.length;
        if (i >= length) {
            this.A05 = Arrays.copyOf(iArr, length * 2);
            boolean[] zArr = this.A0B;
            this.A0B = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.A05;
        int i2 = this.A00;
        iArr2[i2] = type;
        boolean[] zArr2 = this.A0B;
        this.A00 = i2 + 1;
        zArr2[i2] = value;
    }
}
