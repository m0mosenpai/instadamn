package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;

/* renamed from: X.OoS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55700OoS implements InterfaceC73623Ro {
    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "NetworkStatus";
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        long j;
        long j2;
        C15790qZ A04 = AbstractC15820qc.A04();
        C3R9[] c3r9Arr = FeatureData.A0E;
        Type type = Type.A09;
        int intValue = A04.A01.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 1) {
                    if (intValue == 3) {
                        j = 3;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    j = 2;
                }
            } else {
                j = 1;
            }
        } else {
            j = 0;
        }
        FeatureData featureData = new FeatureData(type, "3369", null, null, 0.0d, 16376, j);
        switch (A04.A00.intValue()) {
            case 1:
                j2 = 1;
                break;
            case 2:
                j2 = 2;
                break;
            case 3:
                j2 = 3;
                break;
            case 4:
                j2 = -1;
                break;
            default:
                j2 = 4;
                break;
        }
        return MSW.A0L(AbstractC16960so.A1Q(featureData, new FeatureData(type, "3757", null, null, 0.0d, 16376, j2)), null, true);
    }
}
