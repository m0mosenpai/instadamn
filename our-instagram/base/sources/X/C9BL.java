package X;

/* renamed from: X.9BL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BL extends C0T6 implements InterfaceC79013g8 {
    public final int A00;
    public final Object A01;

    public C9BL(C40971v4 c40971v4, int i) {
        this.A00 = i;
        C14360o3.A0B(c40971v4, 1);
        this.A01 = c40971v4;
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
        if (obj instanceof C9BL) {
            C9BL c9bl = (C9BL) obj;
            if (c9bl.A00 != i || !C14360o3.A0K(this.A01, c9bl.A01)) {
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
