package X;

/* loaded from: classes5.dex */
public final class BVB extends C0T6 {
    public final int A00;
    public final Object A01;

    public BVB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof BVB) && ((BVB) obj).A00 == i) {
            return true;
        }
        return false;
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
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((BVB) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
