package X;

/* loaded from: classes10.dex */
public final class RD4 extends AnonymousClass559 {
    @Override // X.AnonymousClass559, X.AbstractC910944l
    public final AbstractC910944l A08(AbstractC910944l abstractC910944l) {
        if (((AnonymousClass559) this).A00 == abstractC910944l) {
            return this;
        }
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, abstractC910944l, c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AnonymousClass559, X.AbstractC910944l
    public final AbstractC910944l A0A(AbstractC910944l abstractC910944l, C911244o c911244o, Class cls, AbstractC910944l[] abstractC910944lArr) {
        return new AnonymousClass559(abstractC910944l, ((AnonymousClass559) this).A00, c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, abstractC910944lArr, this.A03);
    }

    @Override // X.AnonymousClass559, X.AbstractC910944l
    public final /* bridge */ /* synthetic */ AbstractC910944l A0E(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, ((AnonymousClass559) this).A00, c911244o, cls, ((AbstractC910944l) this).A02, obj, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AnonymousClass559, X.AbstractC910944l
    public final /* bridge */ /* synthetic */ AbstractC910944l A0F(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, ((AnonymousClass559) this).A00, c911244o, cls, obj, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AnonymousClass559
    /* renamed from: A0V */
    public final /* bridge */ /* synthetic */ AnonymousClass559 A0E(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, ((AnonymousClass559) this).A00, c911244o, cls, ((AbstractC910944l) this).A02, obj, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AnonymousClass559
    /* renamed from: A0W */
    public final /* bridge */ /* synthetic */ AnonymousClass559 A0F(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, ((AnonymousClass559) this).A00, c911244o, cls, obj, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.RD4, X.559] */
    @Override // X.AnonymousClass559
    /* renamed from: A0X, reason: merged with bridge method [inline-methods] */
    public final RD4 A06() {
        if (this.A03) {
            return this;
        }
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, ((AnonymousClass559) this).A00.A06(), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.RD4, X.559] */
    @Override // X.AnonymousClass559
    /* renamed from: A0Y, reason: merged with bridge method [inline-methods] */
    public final RD4 A0C(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, ((AnonymousClass559) this).A00.A0E(obj), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.RD4, X.559] */
    @Override // X.AnonymousClass559
    /* renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final RD4 A0D(Object obj) {
        Class cls = ((AbstractC910944l) this).A00;
        C911244o c911244o = ((AbstractC911744t) this).A01;
        return new AnonymousClass559(((AbstractC911744t) this).A00, ((AnonymousClass559) this).A00.A0F(obj), c911244o, cls, ((AbstractC910944l) this).A02, ((AbstractC910944l) this).A01, ((AbstractC911744t) this).A02, this.A03);
    }

    @Override // X.AnonymousClass559, X.AbstractC910944l
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[collection type; class ");
        AbstractC58318PtA.A1Q(((AbstractC910944l) this).A00, A1C);
        A1C.append(", contains ");
        A1C.append(((AnonymousClass559) this).A00);
        return AbstractC58319PtB.A0w(A1C);
    }
}
