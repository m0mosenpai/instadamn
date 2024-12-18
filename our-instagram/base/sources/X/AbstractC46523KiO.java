package X;

/* renamed from: X.KiO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46523KiO {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;

    public final synchronized void A01() {
        AbstractC195978lm.A02.A02("sup:SUPNetworkAnalyticsImpl", "Starting session info tracking");
        this.A01 = System.currentTimeMillis();
        this.A02 = true;
        A03();
    }

    public final synchronized void A02() {
        if (this.A02) {
            AbstractC195978lm.A02.A02("sup:SUPNetworkAnalyticsImpl", "Stopping session info tracking");
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.A01;
            this.A01 = currentTimeMillis;
            A04(j);
            this.A02 = false;
        }
    }

    public abstract void A03();

    public abstract void A04(long j);
}
