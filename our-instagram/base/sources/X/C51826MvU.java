package X;

/* renamed from: X.MvU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51826MvU extends C0T6 implements InterfaceC58034PoK {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51826MvU) {
                C51826MvU c51826MvU = (C51826MvU) obj;
                if (!C14360o3.A0K(this.A02, c51826MvU.A02) || this.A04 != c51826MvU.A04 || !C14360o3.A0K(this.A03, c51826MvU.A03) || this.A00 != c51826MvU.A00 || this.A01 != c51826MvU.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58034PoK
    public final boolean Cce() {
        return this.A04;
    }

    @Override // X.InterfaceC58034PoK
    public final String getName() {
        return this.A02;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A04, AbstractC167017dG.A0O(this.A02) * 31) + AbstractC25227BEk.A07(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public C51826MvU(String str, String str2, int i, int i2, boolean z) {
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = i2;
    }
}
