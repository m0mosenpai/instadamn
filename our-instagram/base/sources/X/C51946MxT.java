package X;

/* renamed from: X.MxT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51946MxT extends C0T6 implements InterfaceC57885Plp {
    public final int A00;
    public final int A01;

    public C51946MxT(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51946MxT) && ((C51946MxT) obj).A00 == i) {
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
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || this.A01 != ((C51946MxT) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01;
    }
}
