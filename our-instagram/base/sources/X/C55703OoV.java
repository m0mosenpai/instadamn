package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.ArrayList;

/* renamed from: X.OoV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55703OoV implements InterfaceC73623Ro {
    public final C120595d4 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        C16930sl c16930sl;
        Type type;
        C120595d4 c120595d4 = this.A00;
        if (c120595d4 != null) {
            double d = c120595d4.A00;
            int i = 1;
            if (d == 0.0d) {
                d = 1.0d;
            } else if (d <= 0.3d) {
                i = 0;
            }
            ?? A1E = AbstractC166987dD.A1E();
            Type type2 = Type.A09;
            A1E.add(new FeatureData(type2, "3351", null, null, 0.0d, 16376, c120595d4.A05));
            Type type3 = Type.A06;
            A1E.add(new FeatureData(type3, "3252", null, null, d, 16372, 0L));
            A1E.add(new FeatureData(type3, "3627", null, null, c120595d4.A01, 16372, 0L));
            A1E.add(new FeatureData(type3, "3628", null, null, c120595d4.A02, 16372, 0L));
            A1E.add(new FeatureData(type3, "3629", null, null, c120595d4.A03, 16372, 0L));
            A1E.add(new FeatureData(type3, "3630", null, null, c120595d4.A04, 16372, 0L));
            A1E.add(new FeatureData(type3, "3649", null, null, d, 16372, 0L));
            A1E.add(new FeatureData(type2, "3650", null, null, 0.0d, 16376, i));
            c16930sl = A1E;
        } else {
            c16930sl = C16930sl.A00;
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj : c16930sl) {
            FeatureData featureData = (FeatureData) obj;
            if (!C14360o3.A0K(featureData.A03, "") && ((type = featureData.A02) != Type.A06 || featureData.A00 != -1.0d)) {
                if (type != Type.A09 || featureData.A01 != -1) {
                    A1E2.add(obj);
                }
            }
        }
        return MSZ.A0O(A1E2);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "StoryPrefetchImmediate";
    }

    public C55703OoV(C120595d4 c120595d4) {
        this.A00 = c120595d4;
    }
}
