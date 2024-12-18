package X;

/* renamed from: X.CoW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28862CoW implements InterfaceC31114Dlw {
    public final int A00;
    public final int A01;
    public final InterfaceC31114Dlw A02;

    @Override // X.InterfaceC31114Dlw
    public final int E36(int i) {
        int E36 = this.A02.E36(i);
        if (i >= 0 && i <= this.A00) {
            AbstractC28412CgI.A01(E36, this.A01, i);
        }
        return E36;
    }

    @Override // X.InterfaceC31114Dlw
    public final int F8T(int i) {
        int F8T = this.A02.F8T(i);
        if (i >= 0 && i <= this.A01) {
            AbstractC28412CgI.A02(F8T, this.A00, i);
        }
        return F8T;
    }

    public C28862CoW(InterfaceC31114Dlw interfaceC31114Dlw, int i, int i2) {
        this.A02 = interfaceC31114Dlw;
        this.A00 = i;
        this.A01 = i2;
    }
}
