package X;

/* loaded from: classes9.dex */
public final class OL9 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final C15790qZ A09;
    public final Integer A0A;
    public final String A0B;

    public final void A01(C51959Mxg c51959Mxg, Integer num) {
        int i;
        C14360o3.A0B(c51959Mxg, 0);
        if (c51959Mxg.A04 >= this.A08 && c51959Mxg.A03 == num) {
            String str = this.A0B;
            int hashCode = str.hashCode();
            if (hashCode != -2041073848) {
                if (hashCode == -852971718 && str.equals("server_ranking")) {
                    i = c51959Mxg.A01;
                }
                i = c51959Mxg.A00;
            } else {
                if (str.equals("server_total")) {
                    i = c51959Mxg.A02;
                }
                i = c51959Mxg.A00;
            }
            if (num == C05F.A0C && i <= 0) {
                return;
            }
            long j = i;
            this.A01 += j;
            this.A00++;
            if (this.A0A == c51959Mxg.A07) {
                this.A07 += j;
                this.A06++;
            }
            Integer num2 = c51959Mxg.A06;
            C15790qZ c15790qZ = this.A09;
            if (num2 != c15790qZ.A01) {
                return;
            }
            this.A05 += j;
            this.A04++;
            if (c51959Mxg.A05 != c15790qZ.A00) {
                return;
            }
            this.A03 += j;
            this.A02++;
        }
    }

    public final C54686ODm A00() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5 = this.A00;
        if (j5 > 0) {
            j = this.A01 / j5;
        } else {
            j = -1;
        }
        long j6 = this.A06;
        if (j6 >= 5) {
            j2 = this.A07 / j6;
        } else if (j5 > 0) {
            j2 = this.A01 / j5;
        } else {
            j2 = -1;
        }
        if (j6 < 5) {
            j6 = j5;
        }
        long j7 = this.A03;
        if (j7 >= 5) {
            j3 = j7 / this.A02;
        } else {
            long j8 = this.A04;
            if (j8 >= 5) {
                j3 = this.A05 / j8;
            } else if (j5 > 0) {
                j3 = this.A01 / j5;
            } else {
                j3 = -1;
            }
        }
        if (j7 >= 5) {
            j4 = this.A02;
        } else {
            j4 = this.A04;
            if (j4 < 5) {
                j4 = j5;
            }
        }
        return new C54686ODm(j, j5, j2, j6, j3, j4);
    }

    public OL9(C15790qZ c15790qZ, Integer num, String str, long j) {
        this.A08 = j;
        this.A0A = num;
        this.A09 = c15790qZ;
        this.A0B = str;
    }
}
