package X;

/* renamed from: X.G0x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36328G0x implements GXJ {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ GXI A01;
    public final /* synthetic */ FR2 A02;

    public C36328G0x(InterfaceC11380iw interfaceC11380iw, GXI gxi, FR2 fr2) {
        this.A01 = gxi;
        this.A02 = fr2;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.GXJ
    public final void Dh2(String str) {
        this.A01.onFinish();
        this.A02.A01(str, this.A00);
    }
}
