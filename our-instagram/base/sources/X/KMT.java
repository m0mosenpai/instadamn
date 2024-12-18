package X;

/* loaded from: classes8.dex */
public final class KMT extends AbstractRunnableC14200nk {
    public final /* synthetic */ C116155Nu A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ InterfaceC71793Kc A02;
    public final /* synthetic */ C27741Wc A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMT(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, InterfaceC71793Kc interfaceC71793Kc, C27741Wc c27741Wc, Runnable runnable, String str) {
        super(334, 3, true, true);
        this.A03 = c27741Wc;
        this.A02 = interfaceC71793Kc;
        this.A01 = abstractC12990ll;
        this.A05 = str;
        this.A00 = c116155Nu;
        this.A04 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC71793Kc interfaceC71793Kc = this.A02;
        interfaceC71793Kc.ASk();
        interfaceC71793Kc.A9Z(this.A00, this.A01, this.A04, this.A05);
    }
}
