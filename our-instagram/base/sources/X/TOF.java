package X;

/* loaded from: classes10.dex */
public final class TOF implements Runnable {
    public final /* synthetic */ C58638PzB A00;
    public final /* synthetic */ AbstractC62642SJz A01;

    public TOF(C58638PzB c58638PzB, AbstractC62642SJz abstractC62642SJz) {
        this.A00 = c58638PzB;
        this.A01 = abstractC62642SJz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48262Jq c48262Jq = this.A00.A00;
        synchronized (c48262Jq) {
            C48262Jq.A02(c48262Jq, this.A01, true);
            C48262Jq.A01(c48262Jq);
        }
    }
}
