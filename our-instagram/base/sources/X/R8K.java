package X;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes10.dex */
public abstract class R8K extends R8H {
    public final float A00;
    public final int A01;
    public final int A02;

    public R8K(DisplayMetrics displayMetrics, int i, int i2, int i3) {
        super(displayMetrics, i + 1);
        this.A02 = 4;
        this.A01 = i2;
        super.A01 = i3;
        this.A00 = TypedValue.applyDimension(2, 23.0f, displayMetrics);
    }

    public final String A01() {
        int i = this.A02;
        StringBuilder A1C = AbstractC166987dD.A1C();
        int i2 = this.A01;
        if (i == 4) {
            A1C.append(i2);
        } else {
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            while (i2 > 0) {
                int i3 = i2 - 1;
                A1C2.append((char) ((i3 % 26) + 97));
                i2 = i3 / 26;
            }
            A1C2.reverse();
            AbstractC58318PtA.A1V(A1C, A1C2);
        }
        return AbstractC166997dE.A0x(".", A1C);
    }
}
