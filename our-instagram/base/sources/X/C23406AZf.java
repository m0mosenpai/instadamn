package X;

/* renamed from: X.AZf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23406AZf implements InterfaceC175477rN {
    public final /* synthetic */ C179937yj A00;

    public C23406AZf(C179937yj c179937yj) {
        this.A00 = c179937yj;
    }

    @Override // X.InterfaceC175477rN
    public final void DX9(int i, int i2, int i3, int i4, boolean z) {
        C179937yj c179937yj = this.A00;
        c179937yj.A03 = i;
        c179937yj.A01 = i2;
        c179937yj.A02 = i3;
        c179937yj.A00 = ((((i4 + 45) + 360) / 90) % 4) * 90;
    }
}
