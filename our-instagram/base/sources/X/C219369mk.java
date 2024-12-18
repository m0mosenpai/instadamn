package X;

/* renamed from: X.9mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219369mk extends AbstractC223869uV {
    public final java.util.Set A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C219369mk) {
                C219369mk c219369mk = (C219369mk) obj;
                if (!C14360o3.A0K(this.A00, c219369mk.A00) || this.A01 != c219369mk.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C219369mk(java.util.Set set, boolean z) {
        this.A00 = set;
        this.A01 = z;
    }

    public C219369mk() {
        this(C16910sj.A00, false);
    }
}
