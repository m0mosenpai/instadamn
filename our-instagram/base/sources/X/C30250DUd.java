package X;

/* renamed from: X.DUd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30250DUd extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5XO A01;
    public final /* synthetic */ C7W A02;
    public final /* synthetic */ C25995Bej A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16620sF A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30250DUd(C5XO c5xo, C7W c7w, C25995Bej c25995Bej, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, long j, boolean z, boolean z2) {
        super(2);
        this.A00 = j;
        this.A03 = c25995Bej;
        this.A02 = c7w;
        this.A07 = z;
        this.A04 = interfaceC16820sZ;
        this.A06 = z2;
        this.A01 = c5xo;
        this.A05 = interfaceC16620sF;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        long A02;
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-193677132, "com.instagram.barcelona.common.ui.button.BdsButton.<anonymous> (BdsButton.kt:112)");
            }
            C5UP c5up = C6L9.A00;
            long j = this.A00;
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), 1.0f);
            C117685Ud[] c117685UdArr = {AbstractC25229BEm.A0S(c5up, A02), AbstractC131065vu.A00.A02(Float.valueOf(C1132359l.A00(j)))};
            C25995Bej c25995Bej = this.A03;
            C7W c7w = this.A02;
            boolean z = this.A07;
            if (AbstractC25233BEq.A1Y(c5Tl, new DV7(this.A01, c7w, c25995Bej, this.A04, this.A05, 1, z, this.A06), c117685UdArr, 551516249)) {
                C0fH.A00(-726709671);
            }
        }
        return C0eB.A00;
    }
}
