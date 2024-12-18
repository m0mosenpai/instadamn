package X;

/* renamed from: X.PuB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58371PuB extends C1E5 {
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }

    public C58371PuB(Runnable runnable, C12k c12k, long j) {
        super.A00 = j;
        this.A01 = c12k;
        this.A00 = runnable;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Task[");
        Runnable runnable = this.A00;
        A1C.append(AbstractC31173DnH.A0q(runnable));
        A1C.append('@');
        AbstractC58318PtA.A1T(A1C, System.identityHashCode(runnable));
        A1C.append(", ");
        A1C.append(super.A00);
        A1C.append(", ");
        A1C.append(this.A01);
        return AbstractC58320PtC.A14(A1C);
    }
}
