package X;

import android.util.SparseIntArray;

/* renamed from: X.6wP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154146wP {
    public final SparseIntArray A02 = new SparseIntArray();
    public final SparseIntArray A01 = new SparseIntArray();
    public boolean A00 = false;

    public final int A02(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int A03 = A03(i);
        for (int i5 = 0; i5 < i; i5++) {
            int A032 = A03(i5);
            i4 += A032;
            if (i4 == i2) {
                i3++;
                i4 = 0;
            } else if (i4 > i2) {
                i3++;
                i4 = A032;
            }
        }
        if (i4 + A03 > i2) {
            return i3 + 1;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0049 -> B:24:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C154136wO
            if (r0 == 0) goto L7
            int r1 = r8 % r9
            return r1
        L7:
            int r4 = r7.A03(r8)
            r6 = 0
            if (r4 == r9) goto L5e
            boolean r0 = r7.A00
            if (r0 == 0) goto L2d
            android.util.SparseIntArray r5 = r7.A02
            int r0 = r5.size()
            int r0 = r0 + (-1)
            r1 = 0
        L1b:
            if (r1 > r0) goto L30
            int r2 = r1 + r0
            int r3 = r2 >>> 1
            int r2 = r5.keyAt(r3)
            if (r2 >= r8) goto L2a
            int r1 = r3 + 1
            goto L1b
        L2a:
            int r0 = r3 + (-1)
            goto L1b
        L2d:
            r2 = 0
            r1 = 0
            goto L4b
        L30:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L2d
            int r0 = r5.size()
            if (r1 >= r0) goto L2d
            int r2 = r5.keyAt(r1)
            if (r2 < 0) goto L2d
            int r1 = r5.get(r2)
            int r0 = r7.A03(r2)
            int r1 = r1 + r0
        L49:
            int r2 = r2 + 1
        L4b:
            if (r2 >= r8) goto L5a
            int r0 = r7.A03(r2)
            int r1 = r1 + r0
            if (r1 != r9) goto L56
            r1 = 0
            goto L49
        L56:
            if (r1 <= r9) goto L49
            r1 = r0
            goto L49
        L5a:
            int r4 = r4 + r1
            if (r4 > r9) goto L5e
            return r1
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC154146wP.A01(int, int):int");
    }

    public int A03(int i) {
        return 1;
    }
}
