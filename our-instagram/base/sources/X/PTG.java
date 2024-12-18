package X;

/* loaded from: classes9.dex */
public final class PTG implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC57942Pmm A02;
    public final /* synthetic */ String A03;

    public PTG(InterfaceC57942Pmm interfaceC57942Pmm, String str, int i, int i2) {
        this.A02 = interfaceC57942Pmm;
        this.A03 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.DqD(this.A03, this.A01, this.A00);
    }
}
