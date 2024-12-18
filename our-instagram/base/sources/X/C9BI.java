package X;

/* renamed from: X.9BI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9BI extends C0T6 implements InterfaceC50424MOe {
    public final int A00;
    public final Object A01;

    public C9BI(C6C9 c6c9, int i) {
        this.A00 = i;
        this.A01 = c6c9;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9BI) && ((C9BI) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50424MOe
    public final C6C9 BXJ() {
        return (C6C9) this.A01;
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
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C9BI) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
