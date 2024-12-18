package X;

/* loaded from: classes8.dex */
public final class M5U implements Runnable {
    public final /* synthetic */ FPB A00;
    public final /* synthetic */ C146106i8 A01;
    public final /* synthetic */ Boolean A02;

    public M5U(FPB fpb, C146106i8 c146106i8, Boolean bool) {
        this.A02 = bool;
        this.A01 = c146106i8;
        this.A00 = fpb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC31177DnL.A1b(this.A02)) {
            AbstractC31178DnM.A1N(C41451vu.A01, this.A01);
        } else {
            this.A00.A00("scheduled_message_delete_failed");
        }
    }
}
