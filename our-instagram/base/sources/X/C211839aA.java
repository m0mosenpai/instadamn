package X;

/* renamed from: X.9aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211839aA extends C0T6 implements InterfaceC41141vN {
    public final int A00;
    public final Object A01;

    public C211839aA(C38321qM c38321qM, int i) {
        this.A00 = i;
        C14360o3.A0B(c38321qM, 1);
        this.A01 = c38321qM;
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
        if (obj instanceof C211839aA) {
            C211839aA c211839aA = (C211839aA) obj;
            if (c211839aA.A00 != i || !C14360o3.A0K(this.A01, c211839aA.A01)) {
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
