package X;

/* renamed from: X.M4u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49979M4u implements Runnable {
    public final /* synthetic */ AbstractC56582ir A00;
    public final /* synthetic */ EnumC53112NeP A01;
    public final /* synthetic */ C161167Kb A02;

    public RunnableC49979M4u(AbstractC56582ir abstractC56582ir, EnumC53112NeP enumC53112NeP, C161167Kb c161167Kb) {
        this.A02 = c161167Kb;
        this.A01 = enumC53112NeP;
        this.A00 = abstractC56582ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C161167Kb c161167Kb = this.A02;
        C161167Kb.A00(this.A00, this.A01, c161167Kb);
    }
}
