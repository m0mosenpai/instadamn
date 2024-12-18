package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class RS7 extends C63033Sb7 {
    public transient int A00;
    public transient int A01;
    public transient long[] links;

    public RS7() {
        A09(3, 1.0f);
    }

    private void A00(int pred, int succ) {
        if (pred == -2) {
            this.A00 = succ;
        } else {
            long[] jArr = this.links;
            C63033Sb7.A01(jArr, succ, pred, jArr[pred]);
        }
        if (succ == -2) {
            this.A01 = pred;
        } else {
            long[] jArr2 = this.links;
            jArr2[succ] = (jArr2[succ] & 4294967295L) | (pred << 32);
        }
    }

    @Override // X.C63033Sb7
    public final void A07(int dstIndex) {
        int i = this.A02 - 1;
        long[] jArr = this.links;
        long j = jArr[dstIndex];
        A00((int) (j >>> 32), (int) j);
        if (dstIndex < i) {
            A00((int) (jArr[i] >>> 32), dstIndex);
            A00(dstIndex, (int) jArr[i]);
        }
        super.A07(dstIndex);
    }

    @Override // X.C63033Sb7
    public final void A09(int expectedSize, float loadFactor) {
        super.A09(expectedSize, 1.0f);
        this.A00 = -2;
        this.A01 = -2;
        long[] jArr = new long[expectedSize];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // X.C63033Sb7
    public final void A06() {
        super.A06();
        this.A00 = -2;
        this.A01 = -2;
    }

    @Override // X.C63033Sb7
    public final void A08(int newCapacity) {
        super.A08(newCapacity);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, newCapacity);
        this.links = copyOf;
        Arrays.fill(copyOf, length, newCapacity, -1L);
    }

    @Override // X.C63033Sb7
    public final void A0B(Object entryIndex, int key, int value, int hash) {
        super.A0B(entryIndex, key, value, hash);
        A00(this.A01, key);
        A00(key, -2);
    }
}
