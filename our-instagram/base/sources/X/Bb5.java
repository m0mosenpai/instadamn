package X;

/* loaded from: classes5.dex */
public final class Bb5 extends AbstractC137436Ko {
    public final C28222CcS A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Bb5) {
                Bb5 bb5 = (Bb5) obj;
                if (!C14360o3.A0K(this.A01, bb5.A01) || !C14360o3.A0K(this.A00, bb5.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC166987dD.A0J(this.A01) + AbstractC25235BEs.A06(this.A00)) * 31;
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("LinkAnnotation.Clickable(tag=", this.A01);
    }

    public Bb5(C28222CcS c28222CcS, String str) {
        this.A01 = str;
        this.A00 = c28222CcS;
    }

    @Override // X.AbstractC137436Ko
    public final C28222CcS A00() {
        return this.A00;
    }
}
