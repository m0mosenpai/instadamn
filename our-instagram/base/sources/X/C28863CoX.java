package X;

/* renamed from: X.CoX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28863CoX implements InterfaceC31114Dlw {
    public final int A00;
    public final int A01;
    public final boolean A02;

    @Override // X.InterfaceC31114Dlw
    public final int E36(int i) {
        return i + this.A01;
    }

    @Override // X.InterfaceC31114Dlw
    public final int F8T(int i) {
        boolean z = this.A02;
        int i2 = this.A01;
        if (z) {
            i -= i2;
            i2 = this.A00;
        }
        int i3 = i - i2;
        return AbstractC25230BEn.A06(i3, i3);
    }

    public C28863CoX(boolean z, int i, int i2) {
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
    }
}
