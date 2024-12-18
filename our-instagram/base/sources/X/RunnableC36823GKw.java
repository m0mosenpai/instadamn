package X;

/* renamed from: X.GKw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36823GKw implements Runnable {
    public final /* synthetic */ ENl A00;

    public RunnableC36823GKw(ENl eNl) {
        this.A00 = eNl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ENl eNl = this.A00;
        AbstractC35212Fg5.A00(eNl.requireActivity(), eNl, eNl.getSession(), C17060sy.A01.A01(eNl.getSession()), "insights_accept_terms");
    }
}
