package X;

import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.2R4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2R4 implements C0TR, C0IK {
    public int A00;
    public final java.util.Set A01 = new HashSet();

    @Override // X.C0TR
    public final /* synthetic */ Map getIndexedDataPoints() {
        return null;
    }

    @Override // X.C0TR
    public final boolean shouldCollectMetrics(int i) {
        return (i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0;
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
        int size;
        java.util.Set set = this.A01;
        synchronized (set) {
            size = set.size();
        }
        ArrayList arrayList = new ArrayList();
        int i = this.A00;
        if (size > i) {
            i = set.size();
        }
        this.A00 = i;
        arrayList.add(new C0TJ(C0TP.A04, i, size));
        return arrayList;
    }

    public C2R4() {
        C0IL.A01(this);
    }

    @Override // X.C0IK
    public final void DRO(C0IG c0ig) {
        Integer num;
        Integer num2;
        if (c0ig.A00() && (num2 = c0ig.A01) != null) {
            java.util.Set set = this.A01;
            synchronized (set) {
                set.add(num2);
            }
        } else if (c0ig.A01() && (num = c0ig.A01) != null) {
            java.util.Set set2 = this.A01;
            synchronized (set2) {
                set2.remove(num);
            }
        }
    }
}
