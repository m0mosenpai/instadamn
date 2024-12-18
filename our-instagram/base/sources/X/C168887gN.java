package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168887gN {
    public int A00;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(C168897gO.A00);
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C168907gP.A00);
    public final List A01 = new ArrayList();
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C168917gQ.A00);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r6 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.AbstractC50812Vc r13, java.lang.Object r14, float r15, float r16, boolean r17) {
        /*
            r12 = this;
            r5 = r13
            r6 = r14
            if (r14 != 0) goto L5b
            if (r13 == 0) goto L4f
            int r4 = r13.A05
            X.0do r3 = r12.A04
            java.lang.Object r1 = r3.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r3.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L5e
            int r0 = r0.intValue()
        L26:
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r0 = 58
            r1.append(r0)
            java.lang.Object r0 = r3.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r2)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            if (r6 != 0) goto L60
        L4f:
            java.lang.String r2 = "staticId:"
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            java.lang.String r6 = X.AnonymousClass001.A0O(r2, r1)
        L5b:
            if (r13 != 0) goto L60
            return
        L5e:
            r0 = 0
            goto L26
        L60:
            r7 = 0
            X.7gR r4 = new X.7gR
            r9 = r15
            r10 = r16
            r11 = r17
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.util.List r0 = r12.A01
            r0.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168887gN.A00(X.2Vc, java.lang.Object, float, float, boolean):void");
    }

    public final void A01(Object obj, InterfaceC16820sZ interfaceC16820sZ, Object[] objArr, float f) {
        Object obj2 = obj;
        C14360o3.A0B(objArr, 5);
        if (obj == null) {
            int i = this.A00;
            this.A00 = i + 1;
            obj2 = AnonymousClass001.A0O("staticId:", i);
        }
        this.A01.add(new C168927gR(null, obj2, new C206859Dq(interfaceC16820sZ, 19), objArr, -1.0f, f, false));
    }
}
