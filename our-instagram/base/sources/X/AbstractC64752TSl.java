package X;

import java.util.Iterator;

/* renamed from: X.TSl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64752TSl implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ TZK A03;

    public /* synthetic */ AbstractC64752TSl(TZK tzk) {
        this.A03 = tzk;
        this.A00 = tzk.A00;
        this.A01 = tzk.isEmpty() ? -1 : 0;
        this.A02 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return MSY.A1R(this.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object next() {
        /*
            r5 = this;
            X.TZK r4 = r5.A03
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L48
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L43
            int r3 = r5.A01
            r5.A02 = r3
            r1 = r5
            boolean r0 = r5 instanceof X.C60701RNd
            if (r0 == 0) goto L2e
            X.RNd r1 = (X.C60701RNd) r1
            X.TZK r0 = r1.A00
            java.lang.Object[] r0 = r0.A05
        L1d:
            r0.getClass()
            r2 = r0[r3]
        L22:
            int r0 = r5.A01
            int r1 = r0 + 1
            int r0 = r4.A01
            if (r1 < r0) goto L2b
            r1 = -1
        L2b:
            r5.A01 = r1
            return r2
        L2e:
            boolean r0 = r5 instanceof X.C60700RNc
            if (r0 == 0) goto L3c
            X.RNc r1 = (X.C60700RNc) r1
            X.TZK r0 = r1.A00
            X.RNY r2 = new X.RNY
            r2.<init>(r0, r3)
            goto L22
        L3c:
            X.RNb r1 = (X.C60699RNb) r1
            X.TZK r0 = r1.A00
            java.lang.Object[] r0 = r0.A04
            goto L1d
        L43:
            java.util.NoSuchElementException r0 = X.AbstractC58318PtA.A13()
            throw r0
        L48:
            java.util.ConcurrentModificationException r0 = X.AbstractC58318PtA.A0z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC64752TSl.next():java.lang.Object");
    }

    @Override // java.util.Iterator
    public final void remove() {
        TZK tzk = this.A03;
        int i = tzk.A00;
        int i2 = this.A00;
        if (i == i2) {
            int i3 = this.A02;
            if (MSY.A1R(i3)) {
                this.A00 = i2 + 32;
                Object[] objArr = tzk.A04;
                objArr.getClass();
                tzk.remove(objArr[i3]);
                this.A01--;
                this.A02 = -1;
                return;
            }
            throw AbstractC166987dD.A14("no calls to next() since the last call to remove()");
        }
        throw AbstractC58318PtA.A0z();
    }
}
