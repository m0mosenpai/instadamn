package X;

/* renamed from: X.9Bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206329Bp extends C0T6 {
    public final int A00;
    public final String A01;

    public C206329Bp(String str, int i) {
        this.A00 = i;
        C14360o3.A0B(str, 1);
        this.A01 = str;
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
            default:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C206329Bp) {
            C206329Bp c206329Bp = (C206329Bp) obj;
            if (c206329Bp.A00 != i || !C14360o3.A0K(this.A01, c206329Bp.A01)) {
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
