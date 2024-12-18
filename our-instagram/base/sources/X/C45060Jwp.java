package X;

/* renamed from: X.Jwp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45060Jwp extends C0T6 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45060Jwp) {
                C45060Jwp c45060Jwp = (C45060Jwp) obj;
                if (this.A01 != c45060Jwp.A01 || this.A00 != c45060Jwp.A00 || this.A06 != c45060Jwp.A06 || this.A03 != c45060Jwp.A03 || this.A02 != c45060Jwp.A02 || this.A05 != c45060Jwp.A05 || this.A04 != c45060Jwp.A04 || this.A07 != c45060Jwp.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A07, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A00, AbstractC25225BEi.A08(this.A01))))))));
    }

    public C45060Jwp(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A01 = z;
        this.A00 = z2;
        this.A06 = z3;
        this.A03 = z4;
        this.A02 = z5;
        this.A05 = z6;
        this.A04 = z7;
        this.A07 = z8;
    }
}
