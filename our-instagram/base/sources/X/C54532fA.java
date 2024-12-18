package X;

import java.nio.ByteBuffer;

/* renamed from: X.2fA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54532fA {
    public static final ThreadLocal A03 = new ThreadLocal();
    public final int A00;
    public final C54502f7 A01;
    public volatile int A02 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.2f5, java.lang.Object] */
    public static C54542fB A00(C54532fA c54532fA) {
        short s;
        ThreadLocal threadLocal = A03;
        C54542fB c54542fB = (C54542fB) threadLocal.get();
        C54542fB c54542fB2 = c54542fB;
        if (c54542fB == null) {
            ?? c2f5 = new C2f5();
            threadLocal.set(c2f5);
            c54542fB2 = c2f5;
        }
        C2f4 c2f4 = c54532fA.A01.A02;
        int i = c54532fA.A00;
        int A00 = c2f4.A00(6);
        if (A00 != 0) {
            int i2 = A00 + c2f4.A00;
            int i3 = i2 + c2f4.A04.getInt(i2) + 4 + (i * 4);
            int i4 = i3 + c2f4.A04.getInt(i3);
            ByteBuffer byteBuffer = c2f4.A04;
            c54542fB2.A04 = byteBuffer;
            if (byteBuffer != null) {
                c54542fB2.A00 = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                c54542fB2.A02 = i5;
                s = c54542fB2.A04.getShort(i5);
            } else {
                s = 0;
                c54542fB2.A00 = 0;
                c54542fB2.A02 = 0;
            }
            c54542fB2.A01 = s;
        }
        return c54542fB2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C54542fB A00 = A00(this);
        int A002 = A00.A00(4);
        if (A002 != 0) {
            i = A00.A04.getInt(A002 + A00.A00);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(AbstractC58317Pt9.A00(425));
        C54542fB A003 = A00(this);
        int A004 = A003.A00(16);
        if (A004 != 0) {
            int i3 = A004 + A003.A00;
            int i4 = A003.A04.getInt(i3 + A003.A04.getInt(i3));
            for (int i5 = 0; i5 < i4; i5++) {
                C54542fB A005 = A00(this);
                int A006 = A005.A00(16);
                if (A006 != 0) {
                    ByteBuffer byteBuffer = A005.A04;
                    int i6 = A006 + A005.A00;
                    i2 = byteBuffer.getInt(i6 + byteBuffer.getInt(i6) + 4 + (i5 * 4));
                } else {
                    i2 = 0;
                }
                sb.append(Integer.toHexString(i2));
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public C54532fA(C54502f7 c54502f7, int i) {
        this.A01 = c54502f7;
        this.A00 = i;
    }
}
