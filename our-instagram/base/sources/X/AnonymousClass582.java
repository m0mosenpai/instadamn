package X;

/* renamed from: X.582, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass582 implements InterfaceC1128957x {
    public final float A00;
    public final float A01;

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ int EL8(float f) {
        return AbstractC119105aS.A01(this, f);
    }

    @Override // X.C57y
    public final /* synthetic */ float EqG(long j) {
        return AbstractC122655h0.A00(this, j);
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

    @Override // X.C57y
    public final /* synthetic */ long F7l(float f) {
        return AbstractC122655h0.A01(this, f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass582) {
                AnonymousClass582 anonymousClass582 = (AnonymousClass582) obj;
                if (Float.compare(this.A00, anonymousClass582.A00) != 0 || Float.compare(this.A01, anonymousClass582.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return AnonymousClass001.A0U("DensityImpl(density=", ", fontScale=", ')', this.A00, this.A01);
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

    public AnonymousClass582(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7m(float f) {
        return F7l(EqH(f));
    }
}
