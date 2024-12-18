package X;

/* loaded from: classes9.dex */
public final class OLh {
    public Object A00;
    public boolean A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
                OLh oLh = (OLh) obj;
                if (this.A01 != oLh.A01 || !C14360o3.A0K(this.A00, oLh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A01) {
            return AbstractC25235BEs.A06(this.A00);
        }
        return super.hashCode();
    }

    public final String toString() {
        if (this.A01) {
            return String.valueOf(this.A00);
        }
        return "[Error] Uninitialized";
    }

    public OLh(String str) {
        this.A02 = str;
    }
}
