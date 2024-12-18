package X;

/* renamed from: X.2ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C56502ij implements InterfaceC56512ik {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public final void A00(C56502ij c56502ij, C56502ij c56502ij2, float f) {
        int i = c56502ij.A03;
        c56502ij2.A03 = (int) (((i - r0) * f) + this.A03);
        int i2 = c56502ij.A02;
        c56502ij2.A02 = (int) (((i2 - r0) * f) + this.A02);
        int i3 = c56502ij.A01;
        c56502ij2.A01 = (int) (((i3 - r0) * f) + this.A01);
        int i4 = c56502ij.A00;
        c56502ij2.A00 = (int) (((i4 - r0) * f) + this.A00);
    }

    @Override // X.InterfaceC56512ik
    public final /* bridge */ /* synthetic */ Object COt(float f, Object obj, Object obj2) {
        C56502ij c56502ij = (C56502ij) obj2;
        A00((C56502ij) obj, c56502ij, f);
        return c56502ij;
    }

    public C56502ij(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public C56502ij() {
    }
}
