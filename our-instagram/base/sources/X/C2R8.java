package X;

import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.2R8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2R8 implements C0TR {
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
        int i;
        int i2;
        C25821No A00 = C25821No.A00();
        C14360o3.A07(A00);
        C25761Ni c25761Ni = A00.A0K;
        C14360o3.A07(c25761Ni);
        C25901Nx c25901Nx = c25761Ni.A03.A00;
        synchronized (c25901Nx) {
            i = c25901Nx.A02;
        }
        synchronized (c25901Nx) {
            i2 = c25901Nx.A01;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C0TJ(C0TP.A0S, i2 / 1024, i / 1024));
        return arrayList;
    }
}
