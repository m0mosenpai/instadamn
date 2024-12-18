package X;

import com.google.common.collect.LinkedHashMultimap;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes10.dex */
public final class RSI<K, V> extends TZR<V> implements InterfaceC65548TmR<K, V> {
    public final Object A04;
    public final /* synthetic */ LinkedHashMultimap A05;
    public LinkedHashMultimap.ValueEntry[] hashTable;
    public int A01 = 0;
    public int A00 = 0;
    public InterfaceC65548TmR A02 = this;
    public InterfaceC65548TmR A03 = this;

    public RSI(final LinkedHashMultimap this$0, Object key, int expectedValues) {
        this.A05 = this$0;
        this.A04 = key;
        this.hashTable = new LinkedHashMultimap.ValueEntry[C1Jk.A00(expectedValues)];
    }

    @Override // X.InterfaceC65548TmR
    public final InterfaceC65548TmR C3m() {
        return this.A02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.hashTable, (Object) null);
        this.A01 = 0;
        for (InterfaceC65548TmR interfaceC65548TmR = this.A02; interfaceC65548TmR != this; interfaceC65548TmR = interfaceC65548TmR.C3m()) {
            LinkedHashMultimap.ValueEntry valueEntry = (LinkedHashMultimap.ValueEntry) interfaceC65548TmR;
            LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry.predecessorInMultimap;
            valueEntry2.getClass();
            LinkedHashMultimap.ValueEntry valueEntry3 = valueEntry.successorInMultimap;
            valueEntry3.getClass();
            valueEntry2.successorInMultimap = valueEntry3;
            valueEntry3.predecessorInMultimap = valueEntry2;
        }
        this.A02 = this;
        this.A03 = this;
        this.A00++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C64765TSz(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01;
    }

    @Override // X.InterfaceC65548TmR
    public final void EbF(InterfaceC65548TmR entry) {
        this.A03 = entry;
    }

    @Override // X.InterfaceC65548TmR
    public final void Ef9(InterfaceC65548TmR entry) {
        this.A02 = entry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.TmR] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.TmR] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int A02 = C1Jk.A02(obj);
        int length = (r1.length - 1) & A02;
        LinkedHashMultimap.ValueEntry valueEntry = this.hashTable[length];
        for (LinkedHashMultimap.ValueEntry valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
            if (valueEntry2.smearedValueHash == A02 && AbstractC50102Ry.A00(valueEntry2.getValue(), obj)) {
                return false;
            }
        }
        LinkedHashMultimap.ValueEntry valueEntry3 = new LinkedHashMultimap.ValueEntry(valueEntry, this.A04, obj, A02);
        InterfaceC65548TmR interfaceC65548TmR = this.A03;
        interfaceC65548TmR.Ef9(valueEntry3);
        valueEntry3.predecessorInValueSet = interfaceC65548TmR;
        valueEntry3.successorInValueSet = this;
        this.A03 = valueEntry3;
        LinkedHashMultimap linkedHashMultimap = this.A05;
        LinkedHashMultimap.ValueEntry valueEntry4 = linkedHashMultimap.A00.predecessorInMultimap;
        valueEntry4.getClass();
        valueEntry4.successorInMultimap = valueEntry3;
        valueEntry3.predecessorInMultimap = valueEntry4;
        LinkedHashMultimap.ValueEntry valueEntry5 = linkedHashMultimap.A00;
        valueEntry3.successorInMultimap = valueEntry5;
        valueEntry5.predecessorInMultimap = valueEntry3;
        LinkedHashMultimap.ValueEntry[] valueEntryArr = this.hashTable;
        valueEntryArr[length] = valueEntry3;
        int i = this.A01 + 1;
        this.A01 = i;
        this.A00++;
        int length2 = valueEntryArr.length;
        if (i <= 1.0d * length2 || length2 >= 1073741824) {
            return true;
        }
        int i2 = length2 * 2;
        LinkedHashMultimap.ValueEntry[] valueEntryArr2 = new LinkedHashMultimap.ValueEntry[i2];
        this.hashTable = valueEntryArr2;
        int i3 = i2 - 1;
        for (RSI<K, V> rsi = this.A02; rsi != this; rsi = rsi.C3m()) {
            LinkedHashMultimap.ValueEntry valueEntry6 = (LinkedHashMultimap.ValueEntry) rsi;
            int i4 = valueEntry6.smearedValueHash & i3;
            valueEntry6.nextInValueBucket = valueEntryArr2[i4];
            valueEntryArr2[i4] = valueEntry6;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        int A02 = C1Jk.A02(o);
        for (LinkedHashMultimap.ValueEntry valueEntry = this.hashTable[(r1.length - 1) & A02]; valueEntry != null; valueEntry = valueEntry.nextInValueBucket) {
            if (valueEntry.smearedValueHash == A02 && AbstractC50102Ry.A00(valueEntry.getValue(), o)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        int A02 = C1Jk.A02(o);
        int length = (r1.length - 1) & A02;
        LinkedHashMultimap.ValueEntry valueEntry = null;
        for (LinkedHashMultimap.ValueEntry valueEntry2 = this.hashTable[length]; valueEntry2 != null; valueEntry2 = valueEntry2.nextInValueBucket) {
            if (valueEntry2.smearedValueHash == A02 && AbstractC50102Ry.A00(valueEntry2.getValue(), o)) {
                if (valueEntry == null) {
                    this.hashTable[length] = valueEntry2.nextInValueBucket;
                } else {
                    valueEntry.nextInValueBucket = valueEntry2.nextInValueBucket;
                }
                InterfaceC65548TmR interfaceC65548TmR = valueEntry2.predecessorInValueSet;
                interfaceC65548TmR.getClass();
                InterfaceC65548TmR interfaceC65548TmR2 = valueEntry2.successorInValueSet;
                interfaceC65548TmR2.getClass();
                interfaceC65548TmR.Ef9(interfaceC65548TmR2);
                interfaceC65548TmR2.EbF(interfaceC65548TmR);
                LinkedHashMultimap.ValueEntry valueEntry3 = valueEntry2.predecessorInMultimap;
                valueEntry3.getClass();
                LinkedHashMultimap.ValueEntry valueEntry4 = valueEntry2.successorInMultimap;
                valueEntry4.getClass();
                valueEntry3.successorInMultimap = valueEntry4;
                valueEntry4.predecessorInMultimap = valueEntry3;
                this.A01--;
                this.A00++;
                return true;
            }
            valueEntry = valueEntry2;
        }
        return false;
    }
}
