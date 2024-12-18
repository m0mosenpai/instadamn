package X;

/* loaded from: classes10.dex */
public final class RD5 extends AnonymousClass558 {
    @Override // X.AnonymousClass558, X.AbstractC910944l
    public final AbstractC910944l A08(AbstractC910944l abstractC910944l) {
        if (((AnonymousClass558) this).A01 == abstractC910944l) {
            return this;
        }
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass558(((AbstractC911744t) this).A00, ((AnonymousClass558) this).A00, abstractC910944l, c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AnonymousClass558, X.AbstractC910944l
    public final AbstractC910944l A0A(AbstractC910944l abstractC910944l, C911244o c911244o, Class cls, AbstractC910944l[] abstractC910944lArr) {
        return new AnonymousClass558(abstractC910944l, ((AnonymousClass558) this).A00, ((AnonymousClass558) this).A01, c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, abstractC910944lArr, this.A03);
    }

    @Override // X.AnonymousClass558
    public final /* bridge */ /* synthetic */ AnonymousClass558 A0T(AbstractC910944l abstractC910944l) {
        if (abstractC910944l == ((AnonymousClass558) this).A00) {
            return this;
        }
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass558(((AbstractC911744t) this).A00, abstractC910944l, ((AnonymousClass558) this).A01, c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AnonymousClass558
    public final /* bridge */ /* synthetic */ AnonymousClass558 A0W(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass558(((AbstractC911744t) this).A00, ((AnonymousClass558) this).A00.A0F(obj), ((AnonymousClass558) this).A01, c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.RD5, X.558] */
    @Override // X.AnonymousClass558
    /* renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final RD5 A06() {
        if (this.A03) {
            return this;
        }
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass558(((AbstractC911744t) this).A00, ((AnonymousClass558) this).A00.A06(), ((AnonymousClass558) this).A01.A06(), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.RD5, X.558] */
    @Override // X.AnonymousClass558
    /* renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public final RD5 A0C(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass558(((AbstractC911744t) this).A00, ((AnonymousClass558) this).A00, ((AnonymousClass558) this).A01.A0E(obj), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.RD5, X.558] */
    @Override // X.AnonymousClass558
    /* renamed from: A0b, reason: merged with bridge method [inline-methods] */
    public final RD5 A0D(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass558(((AbstractC911744t) this).A00, ((AnonymousClass558) this).A00, ((AnonymousClass558) this).A01.A0F(obj), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RD5, X.558] */
    @Override // X.AnonymousClass558
    /* renamed from: A0c, reason: merged with bridge method [inline-methods] */
    public final RD5 A0E(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass558(((AbstractC911744t) this).A00, ((AnonymousClass558) this).A00, ((AnonymousClass558) this).A01, c911244o, cls, ((AbstractC910944l) this).A02, obj, ((AbstractC911744t) this).A02, this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RD5, X.558] */
    @Override // X.AnonymousClass558
    /* renamed from: A0d, reason: merged with bridge method [inline-methods] */
    public final RD5 A0F(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass558(((AbstractC911744t) this).A00, ((AnonymousClass558) this).A00, ((AnonymousClass558) this).A01, c911244o, cls, obj, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AnonymousClass558, X.AbstractC910944l
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[map type; class ");
        AbstractC58318PtA.A1Q(((AbstractC910944l) this).A00, A1C);
        AbstractC58318PtA.A1S(A1C);
        A1C.append(((AnonymousClass558) this).A00);
        A1C.append(" -> ");
        A1C.append(((AnonymousClass558) this).A01);
        return AbstractC58319PtB.A0w(A1C);
    }
}
