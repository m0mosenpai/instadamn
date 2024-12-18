package X;

/* renamed from: X.NJd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52459NJd extends AbstractC53465Nks {
    public final String A00;
    public final boolean A01;

    public C52459NJd() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52459NJd) {
                C52459NJd c52459NJd = (C52459NJd) obj;
                if (this.A01 != c52459NJd.A01 || !C14360o3.A0K(this.A00, c52459NJd.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + AbstractC167017dG.A0O(this.A00);
    }

    public C52459NJd(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
