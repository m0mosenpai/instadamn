package X;

/* renamed from: X.PTg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57067PTg implements Runnable {
    public final /* synthetic */ InterfaceC58104PpT A00;
    public final /* synthetic */ C51380Mmf A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public RunnableC57067PTg(InterfaceC58104PpT interfaceC58104PpT, C51380Mmf c51380Mmf, Boolean bool, Integer num, boolean z) {
        this.A01 = c51380Mmf;
        this.A00 = interfaceC58104PpT;
        this.A03 = num;
        this.A02 = bool;
        this.A04 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C51380Mmf c51380Mmf = this.A01;
        C51380Mmf.A00(this.A00, c51380Mmf, this.A02, this.A03, this.A04);
    }
}
