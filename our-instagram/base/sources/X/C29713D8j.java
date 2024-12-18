package X;

/* renamed from: X.D8j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29713D8j extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C26447BmU A01;
    public final /* synthetic */ C5LT A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29713D8j(C26447BmU c26447BmU, C5LT c5lt, long j, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A02 = c5lt;
        this.A00 = j;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A01 = c26447BmU;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C115725Li A00 = AbstractC115715Lh.A00();
        C75113Zb c75113Zb = this.A02.A04;
        long j = this.A00;
        A00.A01(c75113Zb, j);
        if (!this.A04 && this.A05 && this.A03) {
            AbstractC123605iZ.A00(this.A01.A00).A02(c75113Zb, j);
        }
        return C0eB.A00;
    }
}
