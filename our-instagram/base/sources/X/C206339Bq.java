package X;

/* renamed from: X.9Bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206339Bq extends C0T6 implements InterfaceC166427cB {
    public final int A00;
    public final String A01;

    public C206339Bq(String str, int i) {
        this.A00 = i;
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
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C206339Bq) {
            C206339Bq c206339Bq = (C206339Bq) obj;
            if (c206339Bq.A00 != i || !C14360o3.A0K(this.A01, c206339Bq.A01)) {
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
