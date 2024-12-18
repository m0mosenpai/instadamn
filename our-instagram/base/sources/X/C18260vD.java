package X;

/* renamed from: X.0vD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18260vD extends AbstractRunnableC14200nk {
    public final AbstractRunnableC14200nk A00;

    public C18260vD(AbstractRunnableC14200nk abstractRunnableC14200nk) {
        super(abstractRunnableC14200nk.runnableId, abstractRunnableC14200nk.priority, abstractRunnableC14200nk.isSendToNetworkThreadPool, abstractRunnableC14200nk.isMayRunDuringStartup);
        this.A00 = abstractRunnableC14200nk;
    }

    public final boolean equals(Object obj) {
        C18260vD c18260vD;
        AbstractRunnableC14200nk abstractRunnableC14200nk = this.A00;
        AbstractRunnableC14200nk abstractRunnableC14200nk2 = null;
        if ((obj instanceof C18260vD) && (c18260vD = (C18260vD) obj) != null) {
            abstractRunnableC14200nk2 = c18260vD.A00;
        }
        return C14360o3.A0K(abstractRunnableC14200nk, abstractRunnableC14200nk2);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf;
        if (Thread.interrupted()) {
            Object obj = AbstractC14420oE.A00.get();
            if (obj == null) {
                valueOf = "Unable to find runnable id.";
            } else {
                valueOf = String.valueOf(obj);
            }
            C0w9.A01.EmN("IgExecutor-Leaked-Interrupted-State-Pre-Execution", valueOf);
        }
        AbstractRunnableC14200nk abstractRunnableC14200nk = this.A00;
        abstractRunnableC14200nk.run();
        int i = abstractRunnableC14200nk.runnableId;
        try {
            if (Thread.interrupted()) {
                C0w9.A01.EmN("IgExecutor-Leaked-Interrupted-State-POST-Execution", String.valueOf(i));
            }
        } finally {
            AbstractC14420oE.A00.set(Integer.valueOf(i));
        }
    }
}
