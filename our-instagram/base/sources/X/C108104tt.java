package X;

/* renamed from: X.4tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108104tt {
    public final long A00;
    public final C1XV A01;
    public final Float A02;
    public final Long A03;
    public final String A04;
    public final byte[] A05;

    public C108104tt(C1XV c1xv, Float f, Long l, String str, byte[] bArr, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(bArr, 3);
        C14360o3.A0B(c1xv, 6);
        this.A04 = str;
        this.A02 = f;
        this.A05 = bArr;
        this.A03 = l;
        this.A00 = j;
        this.A01 = c1xv;
    }

    public final boolean equals(Object obj) {
        C108104tt c108104tt;
        if (this != obj) {
            if (obj instanceof C108104tt) {
                c108104tt = (C108104tt) obj;
            } else {
                c108104tt = null;
            }
            if (c108104tt == null || !C14360o3.A0K(this.A04, c108104tt.A04) || !C14360o3.A0J(this.A02, c108104tt.A02) || !C14360o3.A0K(this.A03, c108104tt.A03) || this.A00 != c108104tt.A00 || this.A01 != c108104tt.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A04.hashCode() * 31;
        Float f = this.A02;
        int i2 = 0;
        if (f != null) {
            i = f.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Long l = this.A03;
        if (l != null) {
            i2 = l.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        long j = this.A00;
        return ((i4 + ((int) (j ^ (j >>> 32)))) * 31) + this.A01.hashCode();
    }
}
