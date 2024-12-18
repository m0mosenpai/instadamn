package X;

/* loaded from: classes12.dex */
public final class YIG implements Runnable {
    public final /* synthetic */ InterfaceC73607YNx A00;
    public final /* synthetic */ Xl5 A01;
    public final /* synthetic */ YD4 A02;

    public YIG(InterfaceC73607YNx interfaceC73607YNx, Xl5 xl5, YD4 yd4) {
        this.A02 = yd4;
        this.A01 = xl5;
        this.A00 = interfaceC73607YNx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Xl5 xl5 = this.A01;
        xl5.A00.A00.APm(this.A02.A00);
        this.A00.DD3(null);
    }
}
