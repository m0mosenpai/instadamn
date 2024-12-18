package X;

/* loaded from: classes6.dex */
public final class EUD extends C1P1 {
    public final /* synthetic */ ELT A00;

    public EUD(ELT elt) {
        this.A00 = elt;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C0f9.A0A(-1381908029, C0f9.A03(-1982378998));
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1523275232);
        super.onFinish();
        C6WQ c6wq = this.A00.A07;
        if (c6wq != null) {
            c6wq.hide();
        }
        C0f9.A0A(874880490, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1200553072);
        super.onStart();
        C6WQ c6wq = this.A00.A07;
        if (c6wq != null) {
            C0fJ.A00(c6wq);
        }
        C0f9.A0A(1446258348, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(814320771);
        int A032 = C0f9.A03(-125908266);
        ELT elt = this.A00;
        if (elt.getActivity() != null) {
            new AsyncTaskC31737Dwq(null, elt.A01, 0).execute(new Void[0]);
        }
        C0f9.A0A(1505290076, A032);
        C0f9.A0A(286186993, A03);
    }
}
