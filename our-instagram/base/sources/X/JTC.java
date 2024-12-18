package X;

/* loaded from: classes8.dex */
public final class JTC implements InterfaceC58315Pt7 {
    public final float A00;
    public final float A01;

    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable B1t() {
        return Float.valueOf(this.A00);
    }

    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable BzZ() {
        return Float.valueOf(this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC58315Pt7
    public final /* bridge */ /* synthetic */ boolean ChA(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() > ((Number) comparable2).floatValue()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof JTC) {
            if (!isEmpty() || !((JTC) obj).isEmpty()) {
                JTC jtc = (JTC) obj;
                if (this.A01 != jtc.A01 || this.A00 != jtc.A00) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58315Pt7, X.C17w
    public final boolean isEmpty() {
        return AbstractC167007dF.A1O((this.A01 > this.A00 ? 1 : (this.A01 == this.A00 ? 0 : -1)));
    }

    public JTC(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }

    @Override // X.InterfaceC58315Pt7
    public final /* bridge */ /* synthetic */ boolean AJi(Comparable comparable) {
        float A09 = AbstractC166987dD.A09(comparable);
        if (A09 >= this.A01 && A09 <= this.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        A1C.append("..");
        A1C.append(this.A00);
        return A1C.toString();
    }
}
