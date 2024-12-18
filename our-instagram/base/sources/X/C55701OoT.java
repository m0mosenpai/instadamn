package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;

/* renamed from: X.OoT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55701OoT implements InterfaceC73623Ro {
    public final C4QF A00;

    public C55701OoT(C4QF c4qf) {
        C14360o3.A0B(c4qf, 1);
        this.A00 = c4qf;
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        long now;
        if (C1CC.A09 == C1CA.A03) {
            now = C1CC.A02();
        } else {
            long A00 = this.A00.A00("last_cold_start_key", -1L);
            if (A00 != -1) {
                now = AwakeTimeSinceBootClock.INSTANCE.now() - A00;
            }
            return MSW.A0L(C16930sl.A00, "no record of previous cold start", false);
        }
        if (now != -1) {
            return MSW.A0L(AbstractC166987dD.A1J(new FeatureData(Type.A09, "3615", null, null, 0.0d, 16376, now)), null, true);
        }
        return MSW.A0L(C16930sl.A00, "no record of previous cold start", false);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "TimeSpentSinceColdStart";
    }
}
