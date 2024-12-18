package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class U5U {
    public final int A00;
    public final C192428fk A01;

    public final int A01(int i) {
        C192428fk c192428fk;
        C192428fk c192428fk2 = new C192428fk(i);
        int i2 = this.A00;
        C192428fk c192428fk3 = new C192428fk(i2);
        C192428fk c192428fk4 = this.A01;
        if (c192428fk4 == null) {
            c192428fk = null;
        } else {
            int i3 = c192428fk4.A00;
            int i4 = i2 ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ i3;
            if (i4 != i5 && i4 < i5) {
                i2 = i3;
            }
            c192428fk = new C192428fk(i2);
        }
        return ((C192428fk) C17s.A08(c192428fk2, c192428fk3, c192428fk)).A00;
    }

    public final boolean A02() {
        C192428fk c192428fk = this.A01;
        if (c192428fk != null && this.A00 == c192428fk.A00) {
            return true;
        }
        return false;
    }

    public U5U(C192428fk c192428fk, int i) {
        this.A00 = i;
        this.A01 = c192428fk;
    }

    public final int A00() {
        int i;
        int i2;
        if (A02()) {
            i = this.A00;
            int i3 = AbstractC75953b0.A00;
            i2 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
        } else {
            C192428fk c192428fk = this.A01;
            if (c192428fk != null) {
                i = c192428fk.A00;
                int i4 = AbstractC75953b0.A00;
                i2 = Integer.MIN_VALUE;
            } else {
                return AbstractC75953b0.A00;
            }
        }
        return View.MeasureSpec.makeMeasureSpec(i, i2);
    }
}
