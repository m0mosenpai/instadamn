package X;

import java.util.Arrays;

/* renamed from: X.15q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C221515q {
    public int A00;
    public long A01;
    public long A02;
    public boolean A03;
    public boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C221515q c221515q = (C221515q) obj;
            if (this.A04 != c221515q.A04 || this.A03 != c221515q.A03 || this.A01 != c221515q.A01 || this.A02 != c221515q.A02 || this.A00 != c221515q.A00) {
                return false;
            }
        }
        return true;
    }

    public static void A00(C221515q c221515q, C221515q c221515q2) {
        c221515q.A04 = c221515q2.A04;
        c221515q.A03 = c221515q2.A03;
        c221515q.A01 = c221515q2.A01;
        c221515q.A02 = c221515q2.A02;
        c221515q.A00 = c221515q2.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), Boolean.valueOf(this.A03), Long.valueOf(this.A01), Long.valueOf(this.A02), Integer.valueOf(this.A00)});
    }
}
