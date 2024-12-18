package X;

/* loaded from: classes7.dex */
public final class H85 extends C0T6 implements InterfaceC43391JFg {
    public final int A00;
    public final long A01;

    public H85(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof H85) {
            H85 h85 = (H85) obj;
            if (h85.A00 != i || this.A01 != h85.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A01;
        return (int) (j ^ (j >>> 32));
    }
}
