package X;

/* renamed from: X.BMa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25409BMa implements C33R {
    public final /* synthetic */ C51762Yz A00;
    public final /* synthetic */ C51762Yz A01;
    public final /* synthetic */ BLI A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C25409BMa(C51762Yz c51762Yz, C51762Yz c51762Yz2, BLI bli, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A00 = c51762Yz;
        this.A05 = z2;
        this.A02 = bli;
        this.A03 = z3;
        this.A01 = c51762Yz2;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i == 29 && this.A04) {
            Integer num = c75113Zb.A10;
            Integer num2 = C05F.A00;
            C51762Yz c51762Yz = this.A00;
            if (num == num2) {
                c51762Yz.A01(false);
                if (this.A05) {
                    this.A02.A0H.EkF(true);
                }
                if (this.A03) {
                    this.A02.A0H.ARt(true);
                    return;
                }
                return;
            }
            c51762Yz.A00();
            this.A01.A01(false);
            if (!this.A05) {
                return;
            }
            this.A02.A0H.EkF(false);
        }
    }
}
