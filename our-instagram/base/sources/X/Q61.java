package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class Q61<K, V> extends AbstractC64778TTm<K, V, V> {
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.A00.containsValue(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.SPB, java.util.Iterator] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        C64770TTe c64770TTe = this.A00;
        return new SPB(c64770TTe, AbstractC166997dE.A15(c64770TTe.A00().A01));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        C64770TTe c64770TTe = this.A00;
        Iterator it = c64770TTe.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (C14360o3.A0K(((Map.Entry) obj2).getValue(), obj)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            c64770TTe.remove(entry.getKey());
            return true;
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
        C57N c57n;
        int i;
        boolean z;
        Snapshot A00;
        java.util.Set A0k = AbstractC001800i.A0k(collection);
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
            Iterator it = c64770TTe.entrySet().iterator();
            z = true;
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                if (A0k.contains(A1K.getValue())) {
                    AEz.remove(A1K.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C57N c57n;
        int i;
        boolean z;
        Snapshot A00;
        java.util.Set A0k = AbstractC001800i.A0k(collection);
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
            Iterator it = c64770TTe.entrySet().iterator();
            z = true;
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                if (!A0k.contains(A1K.getValue())) {
                    AEz.remove(A1K.getKey());
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
