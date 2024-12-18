package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Gou, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38066Gou implements InterfaceC43459JHx {
    public final long A00 = System.currentTimeMillis();
    public final InterfaceC43459JHx A01;
    public final C1F5 A02;

    @Override // X.InterfaceC43459JHx
    public final Collection Ab5() {
        Collection Ab5 = this.A01.Ab5();
        C1F5 c1f5 = this.A02;
        C1F5.A00(c1f5);
        Map map = c1f5.A02;
        synchronized (map) {
            HashSet A1H = AbstractC166987dD.A1H();
            A1H.addAll(map.keySet());
            Iterator it = A1H.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (!Ab5.contains(A1B)) {
                    map.remove(A1B);
                    c1f5.A00 = true;
                }
            }
        }
        C1F5.A01(c1f5);
        return Ab5;
    }

    @Override // X.InterfaceC43459JHx
    public final boolean CfA(String str) {
        return this.A01.CfA(str);
    }

    @Override // X.InterfaceC43459JHx
    public final long CgL(String str) {
        C1F5 c1f5 = this.A02;
        Object A02 = c1f5.A02(str, "eviction_timestamps");
        if ((A02 instanceof Long) && this.A00 > ((Number) A02).longValue()) {
            return Long.MIN_VALUE;
        }
        Object A022 = c1f5.A02(str, "eviction_priority");
        if (A022 instanceof Long) {
            return ((Number) A022).longValue();
        }
        return this.A01.CgL(str);
    }

    @Override // X.InterfaceC43459JHx
    public final long[] getItemInformation(String str) {
        long[] itemInformation = this.A01.getItemInformation(str);
        itemInformation[0] = CgL(str);
        return itemInformation;
    }

    @Override // X.InterfaceC43459JHx
    public final boolean remove(String str) {
        this.A02.A03(str);
        return this.A01.remove(str);
    }

    public C38066Gou(InterfaceC43459JHx interfaceC43459JHx, C1F5 c1f5) {
        this.A01 = interfaceC43459JHx;
        this.A02 = c1f5;
    }
}
