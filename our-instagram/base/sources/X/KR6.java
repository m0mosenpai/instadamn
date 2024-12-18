package X;

/* loaded from: classes8.dex */
public final class KR6 extends AbstractC46440Kh0 {
    public final C3o9 A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KR6) {
                KR6 kr6 = (KR6) obj;
                if (!C14360o3.A0K(this.A00, kr6.A00) || this.A01 != kr6.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public KR6(C3o9 c3o9, boolean z) {
        this.A00 = c3o9;
        this.A01 = z;
    }
}
