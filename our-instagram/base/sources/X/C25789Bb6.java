package X;

/* renamed from: X.Bb6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25789Bb6 extends AbstractC137436Ko {
    public final C28222CcS A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25789Bb6) {
                C25789Bb6 c25789Bb6 = (C25789Bb6) obj;
                if (!C14360o3.A0K(this.A01, c25789Bb6.A01) || !C14360o3.A0K(this.A00, c25789Bb6.A00)) {
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
        return AbstractC25235BEs.A0r("LinkAnnotation.Url(url=", this.A01);
    }

    public C25789Bb6(C28222CcS c28222CcS, String str) {
        this.A01 = str;
        this.A00 = c28222CcS;
    }

    @Override // X.AbstractC137436Ko
    public final C28222CcS A00() {
        return this.A00;
    }
}
