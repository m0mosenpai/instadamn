package X;

/* renamed from: X.17u, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17u extends C17v implements C17w {
    public static final C17u A00 = new C17u(1, 0);

    public C17u(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean A01(int i) {
        if (this.A00 <= i && i <= this.A01) {
            return true;
        }
        return false;
    }

    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable B1t() {
        return Integer.valueOf(this.A01);
    }

    @Override // X.C17w
    public final /* bridge */ /* synthetic */ Comparable BzZ() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.C17v
    public final boolean equals(Object obj) {
        if (obj instanceof C17u) {
            if (!isEmpty() || !((C17v) obj).isEmpty()) {
                C17v c17v = (C17v) obj;
                if (this.A00 == c17v.A00 && this.A01 == c17v.A01) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.C17v, X.C17w
    public final boolean isEmpty() {
        if (this.A00 <= this.A01) {
            return false;
        }
        return true;
    }

    @Override // X.C17v
    public final String toString() {
        return AnonymousClass001.A0P("..", this.A00, this.A01);
    }

    @Override // X.C17v
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }
}
