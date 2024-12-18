package X;

/* loaded from: classes10.dex */
public final class RD7 extends AbstractC911744t {
    public AbstractC910944l A00;
    public final int A01;

    @Override // X.AbstractC910944l
    public final boolean A0N() {
        return false;
    }

    public RD7(int i) {
        super(C910844k.A07, C911244o.A04, Object.class, null, null, null, 1, false);
        this.A01 = i;
    }

    private void A00() {
        throw AbstractC166987dD.A1D(AnonymousClass001.A0R("Operation should not be attempted on ", MSY.A0h(this)));
    }

    @Override // X.AbstractC910944l
    public final StringBuilder A0H(StringBuilder sb) {
        sb.append('$');
        sb.append(this.A01 + 1);
        return sb;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A06() {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A08(AbstractC910944l abstractC910944l) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0A(AbstractC910944l abstractC910944l, C911244o c911244o, Class cls, AbstractC910944l[] abstractC910944lArr) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0C(Object obj) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0D(Object obj) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0E(Object obj) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0F(Object obj) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC910944l
    public final StringBuilder A0I(StringBuilder sb) {
        A0H(sb);
        return sb;
    }

    @Override // X.AbstractC911744t
    public final String A0R() {
        return toString();
    }

    @Override // X.AbstractC910944l
    public final boolean equals(Object obj) {
        return AbstractC167007dF.A1X(obj, this);
    }

    @Override // X.AbstractC910944l
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A0H(A1C);
        return A1C.toString();
    }
}
