package X;

/* renamed from: X.9B5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B5 extends C0T6 {
    public boolean A00;
    public final int A01;

    public C9B5(boolean z, int i) {
        this.A01 = i;
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A01) {
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
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C9B5) {
            C9B5 c9b5 = (C9B5) obj;
            if (c9b5.A01 != i || this.A00 != c9b5.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9B5() {
        this(false, 0);
        this.A01 = 0;
        this.A01 = 0;
    }
}
