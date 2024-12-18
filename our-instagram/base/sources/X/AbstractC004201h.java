package X;

/* renamed from: X.01h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC004201h {
    public int A00;
    public Object[] A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC004201h)) {
            return false;
        }
        AbstractC004201h abstractC004201h = (AbstractC004201h) obj;
        int i = abstractC004201h.A00;
        int i2 = this.A00;
        if (i != i2) {
            return false;
        }
        Object[] objArr = this.A01;
        Object[] objArr2 = abstractC004201h.A01;
        C17u A0C = C17s.A0C(0, i2);
        int i3 = A0C.A00;
        int i4 = A0C.A01;
        if (i3 <= i4) {
            while (C14360o3.A0K(objArr[i3], objArr2[i3])) {
                if (i3 != i4) {
                    i3++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.A01;
        int i2 = this.A00;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                Object obj = objArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                if (obj == this) {
                    valueOf = "(this)";
                } else {
                    valueOf = String.valueOf(obj);
                }
                sb.append((CharSequence) valueOf);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        String obj2 = sb.toString();
        C14360o3.A07(obj2);
        return obj2;
    }
}
