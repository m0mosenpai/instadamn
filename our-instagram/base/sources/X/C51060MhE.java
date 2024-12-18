package X;

/* renamed from: X.MhE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51060MhE extends AbstractC53628NnZ {
    public final OX8 A00;
    public final OX8 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51060MhE) {
                C51060MhE c51060MhE = (C51060MhE) obj;
                if (!C14360o3.A0K(this.A01, c51060MhE.A01) || !C14360o3.A0K(this.A00, c51060MhE.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        OX8 ox8 = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: ");
        A1C.append(this.A01);
        return AbstractC16490ru.A0q(AnonymousClass001.A0R(AbstractC50522MSa.A0l(ox8, "\n                    ", A1C), "|)"), "|");
    }

    public C51060MhE(OX8 ox8, OX8 ox82) {
        this.A01 = ox8;
        this.A00 = ox82;
    }
}
