package X;

import java.util.Random;

/* renamed from: X.1yB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42831yB implements InterfaceC13000lm {
    public static volatile C42831yB A04;
    public int A00;
    public Random A01 = new Random();
    public final boolean A02;
    public final int A03;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }

    public static C42831yB A00() {
        if (A04 != null) {
            return A04;
        }
        throw new IllegalStateException("VideoBoundaryTestHelper never initialized");
    }

    public final int A01(C75363a3 c75363a3) {
        if (!this.A02 || c75363a3.A0T || this.A01.nextInt(100) >= this.A00) {
            return 0;
        }
        return this.A03;
    }

    public C42831yB(boolean z, int i, int i2) {
        this.A02 = z;
        this.A03 = i;
        this.A00 = i2;
    }
}
