package X;

/* renamed from: X.PSk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57045PSk implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ P8S A01;
    public final /* synthetic */ boolean A02;

    public RunnableC57045PSk(P8S p8s, long j, boolean z) {
        this.A01 = p8s;
        this.A00 = j;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A01.Cge(this.A00, this.A02);
    }
}
