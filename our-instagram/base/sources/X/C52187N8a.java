package X;

/* renamed from: X.N8a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52187N8a extends AbstractC53440NkT {
    public final String A00;
    public final boolean A01;

    public C52187N8a(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52187N8a) {
                C52187N8a c52187N8a = (C52187N8a) obj;
                if (!C14360o3.A0K(this.A00, c52187N8a.A00) || this.A01 != c52187N8a.A01) {
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
