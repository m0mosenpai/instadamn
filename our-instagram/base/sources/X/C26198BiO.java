package X;

/* renamed from: X.BiO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26198BiO extends C0T6 implements InterfaceC30818Dgt {
    public final int A00;
    public final boolean A01;

    public C26198BiO(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
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
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C26198BiO) {
            C26198BiO c26198BiO = (C26198BiO) obj;
            if (c26198BiO.A00 != i || this.A01 != c26198BiO.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.A01) {
            return 1237;
        }
        return 1231;
    }
}
