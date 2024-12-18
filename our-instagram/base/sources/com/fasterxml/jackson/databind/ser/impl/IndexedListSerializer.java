package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC58321PtD;
import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.List;

@JacksonStdImpl
/* loaded from: classes10.dex */
public final class IndexedListSerializer extends AsArraySerializerBase {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Boolean bool;
        List list = (List) obj;
        int size = list.size();
        if (size == 1 && (((bool = this.A05) == null && AbstractC58321PtD.A1V(abstractC913345m)) || bool == Boolean.TRUE)) {
            A0E(anonymousClass182, abstractC913345m, list);
            return;
        }
        anonymousClass182.A0q(list, size);
        A0E(anonymousClass182, abstractC913345m, list);
        anonymousClass182.A0Z();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        if (r4 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
    
        if (r4 != r0) goto L49;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00c8: INVOKE (r10v0 ?? I:X.45m), (r11v0 ?? I:java.lang.Object), (r0v0 ?? I:java.lang.Throwable), (r5 I:int) STATIC call: com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(X.45m, java.lang.Object, java.lang.Throwable, int):void A[MD:(X.45m, java.lang.Object, java.lang.Throwable, int):void (m)] (LINE:200), block:B:74:0x00c8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.AnonymousClass182 r9, X.AbstractC913345m r10, java.util.List r11) {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.A03
            if (r3 == 0) goto L25
            int r2 = r11.size()
            if (r2 == 0) goto Ld0
            X.Sar r1 = r8.A04
            r5 = 0
        Ld:
            if (r5 >= r2) goto Ld0
            java.lang.Object r0 = r11.get(r5)
            if (r0 != 0) goto L19
            r10.A0T(r9)     // Catch: java.lang.Exception -> Lc7
            goto L22
        L19:
            if (r1 != 0) goto L1f
            r3.A0A(r9, r10, r0)     // Catch: java.lang.Exception -> Lc7
            goto L22
        L1f:
            r3.A09(r9, r10, r1, r0)     // Catch: java.lang.Exception -> Lc7
        L22:
            int r5 = r5 + 1
            goto Ld
        L25:
            X.Sar r7 = r8.A04
            int r6 = r11.size()
            if (r7 == 0) goto L7a
            if (r6 == 0) goto Ld0
            r5 = 0
            X.SZV r4 = r8.A00     // Catch: java.lang.Exception -> Lc7
        L32:
            if (r5 >= r6) goto Ld0
            java.lang.Object r3 = r11.get(r5)     // Catch: java.lang.Exception -> Lc7
            if (r3 != 0) goto L3e
            r10.A0T(r9)     // Catch: java.lang.Exception -> Lc7
            goto L77
        L3e:
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> Lc7
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.A00(r2)     // Catch: java.lang.Exception -> Lc7
            if (r1 != 0) goto L66
            X.44l r1 = r8.A02     // Catch: java.lang.Exception -> Lc7
            boolean r0 = r1.A0J()     // Catch: java.lang.Exception -> Lc7
            if (r0 == 0) goto L6a
            X.44l r2 = r10.A0A(r1, r2)     // Catch: java.lang.Exception -> Lc7
            X.ToB r0 = r8.A01     // Catch: java.lang.Exception -> Lc7
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0B(r0, r2)     // Catch: java.lang.Exception -> Lc7
            java.lang.Class r0 = r2.A00     // Catch: java.lang.Exception -> Lc7
            X.SZV r0 = r4.A01(r1, r0)     // Catch: java.lang.Exception -> Lc7
            if (r4 == r0) goto L64
        L62:
            r8.A00 = r0     // Catch: java.lang.Exception -> Lc7
        L64:
            X.SZV r4 = r8.A00     // Catch: java.lang.Exception -> Lc7
        L66:
            r1.A09(r9, r10, r7, r3)     // Catch: java.lang.Exception -> Lc7
            goto L77
        L6a:
            X.ToB r0 = r8.A01     // Catch: java.lang.Exception -> Lc7
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch: java.lang.Exception -> Lc7
            X.SZV r0 = r4.A01(r1, r2)     // Catch: java.lang.Exception -> Lc7
            if (r4 == r0) goto L64
            goto L62
        L77:
            int r5 = r5 + 1
            goto L32
        L7a:
            if (r6 == 0) goto Ld0
            r5 = 0
            X.SZV r4 = r8.A00     // Catch: java.lang.Exception -> Lc7
        L7f:
            if (r5 >= r6) goto Ld0
            java.lang.Object r3 = r11.get(r5)     // Catch: java.lang.Exception -> Lc7
            if (r3 != 0) goto L8b
            r10.A0T(r9)     // Catch: java.lang.Exception -> Lc7
            goto Lc4
        L8b:
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Exception -> Lc7
            com.fasterxml.jackson.databind.JsonSerializer r1 = r4.A00(r2)     // Catch: java.lang.Exception -> Lc7
            if (r1 != 0) goto Lb3
            X.44l r1 = r8.A02     // Catch: java.lang.Exception -> Lc7
            boolean r0 = r1.A0J()     // Catch: java.lang.Exception -> Lc7
            if (r0 == 0) goto Lb7
            X.44l r2 = r10.A0A(r1, r2)     // Catch: java.lang.Exception -> Lc7
            X.ToB r0 = r8.A01     // Catch: java.lang.Exception -> Lc7
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0B(r0, r2)     // Catch: java.lang.Exception -> Lc7
            java.lang.Class r0 = r2.A00     // Catch: java.lang.Exception -> Lc7
            X.SZV r0 = r4.A01(r1, r0)     // Catch: java.lang.Exception -> Lc7
            if (r4 == r0) goto Lb1
        Laf:
            r8.A00 = r0     // Catch: java.lang.Exception -> Lc7
        Lb1:
            X.SZV r4 = r8.A00     // Catch: java.lang.Exception -> Lc7
        Lb3:
            r1.A0A(r9, r10, r3)     // Catch: java.lang.Exception -> Lc7
            goto Lc4
        Lb7:
            X.ToB r0 = r8.A01     // Catch: java.lang.Exception -> Lc7
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch: java.lang.Exception -> Lc7
            X.SZV r0 = r4.A01(r1, r2)     // Catch: java.lang.Exception -> Lc7
            if (r4 == r0) goto Lb1
            goto Laf
        Lc4:
            int r5 = r5 + 1
            goto L7f
        Lc7:
            r0 = move-exception
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r10, r11, r0, r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.A0E(X.182, X.45m, java.util.List):void");
    }
}
