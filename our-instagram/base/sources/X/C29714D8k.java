package X;

/* renamed from: X.D8k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29714D8k extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC74953Yl A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29714D8k(InterfaceC74953Yl interfaceC74953Yl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(0);
        this.A05 = z;
        this.A02 = interfaceC16820sZ;
        this.A04 = z2;
        this.A03 = interfaceC16660sJ;
        this.A01 = str;
        this.A00 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A05) {
            AbstractC25227BEk.A1A(this.A00, !AbstractC25230BEn.A1X(r1));
            this.A02.invoke();
        } else if (this.A04) {
            this.A03.invoke(this.A01);
        }
        return C0eB.A00;
    }
}
