package X;

/* renamed from: X.POc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56935POc implements Runnable {
    public final /* synthetic */ C56804PIv A00;

    public RunnableC56935POc(C56804PIv c56804PIv) {
        this.A00 = c56804PIv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56804PIv c56804PIv = this.A00;
        C25531Mh A03 = C56804PIv.A03(c56804PIv, C05F.A0Y);
        long j = c56804PIv.A00 + 1;
        c56804PIv.A00 = j;
        A03.A0Q("update_counter", Long.valueOf(j));
        A03.Cht();
        AbstractC50523MSb.A0j(c56804PIv.A0A, c56804PIv.A0G);
    }
}
