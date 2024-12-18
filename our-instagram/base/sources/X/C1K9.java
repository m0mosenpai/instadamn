package X;

/* renamed from: X.1K9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1K9 implements Runnable {
    public final /* synthetic */ AbstractRunnableC14200nk A00;
    public final /* synthetic */ C24801Iy A01;
    public final /* synthetic */ InterfaceC24681Il A02;
    public final /* synthetic */ boolean A03;

    public C1K9(AbstractRunnableC14200nk abstractRunnableC14200nk, C24801Iy c24801Iy, InterfaceC24681Il interfaceC24681Il, boolean z) {
        this.A01 = c24801Iy;
        this.A03 = z;
        this.A00 = abstractRunnableC14200nk;
        this.A02 = interfaceC24681Il;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A03;
        C24651Ii c24651Ii = this.A01.A00;
        AbstractRunnableC14200nk abstractRunnableC14200nk = this.A00;
        InterfaceC24681Il interfaceC24681Il = this.A02;
        if (z) {
            c24651Ii.A01(abstractRunnableC14200nk, interfaceC24681Il);
        } else {
            c24651Ii.A02(abstractRunnableC14200nk, interfaceC24681Il);
        }
    }
}
