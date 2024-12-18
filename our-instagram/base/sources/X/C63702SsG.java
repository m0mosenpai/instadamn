package X;

/* renamed from: X.SsG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63702SsG implements InterfaceC65468Tkk {
    public final int A00;
    public final Object A01;

    public C63702SsG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65468Tkk
    public final void CzL() {
        if (this.A00 != 0) {
            RunnableC64730TRm runnableC64730TRm = (RunnableC64730TRm) this.A01;
            runnableC64730TRm.A01.A00.Ci3(null, null, "client_init_iap_store_connection_stopped");
            runnableC64730TRm.A02.EnA(this, false);
        }
    }

    @Override // X.InterfaceC65468Tkk
    public final void CzM(SYG syg) {
        if (this.A00 == 0) {
            C14360o3.A0B(syg, 0);
            if (syg.A00 != 0) {
                ((SPD) this.A01).A00 = false;
            }
            SPD spd = (SPD) this.A01;
            spd.A02(spd);
        }
    }
}
