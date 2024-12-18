package X;

/* renamed from: X.RBp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60598RBp extends C54y {
    public final float A00;

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C60598RBp)) {
            return false;
        }
        return Float.compare(this.A00, ((C60598RBp) obj).A00) == 0;
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        float f = this.A00;
        String[] strArr = AnonymousClass188.A04;
        return Float.toString(f);
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
        anonymousClass182.A0g(this.A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C60598RBp(float f) {
        this.A00 = f;
    }
}
