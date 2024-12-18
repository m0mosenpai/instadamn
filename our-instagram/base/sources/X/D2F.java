package X;

/* loaded from: classes5.dex */
public final class D2F implements Runnable {
    public final /* synthetic */ C45124Jxt A00;
    public final /* synthetic */ C51757Mtg A01;
    public final /* synthetic */ BKZ A02;

    public D2F(C45124Jxt c45124Jxt, C51757Mtg c51757Mtg, BKZ bkz) {
        this.A02 = bkz;
        this.A00 = c45124Jxt;
        this.A01 = c51757Mtg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BKZ.A00(this.A00, this.A01, this.A02, true);
    }
}
