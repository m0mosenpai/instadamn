package X;

/* loaded from: classes6.dex */
public final class ETL extends C1P1 {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ InterfaceC37261GbE A01;
    public final /* synthetic */ C33971ix A02;
    public final /* synthetic */ C33941iu A03;
    public final /* synthetic */ C47Z A04;

    public ETL(InterfaceC37261GbE interfaceC37261GbE, InterfaceC37261GbE interfaceC37261GbE2, C33971ix c33971ix, C33941iu c33941iu, C47Z c47z) {
        this.A00 = interfaceC37261GbE;
        this.A03 = c33941iu;
        this.A02 = c33971ix;
        this.A04 = c47z;
        this.A01 = interfaceC37261GbE2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 559883455);
        InterfaceC37261GbE interfaceC37261GbE = this.A00;
        InterfaceC37261GbE.A00(interfaceC37261GbE);
        interfaceC37261GbE.DUq(AbstractC35240FgZ.A01(abstractC115105If, AbstractC35240FgZ.A00), null);
        C0f9.A0A(852918018, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1851569455);
        EDZ edz = (EDZ) obj;
        int A0N = AbstractC167017dG.A0N(edz, 1313865032);
        String str = edz.A01;
        if (str != null) {
            C33941iu c33941iu = this.A03;
            ((AbstractC33951iv) c33941iu).A03 = str;
            c33941iu.A01 = null;
            C33971ix.A00(this.A01, this.A02, c33941iu, this.A04, str);
            C0f9.A0A(-843382564, A0N);
            C0f9.A0A(507810892, A03);
            return;
        }
        C14360o3.A0F("collectionId");
        throw C00O.createAndThrow();
    }
}
