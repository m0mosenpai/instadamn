package X;

/* renamed from: X.9BM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BM extends C0T6 implements InterfaceC30856DhV {
    public final int A00;
    public final Object A01;

    public C9BM(C120985dq c120985dq, int i) {
        this.A00 = i;
        this.A01 = c120985dq;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BM) && ((C9BM) obj).A00 == i) {
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
            case 6:
                if (this != obj) {
                    i = 6;
                    break;
                } else {
                    return true;
                }
            case 7:
                if (this != obj) {
                    i = 7;
                    break;
                } else {
                    return true;
                }
            case 8:
                if (this != obj) {
                    i = 8;
                    break;
                } else {
                    return true;
                }
            case 9:
                if (this != obj) {
                    i = 9;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 10;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C9BM) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C9BM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
