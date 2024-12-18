package X;

/* renamed from: X.WqN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71232WqN implements Runnable {
    public final /* synthetic */ C69265VkZ A00;

    public RunnableC71232WqN(C69265VkZ c69265VkZ) {
        this.A00 = c69265VkZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69265VkZ c69265VkZ = this.A00;
        C1UC A03 = C6BQ.A03(c69265VkZ.A02);
        C6FC c6fc = c69265VkZ.A01;
        if (c6fc != null && c6fc.A00 && (A03 instanceof InterfaceC53732dC)) {
            ((InterfaceC53732dC) A03).EkV(false);
        }
    }
}
