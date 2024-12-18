package X;

/* renamed from: X.BaK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25781BaK extends AbstractC137606Lg {
    public final /* synthetic */ C118815Zd A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25781BaK(C118815Zd c118815Zd) {
        super(c118815Zd);
        this.A00 = c118815Zd;
    }

    public static AbstractC137606Lg A02(C59U c59u) {
        C59U c59u2 = c59u.A06;
        C14360o3.A0A(c59u2);
        AbstractC137606Lg A0V = c59u2.A0V();
        C14360o3.A0A(A0V);
        return A0V;
    }

    @Override // X.AbstractC137606Lg, X.InterfaceC1131659e
    public final int Cnj(int i) {
        C118815Zd c118815Zd = this.A00;
        return c118815Zd.A01.Cnl(A02(c118815Zd), this, i);
    }

    @Override // X.AbstractC137606Lg, X.InterfaceC1131659e
    public final int Cnm(int i) {
        C118815Zd c118815Zd = this.A00;
        return c118815Zd.A01.Cno(A02(c118815Zd), this, i);
    }

    @Override // X.InterfaceC1131559d
    public final C59W CpF(long j) {
        C118815Zd c118815Zd = this.A00;
        A0I(j);
        AbstractC137606Lg.A00(c118815Zd.A01.CpE(A02(c118815Zd), this, j), this);
        return this;
    }

    @Override // X.AbstractC137606Lg, X.InterfaceC1131659e
    public final int Cpe(int i) {
        C118815Zd c118815Zd = this.A00;
        return c118815Zd.A01.Cpg(A02(c118815Zd), this, i);
    }

    @Override // X.AbstractC137606Lg, X.InterfaceC1131659e
    public final int Cph(int i) {
        C118815Zd c118815Zd = this.A00;
        return c118815Zd.A01.Cpj(A02(c118815Zd), this, i);
    }

    @Override // X.C59V
    public final int A0L(AbstractC122975hY abstractC122975hY) {
        int A00 = CBP.A00(abstractC122975hY, this);
        ((AbstractC137606Lg) this).A05.put(abstractC122975hY, Integer.valueOf(A00));
        return A00;
    }
}
