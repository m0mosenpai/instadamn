package X;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: X.4H4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4H4 {
    public final C2E0 A00;
    public final Object A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C4H4)) {
                return false;
            }
            C4H4 c4h4 = (C4H4) obj;
            C2E0 c2e0 = this.A00;
            if (c2e0 == c4h4.A00) {
                Comparator comparator = c2e0.A02;
                if (comparator.compare(this.A02, c4h4.A02) != 0 || comparator.compare(this.A01, c4h4.A01) != 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean A01() {
        if (this.A00.A02.compare(this.A02, this.A01) < 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01});
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Object obj = this.A02;
        C2E0 c2e0 = this.A00;
        if (obj.equals(c2e0.A01)) {
            str = "[";
        } else {
            str = "(";
        }
        sb.append(str);
        sb.append(obj);
        sb.append(", ");
        Object obj2 = this.A01;
        sb.append(obj2);
        if (obj2.equals(c2e0.A00)) {
            str2 = "]";
        } else {
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    public C4H4(C2E0 c2e0, Object obj, Object obj2) {
        this.A00 = c2e0;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final C4H4 A00(C4H4 c4h4) {
        if (c4h4.A01()) {
            return this;
        }
        if (!A01()) {
            C2E0 c2e0 = this.A00;
            Object obj = this.A02;
            Object obj2 = c4h4.A02;
            Comparator comparator = c2e0.A02;
            C14360o3.A0B(comparator, 2);
            if (obj == null || (obj2 != null && comparator.compare(obj, obj2) > 0)) {
                obj = obj2;
            }
            Object obj3 = this.A01;
            Object obj4 = c4h4.A01;
            if (obj3 == null || (obj4 != null && comparator.compare(obj3, obj4) < 0)) {
                obj3 = obj4;
            }
            return new C4H4(c2e0, obj, obj3);
        }
        return c4h4;
    }
}
