package X;

/* loaded from: classes5.dex */
public final class D8N extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C76223bS A02;
    public final /* synthetic */ C26360Bl5 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8N(C76223bS c76223bS, C26360Bl5 c26360Bl5, float f, long j) {
        super(0);
        this.A03 = c26360Bl5;
        this.A02 = c76223bS;
        this.A00 = f;
        this.A01 = j;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        float size;
        C26360Bl5 c26360Bl5 = this.A03;
        C76223bS c76223bS = this.A02;
        float f = this.A00;
        int A01 = C78613fT.A01(this.A01);
        if (c26360Bl5.A01.isEmpty()) {
            size = 0.0f;
        } else {
            size = (f * r1.size()) + ((r1.size() * 4.0f) - 1.0f) + 48.0f;
            float f2 = A01 / AbstractC25229BEm.A0b(c76223bS).A01.getDisplayMetrics().density;
            if (size > f2) {
                size = f2;
            }
        }
        return Float.valueOf(size);
    }
}
