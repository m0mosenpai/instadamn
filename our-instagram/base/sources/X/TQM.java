package X;

/* loaded from: classes10.dex */
public final class TQM implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InterfaceC65459TkV A02;

    public TQM(InterfaceC65459TkV interfaceC65459TkV, long j, long j2) {
        this.A00 = j;
        this.A02 = interfaceC65459TkV;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.A00;
        if (j > 0) {
            this.A02.DaB(j);
        } else {
            this.A02.DaB(this.A01);
        }
    }
}
