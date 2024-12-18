package X;

/* renamed from: X.1a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28651a1 {
    public boolean A00;
    public final long[] A01;
    public final int[] A02;
    public final boolean[] A03;

    public final int[] A00() {
        int[] iArr;
        synchronized (this) {
            if (this.A00) {
                long[] jArr = this.A01;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = false;
                    if (jArr[i] > 0) {
                        z = true;
                    }
                    boolean[] zArr = this.A03;
                    if (z != zArr[i2]) {
                        int[] iArr2 = this.A02;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr2[i2] = i4;
                    } else {
                        this.A02[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.A00 = false;
                iArr = (int[]) this.A02.clone();
            } else {
                iArr = null;
            }
        }
        return iArr;
    }

    public C28651a1(int i) {
        this.A01 = new long[i];
        this.A03 = new boolean[i];
        this.A02 = new int[i];
    }
}
