package X;

import com.facebook.R;

/* renamed from: X.E6s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32066E6s extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C32066E6s) {
                    C32066E6s c32066E6s = (C32066E6s) obj;
                    if (c32066E6s.A00 != 1 || this.A01 != c32066E6s.A01 || this.A03 != c32066E6s.A03 || this.A02 != c32066E6s.A02 || !C14360o3.A0K(this.A04, c32066E6s.A04)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C32066E6s)) {
                return false;
            }
            C32066E6s c32066E6s2 = (C32066E6s) obj;
            if (c32066E6s2.A00 != 0 || !C14360o3.A0K(this.A04, c32066E6s2.A04) || this.A02 != c32066E6s2.A02 || this.A03 != c32066E6s2.A03 || this.A01 != c32066E6s2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int i;
        if (this.A00 != 0) {
            A0J = ((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31;
            i = this.A04.hashCode();
        } else {
            A0J = (((AbstractC166987dD.A0J(this.A04) + this.A02) * 31) + this.A03) * 31;
            i = this.A01;
        }
        return A0J + i;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UiGraphSingleSurfaceState(surfaceName=");
        A1C.append(this.A04);
        A1C.append(", rowsCount=");
        A1C.append(this.A02);
        A1C.append(", topRow=");
        A1C.append(this.A03);
        A1C.append(", bottomRow=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }

    public C32066E6s(int i, int i2, String str) {
        this.A00 = 1;
        this.A01 = R.drawable.instagram_lock_filled_12;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = str;
    }

    public C32066E6s(String str, int i, int i2, int i3) {
        this.A00 = 0;
        this.A04 = str;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
    }
}
