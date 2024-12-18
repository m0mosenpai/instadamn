package X;

/* renamed from: X.JwG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45025JwG extends C0T6 {
    public final int A00;
    public final AbstractC160207Gg A01;
    public final AbstractC160207Gg A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45025JwG) {
                C45025JwG c45025JwG = (C45025JwG) obj;
                if (!C14360o3.A0K(this.A01, c45025JwG.A01) || !C14360o3.A0K(this.A02, c45025JwG.A02) || this.A00 != c45025JwG.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A02)) * 31) + this.A00;
    }

    public C45025JwG(AbstractC160207Gg abstractC160207Gg, AbstractC160207Gg abstractC160207Gg2, int i) {
        this.A01 = abstractC160207Gg;
        this.A02 = abstractC160207Gg2;
        this.A00 = i;
    }
}
