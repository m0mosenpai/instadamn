package X;

/* loaded from: classes9.dex */
public final class P1Q implements InterfaceC196338mP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public P1Q(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC196338mP
    public final /* synthetic */ void DeN() {
        if (1 - this.A00 == 0) {
            C146836jL c146836jL = (C146836jL) this.A03;
            C146836jL.A03((C41181vS) this.A02, (C211849aB) this.A01, c146836jL);
        }
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        switch (this.A00) {
            case 0:
                C214959fX c214959fX = (C214959fX) this.A03;
                Object obj = this.A02;
                Object obj2 = this.A01;
                AbstractC166987dD.A1Z(new C57160PZe(obj, obj2, null, 9), c214959fX.A0K);
                return;
            case 1:
                C146836jL c146836jL = (C146836jL) this.A03;
                AbstractC132005xa.A00(c146836jL.A07).A01(null);
                C146836jL.A03((C41181vS) this.A02, (C211849aB) this.A01, c146836jL);
                return;
            default:
                C146836jL c146836jL2 = (C146836jL) this.A03;
                C41181vS c41181vS = (C41181vS) this.A02;
                AbstractC167007dF.A0J().postDelayed(new PT1((C82G) this.A01, c41181vS, c146836jL2), 500L);
                return;
        }
    }
}
