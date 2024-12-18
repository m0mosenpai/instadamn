package X;

/* renamed from: X.TNb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64619TNb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4Q9 A01;

    public RunnableC64619TNb(C4Q9 c4q9, int i) {
        this.A00 = i;
        this.A01 = c4q9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A00;
        C4Q9 c4q9 = this.A01;
        if (i == -1) {
            c4q9.onFailure();
        } else {
            c4q9.onSuccess();
        }
    }
}
