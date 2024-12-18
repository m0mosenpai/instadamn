package X;

/* loaded from: classes8.dex */
public final class LRY implements InterfaceC65626Tpm {
    public C00X A00;
    public C00X A01;
    public boolean A02;
    public final C19L A03;
    public final InterfaceC24731Iq A04;
    public final AbstractC001300b A05;
    public final InterfaceC16820sZ A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.00g] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.00g] */
    @Override // X.InterfaceC65626Tpm
    public final void onCreate(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        AbstractC001300b abstractC001300b = this.A05;
        String A0R = AnonymousClass001.A0R("googleAuthFlow-", AbstractC45802KPh.__redex_internal_original_name);
        this.A00 = abstractC001300b.A01(new WPH(this, 0), new Object(), c07x, A0R);
        String A0R2 = AnonymousClass001.A0R("googleAuthWithNewClientFlow-", AbstractC45802KPh.__redex_internal_original_name);
        this.A01 = abstractC001300b.A01(new WPH(this, 1), new Object(), c07x, A0R2);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        this.A02 = true;
        this.A00 = null;
        this.A01 = null;
        this.A06.invoke();
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public LRY(AbstractC001300b abstractC001300b, InterfaceC16820sZ interfaceC16820sZ, C19L c19l, InterfaceC24731Iq interfaceC24731Iq) {
        AbstractC167017dG.A1R(abstractC001300b, interfaceC24731Iq);
        this.A05 = abstractC001300b;
        this.A04 = interfaceC24731Iq;
        this.A03 = c19l;
        this.A06 = interfaceC16820sZ;
    }
}
