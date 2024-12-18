package X;

/* loaded from: classes8.dex */
public final class M9M implements InterfaceC58315Pt7 {
    public final double A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC58315Pt7
    public final /* bridge */ /* synthetic */ boolean AJi(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        if (doubleValue >= this.A00 && doubleValue <= 1.0d) {
            return true;
        }
        return false;
    }

    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable B1t() {
        return Double.valueOf(1.0d);
    }

    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable BzZ() {
        return Double.valueOf(this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC58315Pt7
    public final /* bridge */ /* synthetic */ boolean ChA(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).doubleValue() > ((Number) comparable2).doubleValue()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M9M) {
            if ((isEmpty() && ((M9M) obj).isEmpty()) || this.A00 == ((M9M) obj).A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC58315Pt7, X.C17w
    public final boolean isEmpty() {
        return AbstractC167007dF.A1O((this.A00 > 1.0d ? 1 : (this.A00 == 1.0d ? 0 : -1)));
    }

    public M9M(double d) {
        this.A00 = d;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (AbstractC28006CWd.A00(this.A00) * 31) + AbstractC28006CWd.A00(1.0d);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A00);
        A1C.append("..");
        A1C.append(1.0d);
        return A1C.toString();
    }
}
