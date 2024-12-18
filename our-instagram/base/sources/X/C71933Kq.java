package X;

import java.util.Arrays;

/* renamed from: X.3Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71933Kq {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C71933Kq c71933Kq = (C71933Kq) obj;
            if (this.A02 != c71933Kq.A02 || this.A00 != c71933Kq.A00 || this.A01 != c71933Kq.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A02), Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectBadgeCount{totalCount=");
        sb.append(this.A02);
        sb.append(", openThreadsCount=");
        sb.append(this.A00);
        sb.append(", securedThreadsCount=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public C71933Kq(int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
