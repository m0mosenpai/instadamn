package X;

/* renamed from: X.Aqh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24338Aqh implements Runnable {
    public final /* synthetic */ C172007lV A00;

    public RunnableC24338Aqh(C172007lV c172007lV) {
        this.A00 = c172007lV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C172007lV c172007lV = this.A00;
        C189478aR A00 = new C189448aO(c172007lV.A01).A00();
        String str = c172007lV.A03;
        String A002 = AbstractC43591JPw.A00(39);
        String A003 = AbstractC111324zv.A00(2507);
        EEC eec = new EEC();
        eec.setArguments(AbstractC61636Rr0.A00(AbstractC167007dF.A1b(AbstractC111324zv.A00(44), str, AbstractC166987dD.A1L(AbstractC43591JPw.A00(68), A002), AbstractC166987dD.A1L(AbstractC43591JPw.A00(299), A003))));
        eec.A00 = new C23566AcK(0, c172007lV, A00);
        A00.A02(c172007lV.A00, eec);
    }
}
