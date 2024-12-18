package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.5r3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC128345r3 implements Iterator, InterfaceC15590qF {
    public int A00;
    public boolean A01 = true;
    public final AbstractC128315r0[] A02;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final int A00(int i) {
        AbstractC128315r0 abstractC128315r0;
        Object[] objArr;
        int bitCount;
        AbstractC128315r0[] abstractC128315r0Arr = this.A02;
        AbstractC128315r0 abstractC128315r02 = abstractC128315r0Arr[i];
        int i2 = abstractC128315r02.A01;
        if (i2 >= abstractC128315r02.A00) {
            Object[] objArr2 = abstractC128315r02.A02;
            if (i2 < objArr2.length) {
                Object obj = objArr2[i2];
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
                C57O c57o = (C57O) obj;
                if (i == 6) {
                    abstractC128315r0 = abstractC128315r0Arr[7];
                    objArr = c57o.A02;
                    bitCount = objArr.length;
                } else {
                    abstractC128315r0 = abstractC128315r0Arr[i + 1];
                    objArr = c57o.A02;
                    bitCount = Integer.bitCount(c57o.A00) * 2;
                }
                abstractC128315r0.A02 = objArr;
                abstractC128315r0.A00 = bitCount;
                abstractC128315r0.A01 = 0;
                return A00(i + 1);
            }
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            r7 = this;
            X.5r0[] r5 = r7.A02
            int r4 = r7.A00
            r0 = r5[r4]
            int r1 = r0.A01
            int r0 = r0.A00
            if (r1 >= r0) goto Ld
            return
        Ld:
            r3 = 0
            r6 = -1
            if (r6 >= r4) goto L48
            int r0 = r7.A00(r4)
            if (r0 != r6) goto L28
            r2 = r5[r4]
            int r1 = r2.A01
            java.lang.Object[] r0 = r2.A02
            int r0 = r0.length
            if (r1 >= r0) goto L2d
            int r0 = r1 + 1
            r2.A01 = r0
            int r0 = r7.A00(r4)
        L28:
            if (r0 == r6) goto L2d
            r7.A00 = r0
            return
        L2d:
            if (r4 <= 0) goto L39
            int r0 = r4 + (-1)
            r1 = r5[r0]
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
        L39:
            r1 = r5[r4]
            X.57O r0 = X.C57O.A04
            java.lang.Object[] r0 = r0.A02
            r1.A02 = r0
            r1.A00 = r3
            r1.A01 = r3
            int r4 = r4 + (-1)
            goto Ld
        L48:
            r7.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC128345r3.A01():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }

    public AbstractC128345r3(C57O c57o, AbstractC128315r0[] abstractC128315r0Arr) {
        this.A02 = abstractC128315r0Arr;
        AbstractC128315r0 abstractC128315r0 = abstractC128315r0Arr[0];
        Object[] objArr = c57o.A02;
        int bitCount = Integer.bitCount(c57o.A00) * 2;
        abstractC128315r0.A02 = objArr;
        abstractC128315r0.A00 = bitCount;
        abstractC128315r0.A01 = 0;
        this.A00 = 0;
        A01();
    }

    public final Object A02() {
        if (hasNext()) {
            AbstractC128315r0 abstractC128315r0 = this.A02[this.A00];
            return abstractC128315r0.A02[abstractC128315r0.A01];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object next = this.A02[this.A00].next();
            A01();
            return next;
        }
        throw new NoSuchElementException();
    }
}
