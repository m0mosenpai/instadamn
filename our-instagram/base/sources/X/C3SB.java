package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3SB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SB implements InterfaceC73623Ro {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        long j;
        C3R9[] c3r9Arr = FeatureData.A0E;
        Type type = Type.A09;
        int ordinal = C1CC.A09.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    j = -1;
                } else {
                    j = 2;
                }
            } else {
                j = 1;
            }
        } else {
            j = 0;
        }
        String str = "3699";
        List singletonList = Collections.singletonList(new FeatureData(type, str, null, 0 == true ? 1 : 0, 0.0d, 16376, j));
        C14360o3.A07(singletonList);
        return new C3SN(singletonList, null, true);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "AppStartType";
    }
}
