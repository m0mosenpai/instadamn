package X;

/* renamed from: X.K2k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45282K2k extends C0T6 implements MNQ {
    public final int A00;
    public final String A01;

    public C45282K2k(String str, int i) {
        this.A00 = i;
        C14360o3.A0B(str, 1);
        this.A01 = str;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45282K2k) && ((C45282K2k) obj).A00 == i) {
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
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C45282K2k) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
