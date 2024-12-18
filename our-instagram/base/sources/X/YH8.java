package X;

/* loaded from: classes12.dex */
public final class YH8 implements Runnable {
    public final /* synthetic */ C72827XoH A00;
    public final /* synthetic */ Throwable A01;

    public YH8(C72827XoH c72827XoH, Throwable th) {
        this.A00 = c72827XoH;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        YRH yrh = this.A00.A00;
        Throwable th = this.A01;
        if (th instanceof AbstractC223559ty) {
            i = ((AbstractC223559ty) th).A01;
        } else {
            i = 10000;
        }
        yrh.D2J(new AbstractC223559ty("Failed to capture using PhotoOutput", th, i));
    }
}
