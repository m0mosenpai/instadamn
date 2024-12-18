package X;

/* renamed from: X.NGe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52383NGe extends AbstractRunnableC14200nk {
    public final /* synthetic */ OVi A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    @Override // java.lang.Runnable
    public final void run() {
        OVi oVi = this.A00;
        if (oVi.A00 == null) {
            OVi.A00(oVi, this.A01);
        }
        C51759Mti c51759Mti = oVi.A00;
        if (c51759Mti != null) {
            this.A02.invoke(c51759Mti);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52383NGe(OVi oVi, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        super(1858782919, 2, false, false);
        this.A00 = oVi;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16660sJ;
    }
}
