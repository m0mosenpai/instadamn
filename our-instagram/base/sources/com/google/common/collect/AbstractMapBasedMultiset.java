package com.google.common.collect;

import X.AbstractC167007dF;
import X.AbstractC24841Jd;
import X.AbstractC38301qK;
import X.AbstractC63247Sg2;
import X.AbstractC75163Zh;
import X.C18C;
import X.C63033Sb7;
import X.C64759TSt;
import X.RQE;
import X.RQF;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class AbstractMapBasedMultiset<E> extends AbstractC75163Zh<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient long A00;
    public transient C63033Sb7 A01;

    @Override // X.AbstractC75163Zh, X.InterfaceC75173Zi
    public final int EEe(Object element, int occurrences) {
        int i = 0;
        int A05 = this.A01.A05(element);
        if (A05 != -1) {
            C63033Sb7 c63033Sb7 = this.A01;
            C18C.A01(A05, c63033Sb7.A02);
            i = c63033Sb7.A05[A05];
            if (i > occurrences) {
                C63033Sb7 c63033Sb72 = this.A01;
                C18C.A01(A05, c63033Sb72.A02);
                c63033Sb72.A05[A05] = i - occurrences;
            } else {
                this.A01.A04(A05);
                occurrences = i;
            }
            this.A00 -= occurrences;
        }
        return i;
    }

    @Override // X.AbstractC75163Zh
    public final int A03() {
        return this.A01.A02;
    }

    @Override // X.AbstractC75163Zh
    public final int A04(Object element, int occurrences) {
        long j;
        if (occurrences == 0) {
            return AL0(element);
        }
        boolean z = true;
        int i = 0;
        C18C.A0C("occurrences cannot be negative: %s", occurrences, AbstractC167007dF.A1O(occurrences));
        int A05 = this.A01.A05(element);
        if (A05 == -1) {
            this.A01.A0A(element, occurrences);
            j = this.A00 + occurrences;
        } else {
            C63033Sb7 c63033Sb7 = this.A01;
            C18C.A01(A05, c63033Sb7.A02);
            i = c63033Sb7.A05[A05];
            long j2 = occurrences;
            long j3 = i + j2;
            if (j3 > 2147483647L) {
                z = false;
            }
            C18C.A05(j3, "too many occurrences: %s", z);
            C63033Sb7 c63033Sb72 = this.A01;
            C18C.A01(A05, c63033Sb72.A02);
            c63033Sb72.A05[A05] = (int) j3;
            j = this.A00 + j2;
        }
        this.A00 = j;
        return i;
    }

    @Override // X.AbstractC75163Zh
    public final Iterator A05() {
        return new RQE(this);
    }

    @Override // X.AbstractC75163Zh
    public final Iterator A06() {
        return new RQF(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Sb7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Sb7] */
    public final C63033Sb7 A07() {
        if (this instanceof LinkedHashMultiset) {
            ?? obj = new Object();
            obj.A09(3, 1.0f);
            return obj;
        }
        ?? obj2 = new Object();
        obj2.A09(3, 1.0f);
        return obj2;
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

    @Override // X.InterfaceC75173Zi
    public final boolean ESE(Object element, int oldCount, int newCount) {
        AbstractC24841Jd.A00(oldCount, "oldCount");
        int A05 = this.A01.A05(element);
        if (A05 != -1) {
            C63033Sb7 c63033Sb7 = this.A01;
            C18C.A01(A05, c63033Sb7.A02);
            if (c63033Sb7.A05[A05] == oldCount) {
                this.A01.A04(A05);
                this.A00 -= oldCount;
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC75163Zh, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A01.A06();
        this.A00 = 0L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final int size() {
        return AbstractC38301qK.A02(this.A00);
    }

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        this.A01 = A07();
        for (int i = 0; i < readInt; i++) {
            A04(stream.readObject(), stream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        AbstractC63247Sg2.A03(this, stream);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C64759TSt(this, entrySet().iterator());
    }
}
