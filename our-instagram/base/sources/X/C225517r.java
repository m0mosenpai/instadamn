package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.17r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C225517r implements Iterator, InterfaceC15590qF {
    public int A00 = -1;
    public C17u A01;
    public int A02;
    public int A03;
    public int A04;
    public final /* synthetic */ C224317f A05;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C225517r(C224317f c224317f) {
        this.A05 = c224317f;
        int A03 = C17s.A03(0, 0, c224317f.A01.length());
        this.A03 = A03;
        this.A04 = A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r0 < r1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r8 = this;
            int r7 = r8.A04
            r5 = 0
            if (r7 >= 0) goto Lb
            r8.A00 = r5
            r0 = 0
            r8.A01 = r0
            return
        Lb:
            X.17f r6 = r8.A05
            int r1 = r6.A00
            r2 = -1
            r3 = 1
            if (r1 <= 0) goto L1b
            int r0 = r8.A02
            int r0 = r0 + 1
            r8.A02 = r0
            if (r0 >= r1) goto L57
        L1b:
            java.lang.CharSequence r4 = r6.A01
            int r0 = r4.length()
            if (r7 > r0) goto L57
            X.0sF r1 = r6.A02
            int r0 = r8.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.invoke(r4, r0)
            X.0e4 r1 = (X.C09530e4) r1
            if (r1 == 0) goto L57
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r8.A03
            X.17u r0 = X.C17s.A0C(r0, r2)
            r8.A01 = r0
            int r2 = r2 + r1
            r8.A03 = r2
            if (r1 != 0) goto L51
            r5 = 1
        L51:
            int r2 = r2 + r5
        L52:
            r8.A04 = r2
            r8.A00 = r3
            return
        L57:
            int r4 = r8.A03
            java.lang.CharSequence r0 = r6.A01
            int r0 = r0.length()
            int r1 = r0 + (-1)
            X.17u r0 = new X.17u
            r0.<init>(r4, r1)
            r8.A01 = r0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C225517r.A00():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 0) {
            C17u c17u = this.A01;
            C14360o3.A0C(c17u, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.A01 = null;
            this.A00 = -1;
            return c17u;
        }
        throw new NoSuchElementException();
    }
}
