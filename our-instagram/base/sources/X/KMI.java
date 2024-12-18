package X;

/* loaded from: classes8.dex */
public final class KMI extends AbstractRunnableC14200nk {
    public final /* synthetic */ InterfaceC71793Kc A00;
    public final /* synthetic */ C27741Wc A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMI(InterfaceC71793Kc interfaceC71793Kc, C27741Wc c27741Wc, String str) {
        super(336);
        this.A01 = c27741Wc;
        this.A00 = interfaceC71793Kc;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC71793Kc interfaceC71793Kc = this.A00;
        interfaceC71793Kc.ASk();
        interfaceC71793Kc.EFr(this.A02);
    }
}
