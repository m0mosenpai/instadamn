package X;

import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.ConcurrentHashMultiset;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC75163Zh<E> extends AbstractCollection<E> implements InterfaceC75173Zi<E> {
    public transient java.util.Set A00;
    public transient java.util.Set A01;

    public int A03() {
        return ((ConcurrentHashMultiset) this).A00.size();
    }

    public int A04(Object element, int occurrences) {
        ConcurrentMap concurrentMap;
        Object obj;
        AtomicInteger atomicInteger;
        int i;
        AtomicInteger atomicInteger2;
        ConcurrentHashMultiset concurrentHashMultiset = (ConcurrentHashMultiset) this;
        element.getClass();
        if (occurrences == 0) {
            return concurrentHashMultiset.AL0(element);
        }
        if (occurrences <= 0) {
            throw new IllegalArgumentException(AnonymousClass001.A0b("occurrences", AbstractC58317Pt9.A00(413), occurrences));
        }
        do {
            concurrentMap = concurrentHashMultiset.A00;
            concurrentMap.getClass();
            try {
                obj = concurrentMap.get(element);
            } catch (ClassCastException | NullPointerException unused) {
                obj = null;
            }
            atomicInteger = (AtomicInteger) obj;
            if (atomicInteger == null && (atomicInteger = (AtomicInteger) concurrentMap.putIfAbsent(element, new AtomicInteger(occurrences))) == null) {
                return 0;
            }
            do {
                i = atomicInteger.get();
                if (i == 0) {
                    atomicInteger2 = new AtomicInteger(occurrences);
                    if (concurrentMap.putIfAbsent(element, atomicInteger2) == null) {
                        return 0;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused2) {
                        throw new IllegalArgumentException(AnonymousClass001.A02(occurrences, i, "Overflow adding ", " occurrences to a count of "));
                    }
                }
            } while (!atomicInteger.compareAndSet(i, AbstractC63123SdR.A00(i, occurrences)));
            return i;
        } while (!concurrentMap.replace(element, atomicInteger, atomicInteger2));
        return 0;
    }

    public Iterator A06() {
        ConcurrentHashMultiset concurrentHashMultiset = (ConcurrentHashMultiset) this;
        return new RQt(concurrentHashMultiset, new RQ3(concurrentHashMultiset));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = java.lang.Math.max(0, r2 - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r4.compareAndSet(r2, r1) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r5.remove(r7, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r2 = r4.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r2 == 0) goto L19;
     */
    @Override // X.InterfaceC75173Zi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int EEe(java.lang.Object r7, int r8) {
        /*
            r6 = this;
            r0 = r6
            com.google.common.collect.ConcurrentHashMultiset r0 = (com.google.common.collect.ConcurrentHashMultiset) r0
            java.util.concurrent.ConcurrentMap r5 = r0.A00
            r5.getClass()
            java.lang.Object r4 = r5.get(r7)     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r4 = 0
        Le:
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4
            r3 = 0
            if (r4 != 0) goto L15
        L13:
            r2 = 0
        L14:
            return r2
        L15:
            int r2 = r4.get()
            if (r2 == 0) goto L13
            int r0 = r2 - r8
            int r1 = java.lang.Math.max(r3, r0)
            boolean r0 = r4.compareAndSet(r2, r1)
            if (r0 == 0) goto L15
            if (r1 != 0) goto L14
            r5.remove(r7, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75163Zh.EEe(java.lang.Object, int):int");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final boolean add(Object element) {
        A04(element, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final boolean remove(Object element) {
        return EEe(element, 1) > 0;
    }

    public java.util.Set A02() {
        if (this instanceof ConcurrentHashMultiset) {
            return new RQx(((ConcurrentHashMultiset) this).A00.keySet());
        }
        return new RS3(this);
    }

    public Iterator A05() {
        throw new AssertionError("should never be called");
    }

    @Override // X.InterfaceC75173Zi
    public java.util.Set ARM() {
        java.util.Set set = this.A00;
        if (set == null) {
            java.util.Set A02 = A02();
            this.A00 = A02;
            return A02;
        }
        return set;
    }

    @Override // X.InterfaceC75173Zi
    public final java.util.Set entrySet() {
        java.util.Set set = this.A01;
        if (set == null) {
            if (this instanceof ConcurrentHashMultiset) {
                set = new RQO((ConcurrentHashMultiset) this);
            } else {
                set = new RS5(this);
            }
            this.A01 = set;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elementsToRemove) {
        if (elementsToRemove instanceof InterfaceC75173Zi) {
            elementsToRemove = ((InterfaceC75173Zi) elementsToRemove).ARM();
        }
        return ARM().removeAll(elementsToRemove);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC75173Zi) {
            InterfaceC75173Zi interfaceC75173Zi = (InterfaceC75173Zi) collection;
            if (interfaceC75173Zi instanceof AbstractMapBasedMultiset) {
                AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) interfaceC75173Zi;
                if (!abstractMapBasedMultiset.isEmpty()) {
                    C63033Sb7 c63033Sb7 = abstractMapBasedMultiset.A01;
                    int A02 = c63033Sb7.A02();
                    while (A02 >= 0) {
                        C18C.A01(A02, c63033Sb7.A02);
                        Object obj = c63033Sb7.A06[A02];
                        C63033Sb7 c63033Sb72 = abstractMapBasedMultiset.A01;
                        C18C.A01(A02, c63033Sb72.A02);
                        A04(obj, c63033Sb72.A05[A02]);
                        c63033Sb7 = abstractMapBasedMultiset.A01;
                        A02 = c63033Sb7.A03(A02);
                    }
                    return true;
                }
                return false;
            }
            if (!interfaceC75173Zi.isEmpty()) {
                for (AbstractC62759SPq abstractC62759SPq : interfaceC75173Zi.entrySet()) {
                    A04(abstractC62759SPq.A01(), abstractC62759SPq.A00());
                }
                return true;
            }
            return false;
        }
        if (!collection.isEmpty()) {
            return AbstractC63071Sbt.A02(this, collection.iterator());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final boolean contains(Object element) {
        if (AL0(element) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, X.InterfaceC75173Zi
    public final boolean equals(Object object) {
        return S36.A00(this, object);
    }

    @Override // java.util.Collection, X.InterfaceC75173Zi
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elementsToRetain) {
        elementsToRetain.getClass();
        if (elementsToRetain instanceof InterfaceC75173Zi) {
            elementsToRetain = ((InterfaceC75173Zi) elementsToRetain).ARM();
        }
        return ARM().retainAll(elementsToRetain);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
