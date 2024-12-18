package X;

/* renamed from: X.K8u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45407K8u extends AbstractC46365Kfn {
    public final C2Fb A00;
    public final String A01;

    public C45407K8u(C2Fb c2Fb, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c2Fb;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45407K8u) {
                C45407K8u c45407K8u = (C45407K8u) obj;
                if (!C14360o3.A0K(this.A01, c45407K8u.A01) || this.A00 != c45407K8u.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
