package X;

/* renamed from: X.5WK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WK implements C5WH {
    public final float A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5WK) && C119145aW.A01(this.A00, ((C5WK) obj).A00));
    }

    @Override // X.C5WH
    public final float EqU(InterfaceC1128957x interfaceC1128957x, long j) {
        return interfaceC1128957x.EqT(this.A00);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0Z("CornerSize(size = ", ".dp)", this.A00);
    }

    public C5WK(float f) {
        this.A00 = f;
    }
}
