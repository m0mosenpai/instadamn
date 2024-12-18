package X;

import java.util.Arrays;

/* renamed from: X.4D4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4D4 implements C4D5 {
    public int A00;
    public char[] A01;

    public static final void A00(C4D4 c4d4, int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = c4d4.A01;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] copyOf = Arrays.copyOf(cArr, i3);
            C14360o3.A07(copyOf);
            c4d4.A01 = copyOf;
        }
    }

    @Override // X.C4D5
    public final void FEJ(String str) {
        C14360o3.A0B(str, 0);
        int length = str.length();
        if (length != 0) {
            A00(this, this.A00, length);
            str.getChars(0, length, this.A01, this.A00);
            this.A00 += length;
        }
    }

    public final void A01() {
        C4D6 c4d6 = C4D6.A02;
        char[] cArr = this.A01;
        C14360o3.A0B(cArr, 0);
        synchronized (c4d6) {
            int length = c4d6.A00 + cArr.length;
            if (length < C4DH.A00) {
                c4d6.A00 = length;
                c4d6.A01.addLast(cArr);
            }
        }
    }

    public final String toString() {
        return new String(this.A01, 0, this.A00);
    }

    public C4D4() {
        char[] cArr;
        C4D6 c4d6 = C4D6.A02;
        synchronized (c4d6) {
            cArr = (char[]) c4d6.A01.A0T();
            if (cArr != null) {
                c4d6.A00 -= cArr.length;
            } else {
                cArr = null;
            }
        }
        this.A01 = cArr == null ? new char[128] : cArr;
    }
}
