package X;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* renamed from: X.2f9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54522f9 {
    public C54532fA A00;
    public final SparseArray A01;

    public C54522f9(int i) {
        this.A01 = new SparseArray(i);
    }

    public final void A00(C54532fA c54532fA, int i, int i2) {
        int i3;
        int i4;
        C54542fB A00 = C54532fA.A00(c54532fA);
        int A002 = A00.A00(16);
        if (A002 != 0) {
            ByteBuffer byteBuffer = A00.A04;
            int i5 = A002 + A00.A00;
            i3 = byteBuffer.getInt(i5 + byteBuffer.getInt(i5) + 4 + (i * 4));
        } else {
            i3 = 0;
        }
        SparseArray sparseArray = this.A01;
        C54522f9 c54522f9 = (C54522f9) sparseArray.get(i3);
        if (c54522f9 == null) {
            c54522f9 = new C54522f9(1);
            C54542fB A003 = C54532fA.A00(c54532fA);
            int A004 = A003.A00(16);
            if (A004 != 0) {
                ByteBuffer byteBuffer2 = A003.A04;
                int i6 = A004 + A003.A00;
                i4 = byteBuffer2.getInt(i6 + byteBuffer2.getInt(i6) + 4 + (i * 4));
            } else {
                i4 = 0;
            }
            sparseArray.put(i4, c54522f9);
        }
        if (i2 > i) {
            c54522f9.A00(c54532fA, i + 1, i2);
        } else {
            c54522f9.A00 = c54532fA;
        }
    }

    public C54522f9() {
        this(1);
    }
}
