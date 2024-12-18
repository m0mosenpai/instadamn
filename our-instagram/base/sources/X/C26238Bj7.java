package X;

/* renamed from: X.Bj7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26238Bj7 extends C0T6 implements InterfaceC31098Dlg {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C26238Bj7(String str, int i) {
        Object obj;
        int i2;
        this.A00 = i;
        if (i != 0) {
            obj = DG6.A00;
            i2 = 1;
        } else {
            obj = DG5.A00;
            i2 = 0;
        }
        this.A00 = i2;
        this.A02 = str;
        this.A01 = obj;
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
        if (obj instanceof C26238Bj7) {
            C26238Bj7 c26238Bj7 = (C26238Bj7) obj;
            if (c26238Bj7.A00 != i || !C14360o3.A0K(this.A02, c26238Bj7.A02) || !C14360o3.A0K(this.A01, c26238Bj7.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A02));
    }
}
