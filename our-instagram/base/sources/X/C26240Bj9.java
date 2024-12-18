package X;

/* renamed from: X.Bj9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26240Bj9 extends C0T6 implements InterfaceC30856DhV {
    public final int A00;
    public final Object A01;

    public C26240Bj9(C120985dq c120985dq, int i) {
        this.A00 = i;
        this.A01 = c120985dq;
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
        if (obj instanceof C26240Bj9) {
            C26240Bj9 c26240Bj9 = (C26240Bj9) obj;
            if (c26240Bj9.A00 != i || !C14360o3.A0K(this.A01, c26240Bj9.A01)) {
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
