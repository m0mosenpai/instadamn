package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.TTe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64770TTe<K, V> implements InterfaceC74933Yj, Map<K, V>, InterfaceC16540rz {
    public AbstractC75003Yq A00;
    public final Collection A01;
    public final java.util.Set A02;
    public final java.util.Set A03;

    public final Q67 A00() {
        AbstractC75003Yq abstractC75003Yq = this.A00;
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (Q67) AbstractC75013Yr.A07(this, abstractC75003Yq);
    }

    @Override // X.InterfaceC74933Yj
    public final AbstractC75003Yq B6j() {
        return this.A00;
    }

    @Override // X.InterfaceC74933Yj
    public final void E5y(AbstractC75003Yq abstractC75003Yq) {
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.A00 = abstractC75003Yq;
    }

    @Override // java.util.Map
    public final void clear() {
        Snapshot A00;
        AbstractC75003Yq abstractC75003Yq = this.A00;
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        Q67 q67 = (Q67) AbstractC75013Yr.A08(abstractC75003Yq);
        C57M c57m = C57M.A02;
        C14360o3.A0C(c57m, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        if (c57m != q67.A01) {
            AbstractC75003Yq abstractC75003Yq2 = this.A00;
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                Q67 q672 = (Q67) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                synchronized (ST4.A00) {
                    q672.A01 = c57m;
                    q672.A00++;
                }
            }
            AbstractC75013Yr.A0H(A00, this);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return this.A02;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return this.A03;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C57N c57n;
        int i;
        V put;
        Snapshot A00;
        boolean z;
        do {
            Object obj3 = ST4.A00;
            synchronized (obj3) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                Q67 A0I = AbstractC58320PtC.A0I(abstractC75003Yq, abstractC75003Yq);
                c57n = A0I.A01;
                i = A0I.A00;
            }
            C14360o3.A0A(c57n);
            C5VT AEz = c57n.AEz();
            put = AEz.put(obj, obj2);
            C57N AEM = AEz.AEM();
            if (C14360o3.A0K(AEM, c57n)) {
                break;
            }
            AbstractC75003Yq abstractC75003Yq2 = this.A00;
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                Q67 q67 = (Q67) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                synchronized (obj3) {
                    int i2 = q67.A00;
                    z = true;
                    if (i2 == i) {
                        q67.A01 = AEM;
                        q67.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AbstractC75013Yr.A0H(A00, this);
        } while (!z);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        C57N c57n;
        int i;
        Snapshot A00;
        boolean z;
        do {
            Object obj = ST4.A00;
            synchronized (obj) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                Q67 A0I = AbstractC58320PtC.A0I(abstractC75003Yq, abstractC75003Yq);
                c57n = A0I.A01;
                i = A0I.A00;
            }
            C14360o3.A0A(c57n);
            C5VT AEz = c57n.AEz();
            AEz.putAll(map);
            C57N AEM = AEz.AEM();
            if (!C14360o3.A0K(AEM, c57n)) {
                AbstractC75003Yq abstractC75003Yq2 = this.A00;
                C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                synchronized (AbstractC75013Yr.A07) {
                    A00 = AbstractC75013Yr.A00();
                    Q67 q67 = (Q67) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                    synchronized (obj) {
                        int i2 = q67.A00;
                        z = true;
                        if (i2 == i) {
                            q67.A01 = AEM;
                            q67.A00 = i2 + 1;
                        } else {
                            z = false;
                        }
                    }
                }
                AbstractC75013Yr.A0H(A00, this);
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        C57N c57n;
        int i;
        V remove;
        Snapshot A00;
        boolean z;
        do {
            Object obj2 = ST4.A00;
            synchronized (obj2) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                Q67 A0I = AbstractC58320PtC.A0I(abstractC75003Yq, abstractC75003Yq);
                c57n = A0I.A01;
                i = A0I.A00;
            }
            C14360o3.A0A(c57n);
            C5VT AEz = c57n.AEz();
            remove = AEz.remove(obj);
            C57N AEM = AEz.AEM();
            if (C14360o3.A0K(AEM, c57n)) {
                break;
            }
            AbstractC75003Yq abstractC75003Yq2 = this.A00;
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                Q67 q67 = (Q67) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                synchronized (obj2) {
                    int i2 = q67.A00;
                    z = true;
                    if (i2 == i) {
                        q67.A01 = AEM;
                        q67.A00 = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            AbstractC75013Yr.A0H(A00, this);
        } while (!z);
        return remove;
    }

    public final String toString() {
        AbstractC75003Yq abstractC75003Yq = this.A00;
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        Q67 q67 = (Q67) AbstractC75013Yr.A08(abstractC75003Yq);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SnapshotStateMap(value=");
        A1C.append(q67.A01);
        A1C.append(")@");
        return AbstractC58318PtA.A0l(A1C, hashCode());
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Q67, X.3Yq] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Q67, X.3Yq] */
    public C64770TTe() {
        C57M c57m = C57M.A02;
        C14360o3.A0C(c57m, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        ?? abstractC75003Yq = new AbstractC75003Yq();
        abstractC75003Yq.A01 = c57m;
        if (C3Z5.A07()) {
            ?? abstractC75003Yq2 = new AbstractC75003Yq();
            abstractC75003Yq2.A01 = c57m;
            abstractC75003Yq2.A00 = 1;
            abstractC75003Yq.A01 = abstractC75003Yq2;
        }
        this.A00 = abstractC75003Yq;
        this.A02 = new AbstractC64778TTm(this);
        this.A03 = new AbstractC64778TTm(this);
        this.A01 = new AbstractC64778TTm(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return A00().A01.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return A00().A01.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return A00().A01.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return A00().A01.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A00().A01.size();
    }

    @Override // X.InterfaceC74933Yj
    public final /* synthetic */ AbstractC75003Yq CpR(AbstractC75003Yq abstractC75003Yq, AbstractC75003Yq abstractC75003Yq2, AbstractC75003Yq abstractC75003Yq3) {
        return null;
    }
}
