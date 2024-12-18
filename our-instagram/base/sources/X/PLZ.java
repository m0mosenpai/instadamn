package X;

/* loaded from: classes9.dex */
public final class PLZ implements Runnable {
    public final /* synthetic */ C53611NnI A00;

    public PLZ(C53611NnI c53611NnI) {
        this.A00 = c53611NnI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C53611NnI c53611NnI = this.A00;
        P06 p06 = c53611NnI.A00;
        if (p06 != null) {
            c53611NnI.A00 = null;
            C11T.A04(new RunnableC56855PLa(p06), 17L);
        }
    }
}
