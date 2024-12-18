package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: X.54u, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C54u extends AbstractC911344p implements Serializable {
    public abstract int hashCode();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r7.A05.A0C(X.EnumC912645f.WRITE_EMPTY_JSON_ARRAYS) != false) goto L24;
     */
    @Override // X.InterfaceC911544r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EOr(X.AnonymousClass182 r6, X.AbstractC913345m r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C1122554x
            if (r0 == 0) goto Ld
            r0 = r5
            X.54x r0 = (X.C1122554x) r0
            int r0 = r0.A00
            r6.A0h(r0)
            return
        Ld:
            boolean r0 = r5 instanceof X.C1122354v
            if (r0 == 0) goto L20
            r0 = r5
            X.54v r0 = (X.C1122354v) r0
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L1c
            r6.A0b()
            return
        L1c:
            r6.A0u(r0)
            return
        L20:
            boolean r0 = r5 instanceof X.C1122654z
            if (r0 == 0) goto L2d
            r0 = r5
            X.54z r0 = (X.C1122654z) r0
            long r0 = r0.A00
            r6.A0i(r0)
            return
        L2d:
            boolean r0 = r5 instanceof X.C54s
            if (r0 == 0) goto L81
            r2 = r5
            X.54s r2 = (X.C54s) r2
            if (r7 == 0) goto L41
            X.45f r1 = X.EnumC912645f.WRITE_EMPTY_JSON_ARRAYS
            X.45R r0 = r7.A05
            boolean r0 = r0.A0C(r1)
            r4 = 1
            if (r0 == 0) goto L42
        L41:
            r4 = 0
        L42:
            r6.A0p(r2)
            java.util.Map r0 = r2.A00
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L4f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r2.getValue()
            X.54u r1 = (X.C54u) r1
            if (r4 == 0) goto L70
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L70
            boolean r0 = r1.A01(r7)
            if (r0 == 0) goto L70
            goto L4f
        L70:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r6.A0r(r0)
            r1.EOr(r6, r7)
            goto L4f
        L7d:
            r6.A0a()
            return
        L81:
            boolean r0 = r5 instanceof X.AnonymousClass550
            if (r0 == 0) goto L8e
            r0 = r5
            X.550 r0 = (X.AnonymousClass550) r0
            boolean r0 = r0.A00
            r6.A0y(r0)
            return
        L8e:
            r0 = r5
            X.55B r0 = (X.C55B) r0
            java.util.List r3 = r0.A00
            int r2 = r3.size()
            r6.A0q(r0, r2)
            r1 = 0
        L9b:
            if (r1 >= r2) goto Lab
            java.lang.Object r0 = r3.get(r1)
            X.44p r0 = (X.AbstractC911344p) r0
            X.54u r0 = (X.C54u) r0
            r0.EOr(r6, r7)
            int r1 = r1 + 1
            goto L9b
        Lab:
            r6.A0Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54u.EOr(X.182, X.45m):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC911344p
    public String toString() {
        Closeable closeable;
        try {
            AnonymousClass553 anonymousClass553 = AnonymousClass551.A00;
            C222015v c222015v = anonymousClass553.A00;
            C55D c55d = new C55D(c222015v.A0B());
            try {
                C17z A0A = c222015v.A0A(c55d);
                C45R c45r = anonymousClass553.A03;
                c45r.A0B(A0A);
                AnonymousClass555 anonymousClass555 = anonymousClass553.A01;
                AnonymousClass162 anonymousClass162 = anonymousClass555.A00;
                if (anonymousClass162 != null) {
                    if (anonymousClass162 == AnonymousClass553.A06) {
                        anonymousClass162 = null;
                    } else if (anonymousClass162 instanceof AnonymousClass163) {
                        anonymousClass162 = ((AnonymousClass163) anonymousClass162).AMQ();
                    }
                    ((AnonymousClass182) A0A).A00 = anonymousClass162;
                }
                AnonymousClass165 anonymousClass165 = anonymousClass555.A01;
                if (anonymousClass165 != null) {
                    ((AnonymousClass180) A0A).A01 = anonymousClass165;
                }
                if (c45r.A0C(EnumC912645f.CLOSE_CLOSEABLE) && (this instanceof Closeable)) {
                    Closeable closeable2 = (Closeable) this;
                    try {
                        anonymousClass553.A04.A0W(c45r, anonymousClass553.A05).A0X(A0A, this);
                        closeable = null;
                    } catch (Exception e) {
                        e = e;
                        closeable = closeable2;
                    }
                    try {
                        closeable2.close();
                    } catch (Exception e2) {
                        e = e2;
                        C914045z.A0B(A0A, closeable, e);
                        throw C00O.createAndThrow();
                    }
                } else {
                    try {
                        anonymousClass553.A04.A0W(c45r, anonymousClass553.A05).A0X(A0A, this);
                    } catch (Exception e3) {
                        C914045z.A0C(A0A, e3);
                        throw C00O.createAndThrow();
                    }
                }
                A0A.close();
                C16O c16o = c55d.A00;
                String A06 = c16o.A06();
                c16o.A07();
                return A06;
            } catch (AnonymousClass400 e4) {
                throw e4;
            } catch (IOException e5) {
                throw C102314j6.A01(e5);
            }
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }
}
