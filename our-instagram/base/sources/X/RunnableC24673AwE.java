package X;

/* renamed from: X.AwE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24673AwE implements Runnable {
    public final /* synthetic */ C219909nc A00;
    public final /* synthetic */ C219919nd A01;

    public RunnableC24673AwE(C219909nc c219909nc, C219919nd c219919nd) {
        this.A01 = c219919nd;
        this.A00 = c219909nc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C219909nc c219909nc;
        int i;
        if (!this.A01.A0N() && (i = (c219909nc = this.A00).A00) > 0) {
            c219909nc.A00 = i - 1;
            ((AbstractC208809Lo) c219909nc).A00.A03(null);
        }
    }
}
