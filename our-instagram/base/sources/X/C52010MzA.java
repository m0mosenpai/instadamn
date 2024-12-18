package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.rsys.devicestats.gen.BatteryStatsReader;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.MzA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52010MzA extends BatteryStatsReader {
    public InterfaceC16660sJ A00;
    public final Context A01;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.facebook.rsys.devicestats.gen.BatteryStatsReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long getBatteryLevel() {
        /*
            r5 = this;
            android.content.Context r2 = r5.A01
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            r0 = 0
            android.content.Intent r2 = X.C0DJ.A00(r0, r2, r1)
            r4 = -1
            if (r2 == 0) goto L41
            java.lang.String r0 = "level"
            int r3 = r2.getIntExtra(r0, r4)
            java.lang.String r0 = "scale"
            int r4 = r2.getIntExtra(r0, r4)
            r1 = -1
            java.lang.String r0 = "status"
            int r1 = r2.getIntExtra(r0, r1)
            r0 = 2
            if (r1 == r0) goto L2a
            r0 = 5
            if (r1 != r0) goto L42
        L2a:
            r2 = 1
        L2b:
            int r0 = r3 * 100
            float r1 = (float) r0
            float r0 = (float) r4
            float r1 = r1 / r0
            int r0 = (int) r1
            X.O8h r1 = new X.O8h
            r1.<init>(r2, r0)
            X.0sJ r0 = r5.A00
            if (r0 == 0) goto L3d
            r0.invoke(r1)
        L3d:
            int r0 = r1.A00
            long r0 = (long) r0
            return r0
        L41:
            r3 = -1
        L42:
            r2 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52010MzA.getBatteryLevel():long");
    }

    @Override // com.facebook.rsys.devicestats.gen.BatteryStatsReader
    public final boolean isCharging() {
        Intent A00 = C0DJ.A00(null, this.A01, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (A00 != null) {
            int intExtra = A00.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C52010MzA(Context context, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = context;
        this.A00 = interfaceC16660sJ;
    }
}
