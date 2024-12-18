package X;

/* renamed from: X.Moa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51489Moa extends AbstractC53425NkE {
    public final boolean A00;
    public final String A01;

    public C51489Moa(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51489Moa) {
                C51489Moa c51489Moa = (C51489Moa) obj;
                if (!C14360o3.A0K(this.A01, c51489Moa.A01) || this.A00 != c51489Moa.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
