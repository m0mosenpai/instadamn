package X;

/* renamed from: X.E5c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32024E5c extends C0T6 {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32024E5c) {
                C32024E5c c32024E5c = (C32024E5c) obj;
                if (!C14360o3.A0K(this.A02, c32024E5c.A02) || this.A04 != c32024E5c.A04 || this.A03 != c32024E5c.A03 || this.A01 != c32024E5c.A01 || this.A00 != c32024E5c.A00 || this.A05 != c32024E5c.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, ((((AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC167017dG.A0O(this.A02) * 31)) * 31) + this.A01) * 31) + this.A00) * 31);
    }
}
