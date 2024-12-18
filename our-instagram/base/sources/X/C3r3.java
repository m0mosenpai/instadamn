package X;

/* renamed from: X.3r3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3r3 extends C0T6 {
    public final int A00;
    public final int A01;
    public final C9BH A02;
    public final C75113Zb A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3r3) {
                C3r3 c3r3 = (C3r3) obj;
                if (!C14360o3.A0K(this.A03, c3r3.A03) || this.A04 != c3r3.A04 || this.A00 != c3r3.A00 || this.A01 != c3r3.A01 || !C14360o3.A0K(this.A02, c3r3.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A03.hashCode() * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return ((((((hashCode + i) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02.hashCode();
    }

    public C3r3(C9BH c9bh, C75113Zb c75113Zb, int i, int i2, boolean z) {
        this.A03 = c75113Zb;
        this.A04 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c9bh;
    }
}
