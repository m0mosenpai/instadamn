package X;

/* renamed from: X.BjU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26261BjU extends C0T6 implements InterfaceC30893Di6 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C26261BjU(C26135BhM c26135BhM, String str, int i) {
        this.A00 = i;
        if (i != 0) {
            C14360o3.A0B(str, 2);
        }
        this.A01 = c26135BhM;
        this.A02 = str;
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
        if (obj instanceof C26261BjU) {
            C26261BjU c26261BjU = (C26261BjU) obj;
            if (c26261BjU.A00 != i || !C14360o3.A0K(this.A01, c26261BjU.A01) || !C14360o3.A0K(this.A02, c26261BjU.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.A00;
        int A0M = AbstractC167017dG.A0M(this.A01);
        if (i != 0) {
            return AbstractC25226BEj.A03(this.A02, A0M * 31);
        }
        return (A0M * 31) + AbstractC25227BEk.A07(this.A02);
    }
}
