package X;

/* loaded from: classes4.dex */
public final class AH7 {
    public final long A0B;
    public final long A0C;
    public long A07 = 0;
    public long A06 = 0;
    public boolean A09 = false;
    public boolean A0A = false;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public String A08 = "";
    public long A00 = 0;

    public static void A00(AH7 ah7) {
        ah7.A06++;
    }

    public final float A01() {
        long j = this.A06;
        if (j != 0) {
            return (((float) this.A07) / 1000000.0f) / ((float) j);
        }
        return 0.0f;
    }

    public final void A02() {
        this.A06 = 0L;
        this.A07 = 0L;
        this.A09 = false;
        this.A0A = false;
        this.A01 = 0L;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A04 = 0L;
        this.A05 = 0L;
        this.A08 = "";
    }

    public AH7(long j, long j2) {
        this.A0C = j;
        this.A0B = j2;
    }
}
