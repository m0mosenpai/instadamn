package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Q5z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58730Q5z<K, V> extends AbstractC64778TTm<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            if (!(obj instanceof InterfaceC15590qF) || (obj instanceof InterfaceC16550s0)) {
                Map.Entry entry = (Map.Entry) obj;
                return C14360o3.A0K(this.A00.get(entry.getKey()), entry.getValue());
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.SPB, java.util.Iterator] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C64770TTe c64770TTe = this.A00;
        return new SPB(c64770TTe, AbstractC166997dE.A15(c64770TTe.A00().A01));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            if (!(obj instanceof InterfaceC15590qF) || (obj instanceof InterfaceC16550s0)) {
                return AbstractC167007dF.A1W(this.A00.remove(((Map.Entry) obj).getKey()));
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ST4.A00();
        throw C00O.createAndThrow();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        ST4.A00();
        throw C00O.createAndThrow();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.A00.remove(AbstractC166987dD.A1K(it).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C57N c57n;
        int i;
        boolean z;
        Snapshot A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(it);
            A18.put(A1K.getKey(), A1K.getValue());
        }
        C64770TTe c64770TTe = this.A00;
        boolean z2 = false;
        do {
            Object obj = ST4.A00;
            synchronized (obj) {
                AbstractC75003Yq abstractC75003Yq = c64770TTe.A00;
                Q67 A0I = AbstractC58320PtC.A0I(abstractC75003Yq, abstractC75003Yq);
                c57n = A0I.A01;
                i = A0I.A00;
            }
            C14360o3.A0A(c57n);
            C5VT AEz = c57n.AEz();
            Iterator it2 = c64770TTe.entrySet().iterator();
            z = true;
            while (it2.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(it2);
                if (!AbstractC58319PtB.A1V(A1K2, A18) || !C14360o3.A0K(A18.get(A1K2.getKey()), A1K2.getValue())) {
                    AEz.remove(A1K2.getKey());
                    z2 = true;
                }
            }
            C57N AEM = AEz.AEM();
            if (C14360o3.A0K(AEM, c57n)) {
                break;
            }
            AbstractC75003Yq abstractC75003Yq2 = c64770TTe.A00;
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                Q67 q67 = (Q67) AbstractC75013Yr.A02(A00, c64770TTe, abstractC75003Yq2);
                synchronized (obj) {
                    int i2 = q67.A00;
                    if (i2 == i) {
                        q67.A01 = AEM;
                        q67.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AbstractC75013Yr.A0H(A00, c64770TTe);
        } while (!z);
        return z2;
    }
}
