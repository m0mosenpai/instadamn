package X;

/* renamed from: X.JuO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44910JuO extends AbstractC46356Kfe {
    public final String A00;
    public final boolean A01;

    public C44910JuO(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44910JuO) {
                C44910JuO c44910JuO = (C44910JuO) obj;
                if (!C14360o3.A0K(this.A00, c44910JuO.A00) || this.A01 != c44910JuO.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
    }
}
