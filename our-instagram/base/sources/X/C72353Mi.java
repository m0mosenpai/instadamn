package X;

/* renamed from: X.3Mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72353Mi extends C0T6 implements InterfaceC41141vN {
    public final C38321qM A00;
    public final C75113Zb A01;
    public final boolean A02;
    public final boolean A03;

    public C72353Mi(C38321qM c38321qM, C75113Zb c75113Zb, boolean z, boolean z2) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A02 = z;
        this.A03 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72353Mi) {
                C72353Mi c72353Mi = (C72353Mi) obj;
                if (!C14360o3.A0K(this.A00, c72353Mi.A00) || !C14360o3.A0K(this.A01, c72353Mi.A01) || this.A02 != c72353Mi.A02 || this.A03 != c72353Mi.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
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
}
