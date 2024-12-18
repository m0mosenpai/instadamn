package X;

/* renamed from: X.DHe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29916DHe extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C2DC A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29916DHe(C2DC c2dc, float f, float f2, long j, long j2) {
        super(1);
        this.A03 = j;
        this.A01 = f;
        this.A00 = f2;
        this.A02 = j2;
        this.A04 = c2dc;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5YU A0a;
        C137576Ld c137576Ld = (C137576Ld) obj;
        C14360o3.A0B(c137576Ld, 0);
        long j = this.A03;
        if (j == C1132359l.A08) {
            A0a = null;
        } else {
            A0a = AbstractC25228BEl.A0a(j);
        }
        float f = this.A01;
        float f2 = this.A00;
        long j2 = this.A02;
        return c137576Ld.A00(new DID(this.A04, A0a, 1.0f, f, f2, (f / 2.0f) + 1.0f, 0, j2));
    }
}
