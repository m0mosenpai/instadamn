package X;

/* renamed from: X.58G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58G implements InterfaceC1128957x {
    public final float A00;
    public final float A01;
    public final C58E A02;

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ int EL8(float f) {
        return AbstractC119105aS.A01(this, f);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqI(int i) {
        return i / this.A00;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long EqJ(long j) {
        return AbstractC119105aS.A03(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqS(long j) {
        return AbstractC119105aS.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7k(long j) {
        return AbstractC119105aS.A04(this, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58G) {
                C58G c58g = (C58G) obj;
                if (Float.compare(this.A00, c58g.A00) != 0 || Float.compare(this.A01, c58g.A01) != 0 || !C14360o3.A0K(this.A02, c58g.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DensityWithConverter(density=");
        sb.append(this.A00);
        sb.append(", fontScale=");
        sb.append(this.A01);
        sb.append(", converter=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A00;
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A01;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqH(float f) {
        return f / this.A00;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqT(float f) {
        return f * this.A00;
    }

    @Override // X.C57y
    public final long F7l(float f) {
        return AbstractC118155Vz.A00(this.A02.AK5(f), 4294967296L);
    }

    public C58G(C58E c58e, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = c58e;
    }

    @Override // X.C57y
    public final float EqG(long j) {
        if (C118135Vx.A01(j) == 4294967296L) {
            return this.A02.AK9(C118135Vx.A00(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7m(float f) {
        return F7l(EqH(f));
    }
}
