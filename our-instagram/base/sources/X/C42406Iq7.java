package X;

/* renamed from: X.Iq7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42406Iq7 implements InterfaceC196338mP {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C42406Iq7(InterfaceC16620sF interfaceC16620sF, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = interfaceC16620sF;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // X.InterfaceC196338mP
    public final /* synthetic */ void DeN() {
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        ((InterfaceC16620sF) this.A01).invoke(Boolean.valueOf(this.A03), Boolean.valueOf(this.A02));
    }
}
