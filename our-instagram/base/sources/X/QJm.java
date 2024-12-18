package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class QJm extends AbstractC99954eH {
    public final boolean A00;

    @Override // X.AbstractC99954eH
    public final void A00(int i, List list) {
        if (i >= 0 && i <= 100) {
            double d = i / 100.0d;
            int i2 = 800;
            boolean z = false;
            if (i >= 50) {
                i2 = 1000;
                z = true;
            }
            C15I c15i = super.A00;
            int[] iArr = c15i.A0B;
            int i3 = iArr[1];
            int max = Math.max((iArr[0] + ((int) ((i3 - r3) * d))) / 1000, i2);
            int i4 = c15i.A02;
            int[] iArr2 = AbstractC62305S6a.A00;
            int min = Math.min(i4, 8);
            int i5 = (max - 1000) / 100;
            if (i5 < 0) {
                i5 = 0;
            }
            for (int i6 = 0; i6 < min; i6++) {
                MSX.A0u(iArr2[i6] + i5, list);
            }
            MSX.A0u(7681, list);
            if (z) {
                MSX.A0u(15873, list);
                MSX.A0u(1795, list);
            }
        }
    }

    public final String toString() {
        if (this.A00) {
            return "snapdragon_v2_auto";
        }
        return "snapdragon_v2";
    }

    public QJm(C15I c15i, boolean z) {
        super(c15i);
        this.A00 = z;
    }
}
