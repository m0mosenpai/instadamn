package X;

/* renamed from: X.3h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79553h6 extends C0T6 {
    public final long A00;
    public final long A01;
    public final C75363a3 A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C79553h6) {
                C79553h6 c79553h6 = (C79553h6) obj;
                if (this.A04 != c79553h6.A04 || this.A01 != c79553h6.A01 || this.A00 != c79553h6.A00 || !C14360o3.A0K(this.A02, c79553h6.A02) || this.A03 != c79553h6.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        long j = this.A01;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A00;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C75363a3 c75363a3 = this.A02;
        if (c75363a3 == null) {
            hashCode = 0;
        } else {
            hashCode = c75363a3.hashCode();
        }
        int i4 = (i3 + hashCode) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public C79553h6(C75363a3 c75363a3, long j, long j2, boolean z, boolean z2) {
        this.A04 = z;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = c75363a3;
        this.A03 = z2;
    }
}
