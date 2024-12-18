package X;

/* loaded from: classes8.dex */
public final class JTN extends C4F4 {
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JTN) {
                JTN jtn = (JTN) obj;
                if (this.A00 != jtn.A00 || !C14360o3.A0K(this.A01, jtn.A01) || this.A02 != jtn.A02 || !C14360o3.A0K(this.A03, jtn.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC167007dF.A0D(this.A02, AbstractC166997dE.A0K(this.A01, this.A00 * 31)));
    }

    public JTN(String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
        this.A03 = str2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
