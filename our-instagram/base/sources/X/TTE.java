package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class TTE implements Iterator, InterfaceC15590qF {
    public int A00;
    public boolean A01;
    public final TT7[] A02;

    public TTE(C6LW c6lw, TT7[] tt7Arr) {
        C14360o3.A0B(c6lw, 1);
        this.A02 = tt7Arr;
        this.A01 = true;
        TT7 tt7 = tt7Arr[0];
        Object[] objArr = c6lw.A02;
        int bitCount = Integer.bitCount(c6lw.A00) * 2;
        tt7.A02 = objArr;
        tt7.A00 = bitCount;
        tt7.A01 = 0;
        this.A00 = 0;
        A01();
    }

    private final int A00(int i) {
        TT7 tt7;
        Object[] objArr;
        int bitCount;
        TT7[] tt7Arr = this.A02;
        TT7 tt72 = tt7Arr[i];
        int i2 = tt72.A01;
        if (i2 >= tt72.A00) {
            Object[] objArr2 = tt72.A02;
            if (i2 < objArr2.length) {
                Object obj = objArr2[i2];
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
                C6LW c6lw = (C6LW) obj;
                if (i == 6) {
                    tt7 = tt7Arr[7];
                    objArr = c6lw.A02;
                    bitCount = objArr.length;
                } else {
                    tt7 = tt7Arr[i + 1];
                    objArr = c6lw.A02;
                    bitCount = Integer.bitCount(c6lw.A00) * 2;
                }
                tt7.A02 = objArr;
                tt7.A00 = bitCount;
                tt7.A01 = 0;
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
            X.TT7[] r5 = r7.A02
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
            X.6LW r0 = X.C6LW.A04
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
        throw new UnsupportedOperationException("Method not decompiled: X.TTE.A01():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Pw1 pw1;
        if (this instanceof C65131Te6) {
            C65131Te6 c65131Te6 = (C65131Te6) this;
            if (c65131Te6.A02) {
                if (c65131Te6.hasNext()) {
                    Object A02 = c65131Te6.A02();
                    pw1 = c65131Te6.A03;
                    C15500q5.A04(pw1).remove(c65131Te6.A01);
                    C65131Te6.A00(A02, c65131Te6, pw1.A04, AbstractC25235BEs.A06(A02), 0);
                } else {
                    pw1 = c65131Te6.A03;
                    C15500q5.A04(pw1).remove(c65131Te6.A01);
                }
                c65131Te6.A01 = null;
                c65131Te6.A02 = false;
                c65131Te6.A00 = pw1.A00;
                return;
            }
            throw AbstractC58318PtA.A0Z();
        }
        throw AbstractC58321PtD.A10();
    }

    public final Object A02() {
        if (hasNext()) {
            TT7 tt7 = this.A02[this.A00];
            return tt7.A02[tt7.A01];
        }
        throw AbstractC58318PtA.A13();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object next = this.A02[this.A00].next();
            A01();
            return next;
        }
        throw AbstractC58318PtA.A13();
    }
}
