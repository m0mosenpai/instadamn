package X;

/* renamed from: X.Cd5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28260Cd5 {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28260Cd5) {
                C28260Cd5 c28260Cd5 = (C28260Cd5) obj;
                if (this.A01 != c28260Cd5.A01 || this.A00 != c28260Cd5.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC25225BEi.A08(this.A01));
    }

    public C28260Cd5(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("InputComposerState(isVisible=");
        A1C.append(this.A01);
        A1C.append(", isDisabled=");
        return AbstractC25236BEt.A0a(A1C, this.A00);
    }

    public C28260Cd5() {
        this(true, true);
    }
}
