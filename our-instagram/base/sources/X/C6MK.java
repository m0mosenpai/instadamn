package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.6MK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MK<T> implements InterfaceC74933Yj, List<T>, RandomAccess, InterfaceC019807s {
    public AbstractC75003Yq A00;

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC13370mN.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC13370mN.A01(this, objArr);
    }

    private final boolean A00(InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        C6MN c6mn;
        Object invoke;
        Snapshot A00;
        boolean z;
        do {
            Object obj = ST3.A00;
            synchronized (obj) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                i = c6mp.A00;
                c6mn = c6mp.A02;
            }
            C14360o3.A0A(c6mn);
            C64937TaD AF0 = c6mn.AF0();
            invoke = interfaceC16660sJ.invoke(AF0);
            C6MN A0P = AF0.A0P();
            if (C14360o3.A0K(A0P, c6mn)) {
                break;
            }
            AbstractC75003Yq abstractC75003Yq2 = this.A00;
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                synchronized (obj) {
                    int i2 = c6mp2.A00;
                    z = true;
                    if (i2 == i) {
                        c6mp2.A02 = A0P;
                        c6mp2.A00 = i2 + 1;
                        c6mp2.A01++;
                    } else {
                        z = false;
                    }
                }
            }
            AbstractC75013Yr.A0H(A00, this);
        } while (!z);
        return ((Boolean) invoke).booleanValue();
    }

    public final int A01() {
        AbstractC75003Yq abstractC75003Yq = this.A00;
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C6MP) AbstractC75013Yr.A08(abstractC75003Yq)).A01;
    }

    public final C6MP A02() {
        AbstractC75003Yq abstractC75003Yq = this.A00;
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C6MP) AbstractC75013Yr.A07(this, abstractC75003Yq);
    }

    @Override // X.InterfaceC74933Yj
    public final AbstractC75003Yq B6j() {
        return this.A00;
    }

    @Override // X.InterfaceC74933Yj
    public final void E5y(AbstractC75003Yq abstractC75003Yq) {
        abstractC75003Yq.A01 = this.A00;
        this.A00 = abstractC75003Yq;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        C6MN c6mn;
        boolean z;
        Snapshot A00;
        do {
            Object obj2 = ST3.A00;
            synchronized (obj2) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                i = c6mp.A00;
                c6mn = c6mp.A02;
            }
            C14360o3.A0A(c6mn);
            C6MN A7U = c6mn.A7U(obj);
            z = false;
            if (C14360o3.A0K(A7U, c6mn)) {
                return false;
            }
            AbstractC75003Yq abstractC75003Yq2 = this.A00;
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                synchronized (obj2) {
                    int i2 = c6mp2.A00;
                    if (i2 == i) {
                        c6mp2.A02 = A7U;
                        c6mp2.A01++;
                        c6mp2.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            AbstractC75013Yr.A0H(A00, this);
        } while (!z);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[SYNTHETIC] */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean addAll(java.util.Collection r11) {
        /*
            r10 = this;
        L0:
            java.lang.Object r9 = X.ST3.A00
            monitor-enter(r9)
            X.3Yq r0 = r10.A00     // Catch: java.lang.Throwable -> La9
            java.lang.String r8 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            X.C14360o3.A0C(r0, r8)     // Catch: java.lang.Throwable -> La9
            X.6MP r0 = (X.C6MP) r0     // Catch: java.lang.Throwable -> La9
            X.3Yq r0 = X.AbstractC75013Yr.A08(r0)     // Catch: java.lang.Throwable -> La9
            X.6MP r0 = (X.C6MP) r0     // Catch: java.lang.Throwable -> La9
            int r7 = r0.A00     // Catch: java.lang.Throwable -> La9
            X.6MN r5 = r0.A02     // Catch: java.lang.Throwable -> La9
            monitor-exit(r9)
            X.C14360o3.A0A(r5)
            boolean r0 = r5 instanceof X.C6ML
            if (r0 == 0) goto L63
            r3 = r5
            X.6ML r3 = (X.C6ML) r3
            int r1 = r3.size()
            int r0 = r11.size()
            int r1 = r1 + r0
            r0 = 32
            if (r1 > r0) goto L5e
            java.lang.Object[] r2 = r3.A00
            int r1 = r3.size()
            int r0 = r11.size()
            int r1 = r1 + r0
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r1)
            X.C14360o3.A07(r4)
            int r3 = r3.size()
            java.util.Iterator r2 = r11.iterator()
        L48:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r1 = r2.next()
            int r0 = r3 + 1
            r4[r3] = r1
            r3 = r0
            goto L48
        L58:
            X.6ML r6 = new X.6ML
            r6.<init>(r4)
            goto L6e
        L5e:
            X.TaD r0 = r3.AF0()
            goto L67
        L63:
            X.TaD r0 = r5.AF0()
        L67:
            r0.addAll(r11)
            X.6MN r6 = r0.A0P()
        L6e:
            boolean r0 = X.C14360o3.A0K(r6, r5)
            r5 = 0
            if (r0 != 0) goto La8
            X.3Yq r0 = r10.A00
            X.C14360o3.A0C(r0, r8)
            java.lang.Object r4 = X.AbstractC75013Yr.A07
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.Snapshot r3 = X.AbstractC75013Yr.A00()     // Catch: java.lang.Throwable -> La5
            X.3Yq r2 = X.AbstractC75013Yr.A02(r3, r10, r0)     // Catch: java.lang.Throwable -> La5
            X.6MP r2 = (X.C6MP) r2     // Catch: java.lang.Throwable -> La5
            monitor-enter(r9)     // Catch: java.lang.Throwable -> La5
            int r1 = r2.A00     // Catch: java.lang.Throwable -> La2
            if (r1 != r7) goto L99
            r2.A02 = r6     // Catch: java.lang.Throwable -> La2
            int r0 = r2.A01     // Catch: java.lang.Throwable -> La2
            int r0 = r0 + 1
            r2.A01 = r0     // Catch: java.lang.Throwable -> La2
            int r0 = r1 + 1
            r2.A00 = r0     // Catch: java.lang.Throwable -> La2
            r5 = 1
        L99:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r4)
            X.AbstractC75013Yr.A0H(r3, r10)
            if (r5 == 0) goto L0
            r5 = 1
            return r5
        La2:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        La8:
            return r5
        La9:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6MK.addAll(java.util.Collection):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        Snapshot A00;
        AbstractC75003Yq abstractC75003Yq = this.A00;
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (AbstractC75013Yr.A07) {
            A00 = AbstractC75013Yr.A00();
            C6MP c6mp = (C6MP) AbstractC75013Yr.A02(A00, this, abstractC75003Yq);
            synchronized (ST3.A00) {
                c6mp.A02 = C6ML.A01;
                c6mp.A00++;
                c6mp.A01++;
            }
        }
        AbstractC75013Yr.A0H(A00, this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new TTW(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C6MN c6mn;
        boolean z;
        Snapshot A00;
        do {
            Object obj2 = ST3.A00;
            synchronized (obj2) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                i = c6mp.A00;
                c6mn = c6mp.A02;
            }
            C14360o3.A0A(c6mn);
            C6MM c6mm = (C6MM) c6mn;
            int indexOf = c6mm.indexOf(obj);
            C6MN c6mn2 = c6mm;
            if (indexOf != -1) {
                c6mn2 = c6mm.EF1(indexOf);
            }
            z = false;
            if (C14360o3.A0K(c6mn2, c6mn)) {
                return false;
            }
            AbstractC75003Yq abstractC75003Yq2 = this.A00;
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                synchronized (obj2) {
                    int i2 = c6mp2.A00;
                    if (i2 == i) {
                        c6mp2.A02 = c6mn2;
                        c6mp2.A01++;
                        c6mp2.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            AbstractC75013Yr.A0H(A00, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        C6MN c6mn;
        boolean z;
        Snapshot A00;
        do {
            Object obj = ST3.A00;
            synchronized (obj) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                i = c6mp.A00;
                c6mn = c6mp.A02;
            }
            C14360o3.A0A(c6mn);
            C6MN EEr = c6mn.EEr(new DRU(collection, 21));
            z = false;
            if (C14360o3.A0K(EEr, c6mn)) {
                return false;
            }
            AbstractC75003Yq abstractC75003Yq2 = this.A00;
            C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC75013Yr.A07) {
                A00 = AbstractC75013Yr.A00();
                C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                synchronized (obj) {
                    int i2 = c6mp2.A00;
                    if (i2 == i) {
                        c6mp2.A02 = EEr;
                        c6mp2.A01++;
                        c6mp2.A00 = i2 + 1;
                        z = true;
                    }
                }
            }
            AbstractC75013Yr.A0H(A00, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return A00(new DRU(collection, 23));
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            return new TTN(this, i, i2);
        }
        SQP.A00("fromIndex or toIndex are out of bounds");
        throw C00O.createAndThrow();
    }

    public final String toString() {
        AbstractC75003Yq abstractC75003Yq = this.A00;
        C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        C6MP c6mp = (C6MP) AbstractC75013Yr.A08(abstractC75003Yq);
        StringBuilder sb = new StringBuilder();
        sb.append("SnapshotStateList(value=");
        sb.append(c6mp.A02);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Yq, X.6MP] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Yq, X.6MP] */
    public C6MK() {
        C6ML c6ml = C6ML.A01;
        ?? abstractC75003Yq = new AbstractC75003Yq();
        abstractC75003Yq.A02 = c6ml;
        if (C3Z5.A07()) {
            ?? abstractC75003Yq2 = new AbstractC75003Yq();
            abstractC75003Yq2.A02 = c6ml;
            abstractC75003Yq2.A00 = 1;
            abstractC75003Yq.A01 = abstractC75003Yq2;
        }
        this.A00 = abstractC75003Yq;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return A02().A02.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return A02().A02.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return A02().A02.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return A02().A02.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return A02().A02.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return A02().A02.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        C6MN c6mn;
        Snapshot A00;
        boolean z;
        Object obj2 = get(i);
        do {
            Object obj3 = ST3.A00;
            synchronized (obj3) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                i2 = c6mp.A00;
                c6mn = c6mp.A02;
            }
            C14360o3.A0A(c6mn);
            C6MN EP2 = c6mn.EP2(obj, i);
            if (!C14360o3.A0K(EP2, c6mn)) {
                AbstractC75003Yq abstractC75003Yq2 = this.A00;
                C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AbstractC75013Yr.A07) {
                    A00 = AbstractC75013Yr.A00();
                    C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                    synchronized (obj3) {
                        int i3 = c6mp2.A00;
                        z = true;
                        if (i3 == i2) {
                            c6mp2.A02 = EP2;
                            c6mp2.A00 = i3 + 1;
                        } else {
                            z = false;
                        }
                    }
                }
                AbstractC75013Yr.A0H(A00, this);
            } else {
                return obj2;
            }
        } while (!z);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return A02().A02.size();
    }

    @Override // X.InterfaceC74933Yj
    public final /* synthetic */ AbstractC75003Yq CpR(AbstractC75003Yq abstractC75003Yq, AbstractC75003Yq abstractC75003Yq2, AbstractC75003Yq abstractC75003Yq3) {
        return null;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        C6MN c6mn;
        Snapshot A00;
        boolean z;
        do {
            Object obj2 = ST3.A00;
            synchronized (obj2) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                i2 = c6mp.A00;
                c6mn = c6mp.A02;
            }
            C14360o3.A0A(c6mn);
            C6MN A7p = c6mn.A7p(obj, i);
            if (!C14360o3.A0K(A7p, c6mn)) {
                AbstractC75003Yq abstractC75003Yq2 = this.A00;
                C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AbstractC75013Yr.A07) {
                    A00 = AbstractC75013Yr.A00();
                    C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                    synchronized (obj2) {
                        int i3 = c6mp2.A00;
                        z = true;
                        if (i3 == i2) {
                            c6mp2.A02 = A7p;
                            c6mp2.A01++;
                            c6mp2.A00 = i3 + 1;
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

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return A00(new DHO(i, 1, collection));
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new TTW(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        int i2;
        C6MN c6mn;
        Snapshot A00;
        boolean z;
        Object obj = get(i);
        do {
            Object obj2 = ST3.A00;
            synchronized (obj2) {
                AbstractC75003Yq abstractC75003Yq = this.A00;
                C14360o3.A0C(abstractC75003Yq, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C6MP c6mp = (C6MP) AbstractC75013Yr.A08((C6MP) abstractC75003Yq);
                i2 = c6mp.A00;
                c6mn = c6mp.A02;
            }
            C14360o3.A0A(c6mn);
            C6MN EF1 = c6mn.EF1(i);
            if (!C14360o3.A0K(EF1, c6mn)) {
                AbstractC75003Yq abstractC75003Yq2 = this.A00;
                C14360o3.A0C(abstractC75003Yq2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AbstractC75013Yr.A07) {
                    A00 = AbstractC75013Yr.A00();
                    C6MP c6mp2 = (C6MP) AbstractC75013Yr.A02(A00, this, abstractC75003Yq2);
                    synchronized (obj2) {
                        int i3 = c6mp2.A00;
                        z = true;
                        if (i3 == i2) {
                            c6mp2.A02 = EF1;
                            c6mp2.A01++;
                            c6mp2.A00 = i3 + 1;
                        } else {
                            z = false;
                        }
                    }
                }
                AbstractC75013Yr.A0H(A00, this);
            } else {
                return obj;
            }
        } while (!z);
        return obj;
    }
}
