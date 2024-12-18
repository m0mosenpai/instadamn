package X;

/* renamed from: X.E8i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32084E8i extends C0T6 implements InterfaceC66482zP {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32084E8i) {
                C32084E8i c32084E8i = (C32084E8i) obj;
                if (this.A03 != c32084E8i.A03 || this.A02 != c32084E8i.A02 || this.A01 != c32084E8i.A01 || this.A00 != c32084E8i.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A03);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC167007dF.A0D(this.A01, ((this.A03 * 31) + this.A02) * 31));
    }

    public C32084E8i(int i, int i2, boolean z, boolean z2) {
        this.A03 = i;
        this.A02 = i2;
        this.A01 = z;
        this.A00 = z2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
