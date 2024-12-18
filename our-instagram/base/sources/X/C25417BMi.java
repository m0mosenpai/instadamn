package X;

/* renamed from: X.BMi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25417BMi extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C2XI A00;
    public final /* synthetic */ C51762Yz A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C51762Yz A03;
    public final /* synthetic */ C51762Yz A04;
    public final /* synthetic */ BLI A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25417BMi(C2XI c2xi, C51762Yz c51762Yz, C51762Yz c51762Yz2, C51762Yz c51762Yz3, C51762Yz c51762Yz4, BLI bli, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        super(0);
        this.A00 = c2xi;
        this.A03 = c51762Yz;
        this.A05 = bli;
        this.A02 = c51762Yz2;
        this.A04 = c51762Yz3;
        this.A01 = c51762Yz4;
        this.A07 = z;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C2XI c2xi = this.A00;
        C51762Yz c51762Yz = this.A03;
        BLI bli = this.A05;
        return new C25418BMj(c2xi, c51762Yz, this.A02, this.A04, this.A01, bli, this.A06, this.A07);
    }
}
