package X;

import java.util.Arrays;

/* renamed from: X.41n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C905241n {
    public final int A00;
    public final int A01;
    public final long A02;
    public final int A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C905241n)) {
            return false;
        }
        return C14360o3.A0K(((C905241n) obj).A04, this.A04);
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        return this.A04;
    }

    public C905241n(int i) {
        this.A02 = 0L;
        this.A00 = -1;
        this.A01 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(0L);
        sb.append(':');
        sb.append(-1);
        sb.append(':');
        sb.append(i);
        this.A04 = sb.toString();
        this.A03 = (int) System.currentTimeMillis();
    }

    public C905241n(long j, int i, int i2) {
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(':');
        sb.append(i);
        sb.append(':');
        sb.append(i2);
        this.A04 = sb.toString();
        this.A03 = Arrays.hashCode(new Object[]{Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }
}
