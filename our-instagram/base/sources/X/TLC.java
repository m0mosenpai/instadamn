package X;

/* loaded from: classes10.dex */
public final class TLC implements Runnable {
    public final /* synthetic */ QFS A00;

    public TLC(QFS qfs) {
        this.A00 = qfs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QFS qfs = this.A00;
        synchronized (qfs) {
            if (qfs.A04) {
                C61254Rjs c61254Rjs = new C61254Rjs(C05F.A0N);
                QFS.A00(qfs);
                qfs.A02(c61254Rjs);
            }
        }
    }
}
