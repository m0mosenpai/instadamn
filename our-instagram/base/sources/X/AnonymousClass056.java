package X;

/* renamed from: X.056, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass056 extends C0UG {
    public final int A00;
    public final InterfaceC19390xP A01;

    @Override // X.C0UG
    public final Object A00(InterfaceC71543Iw interfaceC71543Iw, InterfaceC23621Ds interfaceC23621Ds) {
        int i = this.A00;
        int i2 = C13F.A00;
        C13A c13a = new C13A(i);
        C14830ox c14830ox = new C14830ox(interfaceC71543Iw);
        Object collect = this.A01.collect(new C14930p8((AnonymousClass195) interfaceC23621Ds.getContext().get(AnonymousClass195.A00), interfaceC71543Iw, c14830ox, c13a), interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }

    @Override // X.C0UG
    public final String A01() {
        return AnonymousClass001.A0O("concurrency=", this.A00);
    }

    @Override // X.C0UG
    public final InterfaceC24751Is A02(C19L c19l) {
        return AbstractC71523Is.A03(this.A02, new C0UH(null, this), c19l, super.A00);
    }

    @Override // X.C0UG
    public final C0UG A04(Integer num, C12W c12w, int i) {
        return new AnonymousClass056(num, c12w, this.A01, this.A00, i);
    }

    public AnonymousClass056(Integer num, C12W c12w, InterfaceC19390xP interfaceC19390xP, int i, int i2) {
        super(num, c12w, i2);
        this.A01 = interfaceC19390xP;
        this.A00 = i;
    }
}
