package X;

/* loaded from: classes6.dex */
public final class EUF extends C1P1 {
    public final /* synthetic */ C31721DwQ A00;

    public EUF(C31721DwQ c31721DwQ) {
        this.A00 = c31721DwQ;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1272237474);
        AbstractC35254Fgn.A07(this.A00, abstractC115105If);
        C0f9.A0A(-504620455, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-6956792);
        AbstractC31179DnN.A0u(this.A00);
        C0f9.A0A(-1399182636, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(405000851);
        AbstractC31179DnN.A0v(this.A00);
        C0f9.A0A(1124345773, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1842443580);
        int A032 = C0f9.A03(-896140017);
        this.A00.requireView().post(new RunnableC36908GOd((EDW) obj, this));
        C0f9.A0A(596130800, A032);
        C0f9.A0A(-1141741925, A03);
    }
}
