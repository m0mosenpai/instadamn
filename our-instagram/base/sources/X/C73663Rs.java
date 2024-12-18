package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.ArrayList;

/* renamed from: X.3Rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73663Rs implements InterfaceC73623Ro {
    public final InterfaceC19630xq A00;
    public final C0JM A01;

    public C73663Rs(C0JM c0jm, InterfaceC19630xq interfaceC19630xq) {
        C14360o3.A0B(interfaceC19630xq, 1);
        C14360o3.A0B(c0jm, 2);
        this.A00 = interfaceC19630xq;
        this.A01 = c0jm;
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        ArrayList arrayList = new ArrayList();
        long now = this.A01.now();
        InterfaceC19630xq interfaceC19630xq = this.A00;
        long j = interfaceC19630xq.getLong("last_app_foreground_timestamp", -1L);
        if (j != -1) {
            arrayList.add(new FeatureData(Type.A09, "3614", null, null, 0.0d, 16376, (now - j) / 1000));
        }
        long j2 = interfaceC19630xq.getLong("last_app_background_timestamp", -1L);
        if (j2 != -1) {
            arrayList.add(new FeatureData(Type.A09, "3613", null, null, 0.0d, 16376, (now - j2) / 1000));
        }
        if (arrayList.isEmpty()) {
            return new C3SN(C16930sl.A00, "no time since foreground background signals available", false);
        }
        return new C3SN(arrayList, null, true);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "TimeSinceAppForegroundBackground";
    }
}
