package X;

/* loaded from: classes10.dex */
public abstract class S39 {
    public static void A00(double[] required, int array, int from, int to) {
        if (array == from) {
            int i = from;
            for (int i2 = from + 1; i2 <= to; i2++) {
                if (required[i] > required[i2]) {
                    i = i2;
                }
            }
            if (i != from) {
                double d = required[i];
                required[i] = required[from];
                required[from] = d;
                return;
            }
            return;
        }
        while (to > from) {
            boolean z = true;
            int i3 = (from + to) >>> 1;
            double d2 = required[to];
            double d3 = required[i3];
            boolean A1P = AbstractC25230BEn.A1P((d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)));
            double d4 = required[from];
            boolean A1P2 = AbstractC25230BEn.A1P((d3 > d4 ? 1 : (d3 == d4 ? 0 : -1)));
            if (d2 >= d4) {
                z = false;
            }
            if (A1P == A1P2) {
                required[i3] = d4;
                required[from] = d3;
            } else if (A1P != z) {
                required[from] = d2;
                required[to] = d4;
            }
            double d5 = required[from];
            int i4 = to;
            for (int i5 = to; i5 > from; i5--) {
                if (required[i5] > d5) {
                    double d6 = required[i4];
                    required[i4] = required[i5];
                    required[i5] = d6;
                    i4--;
                }
            }
            double d7 = required[from];
            required[from] = required[i4];
            required[i4] = d7;
            if (i4 >= array) {
                to = i4 - 1;
            }
            if (i4 <= array) {
                from = i4 + 1;
            }
        }
    }
}
