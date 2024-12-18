package X;

/* renamed from: X.RBq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60599RBq extends C54y {
    public final short A00;

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof C60599RBq) && ((C60599RBq) obj).A00 == this.A00;
        }
        return true;
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        return AnonymousClass188.A08(this.A00);
    }

    @Override // X.AbstractC1122454w
    public final C16R A0C() {
        return C16R.A0I;
    }

    @Override // X.C54y
    public final int A0D() {
        return this.A00;
    }

    @Override // X.C54u, X.InterfaceC911544r
    public final void EOr(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m) {
        anonymousClass182.A0x(this.A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        return this.A00;
    }

    public C60599RBq(short s) {
        this.A00 = s;
    }
}
