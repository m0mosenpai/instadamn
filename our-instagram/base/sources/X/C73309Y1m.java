package X;

/* renamed from: X.Y1m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73309Y1m {
    public static final C73309Y1m A02 = new C73309Y1m(-1, -1);
    public final int A00;
    public final int A01;

    static {
        new C73309Y1m(0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73309Y1m)) {
            return false;
        }
        C73309Y1m c73309Y1m = (C73309Y1m) obj;
        return this.A01 == c73309Y1m.A01 && this.A00 == c73309Y1m.A00;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return AnonymousClass001.A0P("x", this.A01, this.A00);
    }

    public C73309Y1m(int i, int i2) {
        boolean z;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        } else {
            z = false;
        }
        WDn.A01(z);
        this.A01 = i;
        this.A00 = i2;
    }
}
