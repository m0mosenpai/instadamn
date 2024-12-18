package X;

/* renamed from: X.0xQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19400xQ extends C0T6 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19400xQ) {
                C19400xQ c19400xQ = (C19400xQ) obj;
                if (!C14360o3.A0K(this.A01, c19400xQ.A01) || !C14360o3.A0K(this.A00, c19400xQ.A00) || this.A02 != c19400xQ.A02 || this.A03 != c19400xQ.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public C19400xQ(String str, String str2, boolean z, boolean z2) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
        this.A03 = z2;
    }
}
