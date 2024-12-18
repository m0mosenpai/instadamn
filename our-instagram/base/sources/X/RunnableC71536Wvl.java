package X;

/* renamed from: X.Wvl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71536Wvl implements Runnable {
    public final /* synthetic */ InterfaceC65636Tpx A00;
    public final /* synthetic */ C70452WWf A01;
    public final /* synthetic */ String A02;

    public RunnableC71536Wvl(InterfaceC65636Tpx interfaceC65636Tpx, C70452WWf c70452WWf, String str) {
        this.A01 = c70452WWf;
        this.A02 = str;
        this.A00 = interfaceC65636Tpx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70452WWf c70452WWf = this.A01;
        c70452WWf.A00.BuS(new WUD(this.A00, c70452WWf.A01), this.A02);
    }
}
