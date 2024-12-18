package X;

/* renamed from: X.9B4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9B4 extends C0T6 implements InterfaceC166427cB {
    public final int A00;
    public final boolean A01;

    public C9B4(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C9B4) {
            C9B4 c9b4 = (C9B4) obj;
            if (c9b4.A00 != i || this.A01 != c9b4.A01) {
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
