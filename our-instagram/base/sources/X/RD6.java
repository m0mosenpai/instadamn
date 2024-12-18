package X;

/* loaded from: classes10.dex */
public final class RD6 extends AbstractC911744t {
    public AbstractC910944l A00;

    @Override // X.AbstractC910944l
    public final AbstractC910944l A06() {
        return this;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A08(AbstractC910944l abstractC910944l) {
        return this;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0A(AbstractC910944l abstractC910944l, C911244o c911244o, Class cls, AbstractC910944l[] abstractC910944lArr) {
        return null;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0C(Object obj) {
        return this;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0D(Object obj) {
        return this;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0E(Object obj) {
        return this;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A0F(Object obj) {
        return this;
    }

    @Override // X.AbstractC910944l
    public final boolean A0N() {
        return false;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A05() {
        AbstractC910944l abstractC910944l = this.A00;
        if (abstractC910944l != null) {
            return abstractC910944l.A05();
        }
        return ((AbstractC911744t) this).A00;
    }

    @Override // X.AbstractC910944l
    public final C911244o A0G() {
        AbstractC910944l abstractC910944l = this.A00;
        if (abstractC910944l != null) {
            return abstractC910944l.A0G();
        }
        return ((AbstractC911744t) this).A01;
    }

    @Override // X.AbstractC910944l
    public final StringBuilder A0H(StringBuilder sb) {
        AbstractC910944l abstractC910944l = this.A00;
        if (abstractC910944l != null) {
            return abstractC910944l.A0H(sb);
        }
        return sb;
    }

    @Override // X.AbstractC910944l
    public final StringBuilder A0I(StringBuilder sb) {
        AbstractC910944l abstractC910944l = this.A00;
        if (abstractC910944l != null) {
            return abstractC910944l.A0H(sb);
        }
        sb.append("?");
        return sb;
    }

    @Override // X.AbstractC910944l
    public final String toString() {
        String name;
        StringBuilder A0q = AbstractC58318PtA.A0q(40);
        A0q.append("[recursive type; ");
        AbstractC910944l abstractC910944l = this.A00;
        if (abstractC910944l == null) {
            name = "UNRESOLVED";
        } else {
            name = abstractC910944l.A00.getName();
        }
        return AbstractC166997dE.A0x(name, A0q);
    }

    @Override // X.AbstractC910944l
    public final boolean equals(Object obj) {
        return AbstractC167007dF.A1X(obj, this);
    }
}
