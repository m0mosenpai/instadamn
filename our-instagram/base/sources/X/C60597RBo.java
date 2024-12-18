package X;

/* renamed from: X.RBo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60597RBo extends C54y {
    public final double A00;

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C60597RBo)) {
            return false;
        }
        return Double.compare(this.A00, ((C60597RBo) obj).A00) == 0;
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        double d = this.A00;
        String[] strArr = AnonymousClass188.A04;
        return Double.toString(d);
    }

    @Override // X.AbstractC1122454w
    public final C16R A0C() {
        return C16R.A0H;
    }

    @Override // X.C54y
    public final int A0D() {
        return (int) this.A00;
    }

    @Override // X.C54u, X.InterfaceC911544r
    public final void EOr(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m) {
        anonymousClass182.A0f(this.A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }

    public C60597RBo(double d) {
        this.A00 = d;
    }
}
