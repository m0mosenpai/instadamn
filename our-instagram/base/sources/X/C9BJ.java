package X;

/* renamed from: X.9BJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BJ extends C0T6 implements InterfaceC86413tE {
    public final int A00 = 1;
    public final Object A01;

    public C9BJ(C206189Bb c206189Bb) {
        this.A01 = c206189Bb;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BJ) && ((C9BJ) obj).A00 == i) {
            return true;
        }
        return false;
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
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C9BJ) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C9BJ(C206199Bc c206199Bc) {
        this.A01 = c206199Bc;
    }
}
