package X;

/* renamed from: X.OLp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54830OLp {
    public final O1E A00;
    public final O1E A01;
    public final O1E A02;
    public final OX8 A03;
    public final OX8 A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
                C54830OLp c54830OLp = (C54830OLp) obj;
                if (!C14360o3.A0K(this.A02, c54830OLp.A02) || !C14360o3.A0K(this.A01, c54830OLp.A01) || !C14360o3.A0K(this.A00, c54830OLp.A00) || !C14360o3.A0K(this.A04, c54830OLp.A04) || !C14360o3.A0K(this.A03, c54830OLp.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)))) + AbstractC25235BEs.A06(this.A03);
    }

    public C54830OLp(O1E o1e, O1E o1e2, O1E o1e3, OX8 ox8, OX8 ox82) {
        this.A02 = o1e;
        this.A01 = o1e2;
        this.A00 = o1e3;
        this.A04 = ox8;
        this.A03 = ox82;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CombinedLoadStates(refresh=");
        A1C.append(this.A02);
        A1C.append(", prepend=");
        A1C.append(this.A01);
        A1C.append(", append=");
        A1C.append(this.A00);
        A1C.append(", source=");
        A1C.append(this.A04);
        A1C.append(", mediator=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
