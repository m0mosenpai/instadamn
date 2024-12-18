package X;

/* loaded from: classes11.dex */
public final class W3G {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final XG2 A0C;

    public static void A00(W3G w3g, int i) {
        long j = w3g.A04;
        if (j != -9223372036854775807L) {
            boolean z = w3g.A0B;
            w3g.A0C.ELS(null, z ? 1 : 0, (int) (w3g.A01 - w3g.A03), i, j);
        }
    }

    public W3G(XG2 xg2) {
        this.A0C = xg2;
    }
}
