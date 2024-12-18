package X;

/* renamed from: X.3hI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79673hI extends C0T6 {
    public final long A00;
    public final long A01;
    public final C9BW A02;
    public final EnumC79653hG A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C79673hI) {
                C79673hI c79673hI = (C79673hI) obj;
                if (this.A04 != c79673hI.A04 || this.A03 != c79673hI.A03 || this.A01 != c79673hI.A01 || this.A00 != c79673hI.A00 || !C14360o3.A0K(this.A02, c79673hI.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int hashCode = ((i * 31) + this.A03.hashCode()) * 31;
        long j = this.A01;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A00;
        return ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A02.hashCode();
    }

    public C79673hI(C9BW c9bw, EnumC79653hG enumC79653hG, long j, long j2, boolean z) {
        this.A04 = z;
        this.A03 = enumC79653hG;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = c9bw;
    }
}
