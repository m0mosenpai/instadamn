package X;

/* loaded from: classes6.dex */
public final class EUB extends C1P1 {
    public final /* synthetic */ C33228ElK A00;

    public EUB(C33228ElK c33228ElK) {
        this.A00 = c33228ElK;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1566376291);
        super.onFail(abstractC115105If);
        AbstractC35254Fgn.A01(this.A00.getContext());
        C0f9.A0A(-1986269646, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(523113438);
        C33228ElK c33228ElK = this.A00;
        c33228ElK.A06 = false;
        AbstractC31178DnM.A0v(c33228ElK);
        C0f9.A0A(-1510055510, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1576833148);
        this.A00.A06 = true;
        C0f9.A0A(346729131, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1864025641);
        int A032 = C0f9.A03(439635299);
        C33228ElK.A00((EDU) obj, this.A00);
        C0f9.A0A(1658957792, A032);
        C0f9.A0A(628067210, A03);
    }
}
