package X;

/* renamed from: X.K8v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45408K8v extends AbstractC46365Kfn {
    public final C5QE A00;
    public final C5QE A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45408K8v) {
                C45408K8v c45408K8v = (C45408K8v) obj;
                if (!C14360o3.A0K(this.A01, c45408K8v.A01) || !C14360o3.A0K(this.A00, c45408K8v.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C45408K8v(C5QE c5qe, C5QE c5qe2) {
        this.A01 = c5qe;
        this.A00 = c5qe2;
    }
}
