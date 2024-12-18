package X;

/* renamed from: X.NHm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52416NHm extends AbstractC187378Sf {
    public final int A00;

    public C52416NHm(int i) {
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52416NHm) && this.A00 == ((C52416NHm) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AbstractC25235BEs.A0q("AudioOptionsState(selectedIndex=", this.A00);
    }

    public C52416NHm() {
        this(-1);
    }
}
