package X;

/* renamed from: X.PSl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57046PSl implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ P8T A01;
    public final /* synthetic */ boolean A02;

    public RunnableC57046PSl(P8T p8t, long j, boolean z) {
        this.A01 = p8t;
        this.A00 = j;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00.Cge(this.A00, this.A02);
    }
}
