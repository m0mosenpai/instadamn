package X;

/* renamed from: X.XMv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72077XMv extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C58J A02;
    public final /* synthetic */ C5BP A03;
    public final /* synthetic */ C5AL A04;
    public final /* synthetic */ C59U A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72077XMv(C58J c58j, C5BP c5bp, C5AL c5al, C59U c59u, float f, long j, boolean z, boolean z2) {
        super(0);
        this.A05 = c59u;
        this.A02 = c58j;
        this.A04 = c5al;
        this.A01 = j;
        this.A03 = c5bp;
        this.A07 = z;
        this.A06 = z2;
        this.A00 = f;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C59U c59u = this.A05;
        C58J c58j = this.A02;
        C5AL c5al = this.A04;
        C58J A00 = AbstractC25295BHo.A00(c58j, c5al.ASv());
        long j = this.A01;
        C59U.A03(A00, this.A03, c5al, c59u, this.A00, j, this.A07, this.A06);
        return C0eB.A00;
    }
}
