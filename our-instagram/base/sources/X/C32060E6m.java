package X;

/* renamed from: X.E6m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32060E6m extends C0T6 {
    public final int A00 = 0;
    public final Object A01;

    public C32060E6m(InterfaceC37110GWv interfaceC37110GWv) {
        C14360o3.A0B(interfaceC37110GWv, 1);
        this.A01 = interfaceC37110GWv;
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
        if (obj instanceof C32060E6m) {
            C32060E6m c32060E6m = (C32060E6m) obj;
            if (c32060E6m.A00 != i || !C14360o3.A0K(this.A01, c32060E6m.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C32060E6m(C51749MtY c51749MtY) {
        C14360o3.A0B(c51749MtY, 1);
        this.A01 = c51749MtY;
    }
}
