package X;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: X.0zP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20480zP {
    public final int A00;
    public final short[] A03;
    public final short[][] A08;
    public final short[][] A09;
    public final short[][] A0B;
    public final int[] A02 = new int[4];
    public final C20440zL A01 = new Object();
    public final short[][] A0A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 12, 16);
    public final short[] A04 = new short[12];
    public final short[] A05 = new short[12];
    public final short[] A06 = new short[12];
    public final short[] A07 = new short[12];

    public void A01() {
        int[] iArr = this.A02;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.A01.A00 = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.A0A;
            if (i2 >= sArr.length) {
                break;
            }
            Arrays.fill(sArr[i2], (short) 1024);
            i2++;
        }
        Arrays.fill(this.A04, (short) 1024);
        Arrays.fill(this.A05, (short) 1024);
        Arrays.fill(this.A06, (short) 1024);
        Arrays.fill(this.A07, (short) 1024);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.A0B;
            if (i3 >= sArr2.length) {
                break;
            }
            Arrays.fill(sArr2[i3], (short) 1024);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.A08;
            if (i4 >= sArr3.length) {
                break;
            }
            Arrays.fill(sArr3[i4], (short) 1024);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.A09;
            if (i < 10) {
                Arrays.fill(sArr4[i], (short) 1024);
                i++;
            } else {
                Arrays.fill(this.A03, (short) 1024);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0zL, java.lang.Object] */
    public AbstractC20480zP(int i) {
        Class cls = Short.TYPE;
        this.A0B = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.A08 = (short[][]) Array.newInstance((Class<?>) cls, 4, 64);
        this.A09 = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.A03 = new short[16];
        this.A00 = (1 << i) - 1;
    }
}
