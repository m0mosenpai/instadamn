package X;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2QI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2QI implements InterfaceC46402Bc {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    @Override // X.InterfaceC46402Bc
    public final void DEJ(String str, String str2, int i, int i2) {
    }

    @Override // X.InterfaceC46412Bd
    public final void DnS(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2, Integer num) {
    }

    @Override // X.InterfaceC46402Bc
    public final void Do1(C2QE c2qe, String str, long j, long j2) {
    }

    @Override // X.InterfaceC46412Bd
    public final void DnP(C2QE c2qe, C49802Qq c49802Qq) {
        String A00;
        String str = c49802Qq.A06;
        if (str != null && (A00 = AbstractC49822Qs.A00(str)) != null) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            java.util.Set set = (java.util.Set) concurrentHashMap.get(A00);
            if (set == null) {
                set = new HashSet();
                concurrentHashMap.put(A00, set);
            }
            set.add(Integer.valueOf(str.hashCode()));
        }
    }

    @Override // X.InterfaceC46412Bd
    public final void DnQ(C2QE c2qe, C49802Qq c49802Qq) {
        String A00;
        String str = c49802Qq.A06;
        if (str != null && (A00 = AbstractC49822Qs.A00(str)) != null) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            java.util.Set set = (java.util.Set) concurrentHashMap.get(A00);
            if (set != null) {
                set.remove(Integer.valueOf(str.hashCode()));
                if (set.isEmpty()) {
                    concurrentHashMap.remove(A00);
                }
            }
        }
    }

    @Override // X.InterfaceC46412Bd
    public final void DnR(C2QE c2qe, C49802Qq c49802Qq, C49802Qq c49802Qq2) {
    }
}
