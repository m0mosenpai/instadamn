package X;

/* renamed from: X.6Nv, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Nv implements InterfaceC138166Nw {
    public int A00;
    public C6Nx A01;
    public final C57S A02 = new C57S(new C6Nx[16]);

    public static final void A00(C6Nv c6Nv, int i) {
        if (i >= 0 && i < c6Nv.A00) {
        } else {
            throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, c6Nv.A00, "Index ", ", size "));
        }
    }

    public final void A01(int i, Object obj) {
        if (i >= 0) {
            if (i != 0) {
                int i2 = this.A00;
                C6Nx c6Nx = new C6Nx(i2, i, obj);
                this.A00 = i2 + i;
                this.A02.A09(c6Nx);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("size should be >=0, but was ", i));
    }

    @Override // X.InterfaceC138166Nw
    public final C6Nx AXC(int i) {
        A00(this, i);
        C6Nx c6Nx = this.A01;
        if (c6Nx != null) {
            int i2 = c6Nx.A01;
            if (i < c6Nx.A00 + i2 && i2 <= i) {
                return c6Nx;
            }
        }
        C57S c57s = this.A02;
        C6Nx c6Nx2 = (C6Nx) c57s.A02[C6O1.A00(c57s, i)];
        this.A01 = c6Nx2;
        return c6Nx2;
    }
}
