package X;

/* loaded from: classes9.dex */
public final class MU9 extends C0T6 implements InterfaceC57806PkY {
    public final int A00;
    public final Object A01;

    public static boolean A00(Object obj) {
        return A01(obj, 0);
    }

    public MU9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof MU9) && ((MU9) obj).A00 == i) {
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
        if (!A01(obj, i) || !C14360o3.A0K(this.A01, ((MU9) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A01);
    }
}
