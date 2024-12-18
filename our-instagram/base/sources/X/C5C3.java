package X;

/* renamed from: X.5C3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5C3 {
    public static final C5C7 A03 = new C5C6(C5C5.A00, C5C4.A00);
    public final long A00;
    public final C5C8 A01;
    public final C5C2 A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5C3(java.lang.String r4, long r5) {
        /*
            r3 = this;
            r2 = 0
            X.0sl r1 = X.C16930sl.A00
            X.5C8 r0 = new X.5C8
            r0.<init>(r1, r1, r4)
            r3.<init>(r0, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5C3.<init>(java.lang.String, long):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5C3)) {
            return false;
        }
        C5C3 c5c3 = (C5C3) obj;
        return this.A00 == c5c3.A00 && C14360o3.A0K(this.A02, c5c3.A02) && C14360o3.A0K(this.A01, c5c3.A01);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A01.hashCode() * 31;
        long j = this.A00;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        C5C2 c5c2 = this.A02;
        if (c5c2 != null) {
            long j2 = c5c2.A00;
            i = (int) (j2 ^ (j2 >>> 32));
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextFieldValue(text='");
        sb.append((Object) this.A01);
        sb.append("', selection=");
        sb.append((Object) C5C2.A02(this.A00));
        sb.append(", composition=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C5C3(C5C8 c5c8, C5C2 c5c2, long j) {
        C5C2 c5c22;
        this.A01 = c5c8;
        int length = c5c8.A00.length();
        int i = (int) (j >> 32);
        int A032 = C17s.A03(i, 0, length);
        int i2 = (int) (j & 4294967295L);
        int A033 = C17s.A03(i2, 0, length);
        this.A00 = (A032 == i && A033 == i2) ? j : C60Z.A00(A032, A033);
        if (c5c2 != null) {
            long j2 = c5c2.A00;
            int i3 = (int) (j2 >> 32);
            int A034 = C17s.A03(i3, 0, length);
            int i4 = (int) (j2 & 4294967295L);
            int A035 = C17s.A03(i4, 0, length);
            c5c22 = new C5C2((A034 == i3 && A035 == i4) ? j2 : C60Z.A00(A034, A035));
        } else {
            c5c22 = null;
        }
        this.A02 = c5c22;
    }
}
