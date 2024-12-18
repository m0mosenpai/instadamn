package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.46D, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C46D {
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ed, code lost:
    
        if (r0 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A00(X.AbstractC910944l r13, com.fasterxml.jackson.databind.JsonSerializer r14, X.AbstractC913345m r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46D.A00(X.44l, com.fasterxml.jackson.databind.JsonSerializer, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r6 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A01(X.AbstractC910944l r12, X.AbstractC913345m r13) {
        /*
            r11 = this;
            r7 = r11
            X.46B r7 = (X.C46B) r7
            X.45R r9 = r13.A05
            X.451 r0 = r9.A01
            X.453 r8 = r0.A03
            X.452 r8 = (X.AnonymousClass452) r8
            X.45B r4 = r8.A03(r12, r9, r9)
            X.454 r1 = r4.A07
            com.fasterxml.jackson.databind.JsonSerializer r6 = r7.A04(r13, r1)
            if (r6 != 0) goto L91
            X.44W r0 = r9.A00()
            r2 = 0
            if (r0 != 0) goto L65
            r10 = r12
        L1f:
            r5 = 1
            if (r10 == r12) goto L2d
            java.lang.Class r1 = r12.A00
            java.lang.Class r0 = r10.A00
            if (r0 == r1) goto L2c
            X.45B r4 = r8.A03(r10, r9, r9)
        L2c:
            r2 = 1
        L2d:
            X.44W r1 = r4.A04
            if (r1 == 0) goto L6a
            X.454 r0 = r4.A07
            java.lang.Object r0 = r1.A0d(r0)
            X.TmN r3 = r4.A02(r0)
            if (r3 == 0) goto L6a
            X.44k r0 = r13.A05()
            X.44l r2 = r3.BaK(r0)
            java.lang.Class r0 = r10.A00
            java.lang.Class r1 = r2.A00
            if (r1 == r0) goto L57
            X.45B r4 = r8.A03(r2, r9, r9)
            X.454 r0 = r4.A07
            com.fasterxml.jackson.databind.JsonSerializer r6 = r7.A04(r13, r0)
            if (r6 != 0) goto L5f
        L57:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L5f
            com.fasterxml.jackson.databind.JsonSerializer r6 = r7.A06(r2, r13, r4, r5)
        L5f:
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer r0 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
            r0.<init>(r2, r6, r3)
            return r0
        L65:
            X.44l r10 = r0.A0C(r12, r9, r1)     // Catch: X.C102314j6 -> L6f
            goto L1f
        L6a:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r7.A06(r10, r13, r4, r2)
            return r0
        L6f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            X.44l r0 = r4.A05
            java.lang.Class r0 = r0.A00
            java.lang.String r0 = X.C914045z.A06(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Invalid type definition for type %s: %s"
            java.lang.String r3 = java.lang.String.format(r0, r1)
            X.45l r13 = (X.AbstractC913245l) r13
            X.182 r2 = r13.A00
            r1 = 0
            X.R9A r0 = new X.R9A
            r0.<init>(r2, r4, r1, r3)
            throw r0
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46D.A01(X.44l, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final AbstractC60587RBe A02(AbstractC910944l abstractC910944l, C45R c45r) {
        AnonymousClass454 anonymousClass454 = c45r.A02(abstractC910944l.A00).A07;
        C44W A00 = c45r.A00();
        InterfaceC65505Tla A0K = A00.A0K(c45r, anonymousClass454);
        ArrayList arrayList = null;
        if (A0K == null) {
            A0K = ((C45T) c45r).A01.A06;
            if (A0K == null) {
                return null;
            }
        } else {
            C45C c45c = ((C45S) c45r).A03;
            HashMap hashMap = new HashMap();
            c45c.A04(A00, c45r, anonymousClass454, new TI3(anonymousClass454.A05, null), hashMap);
            arrayList = new ArrayList(hashMap.values());
        }
        return A0K.AEo(abstractC910944l, c45r, arrayList);
    }
}
