package X;

/* loaded from: classes9.dex */
public final class PTN implements Runnable {
    public final /* synthetic */ InterfaceC58104PpT A00;
    public final /* synthetic */ C51380Mmf A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;

    public PTN(InterfaceC58104PpT interfaceC58104PpT, C51380Mmf c51380Mmf, Boolean bool, Integer num) {
        this.A01 = c51380Mmf;
        this.A00 = interfaceC58104PpT;
        this.A03 = num;
        this.A02 = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.E4Z(this.A00, this.A02, this.A03);
    }
}
