package X;

/* loaded from: classes9.dex */
public final class NAA extends C1P1 {
    public final AbstractC154286wd A00;
    public final C154806xV A01;
    public final C11R A02;

    public NAA(C11R c11r, AbstractC154286wd abstractC154286wd, C154806xV c154806xV) {
        C14360o3.A0B(c154806xV, 2);
        this.A02 = c11r;
        this.A01 = c154806xV;
        this.A00 = abstractC154286wd;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1475272207);
        C154806xV c154806xV = this.A01;
        c154806xV.A01 = null;
        c154806xV.A00(C05F.A01);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(-1425992250, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1959791012);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(-1210725006, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1563496711);
        this.A00.onFinish();
        C0f9.A0A(-664548062, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1938740161);
        C154806xV c154806xV = this.A01;
        c154806xV.A00(C05F.A00);
        c154806xV.A01 = this.A02;
        this.A00.onStart();
        C0f9.A0A(1686848174, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-595769799);
        InterfaceC74303Vl interfaceC74303Vl = (InterfaceC74303Vl) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC74303Vl, -29321431);
        C154806xV c154806xV = this.A01;
        c154806xV.A01 = null;
        c154806xV.A00(C05F.A0C);
        c154806xV.A0A = interfaceC74303Vl.CQG();
        boolean CQT = interfaceC74303Vl.CQT();
        String nextMaxId = interfaceC74303Vl.getNextMaxId();
        if (CQT) {
            c154806xV.A06 = nextMaxId;
        } else {
            c154806xV.A07 = nextMaxId;
        }
        this.A00.onSuccess(interfaceC74303Vl);
        C0f9.A0A(1923467156, A0N);
        C0f9.A0A(-754235887, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(1490628625);
        int A0N = AbstractC167017dG.A0N(obj, -1120690383);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(1165528539, A0N);
        C0f9.A0A(-671140569, A03);
    }
}
