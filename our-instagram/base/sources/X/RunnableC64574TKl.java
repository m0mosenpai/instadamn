package X;

/* renamed from: X.TKl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64574TKl implements Runnable {
    public final /* synthetic */ SJI A00;

    public RunnableC64574TKl(SJI sji) {
        this.A00 = sji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SJI sji = this.A00;
        synchronized (sji) {
            if (!sji.A01) {
                sji.A06.invoke(C62792SRm.A00("Location request timed out", 3));
                C0fS.A01(sji.A03, sji.A04);
                sji.A01 = true;
            }
        }
    }
}
