package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC58321PtD;
import X.AbstractC913345m;
import X.AnonymousClass182;
import java.util.Collection;

/* loaded from: classes10.dex */
public class CollectionSerializer extends AsArraySerializerBase {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Boolean bool;
        Collection collection = (Collection) obj;
        int size = collection.size();
        if (size == 1 && (((bool = this.A05) == null && AbstractC58321PtD.A1V(abstractC913345m)) || bool == Boolean.TRUE)) {
            A0E(anonymousClass182, abstractC913345m, collection);
            return;
        }
        anonymousClass182.A0q(collection, size);
        A0E(anonymousClass182, abstractC913345m, collection);
        anonymousClass182.A0Z();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return ((Collection) obj).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (r6 != r0) goto L31;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0095: INVOKE (r10v0 ?? I:X.45m), (r11v0 ?? I:java.lang.Object), (r0v0 ?? I:java.lang.Throwable), (r5 I:int) STATIC call: com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(X.45m, java.lang.Object, java.lang.Throwable, int):void A[MD:(X.45m, java.lang.Object, java.lang.Throwable, int):void (m)] (LINE:149), block:B:48:0x0095 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.AnonymousClass182 r9, X.AbstractC913345m r10, java.util.Collection r11) {
        /*
            r8 = this;
            r9.A0F(r11)
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.A03
            if (r3 == 0) goto L28
            java.util.Iterator r2 = r11.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            X.Sar r1 = r8.A04
            r5 = 0
        L14:
            java.lang.Object r0 = r2.next()
            if (r0 != 0) goto L1e
            r10.A0T(r9)     // Catch: java.lang.Exception -> L94
            goto L38
        L1e:
            if (r1 != 0) goto L24
            r3.A0A(r9, r10, r0)     // Catch: java.lang.Exception -> L94
            goto L38
        L24:
            r3.A09(r9, r10, r1, r0)     // Catch: java.lang.Exception -> L94
            goto L38
        L28:
            java.util.Iterator r7 = r11.iterator()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L40
            X.SZV r6 = r8.A00
            X.Sar r4 = r8.A04
            r5 = 0
            goto L41
        L38:
            int r5 = r5 + 1
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L14
        L40:
            return
        L41:
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Exception -> L94
            if (r3 != 0) goto L53
            r10.A0T(r9)     // Catch: java.lang.Exception -> L94
        L4a:
            int r5 = r5 + 1
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L94
            if (r0 != 0) goto L41
            goto L93
        L53:
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> L94
            com.fasterxml.jackson.databind.JsonSerializer r1 = r6.A00(r2)     // Catch: java.lang.Exception -> L94
            if (r1 != 0) goto L89
            X.44l r1 = r8.A02     // Catch: java.lang.Exception -> L94
            boolean r0 = r1.A0J()     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L7c
            X.44l r2 = r10.A0A(r1, r2)     // Catch: java.lang.Exception -> L94
            X.ToB r0 = r8.A01     // Catch: java.lang.Exception -> L94
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0B(r0, r2)     // Catch: java.lang.Exception -> L94
            java.lang.Class r0 = r2.A00     // Catch: java.lang.Exception -> L94
            X.SZV r0 = r6.A01(r1, r0)     // Catch: java.lang.Exception -> L94
            if (r6 == r0) goto L79
        L77:
            r8.A00 = r0     // Catch: java.lang.Exception -> L94
        L79:
            X.SZV r6 = r8.A00     // Catch: java.lang.Exception -> L94
            goto L89
        L7c:
            X.ToB r0 = r8.A01     // Catch: java.lang.Exception -> L94
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch: java.lang.Exception -> L94
            X.SZV r0 = r6.A01(r1, r2)     // Catch: java.lang.Exception -> L94
            if (r6 == r0) goto L79
            goto L77
        L89:
            if (r4 != 0) goto L8f
            r1.A0A(r9, r10, r3)     // Catch: java.lang.Exception -> L94
            goto L4a
        L8f:
            r1.A09(r9, r10, r4, r3)     // Catch: java.lang.Exception -> L94
            goto L4a
        L93:
            return
        L94:
            r0 = move-exception
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r10, r11, r0, r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.CollectionSerializer.A0E(X.182, X.45m, java.util.Collection):void");
    }
}
