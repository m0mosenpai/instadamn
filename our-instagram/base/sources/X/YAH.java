package X;

/* loaded from: classes12.dex */
public final class YAH implements C0KE {
    public final /* synthetic */ YAI A00;

    @Override // X.C0KE
    public final void DIN(long j) {
        YAI yai = this.A00;
        double d = yai.A04;
        long max = Math.max(Math.round(j / d), 1L);
        long min = Math.min(max - 1, 100L);
        double d2 = min;
        yai.A01 += d2;
        if (min > 4) {
            yai.A00 += d2 / 4.0d;
        }
        yai.A02 = (long) (yai.A02 + (d * max));
    }

    public YAH(YAI yai) {
        this.A00 = yai;
    }
}
