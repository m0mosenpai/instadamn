package X;

/* loaded from: classes6.dex */
public final class GOI implements Runnable {
    public final /* synthetic */ ELH A00;
    public final /* synthetic */ Runnable A01;

    public GOI(ELH elh, Runnable runnable) {
        this.A00 = elh;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A06()) {
            this.A01.run();
        }
    }
}
