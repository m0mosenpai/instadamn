package X;

/* loaded from: classes9.dex */
public final class MUj extends C0T6 implements InterfaceC58061Pom {
    public final InterfaceC16660sJ A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MUj) {
                MUj mUj = (MUj) obj;
                if (!C14360o3.A0K(this.A01, mUj.A01) || !C14360o3.A0K(this.A00, mUj.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58061Pom
    public final InterfaceC16660sJ BVs() {
        return this.A00;
    }

    @Override // X.InterfaceC58061Pom
    public final Object BWw() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0M(this.A01) * 31);
    }

    public MUj(InterfaceC16660sJ interfaceC16660sJ, Object obj) {
        this.A01 = obj;
        this.A00 = interfaceC16660sJ;
    }
}
