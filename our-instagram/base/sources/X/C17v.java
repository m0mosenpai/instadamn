package X;

/* renamed from: X.17v, reason: invalid class name */
/* loaded from: classes.dex */
public class C17v implements Iterable, InterfaceC15590qF {
    public final int A00;
    public final int A01;
    public final int A02;

    @Override // java.lang.Iterable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C58612mK iterator() {
        return new C58612mK(this.A00, this.A01, this.A02);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17v) {
            if (!isEmpty() || !((C17v) obj).isEmpty()) {
                C17v c17v = (C17v) obj;
                if (this.A00 == c17v.A00 && this.A01 == c17v.A01 && this.A02 == c17v.A02) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        int i = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        if (i > 0) {
            if (i2 > i3) {
                return true;
            }
            return false;
        }
        if (i2 < i3) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i = this.A02;
        StringBuilder sb = new StringBuilder();
        int i2 = this.A00;
        if (i > 0) {
            sb.append(i2);
            sb.append("..");
            sb.append(this.A01);
            sb.append(" step ");
        } else {
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(this.A01);
            sb.append(" step ");
            i = -i;
        }
        sb.append(i);
        return sb.toString();
    }

    public C17v(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.A00 = i;
                this.A01 = C17x.A00(i, i2, i3);
                this.A02 = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }
}
