package X;

/* renamed from: X.45W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45W {
    public static final C45W A02 = new C45W(0, 0);
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C45W c45w = (C45W) obj;
            if (c45w.A01 != this.A01 || c45w.A00 != this.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A00 + this.A01;
    }

    public final String toString() {
        if (this == A02) {
            return "EMPTY";
        }
        return String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.A01), Integer.valueOf(this.A00));
    }

    public C45W(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
