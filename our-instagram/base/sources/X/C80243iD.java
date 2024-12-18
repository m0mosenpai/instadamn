package X;

/* renamed from: X.3iD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80243iD extends C0T6 {
    public final int A00;
    public final int A01;
    public final C206279Bk A02;
    public final C38321qM A03;
    public final C75113Zb A04;
    public final C80223iB A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80243iD) {
                C80243iD c80243iD = (C80243iD) obj;
                if (this.A06 != c80243iD.A06 || this.A00 != c80243iD.A00 || this.A01 != c80243iD.A01 || !C14360o3.A0K(this.A05, c80243iD.A05) || !C14360o3.A0K(this.A04, c80243iD.A04) || !C14360o3.A0K(this.A02, c80243iD.A02) || !C14360o3.A0K(this.A03, c80243iD.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return (((((((((((i * 31) + this.A00) * 31) + this.A01) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public C80243iD(C206279Bk c206279Bk, C38321qM c38321qM, C75113Zb c75113Zb, C80223iB c80223iB, int i, int i2, boolean z) {
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = c80223iB;
        this.A04 = c75113Zb;
        this.A02 = c206279Bk;
        this.A03 = c38321qM;
    }
}
