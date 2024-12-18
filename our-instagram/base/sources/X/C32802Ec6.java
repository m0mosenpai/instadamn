package X;

/* renamed from: X.Ec6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32802Ec6 extends AbstractC33539EsD {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32802Ec6) {
                C32802Ec6 c32802Ec6 = (C32802Ec6) obj;
                if (!C14360o3.A0K(this.A00, c32802Ec6.A00) || this.A01 != c32802Ec6.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }

    public C32802Ec6(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
