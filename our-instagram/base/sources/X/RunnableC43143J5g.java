package X;

/* renamed from: X.J5g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43143J5g implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C909243j A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;

    public RunnableC43143J5g(C909243j c909243j, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        this.A01 = c909243j;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.DlE(this.A02, this.A03, this.A00);
    }
}
