package X;

/* loaded from: classes6.dex */
public final class E9Q extends C0T6 implements InterfaceC37097GWh {
    public final int A00;
    public final String A01;

    public E9Q(String str, int i) {
        this.A00 = i;
        this.A01 = str;
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
        if (obj instanceof E9Q) {
            E9Q e9q = (E9Q) obj;
            if (e9q.A00 != i || !C14360o3.A0K(this.A01, e9q.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
