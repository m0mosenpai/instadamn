package X;

/* loaded from: classes9.dex */
public final class PT1 implements Runnable {
    public final /* synthetic */ C82G A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C146836jL A02;

    public PT1(C82G c82g, C41181vS c41181vS, C146836jL c146836jL) {
        this.A02 = c146836jL;
        this.A01 = c41181vS;
        this.A00 = c82g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C146836jL c146836jL = this.A02;
        C146836jL.A01(this.A00, this.A01, c146836jL);
    }
}
