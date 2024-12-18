package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;

/* renamed from: X.OoU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55702OoU implements InterfaceC73623Ro {
    public final C1CM A00;

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        C3R9[] c3r9Arr = FeatureData.A0E;
        Type type = Type.A06;
        C1CM c1cm = this.A00;
        C1CM.A00(c1cm);
        FeatureData featureData = new FeatureData(type, "2619", null, null, c1cm.A00 / 100.0d, 16372, 0L);
        Type type2 = Type.A09;
        C1CM.A00(c1cm);
        String str = c1cm.A01;
        long j = -1;
        switch (str.hashCode()) {
            case -1054830049:
                if (str.equals("Unplugged")) {
                    j = 0;
                    break;
                }
                break;
            case 2201263:
                if (str.equals("Full")) {
                    j = 2;
                    break;
                }
                break;
            case 1500759697:
                if (str.equals("Charging")) {
                    j = 1;
                    break;
                }
                break;
        }
        return MSW.A0L(AbstractC16960so.A1Q(featureData, new FeatureData(type2, "2618", null, null, 0.0d, 16376, j)), null, true);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "BatteryStatusAndLevel";
    }

    public C55702OoU(C1CM c1cm) {
        this.A00 = c1cm;
    }
}
