package X;

import java.util.Arrays;

/* renamed from: X.Sb7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C63033Sb7 {
    public transient float A00;
    public transient int A01;
    public transient int A02;
    public transient int A03;
    public transient int[] A04;
    public transient int[] A05;
    public transient Object[] A06;
    public transient long[] entries;

    public final int A02() {
        if (this instanceof RS7) {
            int i = ((RS7) this).A00;
            if (i != -2) {
                return i;
            }
        } else if (this.A02 != 0) {
            return 0;
        }
        return -1;
    }

    public final int A03(int index) {
        if (this instanceof RS7) {
            int i = (int) ((RS7) this).links[index];
            if (i != -2) {
                return i;
            }
        } else {
            int i2 = index + 1;
            if (i2 < this.A02) {
                return i2;
            }
        }
        return -1;
    }

    public final int A04(int entryIndex) {
        Object obj = this.A06[entryIndex];
        long[] jArr = this.entries;
        int i = (int) (jArr[entryIndex] >>> 32);
        int length = (r1.length - 1) & i;
        int i2 = this.A04[length];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (((int) (jArr[i2] >>> 32)) == i && AbstractC50102Ry.A00(obj, this.A06[i2])) {
                    int i4 = this.A05[i2];
                    if (i3 == -1) {
                        this.A04[length] = (int) this.entries[i2];
                    } else {
                        long[] jArr2 = this.entries;
                        A01(jArr2, (int) jArr2[i2], i3, jArr2[i3]);
                    }
                    A07(i2);
                    this.A02--;
                    this.A01++;
                    return i4;
                }
                jArr = this.entries;
                int i5 = (int) jArr[i2];
                if (i5 != -1) {
                    i3 = i2;
                    i2 = i5;
                } else {
                    return 0;
                }
            }
        } else {
            return 0;
        }
    }

    public void A06() {
        this.A01++;
        Arrays.fill(this.A06, 0, this.A02, (Object) null);
        Arrays.fill(this.A05, 0, this.A02, 0);
        Arrays.fill(this.A04, -1);
        Arrays.fill(this.entries, -1L);
        this.A02 = 0;
    }

    public void A07(int dstIndex) {
        int i = this.A02 - 1;
        Object[] objArr = this.A06;
        if (dstIndex < i) {
            objArr[dstIndex] = objArr[i];
            int[] iArr = this.A05;
            iArr[dstIndex] = iArr[i];
            objArr[i] = null;
            iArr[i] = 0;
            long[] jArr = this.entries;
            long j = jArr[i];
            jArr[dstIndex] = j;
            jArr[i] = -1;
            int[] iArr2 = this.A04;
            int length = ((int) (j >>> 32)) & (iArr2.length - 1);
            int i2 = iArr2[length];
            if (i2 == i) {
                iArr2[length] = dstIndex;
                return;
            }
            while (true) {
                long j2 = jArr[i2];
                int i3 = (int) j2;
                if (i3 == i) {
                    A01(jArr, dstIndex, i2, j2);
                    return;
                }
                i2 = i3;
            }
        } else {
            objArr[dstIndex] = null;
            this.A05[dstIndex] = 0;
            this.entries[dstIndex] = -1;
        }
    }

    public void A08(int newCapacity) {
        this.A06 = Arrays.copyOf(this.A06, newCapacity);
        this.A05 = Arrays.copyOf(this.A05, newCapacity);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, newCapacity);
        if (newCapacity > length) {
            Arrays.fill(copyOf, length, newCapacity, -1L);
        }
        this.entries = copyOf;
    }

    public void A09(int expectedSize, float loadFactor) {
        C18C.A0G(MSY.A1R(expectedSize), "Initial capacity must be non-negative");
        int A00 = C1Jk.A00(expectedSize);
        int[] iArr = new int[A00];
        Arrays.fill(iArr, -1);
        this.A04 = iArr;
        this.A00 = 1.0f;
        this.A06 = new Object[expectedSize];
        this.A05 = new int[expectedSize];
        long[] jArr = new long[expectedSize];
        Arrays.fill(jArr, -1L);
        this.entries = jArr;
        this.A03 = Math.max(1, (int) (A00 * 1.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (r0 != r2) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(java.lang.Object r13, int r14) {
        /*
            r12 = this;
            java.lang.String r1 = "count"
            if (r14 <= 0) goto Lb1
            long[] r11 = r12.entries
            java.lang.Object[] r10 = r12.A06
            int[] r9 = r12.A05
            int r8 = X.C1Jk.A02(r13)
            int[] r1 = r12.A04
            int r0 = r1.length
            int r0 = r0 + (-1)
            r0 = r0 & r8
            int r7 = r12.A02
            r6 = r1[r0]
            r5 = -1
            if (r6 != r5) goto L8c
            r1[r0] = r7
        L1d:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r3) goto Laa
            int r4 = r7 + 1
            long[] r0 = r12.entries
            int r2 = r0.length
            if (r4 <= r2) goto L39
            int r1 = r2 >>> 1
            r0 = 1
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = r0 + r2
            if (r0 >= 0) goto L89
            r0 = 2147483647(0x7fffffff, float:NaN)
        L36:
            r12.A08(r0)
        L39:
            r12.A0B(r13, r7, r14, r8)
            r12.A02 = r4
            int r0 = r12.A03
            if (r7 < r0) goto L4d
            int[] r0 = r12.A04
            int r1 = r0.length
            int r2 = r1 * 2
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 < r0) goto L54
            r12.A03 = r3
        L4d:
            int r0 = r12.A01
            int r0 = r0 + 1
            r12.A01 = r0
            return
        L54:
            float r1 = (float) r2
            float r0 = r12.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r8 = r0 + 1
            int[] r7 = new int[r2]
            java.util.Arrays.fill(r7, r5)
            long[] r9 = r12.entries
            int r10 = r2 + (-1)
            r6 = 0
        L65:
            int r0 = r12.A02
            if (r6 >= r0) goto L84
            r0 = r9[r6]
            r3 = 32
            long r0 = r0 >>> r3
            int r2 = (int) r0
            r1 = r2 & r10
            r0 = r7[r1]
            r7[r1] = r6
            long r4 = (long) r2
            long r4 = r4 << r3
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = (long) r0
            long r2 = r2 & r0
            long r4 = r4 | r2
            r9[r6] = r4
            int r6 = r6 + 1
            goto L65
        L84:
            r12.A03 = r8
            r12.A04 = r7
            goto L4d
        L89:
            if (r0 == r2) goto L39
            goto L36
        L8c:
            r1 = r11[r6]
            r0 = 32
            long r3 = r1 >>> r0
            int r0 = (int) r3
            if (r0 != r8) goto La0
            r0 = r10[r6]
            boolean r0 = X.AbstractC50102Ry.A00(r13, r0)
            if (r0 == 0) goto La0
            r9[r6] = r14
            return
        La0:
            int r0 = (int) r1
            if (r0 != r5) goto La8
            A01(r11, r7, r6, r1)
            goto L1d
        La8:
            r6 = r0
            goto L8c
        Laa:
            java.lang.String r0 = "Cannot contain more than Integer.MAX_VALUE elements!"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        Lb1:
            java.lang.String r0 = " must be positive but was: "
            java.lang.String r0 = X.AnonymousClass001.A0b(r1, r0, r14)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63033Sb7.A0A(java.lang.Object, int):void");
    }

    public void A0B(Object entryIndex, int key, int value, int hash) {
        this.entries[key] = (hash << 32) | 4294967295L;
        this.A06[key] = entryIndex;
        this.A05[key] = value;
    }

    public C63033Sb7() {
        A09(3, 1.0f);
    }

    public final int A05(Object key) {
        int A02 = C1Jk.A02(key);
        int i = this.A04[(r1.length - 1) & A02];
        while (i != -1) {
            long j = this.entries[i];
            if (((int) (j >>> 32)) == A02 && AbstractC50102Ry.A00(key, this.A06[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public static void A01(long[] jArr, int i, int i2, long j) {
        jArr[i2] = (j & (-4294967296L)) | (i & 4294967295L);
    }
}
