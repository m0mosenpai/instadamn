package com.google.common.collect;

import X.AbstractC139326Sn;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25229BEm;
import X.AbstractC38301qK;
import X.AbstractC63123SdR;
import X.AbstractConcurrentMapC60760RQo;
import X.C18B;
import X.C18C;
import X.C18H;
import X.C18K;
import X.C18L;
import X.C18M;
import X.C18P;
import X.C18S;
import X.C60765RRe;
import X.C683035s;
import com.facebook.common.dextricks.Constants;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap.Segment;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class MapMakerInternalMap<K, V, E extends C18P<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final C18K A07 = new C18K() { // from class: X.18J
        @Override // X.C18K
        public final /* bridge */ /* synthetic */ C18K AKu(C18P queue, ReferenceQueue entry) {
            return this;
        }

        @Override // X.C18K
        public final /* bridge */ /* synthetic */ C18P B2O() {
            return null;
        }

        @Override // X.C18K
        public final void clear() {
        }

        @Override // X.C18K
        public final Object get() {
            return null;
        }
    };
    public static final long serialVersionUID = 5;
    public transient Collection A00;
    public transient Set A01;
    public transient Set A02;
    public final transient int A03;
    public final transient int A04;
    public final transient C18H A05;
    public final transient Segment[] A06;
    public final int concurrencyLevel;
    public final C18M keyEquivalence;

    /* loaded from: classes10.dex */
    public abstract class AbstractSerializationProxy<K, V> extends AbstractConcurrentMapC60760RQo<K, V> implements Serializable {
        public static final long serialVersionUID = 3;
        public transient ConcurrentMap A00;
        public final int concurrencyLevel;
        public final C18M keyEquivalence;
        public final Strength keyStrength;
        public final C18M valueEquivalence;
        public final Strength valueStrength;

        @Override // X.AbstractC451425u
        public final /* bridge */ /* synthetic */ Object A00() {
            return this.A00;
        }

        public AbstractSerializationProxy(C18M keyStrength, C18M valueStrength, Strength keyEquivalence, Strength valueEquivalence, ConcurrentMap concurrencyLevel, int delegate) {
            this.keyStrength = keyEquivalence;
            this.valueStrength = valueEquivalence;
            this.keyEquivalence = keyStrength;
            this.valueEquivalence = valueStrength;
            this.concurrencyLevel = delegate;
            this.A00 = concurrencyLevel;
        }
    }

    /* loaded from: classes.dex */
    public abstract class Segment extends ReentrantLock {
        public volatile int count;
        public final MapMakerInternalMap map;
        public int modCount;
        public final AtomicInteger readCount = new AtomicInteger();
        public volatile AtomicReferenceArray table;
        public int threshold;

        public void A03() {
        }

        public void A04() {
        }

        public final void A08(ReferenceQueue keyReferenceQueue) {
            int i = 0;
            do {
                Object poll = keyReferenceQueue.poll();
                if (poll != null) {
                    C18P c18p = (C18P) poll;
                    MapMakerInternalMap mapMakerInternalMap = this.map;
                    int BD2 = c18p.BD2();
                    Segment A01 = mapMakerInternalMap.A01(BD2);
                    A01.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = A01.table;
                        int length = BD2 & (atomicReferenceArray.length() - 1);
                        C18P c18p2 = (C18P) atomicReferenceArray.get(length);
                        C18P c18p3 = c18p2;
                        while (true) {
                            if (c18p3 == null) {
                                break;
                            }
                            if (c18p3 != c18p) {
                                c18p3 = c18p3.BWo();
                            } else {
                                A01.modCount++;
                                C18P A00 = A01.A00(c18p2, c18p3);
                                int i2 = A01.count - 1;
                                atomicReferenceArray.set(length, A00);
                                A01.count = i2;
                                break;
                            }
                        }
                        A01.unlock();
                        i++;
                    } catch (Throwable th) {
                        A01.unlock();
                        throw th;
                    }
                } else {
                    return;
                }
            } while (i != 16);
        }

        public final void A09(ReferenceQueue valueReferenceQueue) {
            int i = 0;
            do {
                Object poll = valueReferenceQueue.poll();
                if (poll != null) {
                    C18K c18k = (C18K) poll;
                    MapMakerInternalMap mapMakerInternalMap = this.map;
                    C18P B2O = c18k.B2O();
                    int BD2 = B2O.BD2();
                    Segment A01 = mapMakerInternalMap.A01(BD2);
                    Object key = B2O.getKey();
                    A01.lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = A01.table;
                        int length = (atomicReferenceArray.length() - 1) & BD2;
                        C18P c18p = (C18P) atomicReferenceArray.get(length);
                        C18P c18p2 = c18p;
                        while (true) {
                            if (c18p2 == null) {
                                break;
                            }
                            Object key2 = c18p2.getKey();
                            if (c18p2.BD2() == BD2 && key2 != null && A01.map.keyEquivalence.A01(key, key2)) {
                                if (((C18S) c18p2).CEa() == c18k) {
                                    A01.modCount++;
                                    C18P A00 = A01.A00(c18p, c18p2);
                                    int i2 = A01.count - 1;
                                    atomicReferenceArray.set(length, A00);
                                    A01.count = i2;
                                }
                            } else {
                                c18p2 = c18p2.BWo();
                            }
                        }
                        A01.unlock();
                        i++;
                    } catch (Throwable th) {
                        A01.unlock();
                        throw th;
                    }
                } else {
                    return;
                }
            } while (i != 16);
        }

        public final C18P A00(C18P first, C18P entry) {
            int i = this.count;
            C18P BWo = entry.BWo();
            while (first != entry) {
                C18P AKq = this.map.A05.AKq(first, BWo, this);
                if (AKq != null) {
                    BWo = AKq;
                } else {
                    i--;
                }
                first = first.BWo();
            }
            this.count = i;
            return BWo;
        }

        public final C18P A01(Object key, int hash) {
            if (this.count != 0) {
                for (C18P c18p = (C18P) this.table.get((r1.length() - 1) & hash); c18p != null; c18p = c18p.BWo()) {
                    if (c18p.BD2() == hash) {
                        Object key2 = c18p.getKey();
                        if (key2 == null) {
                            A07();
                        } else if (this.map.keyEquivalence.A01(key, key2)) {
                            return c18p;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        public final void A05() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                A06();
            }
        }

        public boolean containsValue(Object value) {
            Object value2;
            try {
                if (this.count != 0) {
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (C18P c18p = (C18P) atomicReferenceArray.get(i); c18p != null; c18p = c18p.BWo()) {
                            if (c18p.getKey() != null && (value2 = c18p.getValue()) != null) {
                                if (this.map.valueEquivalence().A01(value, value2)) {
                                    A05();
                                    return true;
                                }
                            } else {
                                A07();
                            }
                        }
                    }
                }
                return false;
            } finally {
                A05();
            }
        }

        public Segment(MapMakerInternalMap map, int initialCapacity) {
            this.map = map;
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(initialCapacity);
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        public final Object A02(int key, Object hash, Object value, boolean onlyIfAbsent) {
            lock();
            try {
                A06();
                int i = this.count + 1;
                if (i > this.threshold) {
                    AtomicReferenceArray atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    if (length < 1073741824) {
                        int i2 = this.count;
                        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
                        this.threshold = (atomicReferenceArray2.length() * 3) / 4;
                        int length2 = atomicReferenceArray2.length() - 1;
                        for (int i3 = 0; i3 < length; i3++) {
                            C18P c18p = (C18P) atomicReferenceArray.get(i3);
                            if (c18p != null) {
                                C18P BWo = c18p.BWo();
                                int BD2 = c18p.BD2() & length2;
                                if (BWo == null) {
                                    atomicReferenceArray2.set(BD2, c18p);
                                } else {
                                    C18P c18p2 = c18p;
                                    do {
                                        int BD22 = BWo.BD2() & length2;
                                        if (BD22 != BD2) {
                                            c18p2 = BWo;
                                            BD2 = BD22;
                                        }
                                        BWo = BWo.BWo();
                                    } while (BWo != null);
                                    atomicReferenceArray2.set(BD2, c18p2);
                                    while (c18p != c18p2) {
                                        int BD23 = c18p.BD2() & length2;
                                        C18P AKq = this.map.A05.AKq(c18p, (C18P) atomicReferenceArray2.get(BD23), this);
                                        if (AKq != null) {
                                            atomicReferenceArray2.set(BD23, AKq);
                                        } else {
                                            i2--;
                                        }
                                        c18p = c18p.BWo();
                                    }
                                }
                            }
                        }
                        this.table = atomicReferenceArray2;
                        this.count = i2;
                    }
                    i = this.count + 1;
                }
                AtomicReferenceArray atomicReferenceArray3 = this.table;
                int length3 = (atomicReferenceArray3.length() - 1) & key;
                C18P c18p3 = (C18P) atomicReferenceArray3.get(length3);
                C18P c18p4 = c18p3;
                while (true) {
                    if (c18p4 != null) {
                        Object key2 = c18p4.getKey();
                        if (c18p4.BD2() == key && key2 != null && this.map.keyEquivalence.A01(hash, key2)) {
                            Object value2 = c18p4.getValue();
                            if (value2 == null) {
                                this.modCount++;
                                this.map.A05.Egj(c18p4, this, value);
                                this.count = this.count;
                            } else {
                                if (!onlyIfAbsent) {
                                    this.modCount++;
                                    this.map.A05.Egj(c18p4, this, value);
                                }
                                return value2;
                            }
                        } else {
                            c18p4 = c18p4.BWo();
                        }
                    } else {
                        this.modCount++;
                        C18P CsK = this.map.A05.CsK(c18p3, this, hash, key);
                        this.map.A05.Egj(CsK, this, value);
                        atomicReferenceArray3.set(length3, CsK);
                        this.count = i;
                        break;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public final void A06() {
            if (tryLock()) {
                try {
                    A04();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public final void A07() {
            if (tryLock()) {
                try {
                    A04();
                } finally {
                    unlock();
                }
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        public static final long serialVersionUID = 3;

        private Object readResolve() {
            return this.A00;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void readObject(ObjectInputStream in) {
            in.defaultReadObject();
            int readInt = in.readInt();
            C18B c18b = new C18B();
            c18b.A03(readInt);
            c18b.A04(this.keyStrength);
            c18b.A05(this.valueStrength);
            C18M c18m = this.keyEquivalence;
            C18M c18m2 = c18b.A02;
            C18C.A0B(c18m2, "key equivalence was already set to %s", AbstractC25229BEm.A1Z(c18m2));
            c18m.getClass();
            c18b.A02 = c18m;
            c18b.A05 = true;
            c18b.A02(this.concurrencyLevel);
            this.A00 = c18b.A00();
            while (true) {
                Object readObject = in.readObject();
                if (readObject == null) {
                    return;
                }
                this.A00.put(readObject, in.readObject());
            }
        }

        private void writeObject(ObjectOutputStream out) {
            out.defaultWriteObject();
            out.writeInt(this.A00.size());
            Iterator A15 = AbstractC166997dE.A15(this.A00);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                out.writeObject(A1K.getKey());
                out.writeObject(A1K.getValue());
            }
            out.writeObject(null);
        }
    }

    /* loaded from: classes10.dex */
    public final class StrongKeyStrongValueSegment extends Segment {
    }

    /* loaded from: classes.dex */
    public final class StrongKeyWeakValueSegment extends Segment {
        public final ReferenceQueue queueForValues;

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void A03() {
            do {
            } while (this.queueForValues.poll() != null);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void A04() {
            A09(this.queueForValues);
        }

        public StrongKeyWeakValueSegment(MapMakerInternalMap map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForValues = new ReferenceQueue();
        }
    }

    /* loaded from: classes3.dex */
    public final class WeakKeyStrongValueSegment extends Segment {
        public final ReferenceQueue queueForKeys;

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void A03() {
            do {
            } while (this.queueForKeys.poll() != null);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void A04() {
            A08(this.queueForKeys);
        }

        public WeakKeyStrongValueSegment(MapMakerInternalMap map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForKeys = new ReferenceQueue();
        }
    }

    /* loaded from: classes2.dex */
    public final class WeakKeyWeakValueSegment extends Segment {
        public final ReferenceQueue queueForKeys;
        public final ReferenceQueue queueForValues;

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void A03() {
            do {
            } while (this.queueForKeys.poll() != null);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public final void A04() {
            A08(this.queueForKeys);
            A09(this.queueForValues);
        }

        public WeakKeyWeakValueSegment(MapMakerInternalMap map, int initialCapacity) {
            super(map, initialCapacity);
            this.queueForKeys = new ReferenceQueue();
            this.queueForValues = new ReferenceQueue();
        }
    }

    public Object writeReplace() {
        C18H c18h = this.A05;
        return new AbstractSerializationProxy(this.keyEquivalence, c18h.FDY().A00(), c18h.CgX(), c18h.FDY(), this, this.concurrencyLevel);
    }

    private void readObject(ObjectInputStream in) {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int A00(Object key) {
        int A00 = this.keyEquivalence.A00(key);
        int i = A00 + ((A00 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public final Segment A01(int hash) {
        return this.A06[(hash >>> this.A04) & this.A03];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Segment[] segmentArr = this.A06;
        int length = segmentArr.length;
        for (int i = 0; i < length; i++) {
            Segment segment = segmentArr[i];
            if (segment.count != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = segment.table;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    segment.A03();
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                } finally {
                    segment.unlock();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        C18P A01;
        if (key == null) {
            return false;
        }
        int A00 = A00(key);
        Segment A012 = A01(A00);
        try {
            boolean z = false;
            if (A012.count != 0 && (A01 = A012.A01(key, A00)) != null) {
                if (A01.getValue() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            A012.A05();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object value) {
        Object value2;
        if (value == null) {
            return false;
        }
        Segment[] segmentArr = this.A06;
        long j = -1;
        int i = 0;
        do {
            long j2 = 0;
            for (Segment segment : segmentArr) {
                AtomicReferenceArray atomicReferenceArray = segment.table;
                for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                    for (C18P c18p = (C18P) atomicReferenceArray.get(i2); c18p != null; c18p = c18p.BWo()) {
                        if (c18p.getKey() != null && (value2 = c18p.getValue()) != null) {
                            if (valueEquivalence().A01(value, value2)) {
                                return true;
                            }
                        } else {
                            segment.A07();
                        }
                    }
                }
                j2 += segment.modCount;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        } while (i < 3);
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.A01;
        if (set == null) {
            AbstractC139326Sn<Map.Entry<K, V>> abstractC139326Sn = new AbstractC139326Sn<Map.Entry<K, V>>() { // from class: X.6Sm
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
                    MapMakerInternalMap.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object o) {
                    Map.Entry entry;
                    Object key;
                    MapMakerInternalMap mapMakerInternalMap;
                    V v;
                    if (!(o instanceof Map.Entry) || (key = (entry = (Map.Entry) o).getKey()) == null || (v = (mapMakerInternalMap = MapMakerInternalMap.this).get(key)) == null || !mapMakerInternalMap.valueEquivalence().A01(entry.getValue(), v)) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean isEmpty() {
                    return MapMakerInternalMap.this.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return new AbstractC116005Nc(MapMakerInternalMap.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(Object o) {
                    Map.Entry entry;
                    Object key;
                    if (!(o instanceof Map.Entry) || (key = (entry = (Map.Entry) o).getKey()) == null || !MapMakerInternalMap.this.remove(key, entry.getValue())) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return MapMakerInternalMap.this.size();
                }
            };
            this.A01 = abstractC139326Sn;
            return abstractC139326Sn;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object key) {
        Object value;
        if (key == null) {
            return null;
        }
        int A00 = A00(key);
        Segment A01 = A01(A00);
        try {
            C18P A012 = A01.A01(key, A00);
            if (A012 != null) {
                value = A012.getValue();
                if (value == null) {
                    A01.A07();
                }
            } else {
                value = null;
            }
            return value;
        } finally {
            A01.A05();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment[] segmentArr = this.A06;
        long j = 0;
        int i = 0;
        while (true) {
            int length = segmentArr.length;
            if (i < length) {
                if (segmentArr[i].count != 0) {
                    return false;
                }
                j += segmentArr[i].modCount;
                i++;
            } else {
                if (j == 0) {
                    return true;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    if (segmentArr[i2].count != 0) {
                        return false;
                    }
                    j -= segmentArr[i2].modCount;
                }
                if (j != 0) {
                    return false;
                }
                return true;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.A02;
        if (set == null) {
            C60765RRe c60765RRe = new C60765RRe(this);
            this.A02 = c60765RRe;
            return c60765RRe;
        }
        return set;
    }

    public Strength keyStrength() {
        return this.A05.CgX();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r2 = r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r6.getValue() != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r4.modCount++;
        r1 = r4.A00(r7, r6);
        r0 = r4.count - 1;
        r5.set(r3, r1);
        r4.count = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        return r2;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r2 = r9.A00(r10)
            com.google.common.collect.MapMakerInternalMap$Segment r4 = r9.A01(r2)
            r4.lock()
            r4.A06()     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r4.table     // Catch: java.lang.Throwable -> L6c
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L6c
            int r3 = r0 + (-1)
            r3 = r3 & r2
            java.lang.Object r7 = r5.get(r3)     // Catch: java.lang.Throwable -> L6c
            X.18P r7 = (X.C18P) r7     // Catch: java.lang.Throwable -> L6c
            r6 = r7
        L22:
            r8 = 0
            if (r6 == 0) goto L68
            java.lang.Object r1 = r6.getKey()     // Catch: java.lang.Throwable -> L6c
            int r0 = r6.BD2()     // Catch: java.lang.Throwable -> L6c
            if (r0 != r2) goto L49
            if (r1 == 0) goto L49
            com.google.common.collect.MapMakerInternalMap r0 = r4.map     // Catch: java.lang.Throwable -> L6c
            X.18M r0 = r0.keyEquivalence     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.A01(r10, r1)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L49
            java.lang.Object r2 = r6.getValue()     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L51
            java.lang.Object r1 = r6.getValue()     // Catch: java.lang.Throwable -> L6c
            r0 = 0
            if (r1 != 0) goto L4f
            goto L4e
        L49:
            X.18P r6 = r6.BWo()     // Catch: java.lang.Throwable -> L6c
            goto L22
        L4e:
            r0 = 1
        L4f:
            if (r0 == 0) goto L68
        L51:
            int r0 = r4.modCount     // Catch: java.lang.Throwable -> L6c
            int r0 = r0 + 1
            r4.modCount = r0     // Catch: java.lang.Throwable -> L6c
            X.18P r1 = r4.A00(r7, r6)     // Catch: java.lang.Throwable -> L6c
            int r0 = r4.count     // Catch: java.lang.Throwable -> L6c
            int r0 = r0 + (-1)
            r5.set(r3, r1)     // Catch: java.lang.Throwable -> L6c
            r4.count = r0     // Catch: java.lang.Throwable -> L6c
            r4.unlock()
            return r2
        L68:
            r4.unlock()
            return r8
        L6c:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i = 0; i < this.A06.length; i++) {
            j += r5[i].count;
        }
        return AbstractC38301qK.A02(j);
    }

    public C18M valueEquivalence() {
        return this.A05.FDY().A00();
    }

    public Strength valueStrength() {
        return this.A05.FDY();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.A00;
        if (collection == null) {
            AbstractCollection<V> abstractCollection = new AbstractCollection<V>() { // from class: X.5sR
                @Override // java.util.AbstractCollection, java.util.Collection
                public final void clear() {
                    MapMakerInternalMap.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean contains(Object o) {
                    return MapMakerInternalMap.this.containsValue(o);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean isEmpty() {
                    return MapMakerInternalMap.this.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
                    return new AbstractC116005Nc(MapMakerInternalMap.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final int size() {
                    return MapMakerInternalMap.this.size();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final Object[] toArray(Object[] a) {
                    ArrayList arrayList = new ArrayList(size());
                    AbstractC63071Sbt.A02(arrayList, iterator());
                    return arrayList.toArray(a);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final Object[] toArray() {
                    ArrayList arrayList = new ArrayList(size());
                    AbstractC63071Sbt.A02(arrayList, iterator());
                    return arrayList.toArray();
                }
            };
            this.A00 = abstractCollection;
            return abstractCollection;
        }
        return collection;
    }

    public MapMakerInternalMap(C18B builder, C18H entryHelper) {
        int i = builder.A00;
        int min = Math.min(i == -1 ? 4 : i, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        this.concurrencyLevel = min;
        C18M c18m = builder.A02;
        Strength strength = builder.A03;
        this.keyEquivalence = c18m != null ? c18m : (strength == null ? Strength.A00 : strength).A00();
        this.A05 = entryHelper;
        int i2 = builder.A01;
        int min2 = Math.min(i2 == -1 ? 16 : i2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 < min) {
            i6++;
            i5 <<= 1;
        }
        this.A04 = 32 - i6;
        this.A03 = i5 - 1;
        this.A06 = new Segment[i5];
        int i7 = min2 / i5;
        while (i4 < (i5 * i7 < min2 ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Segment[] segmentArr = this.A06;
            if (i3 < segmentArr.length) {
                segmentArr[i3] = this.A05.CsX(this, i4);
                i3++;
            } else {
                return;
            }
        }
    }

    public C18P copyEntry(C18P original, C18P newNext) {
        Segment A01 = A01(original.BD2());
        return A01.map.A05.AKq(original, newNext, A01);
    }

    public boolean isLiveForTesting(C18P entry) {
        Segment A01 = A01(entry.BD2());
        if (entry.getKey() != null && entry.getValue() != null) {
            return true;
        }
        A01.A07();
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object key, Object value) {
        key.getClass();
        value.getClass();
        int A00 = A00(key);
        return A01(A00).A02(A00, key, value, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map m) {
        for (Map.Entry<K, V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object key, Object value) {
        key.getClass();
        value.getClass();
        int A00 = A00(key);
        return A01(A00).A02(A00, key, value, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replace(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r10.getClass()
            r11.getClass()
            int r8 = r9.A00(r10)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r9.A01(r8)
            r2.lock()
            r2.A06()     // Catch: java.lang.Throwable -> L7c
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.table     // Catch: java.lang.Throwable -> L7c
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L7c
            int r4 = r0 + (-1)
            r4 = r4 & r8
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> L7c
            X.18P r6 = (X.C18P) r6     // Catch: java.lang.Throwable -> L7c
            r3 = r6
        L24:
            r7 = 0
            if (r3 == 0) goto L78
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L7c
            int r0 = r3.BD2()     // Catch: java.lang.Throwable -> L7c
            if (r0 != r8) goto L4b
            if (r1 == 0) goto L4b
            com.google.common.collect.MapMakerInternalMap r0 = r2.map     // Catch: java.lang.Throwable -> L7c
            X.18M r0 = r0.keyEquivalence     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r0.A01(r10, r1)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L4b
            java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Throwable -> L7c
            if (r1 != 0) goto L67
            java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Throwable -> L7c
            r0 = 0
            if (r1 != 0) goto L51
            goto L50
        L4b:
            X.18P r3 = r3.BWo()     // Catch: java.lang.Throwable -> L7c
            goto L24
        L50:
            r0 = 1
        L51:
            if (r0 == 0) goto L78
            int r0 = r2.modCount     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 + 1
            r2.modCount = r0     // Catch: java.lang.Throwable -> L7c
            X.18P r1 = r2.A00(r6, r3)     // Catch: java.lang.Throwable -> L7c
            int r0 = r2.count     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 + (-1)
            r5.set(r4, r1)     // Catch: java.lang.Throwable -> L7c
            r2.count = r0     // Catch: java.lang.Throwable -> L7c
            goto L78
        L67:
            int r0 = r2.modCount     // Catch: java.lang.Throwable -> L7c
            int r0 = r0 + 1
            r2.modCount = r0     // Catch: java.lang.Throwable -> L7c
            com.google.common.collect.MapMakerInternalMap r0 = r2.map     // Catch: java.lang.Throwable -> L7c
            X.18H r0 = r0.A05     // Catch: java.lang.Throwable -> L7c
            r0.Egj(r3, r2, r11)     // Catch: java.lang.Throwable -> L7c
            r2.unlock()
            return r1
        L78:
            r2.unlock()
            return r7
        L7c:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public abstract class Strength {
        public static final Strength A00 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public final C18M A00() {
                return C18L.A00;
            }
        };
        public static final Strength A01 = new Strength() { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public final C18M A00() {
                return C683035s.A00;
            }
        };

        public abstract C18M A00();

        public Strength(String $enum$name, int $enum$ordinal) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r3.map.valueEquivalence().A01(r12, r5.getValue()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        r3.modCount++;
        r1 = r3.A00(r6, r5);
        r0 = r3.count - 1;
        r4.set(r2, r1);
        r3.count = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r5.getValue() != null) goto L21;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            if (r11 == 0) goto L74
            if (r12 == 0) goto L74
            int r9 = r10.A00(r11)
            com.google.common.collect.MapMakerInternalMap$Segment r3 = r10.A01(r9)
            r3.lock()
            r3.A06()     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r3.table     // Catch: java.lang.Throwable -> L6f
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L6f
            r8 = 1
            int r2 = r2 - r8
            r2 = r2 & r9
            java.lang.Object r6 = r4.get(r2)     // Catch: java.lang.Throwable -> L6f
            X.18P r6 = (X.C18P) r6     // Catch: java.lang.Throwable -> L6f
            r5 = r6
        L22:
            r7 = 0
            if (r5 == 0) goto L6b
            java.lang.Object r1 = r5.getKey()     // Catch: java.lang.Throwable -> L6f
            int r0 = r5.BD2()     // Catch: java.lang.Throwable -> L6f
            if (r0 != r9) goto L4c
            if (r1 == 0) goto L4c
            com.google.common.collect.MapMakerInternalMap r0 = r3.map     // Catch: java.lang.Throwable -> L6f
            X.18M r0 = r0.keyEquivalence     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.A01(r11, r1)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L4c
            java.lang.Object r1 = r5.getValue()     // Catch: java.lang.Throwable -> L6f
            com.google.common.collect.MapMakerInternalMap r0 = r3.map     // Catch: java.lang.Throwable -> L6f
            X.18M r0 = r0.valueEquivalence()     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.A01(r12, r1)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L53
            goto L51
        L4c:
            X.18P r5 = r5.BWo()     // Catch: java.lang.Throwable -> L6f
            goto L22
        L51:
            r7 = 1
            goto L59
        L53:
            java.lang.Object r0 = r5.getValue()     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L6b
        L59:
            int r0 = r3.modCount     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 + 1
            r3.modCount = r0     // Catch: java.lang.Throwable -> L6f
            X.18P r1 = r3.A00(r6, r5)     // Catch: java.lang.Throwable -> L6f
            int r0 = r3.count     // Catch: java.lang.Throwable -> L6f
            int r0 = r0 - r8
            r4.set(r2, r1)     // Catch: java.lang.Throwable -> L6f
            r3.count = r0     // Catch: java.lang.Throwable -> L6f
        L6b:
            r3.unlock()
            return r7
        L6f:
            r0 = move-exception
            r3.unlock()
            throw r0
        L74:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        return false;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean replace(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            r10.getClass()
            r12.getClass()
            if (r11 == 0) goto L88
            int r8 = r9.A00(r10)
            com.google.common.collect.MapMakerInternalMap$Segment r2 = r9.A01(r8)
            r2.lock()
            r2.A06()     // Catch: java.lang.Throwable -> L80
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.table     // Catch: java.lang.Throwable -> L80
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L80
            r7 = 1
            int r4 = r4 - r7
            r4 = r4 & r8
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> L80
            X.18P r6 = (X.C18P) r6     // Catch: java.lang.Throwable -> L80
            r1 = r6
        L26:
            if (r1 == 0) goto L85
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L80
            int r0 = r1.BD2()     // Catch: java.lang.Throwable -> L80
            if (r0 != r8) goto L5d
            if (r3 == 0) goto L5d
            com.google.common.collect.MapMakerInternalMap r0 = r2.map     // Catch: java.lang.Throwable -> L80
            X.18M r0 = r0.keyEquivalence     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.A01(r10, r3)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L5d
            java.lang.Object r3 = r1.getValue()     // Catch: java.lang.Throwable -> L80
            if (r3 != 0) goto L62
            java.lang.Object r0 = r1.getValue()     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L85
            int r0 = r2.modCount     // Catch: java.lang.Throwable -> L80
            int r0 = r0 + 1
            r2.modCount = r0     // Catch: java.lang.Throwable -> L80
            X.18P r1 = r2.A00(r6, r1)     // Catch: java.lang.Throwable -> L80
            int r0 = r2.count     // Catch: java.lang.Throwable -> L80
            int r0 = r0 - r7
            r5.set(r4, r1)     // Catch: java.lang.Throwable -> L80
            r2.count = r0     // Catch: java.lang.Throwable -> L80
            goto L85
        L5d:
            X.18P r1 = r1.BWo()     // Catch: java.lang.Throwable -> L80
            goto L26
        L62:
            com.google.common.collect.MapMakerInternalMap r0 = r2.map     // Catch: java.lang.Throwable -> L80
            X.18M r0 = r0.valueEquivalence()     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.A01(r11, r3)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L85
            int r0 = r2.modCount     // Catch: java.lang.Throwable -> L80
            int r0 = r0 + 1
            r2.modCount = r0     // Catch: java.lang.Throwable -> L80
            com.google.common.collect.MapMakerInternalMap r0 = r2.map     // Catch: java.lang.Throwable -> L80
            X.18H r0 = r0.A05     // Catch: java.lang.Throwable -> L80
            r0.Egj(r1, r2, r12)     // Catch: java.lang.Throwable -> L80
            r2.unlock()
            r0 = 1
            return r0
        L80:
            r0 = move-exception
            r2.unlock()
            throw r0
        L85:
            r2.unlock()
        L88:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.MapMakerInternalMap.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
