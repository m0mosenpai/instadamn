package X;

/* loaded from: classes5.dex */
public final class D1Z implements Runnable {
    public final /* synthetic */ C25869BcQ A00;
    public final /* synthetic */ String A01;

    public D1Z(C25869BcQ c25869BcQ, String str) {
        this.A01 = str;
        this.A00 = c25869BcQ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A04();
        c146106i8.A0H = "ai_studio_deletion_progress";
        c146106i8.A0D = this.A01;
        c146106i8.A0A(new C29314Cw9(this.A00, 4));
        AbstractC25233BEq.A1F(c146106i8);
    }
}
