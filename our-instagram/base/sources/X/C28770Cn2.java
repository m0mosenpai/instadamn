package X;

/* renamed from: X.Cn2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28770Cn2 implements InterfaceC30906DiJ {
    public final float A00;

    @Override // X.InterfaceC30906DiJ
    public final int AFB(InterfaceC1128957x interfaceC1128957x, int i, int i2) {
        return interfaceC1128957x.EL8(this.A00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28770Cn2)) {
            return false;
        }
        return C119145aW.A01(this.A00, ((C28770Cn2) obj).A00);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C28770Cn2(float f) {
        this.A00 = f;
    }
}
