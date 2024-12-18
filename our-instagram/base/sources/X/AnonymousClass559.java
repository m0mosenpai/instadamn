package X;

/* renamed from: X.559, reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass559 extends AbstractC911744t {
    public final AbstractC910944l A00;

    @Override // X.AbstractC910944l
    public final boolean A0M() {
        return true;
    }

    @Override // X.AbstractC910944l
    public final boolean A0N() {
        return true;
    }

    @Override // X.AbstractC910944l
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            AnonymousClass559 anonymousClass559 = (AnonymousClass559) obj;
            if (((AbstractC910944l) this).A00 != ((AbstractC910944l) anonymousClass559).A00 || !this.A00.equals(anonymousClass559.A00)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A03() {
        return this.A00;
    }

    @Override // X.AbstractC910944l
    public AbstractC910944l A08(AbstractC910944l abstractC910944l) {
        if (this.A00 == abstractC910944l) {
            return this;
        }
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, abstractC910944l, c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AbstractC910944l
    public AbstractC910944l A0A(AbstractC910944l abstractC910944l, C911244o c911244o, Class cls, AbstractC910944l[] abstractC910944lArr) {
        return new AnonymousClass559(abstractC910944l, this.A00, c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, abstractC910944lArr, this.A03);
    }

    @Override // X.AbstractC910944l
    public final StringBuilder A0H(StringBuilder sb) {
        AbstractC911744t.A01(((AbstractC910944l) this).A00, sb, true);
        return sb;
    }

    @Override // X.AbstractC910944l
    public final StringBuilder A0I(StringBuilder sb) {
        AbstractC911744t.A01(((AbstractC910944l) this).A00, sb, false);
        sb.append('<');
        this.A00.A0I(sb);
        sb.append(">;");
        return sb;
    }

    @Override // X.AbstractC911744t
    public final String A0R() {
        StringBuilder sb = new StringBuilder();
        Class cls = ((AbstractC910944l) this).A00;
        sb.append(cls.getName());
        AbstractC910944l abstractC910944l = this.A00;
        if (abstractC910944l != null && cls.getTypeParameters().length == 1) {
            sb.append('<');
            sb.append(((AbstractC911744t) abstractC910944l).A0R());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override // X.AbstractC910944l
    /* renamed from: A0S, reason: merged with bridge method [inline-methods] */
    public AnonymousClass559 A06() {
        if (this.A03) {
            return this;
        }
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, this.A00.A06(), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, true);
    }

    @Override // X.AbstractC910944l
    /* renamed from: A0T, reason: merged with bridge method [inline-methods] */
    public AnonymousClass559 A0C(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, this.A00.A0E(obj), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AbstractC910944l
    /* renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public AnonymousClass559 A0D(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, this.A00.A0F(obj), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AbstractC910944l
    /* renamed from: A0V, reason: merged with bridge method [inline-methods] */
    public AnonymousClass559 A0E(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, this.A00, c911244o, cls, ((AbstractC910944l) this).A02, obj, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AbstractC910944l
    /* renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public AnonymousClass559 A0F(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, this.A00, c911244o, cls, obj, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AbstractC910944l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[collection-like type; class ");
        sb.append(((AbstractC910944l) this).A00.getName());
        sb.append(", contains ");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }

    public AnonymousClass559(AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, C911244o c911244o, Class cls, Object obj, Object obj2, AbstractC910944l[] abstractC910944lArr, boolean z) {
        super(abstractC910944l, c911244o, cls, obj, obj2, abstractC910944lArr, abstractC910944l2.hashCode(), z);
        this.A00 = abstractC910944l2;
    }

    @Override // X.AbstractC910944l
    public final AbstractC910944l A09(AbstractC910944l abstractC910944l) {
        AbstractC910944l abstractC910944l2;
        AbstractC910944l A09;
        AbstractC910944l A092 = super.A09(abstractC910944l);
        AbstractC910944l A03 = abstractC910944l.A03();
        if (A03 != null && (A09 = (abstractC910944l2 = this.A00).A09(A03)) != abstractC910944l2) {
            return A092.A08(A09);
        }
        return A092;
    }

    @Override // X.AbstractC910944l
    public final boolean A0K() {
        if (!super.A0K() && !this.A00.A0K()) {
            return false;
        }
        return true;
    }
}
