package X;

/* renamed from: X.DHw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29934DHw extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29934DHw(InterfaceC74963Ym interfaceC74963Ym, int i, long j, long j2, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A04 = z;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = z2;
        this.A03 = interfaceC74963Ym;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        long j2;
        if (this.A00 != 0) {
            C137576Ld c137576Ld = (C137576Ld) obj;
            C14360o3.A0B(c137576Ld, 0);
            boolean z = this.A04;
            return c137576Ld.A00(new C29934DHw((InterfaceC74963Ym) this.A03, 0, this.A02, this.A01, z, this.A05));
        }
        InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
        AbstractC25230BEn.A19(interfaceC1129057z);
        if (this.A04) {
            j = this.A02;
        } else {
            j = this.A01;
        }
        if (this.A05) {
            j2 = AbstractC119395aw.A00(C5YC.A02(interfaceC1129057z.Bxc()) * (1.0f - (AbstractC25231BEo.A05((InterfaceC74963Ym) this.A03) / 100.0f)), 0.0f);
        } else {
            j2 = 0;
        }
        interfaceC1129057z.AR1(null, C119815bf.A00, 1.0f, 4, j, j2, C5YB.A00(C5YC.A02(interfaceC1129057z.Bxc()) * (AbstractC25231BEo.A05((InterfaceC74963Ym) this.A03) / 100.0f), AbstractC25229BEm.A00(interfaceC1129057z)));
        return C0eB.A00;
    }
}
