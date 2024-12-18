package X;

/* renamed from: X.HaT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39387HaT extends AbstractC39674Hj3 {
    public final C5QE A00;
    public final String A01;

    public C39387HaT(C5QE c5qe, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c5qe;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39387HaT) {
                C39387HaT c39387HaT = (C39387HaT) obj;
                if (!C14360o3.A0K(this.A00, c39387HaT.A00) || !C14360o3.A0K(this.A01, c39387HaT.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }
}
