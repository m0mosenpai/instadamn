package X;

import android.util.Pair;

/* loaded from: classes9.dex */
public final class OW7 {
    public Pair A04 = null;
    public Pair A06 = null;
    public Pair A07 = null;
    public Pair A05 = null;
    public double A01 = -1.0d;
    public double A00 = -1.0d;
    public Integer A0A = null;
    public Integer A09 = null;
    public Integer A08 = null;
    public String A0B = null;
    public String A0E = null;
    public long A03 = 0;
    public String A0D = null;
    public String A0C = null;
    public int A02 = -1;
    public String A0F = null;
    public String A0G = null;

    public static void A00(Pair pair, String str, StringBuilder sb) {
        sb.append(str);
        Object obj = pair.first;
        C14360o3.A06(obj);
        sb.append(((Number) obj).intValue());
        sb.append("x");
        Object obj2 = pair.second;
        C14360o3.A06(obj2);
        sb.append(((Number) obj2).intValue());
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        String str2 = this.A0B;
        if (str2 != null) {
            A1C.append("Type: ");
            A1C.append(str2);
            A1C.append("\n");
        }
        Pair pair = this.A04;
        if (pair != null) {
            A00(pair, "Camera: ", A1C);
            A1C.append("\n");
        }
        Pair pair2 = this.A06;
        if (pair2 != null) {
            String str3 = this.A0F;
            if (str3 == null) {
                str3 = "Screen";
            }
            A1C.append(str3);
            A00(pair2, ": ", A1C);
            Integer num = this.A0A;
            if (num != null) {
                int intValue = num.intValue();
                A1C.append(" @ ");
                A1C.append(intValue);
                A1C.append(" fps");
            }
            A1C.append("\n");
        }
        Pair pair3 = this.A07;
        if (pair3 != null) {
            A00(pair3, "Live Encoder: ", A1C);
            Integer num2 = this.A09;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                A1C.append(" @ ");
                A1C.append(intValue2);
                A1C.append(" fps");
            }
            A1C.append(" (");
            String str4 = this.A0D;
            if (str4 != null) {
                A1C.append(str4);
                A1C.append(": ");
            }
            A1C.append(this.A0E);
            A1C.append(")\n");
        }
        Pair pair4 = this.A05;
        if (pair4 != null) {
            A00(pair4, "DVR Encoder: ", A1C);
            Integer num3 = this.A08;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                A1C.append(" @ ");
                A1C.append(intValue3);
                A1C.append(" fps");
            }
            A1C.append(" (");
            A1C.append(this.A0C);
            A1C.append(")\n");
        }
        double d = this.A01;
        if (MSY.A1R((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)))) {
            A1C.append(AbstractC13670mt.A06("Live Bitrate: %.1f kbps\n", Double.valueOf(d)));
        }
        if (this.A00 >= 0.0d) {
            int i = this.A02;
            if (i >= 0) {
                str = AbstractC13670mt.A06(" (lag: %d)", AbstractC25228BEl.A1Y(i));
            } else {
                str = "";
            }
            A1C.append(AbstractC13670mt.A06("Throughput: %.1f kbps%s\n", Double.valueOf(this.A00), str));
        }
        return AbstractC166987dD.A19(A1C);
    }
}
