package X;

/* renamed from: X.M6r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50028M6r implements Runnable {
    public final /* synthetic */ C131845xK A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ C47984LJj A03;
    public final /* synthetic */ boolean A04;

    public RunnableC50028M6r(C131845xK c131845xK, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, C47984LJj c47984LJj, boolean z) {
        this.A04 = z;
        this.A00 = c131845xK;
        this.A02 = interfaceC103384lE;
        this.A03 = c47984LJj;
        this.A01 = interfaceC103384lE2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A04) {
            C131845xK c131845xK = this.A00;
            InterfaceC103384lE interfaceC103384lE = this.A02;
            C131845xK.A00(c131845xK.A00, C6FW.A01, interfaceC103384lE);
            return;
        }
        this.A03.A02(this.A00, this.A01);
    }
}
