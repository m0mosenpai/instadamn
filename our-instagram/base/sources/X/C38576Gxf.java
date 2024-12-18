package X;

/* renamed from: X.Gxf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38576Gxf extends C0T6 {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38576Gxf) {
                C38576Gxf c38576Gxf = (C38576Gxf) obj;
                if (this.A00 != c38576Gxf.A00 || !C14360o3.A0K(this.A01, c38576Gxf.A01) || !C14360o3.A0K(this.A03, c38576Gxf.A03) || !C14360o3.A0K(this.A02, c38576Gxf.A02) || this.A04 != c38576Gxf.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, (AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A01, this.A00 * 31)) + AbstractC167017dG.A0O(this.A02)) * 31);
    }
}
