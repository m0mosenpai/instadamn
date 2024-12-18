package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Random;

/* renamed from: X.1KE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KE implements C0f6 {
    public int A00;
    public final LightweightQuickPerformanceLogger A01;
    public final Random A02;

    @Override // X.C0f6
    public final C0f5 AEp(String str, int i) {
        return AEr(false, str, i, 0);
    }

    @Override // X.C0f6
    public final C0f5 AEq(Boolean bool, String str, int i) {
        return AEr(bool, str, i, 0);
    }

    @Override // X.C0f6
    public final C0f5 AEr(Boolean bool, String str, int i, int i2) {
        boolean z = false;
        if (this.A02.nextInt() % 1 != 0) {
            z = true;
        }
        return new C1Q4(this.A01, str, i, this.A00, i2, z, bool.booleanValue());
    }

    public C1KE(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Random random, int i) {
        this.A01 = lightweightQuickPerformanceLogger;
        this.A02 = random;
        this.A00 = i;
    }

    @Override // X.C0f6
    public final void EH8(int i, String str) {
        AEp(str, i).report();
    }
}
