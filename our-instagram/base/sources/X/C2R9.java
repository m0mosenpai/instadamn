package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.util.creation.RenderBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.2R9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2R9 implements C0TR {
    @Override // X.C0TR
    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public final boolean shouldCollectMetrics(int i) {
        return (i & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0;
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean shouldCollectMetrics(int i, C0TG c0tg) {
        return C0TQ.A00(c0tg, this, i);
    }

    @Override // X.C0TR
    public final /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    @Override // X.C0TR
    public final Collection getDataPoints() {
        ArrayList arrayList = new ArrayList();
        synchronized (RenderBridge.class) {
            if (!RenderBridge.A00) {
                try {
                    C09170dP.A0C("cj_moz");
                    RenderBridge.A00 = true;
                } catch (UnsatisfiedLinkError e) {
                    C0w9.A06("RenderBridge", "Could not load native library", e);
                }
            }
        }
        long cacheStats = RenderBridge.getCacheStats();
        arrayList.add(new C0TJ(C0TP.A0s, 0L, cacheStats & 281474976710655L));
        arrayList.add(new C0TJ(C0TP.A0t, 0L, ((-281474976710656L) & cacheStats) >> 48));
        return arrayList;
    }
}
