package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC167007dF;
import X.AbstractC58321PtD;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C46K;
import X.InterfaceC65620ToB;
import X.RC9;
import X.SZV;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class ObjectArraySerializer extends ArraySerializerBase implements C46K {
    public JsonSerializer A00;
    public SZV A01;
    public final AbstractC910944l A02;
    public final AbstractC63023Sar A03;
    public final boolean A04;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r3 != r0) goto L28;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0098: INVOKE (r10v0 ?? I:X.45m), (r4 I:java.lang.Object), (r0 I:java.lang.Throwable), (r5 I:int) STATIC call: com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(X.45m, java.lang.Object, java.lang.Throwable, int):void A[MD:(X.45m, java.lang.Object, java.lang.Throwable, int):void (m)] (LINE:152), block:B:57:0x0098 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0098: INVOKE (r10v0 ?? I:X.45m), (r4v0 ?? I:java.lang.Object), (r0v0 ?? I:java.lang.Throwable), (r5 I:int) STATIC call: com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(X.45m, java.lang.Object, java.lang.Throwable, int):void A[MD:(X.45m, java.lang.Object, java.lang.Throwable, int):void (m)] (LINE:152), block:B:57:0x0098 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.AnonymousClass182 r9, X.AbstractC913345m r10, java.lang.Object[] r11) {
        /*
            r8 = this;
            int r6 = r11.length
            if (r6 == 0) goto La0
            com.fasterxml.jackson.databind.JsonSerializer r1 = r8.A00
            if (r1 == 0) goto L21
            X.Sar r0 = r8.A03
            r5 = 0
            r4 = 0
        Lb:
            r4 = r11[r5]     // Catch: java.lang.Exception -> L97
            if (r4 != 0) goto L13
            r10.A0T(r9)     // Catch: java.lang.Exception -> L97
            goto L1c
        L13:
            if (r0 != 0) goto L19
            r1.A0A(r9, r10, r4)     // Catch: java.lang.Exception -> L97
            goto L1c
        L19:
            r1.A09(r9, r10, r0, r4)     // Catch: java.lang.Exception -> L97
        L1c:
            int r5 = r5 + 1
            if (r5 >= r6) goto La0
            goto Lb
        L21:
            X.Sar r7 = r8.A03
            r5 = 0
            r4 = 0
            if (r7 != 0) goto L6d
            X.SZV r3 = r8.A01     // Catch: java.lang.Exception -> L97
        L29:
            r4 = r11[r5]     // Catch: java.lang.Exception -> L97
            if (r4 != 0) goto L31
            r10.A0T(r9)     // Catch: java.lang.Exception -> L97
            goto L68
        L31:
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Exception -> L97
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A00(r2)     // Catch: java.lang.Exception -> L97
            if (r1 != 0) goto L57
            X.44l r1 = r8.A02     // Catch: java.lang.Exception -> L97
            boolean r0 = r1.A0J()     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L5b
            X.44l r2 = r10.A0A(r1, r2)     // Catch: java.lang.Exception -> L97
            X.ToB r0 = r8.A00     // Catch: java.lang.Exception -> L97
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0B(r0, r2)     // Catch: java.lang.Exception -> L97
            java.lang.Class r0 = r2.A00     // Catch: java.lang.Exception -> L97
            X.SZV r0 = r3.A01(r1, r0)     // Catch: java.lang.Exception -> L97
            if (r3 == r0) goto L57
        L55:
            r8.A01 = r0     // Catch: java.lang.Exception -> L97
        L57:
            r1.A0A(r9, r10, r4)     // Catch: java.lang.Exception -> L97
            goto L68
        L5b:
            X.ToB r0 = r8.A00     // Catch: java.lang.Exception -> L97
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch: java.lang.Exception -> L97
            X.SZV r0 = r3.A01(r1, r2)     // Catch: java.lang.Exception -> L97
            if (r3 == r0) goto L57
            goto L55
        L68:
            int r5 = r5 + 1
            if (r5 >= r6) goto La0
            goto L29
        L6d:
            X.SZV r3 = r8.A01     // Catch: java.lang.Exception -> L97
        L6f:
            r4 = r11[r5]     // Catch: java.lang.Exception -> L97
            if (r4 != 0) goto L77
            r10.A0T(r9)     // Catch: java.lang.Exception -> L97
            goto L92
        L77:
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Exception -> L97
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A00(r2)     // Catch: java.lang.Exception -> L97
            if (r1 != 0) goto L8f
            X.ToB r0 = r8.A00     // Catch: java.lang.Exception -> L97
            com.fasterxml.jackson.databind.JsonSerializer r1 = r10.A0G(r0, r2)     // Catch: java.lang.Exception -> L97
            X.SZV r0 = r3.A01(r1, r2)     // Catch: java.lang.Exception -> L97
            if (r3 == r0) goto L8f
            r8.A01 = r0     // Catch: java.lang.Exception -> L97
        L8f:
            r1.A09(r9, r10, r7, r4)     // Catch: java.lang.Exception -> L97
        L92:
            int r5 = r5 + 1
            if (r5 >= r6) goto La0
            goto L6f
        L97:
            r0 = move-exception
            com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(r10, r4, r0, r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer.A0E(X.182, X.45m, java.lang.Object[]):void");
    }

    public ObjectArraySerializer(AbstractC910944l abstractC910944l, JsonSerializer jsonSerializer, AbstractC63023Sar abstractC63023Sar, boolean z) {
        super(Object[].class);
        this.A02 = abstractC910944l;
        this.A04 = z;
        this.A03 = abstractC63023Sar;
        this.A01 = RC9.A00;
        this.A00 = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Boolean bool;
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 1 && (((bool = super.A01) == null && AbstractC58321PtD.A1V(abstractC913345m)) || bool == Boolean.TRUE)) {
            A0E(anonymousClass182, abstractC913345m, objArr);
            return;
        }
        anonymousClass182.A0q(objArr, length);
        A0E(anonymousClass182, abstractC913345m, objArr);
        anonymousClass182.A0Z();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return AbstractC167007dF.A1N(((Object[]) obj).length);
    }

    public ObjectArraySerializer(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, AbstractC63023Sar abstractC63023Sar, ObjectArraySerializer objectArraySerializer, Boolean bool) {
        super(interfaceC65620ToB, objectArraySerializer, bool);
        this.A02 = objectArraySerializer.A02;
        this.A03 = abstractC63023Sar;
        this.A04 = objectArraySerializer.A04;
        this.A01 = RC9.A00;
        this.A00 = jsonSerializer;
    }
}
