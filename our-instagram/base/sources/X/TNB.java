package X;

/* loaded from: classes10.dex */
public final class TNB implements Runnable {
    public final /* synthetic */ SMR A00;
    public final /* synthetic */ QF6 A01;

    public TNB(SMR smr, QF6 qf6) {
        this.A01 = qf6;
        this.A00 = smr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QF6 qf6 = this.A01;
        String A00 = this.A00.A00();
        C14360o3.A0A(A00);
        qf6.A0G(A00);
    }
}
