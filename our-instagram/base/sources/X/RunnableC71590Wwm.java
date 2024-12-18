package X;

/* renamed from: X.Wwm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71590Wwm implements Runnable {
    public final /* synthetic */ InterfaceC138736Qd A00;
    public final /* synthetic */ C6PT A01;
    public final /* synthetic */ AbstractC115825Lw A02;
    public final /* synthetic */ String A03;

    public RunnableC71590Wwm(InterfaceC138736Qd interfaceC138736Qd, C6PT c6pt, AbstractC115825Lw abstractC115825Lw, String str) {
        this.A02 = abstractC115825Lw;
        this.A01 = c6pt;
        this.A03 = str;
        this.A00 = interfaceC138736Qd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A02.AV8(this.A00, this.A01, this.A03, true);
        } catch (C902840n e) {
            C11T.A02(new RunnableC71260Wqp(new RunnableC71542Wvr(this.A01, e, this.A02)));
        }
    }
}
