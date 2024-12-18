package X;

/* renamed from: X.5Zw, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Zw extends C58J implements InterfaceC113445Ag {
    public final float A00;
    public final C5Y1 A01 = AbstractC118385Xa.A00(1.0f);
    public final C5Y4 A02;
    public final C5Y4 A03;
    public final C5XP A04;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        C14360o3.A0B(interfaceC1129057z, 0);
        float floatValue = ((Number) this.A01.A04.A05.getValue()).floatValue();
        long Amh = interfaceC1129057z.Amh();
        AnonymousClass588 AzL = interfaceC1129057z.AzL();
        AnonymousClass587 anonymousClass587 = (AnonymousClass587) AzL;
        AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
        long j = anonymousClass586.A00;
        anonymousClass586.A01.ELZ();
        try {
            anonymousClass587.A01.ELz(Amh, floatValue, floatValue);
            interfaceC1129057z.AQf();
        } finally {
            anonymousClass586.A01.EKS();
            AzL.EeS(j);
        }
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }

    public C5Zw(C5XP c5xp, float f, float f2, float f3) {
        this.A04 = c5xp;
        this.A00 = f;
        this.A02 = new C5Y4(null, 0.5f, f2);
        this.A03 = new C5Y4(null, 0.5f, f3);
    }
}
