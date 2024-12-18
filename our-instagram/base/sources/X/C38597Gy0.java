package X;

/* renamed from: X.Gy0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38597Gy0 extends C0T6 {
    public final int A00;
    public final String A01;

    public C38597Gy0(String str, int i) {
        this.A00 = i;
        this.A01 = str;
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
        if (obj instanceof C38597Gy0) {
            C38597Gy0 c38597Gy0 = (C38597Gy0) obj;
            if (c38597Gy0.A00 != i || !C14360o3.A0K(this.A01, c38597Gy0.A01)) {
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
