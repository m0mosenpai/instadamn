package X;

/* renamed from: X.BaJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25780BaJ extends AbstractC137606Lg {
    public final /* synthetic */ C59T A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25780BaJ(C59T c59t) {
        super(c59t);
        this.A00 = c59t;
    }

    @Override // X.C59V
    public final int A0L(AbstractC122975hY abstractC122975hY) {
        int i;
        C121665fI c121665fI = ((AbstractC137606Lg) this).A04.A0H.A0U.A05;
        C14360o3.A0A(c121665fI);
        Number number = (Number) c121665fI.A0L().get(abstractC122975hY);
        if (number != null) {
            i = number.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        ((AbstractC137606Lg) this).A05.put(abstractC122975hY, Integer.valueOf(i));
        return i;
    }

    @Override // X.AbstractC137606Lg
    public final void A0Q() {
        C121665fI c121665fI = ((AbstractC137606Lg) this).A04.A0H.A0U.A05;
        C14360o3.A0A(c121665fI);
        c121665fI.A0N();
    }

    @Override // X.AbstractC137606Lg, X.InterfaceC1131659e
    public final int Cnj(int i) {
        C25283BGz A00 = AnonymousClass599.A00(((AbstractC137606Lg) this).A04.A0H);
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) A00.A00.getValue();
        AnonymousClass599 anonymousClass599 = A00.A01;
        return interfaceC1127857k.Cnk(anonymousClass599.A0W.A04, anonymousClass599.A0E(), i);
    }

    @Override // X.AbstractC137606Lg, X.InterfaceC1131659e
    public final int Cnm(int i) {
        C25283BGz A00 = AnonymousClass599.A00(((AbstractC137606Lg) this).A04.A0H);
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) A00.A00.getValue();
        AnonymousClass599 anonymousClass599 = A00.A01;
        return interfaceC1127857k.Cnn(anonymousClass599.A0W.A04, anonymousClass599.A0E(), i);
    }

    @Override // X.AbstractC137606Lg, X.InterfaceC1131659e
    public final int Cpe(int i) {
        C25283BGz A00 = AnonymousClass599.A00(((AbstractC137606Lg) this).A04.A0H);
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) A00.A00.getValue();
        AnonymousClass599 anonymousClass599 = A00.A01;
        return interfaceC1127857k.Cpf(anonymousClass599.A0W.A04, anonymousClass599.A0E(), i);
    }

    @Override // X.AbstractC137606Lg, X.InterfaceC1131659e
    public final int Cph(int i) {
        C25283BGz A00 = AnonymousClass599.A00(((AbstractC137606Lg) this).A04.A0H);
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) A00.A00.getValue();
        AnonymousClass599 anonymousClass599 = A00.A01;
        return interfaceC1127857k.Cpi(anonymousClass599.A0W.A04, anonymousClass599.A0E(), i);
    }

    @Override // X.InterfaceC1131559d
    public final C59W CpF(long j) {
        A0I(j);
        AnonymousClass599 anonymousClass599 = ((AbstractC137606Lg) this).A04.A0H;
        C57S A0A = anonymousClass599.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                C121665fI c121665fI = ((AnonymousClass599) objArr[i2]).A0U.A05;
                C14360o3.A0A(c121665fI);
                c121665fI.A05 = C05F.A0C;
                i2++;
            } while (i2 < i);
        }
        AbstractC137606Lg.A00(anonymousClass599.A07.CpD(this, anonymousClass599.A0E(), j), this);
        return this;
    }
}
