package X;

/* renamed from: X.GMa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36853GMa implements Runnable {
    public final /* synthetic */ ELY A00;

    public RunnableC36853GMa(ELY ely) {
        this.A00 = ely;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ELY ely = this.A00;
        if (ely.isResumed()) {
            AbstractC25226BEj.A1Q(ely);
        }
    }
}
