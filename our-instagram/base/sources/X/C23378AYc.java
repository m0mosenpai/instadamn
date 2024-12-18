package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;

/* renamed from: X.AYc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23378AYc implements InterfaceC73623Ro {
    public final AnonymousClass946 A00;

    public C23378AYc(AnonymousClass946 anonymousClass946) {
        C14360o3.A0B(anonymousClass946, 1);
        this.A00 = anonymousClass946;
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        double d;
        C3R9[] c3r9Arr = FeatureData.A0E;
        InterfaceC10260gi interfaceC10260gi = this.A00.A00;
        if (interfaceC10260gi != null) {
            d = interfaceC10260gi.Az2(37168638390436324L);
        } else {
            d = 0.0d;
        }
        return new C3SN(AbstractC166987dD.A1J(new FeatureData(null, "111", null, null, d, 16374, 0L)), null, true);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "AdsDwellThreshold";
    }
}
