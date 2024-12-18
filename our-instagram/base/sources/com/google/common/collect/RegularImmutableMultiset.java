package com.google.common.collect;

import X.AbstractC38301qK;
import X.AbstractC62759SPq;
import X.C18C;
import X.C63033Sb7;
import X.InterfaceC75173Zi;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes10.dex */
public class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset A03 = new RegularImmutableMultiset(new C63033Sb7());
    public transient ImmutableSet A00;
    public final transient C63033Sb7 A01;
    public final transient int A02;

    /* loaded from: classes10.dex */
    public final class ElementSet extends IndexedImmutableSet<E> {
        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0B() {
            return true;
        }

        public ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            return RegularImmutableMultiset.this.contains(object);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableMultiset.this.A01.A02;
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: classes10.dex */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final int[] counts;
        public final Object[] elements;

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Sb7] */
        /* JADX WARN: Type inference failed for: r3v0, types: [X.RR5, java.lang.Object] */
        public Object readResolve() {
            int length = this.elements.length;
            ?? obj = new Object();
            obj.A01 = false;
            ?? obj2 = new Object();
            obj2.A09(length, 1.0f);
            obj.A00 = obj2;
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i < objArr.length) {
                    obj.A02(objArr[i], this.counts[i]);
                    i++;
                } else {
                    return obj.build();
                }
            }
        }

        public SerializedForm(InterfaceC75173Zi interfaceC75173Zi) {
            int size = interfaceC75173Zi.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (AbstractC62759SPq abstractC62759SPq : interfaceC75173Zi.entrySet()) {
                this.elements[i] = abstractC62759SPq.A01();
                this.counts[i] = abstractC62759SPq.A00();
                i++;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean A0B() {
        return false;
    }

    @Override // X.InterfaceC75173Zi
    public final int AL0(Object element) {
        C63033Sb7 c63033Sb7 = this.A01;
        int A05 = c63033Sb7.A05(element);
        if (A05 == -1) {
            return 0;
        }
        return c63033Sb7.A05[A05];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final int size() {
        return this.A02;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public RegularImmutableMultiset(C63033Sb7 contents) {
        this.A01 = contents;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = contents.A02;
            if (i < i2) {
                C18C.A01(i, i2);
                j += contents.A05[i];
                i++;
            } else {
                this.A02 = AbstractC38301qK.A02(j);
                return;
            }
        }
    }

    @Override // X.InterfaceC75173Zi
    public final /* bridge */ /* synthetic */ Set ARM() {
        return A0C();
    }
}
