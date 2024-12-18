package X;

/* loaded from: classes8.dex */
public final class M10 implements Runnable {
    public final /* synthetic */ C45466KBb A00;

    public M10(C45466KBb c45466KBb) {
        this.A00 = c45466KBb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45466KBb c45466KBb = this.A00;
        C45466KBb.A09(EnumC46303KeZ.A0A, c45466KBb);
        AbstractC167007dF.A0J().postDelayed(new RunnableC49879M0y(c45466KBb), 2000L);
    }
}
