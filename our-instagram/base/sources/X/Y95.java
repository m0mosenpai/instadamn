package X;

import java.util.Random;

/* loaded from: classes12.dex */
public final class Y95 implements YMO {
    public final Random A00;
    public final int[] A01;
    public final int[] A02;

    public Y95(Random random, int[] iArr) {
        this.A02 = iArr;
        this.A00 = random;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        this.A01 = iArr2;
        for (int i = 0; i < length; i++) {
            iArr2[iArr[i]] = i;
        }
    }
}
