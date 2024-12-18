package X;

/* loaded from: classes6.dex */
public final class Ef7 extends EUK {
    public final /* synthetic */ EfA A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef7(AbstractC32317ELg abstractC32317ELg, EfA efA) {
        super(abstractC32317ELg, null);
        this.A00 = efA;
    }

    @Override // X.EUK, X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-223272779);
        this.A00.A01.setVisibility(8);
        C0f9.A0A(1134051024, A03);
    }

    @Override // X.EUK, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-66290124);
        A00((ED6) obj);
        C0f9.A0A(433952448, A03);
    }
}
