package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import java.util.ArrayList;

/* renamed from: X.OoX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55705OoX implements InterfaceC73623Ro {
    public final Double A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return this.A02;
    }

    public C55705OoX(Double d, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = d;
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Double d = this.A00;
        if (d != null) {
            A1E.add(new FeatureData(null, this.A01, null, null, d.doubleValue(), 16374, 0L));
        }
        if (A1E.isEmpty()) {
            return MSW.A0L(C16930sl.A00, "scroll speed config parse error", false);
        }
        return MSZ.A0O(A1E);
    }
}
