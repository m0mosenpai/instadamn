package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC24851Je;
import X.AbstractC37303Gc4;
import X.AbstractC50102Ry;
import X.AbstractC58318PtA;
import X.C18C;
import X.C1Jk;
import X.InterfaceC65694TsG;
import X.MSY;
import X.RR0;
import X.RR1;
import X.RR2;
import X.TZS;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements InterfaceC65694TsG<K, V>, Serializable {
    public transient int A00;
    public transient int A01;
    public transient int A02;
    public transient InterfaceC65694TsG A03;
    public transient Set A04;
    public transient int[] A05;
    public transient int[] A06;
    public transient int[] A07;
    public transient int[] A08;
    public transient int[] A09;
    public transient int[] A0A;
    public transient Object[] A0B;
    public transient Object[] A0C;
    public transient int A0D;
    public transient Set A0E;
    public transient Set A0F;

    /* loaded from: classes10.dex */
    public class Inverse<K, V> extends AbstractMap<V, K> implements InterfaceC65694TsG<V, K>, Serializable {
        public transient Set A00;
        public final HashBiMap forward;

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object key) {
            return this.forward.containsValue(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(Object value) {
            return this.forward.containsKey(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            Set set = this.A00;
            if (set == null) {
                TZS tzs = new TZS(this.forward);
                this.A00 = tzs;
                return tzs;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object key) {
            HashBiMap hashBiMap = this.forward;
            int A0B = hashBiMap.A0B(key, C1Jk.A02(key));
            if (A0B == -1) {
                return null;
            }
            return hashBiMap.A0B[A0B];
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            HashBiMap hashBiMap = this.forward;
            Set set = hashBiMap.A04;
            if (set == null) {
                RR2 rr2 = new RR2(hashBiMap);
                hashBiMap.A04 = rr2;
                return rr2;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object value, Object key) {
            return this.forward.A0C(value, key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object value) {
            HashBiMap hashBiMap = this.forward;
            int A02 = C1Jk.A02(value);
            int A0B = hashBiMap.A0B(value, A02);
            if (A0B == -1) {
                return null;
            }
            Object obj = hashBiMap.A0B[A0B];
            hashBiMap.A0F(A0B, A02);
            return obj;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.forward.A02;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Collection values() {
            return this.forward.keySet();
        }

        public Inverse(HashBiMap forward) {
            this.forward = forward;
        }

        private void readObject(ObjectInputStream in) {
            in.defaultReadObject();
            this.forward.A03 = this;
        }
    }

    private void A02(int entry, int keyHash) {
        C18C.A0E(MSY.A1S(entry, -1));
        int[] iArr = this.A05;
        int length = keyHash & (iArr.length - 1);
        int i = iArr[length];
        if (i == entry) {
            int[] iArr2 = this.A07;
            iArr[length] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int[] iArr3 = this.A07;
        int i2 = iArr3[i];
        while (true) {
            int i3 = i;
            i = i2;
            if (i2 != -1) {
                if (i2 == entry) {
                    iArr3[i3] = iArr3[entry];
                    iArr3[entry] = -1;
                    return;
                }
                i2 = iArr3[i2];
            } else {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Expected to find entry with key ");
                throw AbstractC58318PtA.A0W(AbstractC166997dE.A0v(this.A0B[entry], A1C));
            }
        }
    }

    private void A03(int entry, int valueHash) {
        C18C.A0E(MSY.A1S(entry, -1));
        int length = valueHash & (this.A05.length - 1);
        int[] iArr = this.A06;
        int i = iArr[length];
        if (i == entry) {
            int[] iArr2 = this.A08;
            iArr[length] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int[] iArr3 = this.A08;
        int i2 = iArr3[i];
        while (true) {
            int i3 = i;
            i = i2;
            if (i2 != -1) {
                if (i2 == entry) {
                    iArr3[i3] = iArr3[entry];
                    iArr3[entry] = -1;
                    return;
                }
                i2 = iArr3[i2];
            } else {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Expected to find entry with value ");
                throw AbstractC58318PtA.A0W(AbstractC166997dE.A0v(this.A0C[entry], A1C));
            }
        }
    }

    private void A04(int entry, int keyHash) {
        boolean z = false;
        if (entry != -1) {
            z = true;
        }
        C18C.A0E(z);
        int[] iArr = this.A05;
        int length = keyHash & (iArr.length - 1);
        this.A07[entry] = iArr[length];
        iArr[length] = entry;
    }

    private void A05(int entry, int valueHash) {
        boolean z = false;
        if (entry != -1) {
            z = true;
        }
        C18C.A0E(z);
        int length = valueHash & (this.A05.length - 1);
        int[] iArr = this.A08;
        int[] iArr2 = this.A06;
        iArr[entry] = iArr2[length];
        iArr2[length] = entry;
    }

    private void A06(int prev, int next) {
        if (prev == -2) {
            this.A00 = next;
        } else {
            this.A09[prev] = next;
        }
        if (next == -2) {
            this.A0D = prev;
        } else {
            this.A0A[next] = prev;
        }
    }

    public static void A07(HashBiMap hashBiMap, int i, int i2, int i3) {
        int i4;
        int i5;
        C18C.A0E(MSY.A1S(i, -1));
        hashBiMap.A02(i, i2);
        hashBiMap.A03(i, i3);
        int[] iArr = hashBiMap.A0A;
        int i6 = iArr[i];
        int[] iArr2 = hashBiMap.A09;
        hashBiMap.A06(i6, iArr2[i]);
        int i7 = hashBiMap.A02 - 1;
        if (i7 != i) {
            int i8 = iArr[i7];
            int i9 = iArr2[i7];
            hashBiMap.A06(i8, i);
            hashBiMap.A06(i, i9);
            Object[] objArr = hashBiMap.A0B;
            Object obj = objArr[i7];
            Object[] objArr2 = hashBiMap.A0C;
            Object obj2 = objArr2[i7];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int A02 = C1Jk.A02(obj);
            int[] iArr3 = hashBiMap.A05;
            int length = A02 & (iArr3.length - 1);
            int i10 = iArr3[length];
            if (i10 == i7) {
                iArr3[length] = i;
            } else {
                int[] iArr4 = hashBiMap.A07;
                int i11 = iArr4[i10];
                while (true) {
                    i4 = i10;
                    i10 = i11;
                    if (i11 == i7) {
                        break;
                    } else {
                        i11 = iArr4[i11];
                    }
                }
                iArr4[i4] = i;
            }
            int[] iArr5 = hashBiMap.A07;
            iArr5[i] = iArr5[i7];
            iArr5[i7] = -1;
            int A022 = C1Jk.A02(obj2) & (hashBiMap.A05.length - 1);
            int[] iArr6 = hashBiMap.A06;
            int i12 = iArr6[A022];
            if (i12 == i7) {
                iArr6[A022] = i;
            } else {
                int[] iArr7 = hashBiMap.A08;
                int i13 = iArr7[i12];
                while (true) {
                    i5 = i12;
                    i12 = i13;
                    if (i13 == i7) {
                        break;
                    } else {
                        i13 = iArr7[i13];
                    }
                }
                iArr7[i5] = i;
            }
            int[] iArr8 = hashBiMap.A08;
            iArr8[i] = iArr8[i7];
            iArr8[i7] = -1;
        }
        Object[] objArr3 = hashBiMap.A0B;
        int i14 = hashBiMap.A02;
        int i15 = i14 - 1;
        objArr3[i15] = null;
        hashBiMap.A0C[i15] = null;
        hashBiMap.A02 = i14 - 1;
        hashBiMap.A01++;
    }

    public static void A08(HashBiMap entry, Object newKey, int force) {
        C18C.A0E(MSY.A1S(force, -1));
        int A0A = entry.A0A(newKey, C1Jk.A02(newKey));
        int i = entry.A0D;
        if (A0A != -1) {
            throw AbstractC37303Gc4.A0M(newKey, "Key already present in map: ", AbstractC166987dD.A1C());
        }
        if (i == force) {
            i = entry.A0A[force];
        } else if (i == entry.A02) {
            i = -1;
        }
        if (-2 == force) {
            A0A = entry.A09[force];
        } else if (-2 != entry.A02) {
            A0A = -2;
        }
        entry.A06(entry.A0A[force], entry.A09[force]);
        entry.A02(force, C1Jk.A02(entry.A0B[force]));
        entry.A0B[force] = newKey;
        entry.A04(force, C1Jk.A02(newKey));
        entry.A06(i, force);
        entry.A06(force, A0A);
    }

    public static void A09(HashBiMap hashBiMap, Object obj, int i, boolean z) {
        C18C.A0E(MSY.A1S(i, -1));
        int A02 = C1Jk.A02(obj);
        int A0B = hashBiMap.A0B(obj, A02);
        if (A0B != -1) {
            if (z) {
                hashBiMap.A0F(A0B, A02);
                if (i == hashBiMap.A02) {
                    i = A0B;
                }
            } else {
                throw AbstractC37303Gc4.A0M(obj, "Value already present in map: ", AbstractC166987dD.A1C());
            }
        }
        hashBiMap.A03(i, C1Jk.A02(hashBiMap.A0C[i]));
        hashBiMap.A0C[i] = obj;
        hashBiMap.A05(i, A02);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object key, Object value) {
        return A0D(key, value, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, com.google.common.collect.HashBiMap] */
    public static HashBiMap A00() {
        ?? abstractMap = new AbstractMap();
        abstractMap.A0E();
        return abstractMap;
    }

    private void A01(int minCapacity) {
        int length = this.A07.length;
        if (length < minCapacity) {
            int A00 = AbstractC24851Je.A00(length, minCapacity);
            this.A0B = Arrays.copyOf(this.A0B, A00);
            this.A0C = Arrays.copyOf(this.A0C, A00);
            int[] iArr = this.A07;
            int length2 = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, A00);
            Arrays.fill(copyOf, length2, A00, -1);
            this.A07 = copyOf;
            int[] iArr2 = this.A08;
            int length3 = iArr2.length;
            int[] copyOf2 = Arrays.copyOf(iArr2, A00);
            Arrays.fill(copyOf2, length3, A00, -1);
            this.A08 = copyOf2;
            int[] iArr3 = this.A0A;
            int length4 = iArr3.length;
            int[] copyOf3 = Arrays.copyOf(iArr3, A00);
            Arrays.fill(copyOf3, length4, A00, -1);
            this.A0A = copyOf3;
            int[] iArr4 = this.A09;
            int length5 = iArr4.length;
            int[] copyOf4 = Arrays.copyOf(iArr4, A00);
            Arrays.fill(copyOf4, length5, A00, -1);
            this.A09 = copyOf4;
        }
        if (this.A05.length < minCapacity) {
            int A002 = C1Jk.A00(minCapacity);
            int[] iArr5 = new int[A002];
            Arrays.fill(iArr5, -1);
            this.A05 = iArr5;
            int[] iArr6 = new int[A002];
            Arrays.fill(iArr6, -1);
            this.A06 = iArr6;
            for (int i = 0; i < this.A02; i++) {
                int A02 = C1Jk.A02(this.A0B[i]);
                int[] iArr7 = this.A05;
                int length6 = A02 & (iArr7.length - 1);
                this.A07[i] = iArr7[length6];
                iArr7[length6] = i;
                int A022 = C1Jk.A02(this.A0C[i]) & (this.A05.length - 1);
                int[] iArr8 = this.A08;
                int[] iArr9 = this.A06;
                iArr8[i] = iArr9[A022];
                iArr9[A022] = i;
            }
        }
    }

    public final int A0A(Object key, int keyHash) {
        int[] iArr = this.A05;
        int[] iArr2 = this.A07;
        Object[] objArr = this.A0B;
        for (int i = iArr[keyHash & (iArr.length - 1)]; i != -1; i = iArr2[i]) {
            if (AbstractC50102Ry.A00(objArr[i], key)) {
                return i;
            }
        }
        return -1;
    }

    public final int A0B(Object value, int valueHash) {
        int[] iArr = this.A06;
        int[] iArr2 = this.A08;
        Object[] objArr = this.A0C;
        for (int i = iArr[valueHash & (this.A05.length - 1)]; i != -1; i = iArr2[i]) {
            if (AbstractC50102Ry.A00(objArr[i], value)) {
                return i;
            }
        }
        return -1;
    }

    public final void A0E() {
        int A00 = C1Jk.A00(16);
        this.A02 = 0;
        this.A0B = new Object[16];
        this.A0C = new Object[16];
        int[] iArr = new int[A00];
        Arrays.fill(iArr, -1);
        this.A05 = iArr;
        int[] iArr2 = new int[A00];
        Arrays.fill(iArr2, -1);
        this.A06 = iArr2;
        int[] iArr3 = new int[16];
        Arrays.fill(iArr3, -1);
        this.A07 = iArr3;
        int[] iArr4 = new int[16];
        Arrays.fill(iArr4, -1);
        this.A08 = iArr4;
        this.A00 = -2;
        this.A0D = -2;
        int[] iArr5 = new int[16];
        Arrays.fill(iArr5, -1);
        this.A0A = iArr5;
        int[] iArr6 = new int[16];
        Arrays.fill(iArr6, -1);
        this.A09 = iArr6;
    }

    public final void A0F(int entry, int valueHash) {
        A07(this, entry, C1Jk.A02(this.A0B[entry]), valueHash);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.A0B, 0, this.A02, (Object) null);
        Arrays.fill(this.A0C, 0, this.A02, (Object) null);
        Arrays.fill(this.A05, -1);
        Arrays.fill(this.A06, -1);
        Arrays.fill(this.A07, 0, this.A02, -1);
        Arrays.fill(this.A08, 0, this.A02, -1);
        Arrays.fill(this.A0A, 0, this.A02, -1);
        Arrays.fill(this.A09, 0, this.A02, -1);
        this.A02 = 0;
        this.A00 = -2;
        this.A0D = -2;
        this.A01++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.A0E;
        if (set == null) {
            RR0 rr0 = new RR0(this);
            this.A0E = rr0;
            return rr0;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.A0F;
        if (set == null) {
            RR1 rr1 = new RR1(this);
            this.A0F = rr1;
            return rr1;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A02;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        Set set = this.A04;
        if (set == null) {
            RR2 rr2 = new RR2(this);
            this.A04 = rr2;
            return rr2;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        A0E();
        for (int i = 0; i < readInt; i++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator A14 = AbstractC166997dE.A14(this);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            stream.writeObject(A1K.getKey());
            stream.writeObject(A1K.getValue());
        }
    }

    public final Object A0C(Object obj, Object obj2) {
        int i;
        int A02 = C1Jk.A02(obj);
        int A0B = A0B(obj, A02);
        if (A0B != -1) {
            Object obj3 = this.A0B[A0B];
            if (AbstractC50102Ry.A00(obj3, obj2)) {
                return obj2;
            }
            A08(this, obj2, A0B);
            return obj3;
        }
        int i2 = this.A0D;
        int A022 = C1Jk.A02(obj2);
        C18C.A0A(obj2, "Key already present: %s", AbstractC167007dF.A1P(A0A(obj2, A022), -1));
        A01(this.A02 + 1);
        Object[] objArr = this.A0B;
        int i3 = this.A02;
        objArr[i3] = obj2;
        this.A0C[i3] = obj;
        A04(i3, A022);
        A05(this.A02, A02);
        if (i2 == -2) {
            i = this.A00;
        } else {
            i = this.A09[i2];
        }
        int i4 = this.A02;
        A06(i2, i4);
        A06(i4, i);
        this.A02 = i4 + 1;
        this.A01++;
        return null;
    }

    public final Object A0D(Object key, Object value, boolean force) {
        int A02 = C1Jk.A02(key);
        int A0A = A0A(key, A02);
        if (A0A != -1) {
            Object obj = this.A0C[A0A];
            if (AbstractC50102Ry.A00(obj, value)) {
                return value;
            }
            A09(this, value, A0A, force);
            return obj;
        }
        int A022 = C1Jk.A02(value);
        int A0B = A0B(value, A022);
        if (force) {
            if (A0B != -1) {
                A0F(A0B, A022);
            }
        } else {
            boolean z = false;
            if (A0B == -1) {
                z = true;
            }
            C18C.A0A(value, "Value already present: %s", z);
        }
        A01(this.A02 + 1);
        Object[] objArr = this.A0B;
        int i = this.A02;
        objArr[i] = key;
        this.A0C[i] = value;
        A04(i, A02);
        A05(this.A02, A022);
        int i2 = this.A0D;
        int i3 = this.A02;
        A06(i2, i3);
        A06(i3, -2);
        this.A02 = i3 + 1;
        this.A01++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        return MSY.A1S(A0A(key, C1Jk.A02(key)), -1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object value) {
        return MSY.A1S(A0B(value, C1Jk.A02(value)), -1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object key) {
        int A0A = A0A(key, C1Jk.A02(key));
        if (A0A == -1) {
            return null;
        }
        return this.A0C[A0A];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object key) {
        int A02 = C1Jk.A02(key);
        int A0A = A0A(key, A02);
        if (A0A == -1) {
            return null;
        }
        Object obj = this.A0C[A0A];
        A07(this, A0A, A02, C1Jk.A02(obj));
        return obj;
    }
}
