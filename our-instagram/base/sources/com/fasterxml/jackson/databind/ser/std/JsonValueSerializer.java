package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass001;
import X.AnonymousClass182;
import X.C00O;
import X.C102314j6;
import X.C16R;
import X.C46K;
import X.C60588RBf;
import X.InterfaceC65620ToB;
import X.RBL;
import X.RC9;
import X.SX7;
import X.SZV;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class JsonValueSerializer extends StdSerializer implements C46K {
    public final InterfaceC65620ToB A00;
    public final JsonSerializer A01;
    public final AbstractC63023Sar A02;
    public final boolean A03;
    public final AbstractC910944l A04;
    public final RBL A05;
    public transient SZV A06;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r2 == r0) goto L32;
     */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r14, X.AbstractC913345m r15) {
        /*
            r13 = this;
            r6 = r13
            X.Sar r5 = r13.A02
            r1 = r5
            r3 = r14
            if (r5 == 0) goto Lb
            X.Sar r5 = r5.A05(r14)
        Lb:
            com.fasterxml.jackson.databind.JsonSerializer r9 = r13.A01
            if (r9 != 0) goto L68
            X.45Y r2 = X.C45Y.A0U
            X.45R r0 = r15.A05
            boolean r0 = r0.A08(r2)
            if (r0 != 0) goto L38
            X.44l r0 = r13.A04
            java.lang.Class r0 = r0.A00
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L38
            X.ToB r0 = r13.A00
            if (r14 == r0) goto L37
            boolean r12 = r13.A03
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r2 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r7 = r2
            r8 = r14
            r10 = r5
            r11 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            return r2
        L37:
            return r13
        L38:
            X.44l r0 = r13.A04
            com.fasterxml.jackson.databind.JsonSerializer r4 = r15.A0D(r14, r0)
            java.lang.Class r2 = r0.A00
            boolean r0 = r2.isPrimitive()
            r7 = 0
            if (r0 == 0) goto L54
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 == r0) goto L63
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 == r0) goto L63
            java.lang.Class r0 = java.lang.Double.TYPE
        L51:
            if (r2 == r0) goto L63
            goto L70
        L54:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 == r0) goto L63
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 == r0) goto L63
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r2 == r0) goto L63
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            goto L51
        L63:
            boolean r7 = X.C914045z.A0K(r4)
            goto L70
        L68:
            boolean r0 = r9 instanceof X.C46K
            com.fasterxml.jackson.databind.JsonSerializer r4 = X.AbstractC58322PtE.A0b(r14, r9, r15, r0)
            boolean r7 = r13.A03
        L70:
            X.ToB r0 = r13.A00
            if (r0 != r14) goto L7d
            if (r1 != r5) goto L7d
            if (r9 != r4) goto L7d
            boolean r0 = r13.A03
            if (r7 != r0) goto L7d
            return r13
        L7d:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r2 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        try {
            Object A0A = this.A05.A0A(obj);
            if (A0A == null) {
                abstractC913345m.A0T(anonymousClass182);
                return;
            }
            JsonSerializer jsonSerializer = this.A01;
            if (jsonSerializer == null) {
                jsonSerializer = A0E(abstractC913345m, A0A.getClass());
            } else if (this.A03) {
                SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0J, abstractC63023Sar, obj);
                jsonSerializer.A0A(anonymousClass182, abstractC913345m, A0A);
                abstractC63023Sar.A03(anonymousClass182, A00);
                return;
            }
            jsonSerializer.A09(anonymousClass182, abstractC913345m, new C60588RBf(abstractC63023Sar, obj), A0A);
        } catch (Exception e) {
            StdSerializer.A01(abstractC913345m, obj, AnonymousClass001.A0R(this.A05.A05(), "()"), e);
            throw C00O.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        try {
            Object A0A = this.A05.A0A(obj);
            if (A0A == null) {
                abstractC913345m.A0T(anonymousClass182);
                return;
            }
            JsonSerializer jsonSerializer = this.A01;
            if (jsonSerializer == null) {
                jsonSerializer = A0E(abstractC913345m, A0A.getClass());
            }
            AbstractC63023Sar abstractC63023Sar = this.A02;
            if (abstractC63023Sar != null) {
                jsonSerializer.A09(anonymousClass182, abstractC913345m, abstractC63023Sar, A0A);
            } else {
                jsonSerializer.A0A(anonymousClass182, abstractC913345m, A0A);
            }
        } catch (Exception e) {
            StdSerializer.A01(abstractC913345m, obj, AnonymousClass001.A0R(this.A05.A05(), "()"), e);
            throw C00O.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        Object A0A = this.A05.A0A(obj);
        if (A0A == null) {
            return true;
        }
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = A0E(abstractC913345m, A0A.getClass());
            } catch (C102314j6 e) {
                throw new RuntimeException(e);
            }
        }
        return jsonSerializer.A0B(abstractC913345m, A0A);
    }

    public final JsonSerializer A0E(AbstractC913345m abstractC913345m, Class cls) {
        SZV A01;
        JsonSerializer A00 = this.A06.A00(cls);
        if (A00 == null) {
            AbstractC910944l abstractC910944l = this.A04;
            if (abstractC910944l.A0J()) {
                AbstractC910944l A0A = abstractC913345m.A0A(abstractC910944l, cls);
                A00 = abstractC913345m.A0D(this.A00, A0A);
                A01 = this.A06.A01(A00, A0A.A00);
            } else {
                A00 = abstractC913345m.A0H(this.A00, cls);
                A01 = this.A06.A01(A00, cls);
            }
            this.A06 = A01;
        }
        return A00;
    }

    public JsonValueSerializer(JsonSerializer jsonSerializer, RBL rbl, AbstractC63023Sar abstractC63023Sar) {
        super(rbl.A03());
        this.A05 = rbl;
        this.A04 = rbl.A03();
        this.A02 = abstractC63023Sar;
        this.A01 = jsonSerializer;
        this.A00 = null;
        this.A03 = true;
        this.A06 = RC9.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("(@JsonValue serializer for method ");
        RBL rbl = this.A05;
        A1C.append(rbl.A09());
        A1C.append("#");
        A1C.append(rbl.A05());
        return AbstractC166997dE.A0x(")", A1C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JsonValueSerializer(X.InterfaceC65620ToB r2, com.fasterxml.jackson.databind.JsonSerializer r3, X.AbstractC63023Sar r4, com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r5, boolean r6) {
        /*
            r1 = this;
            java.lang.Class r0 = r5.A00
            if (r0 != 0) goto L6
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L6:
            r1.<init>(r0)
            X.RBL r0 = r5.A05
            r1.A05 = r0
            X.44l r0 = r5.A04
            r1.A04 = r0
            r1.A02 = r4
            r1.A01 = r3
            r1.A00 = r2
            r1.A03 = r6
            X.RC9 r0 = X.RC9.A00
            r1.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.<init>(X.ToB, com.fasterxml.jackson.databind.JsonSerializer, X.Sar, com.fasterxml.jackson.databind.ser.std.JsonValueSerializer, boolean):void");
    }
}
