package X;

import java.util.concurrent.Executor;

/* renamed from: X.XLs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72051XLs extends AbstractC002400o {
    public static volatile C72051XLs A04;
    public AbstractC002400o A00;
    public final AbstractC002400o A01;
    public static final Executor A03 = new ExecutorC72050XLr(0);
    public static final Executor A02 = new ExecutorC72050XLr(1);

    public static C72051XLs A00() {
        if (A04 == null) {
            synchronized (C72051XLs.class) {
                if (A04 == null) {
                    A04 = new C72051XLs();
                }
            }
        }
        return A04;
    }

    @Override // X.AbstractC002400o
    public final void A01(Runnable runnable) {
        this.A00.A01(runnable);
    }

    @Override // X.AbstractC002400o
    public final void A02(Runnable runnable) {
        this.A00.A02(runnable);
    }

    @Override // X.AbstractC002400o
    public final boolean A03() {
        return this.A00.A03();
    }

    public C72051XLs() {
        C58337PtY c58337PtY = new C58337PtY();
        this.A01 = c58337PtY;
        this.A00 = c58337PtY;
    }
}
