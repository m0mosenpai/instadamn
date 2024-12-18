package X;

/* renamed from: X.4Wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96784Wn {
    public static final C96784Wn A02 = new C96784Wn(-1, -1);
    public final int A00;
    public final int A01;

    static {
        new C96784Wn(0, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C96784Wn)) {
            return false;
        }
        C96784Wn c96784Wn = (C96784Wn) obj;
        return this.A01 == c96784Wn.A01 && this.A00 == c96784Wn.A00;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        return AnonymousClass001.A0P("x", this.A01, this.A00);
    }

    public C96784Wn(int i, int i2) {
        boolean z;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        } else {
            z = false;
        }
        C4B8.A03(z);
        this.A01 = i;
        this.A00 = i2;
    }
}
