package X;

/* renamed from: X.9BK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BK extends C0T6 implements InterfaceC166427cB {
    public final int A00;
    public final Object A01;

    public C9BK(InterfaceC30800Dgb interfaceC30800Dgb) {
        this.A00 = 5;
        this.A01 = interfaceC30800Dgb;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BK) && ((C9BK) obj).A00 == i) {
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
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            case 4:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
            case 5:
                if (this != obj) {
                    i = 5;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 6;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C9BK) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj;
        if (2 - this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = this.A01;
            if (obj == null) {
                return 0;
            }
        }
        return obj.hashCode();
    }

    public C9BK(C38321qM c38321qM, int i) {
        this.A00 = i;
        this.A01 = c38321qM;
    }

    public C9BK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
