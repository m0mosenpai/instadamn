package X;

/* renamed from: X.Cvm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29291Cvm implements C33R {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C26640Bpb A02;
    public final /* synthetic */ C27079Bx3 A03;
    public final /* synthetic */ C14510oO A04;

    public C29291Cvm(C26640Bpb c26640Bpb, C27079Bx3 c27079Bx3, C14510oO c14510oO, float f, int i) {
        this.A01 = i;
        this.A02 = c26640Bpb;
        this.A04 = c14510oO;
        this.A00 = f;
        this.A03 = c27079Bx3;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i == 68) {
            float f = c75113Zb.A01;
            int i2 = this.A01;
            float f2 = f - i2;
            if (f2 > 0.0f) {
                C2XI c2xi = C26640Bpb.A07;
                if (AbstractC166987dD.A09(c2xi.A00) == 0.0f) {
                    C26640Bpb c26640Bpb = this.A02;
                    c26640Bpb.A05.D2b(c26640Bpb.A00, c26640Bpb.A01, i2, false);
                }
                AbstractC25227BEk.A1D(c2xi, f2);
                AbstractC25227BEk.A1D(C26640Bpb.A08, 1.0f);
                C14510oO c14510oO = this.A04;
                if (!c14510oO.A00 && c75113Zb.A0i == C3VZ.A04 && f2 >= this.A00) {
                    C27079Bx3 c27079Bx3 = this.A03;
                    c27079Bx3.performHapticFeedback(0);
                    C26640Bpb c26640Bpb2 = this.A02;
                    c26640Bpb2.A05.D2b(c26640Bpb2.A00, c26640Bpb2.A01, i2, true);
                    new C37616GhB(c26640Bpb2.A02, c26640Bpb2.A03).A06(c27079Bx3, null, null);
                    c14510oO.A00 = true;
                    return;
                }
                return;
            }
            this.A04.A00 = false;
            AbstractC25227BEk.A1D(C26640Bpb.A08, 0.0f);
            AbstractC25227BEk.A1D(C26640Bpb.A07, f2);
        }
    }
}
