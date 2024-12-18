package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC167007dF;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.C102314j6;
import X.C102414jI;
import X.C45I;
import X.C46K;
import X.C46h;
import X.C4JL;
import X.InterfaceC65620ToB;
import X.RC9;
import X.RDC;
import X.SXY;
import X.SZV;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public abstract class ReferenceTypeSerializer extends StdSerializer implements C46K {
    public static final Object A08 = C45I.NON_EMPTY;
    public final InterfaceC65620ToB A00;
    public final JsonSerializer A01;
    public final AbstractC63023Sar A02;
    public final SXY A03;
    public final Object A04;
    public final boolean A05;
    public final AbstractC910944l A06;
    public transient SZV A07;

    public final ReferenceTypeSerializer A0E(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, AbstractC63023Sar abstractC63023Sar, SXY sxy) {
        if (this instanceof GuavaOptionalSerializer) {
            if (this.A00 == interfaceC65620ToB && this.A02 == abstractC63023Sar && this.A01 == jsonSerializer && this.A03 == sxy) {
                return this;
            }
            return new ReferenceTypeSerializer(interfaceC65620ToB, jsonSerializer, abstractC63023Sar, this, sxy, this.A04, this.A05);
        }
        return new ReferenceTypeSerializer(interfaceC65620ToB, jsonSerializer, abstractC63023Sar, this, sxy, this.A04, this.A05);
    }

    public final ReferenceTypeSerializer A0F(Object obj, boolean z) {
        boolean z2 = this instanceof GuavaOptionalSerializer;
        InterfaceC65620ToB interfaceC65620ToB = this.A00;
        AbstractC63023Sar abstractC63023Sar = this.A02;
        JsonSerializer jsonSerializer = this.A01;
        SXY sxy = this.A03;
        if (z2) {
            return new ReferenceTypeSerializer(interfaceC65620ToB, jsonSerializer, abstractC63023Sar, this, sxy, obj, z);
        }
        return new ReferenceTypeSerializer(interfaceC65620ToB, jsonSerializer, abstractC63023Sar, this, sxy, obj, z);
    }

    private final JsonSerializer A03(AbstractC913345m abstractC913345m, Class cls) {
        JsonSerializer A00 = this.A07.A00(cls);
        if (A00 == null) {
            AbstractC910944l abstractC910944l = this.A06;
            if (abstractC910944l.A0J()) {
                A00 = abstractC913345m.A0D(this.A00, abstractC913345m.A0A(abstractC910944l, cls));
            } else {
                A00 = abstractC913345m.A0H(this.A00, cls);
            }
            SXY sxy = this.A03;
            if (sxy != null) {
                A00 = A00.A07(sxy);
            }
            this.A07 = this.A07.A01(A00, cls);
        }
        return A00;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final JsonSerializer A07(SXY sxy) {
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer != null && (jsonSerializer = jsonSerializer.A07(sxy)) == jsonSerializer) {
            return this;
        }
        SXY sxy2 = this.A03;
        if (sxy2 != null) {
            sxy = new RDC(sxy, sxy2);
        }
        if (jsonSerializer == jsonSerializer && sxy2 == sxy) {
            return this;
        }
        return A0E(this.A00, jsonSerializer, this.A02, sxy);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean A08() {
        return AbstractC167007dF.A1W(this.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.AnonymousClass182 r3, X.AbstractC913345m r4, X.AbstractC63023Sar r5, java.lang.Object r6) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer
            if (r0 == 0) goto L28
            X.46h r6 = (X.C46h) r6
            boolean r0 = r6 instanceof X.C4JL
            if (r0 == 0) goto L20
            java.lang.Object r1 = r6.A03()
        Le:
            if (r1 == 0) goto L20
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A01
            if (r0 != 0) goto L1c
            java.lang.Class r0 = r1.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A03(r4, r0)
        L1c:
            r0.A09(r3, r4, r5, r1)
        L1f:
            return
        L20:
            X.SXY r0 = r2.A03
            if (r0 != 0) goto L1f
            r4.A0T(r3)
            return
        L28:
            java.util.concurrent.atomic.AtomicReference r6 = (java.util.concurrent.atomic.AtomicReference) r6
            java.lang.Object r1 = r6.get()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A09(X.182, X.45m, X.Sar, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.AnonymousClass182 r4, X.AbstractC913345m r5, java.lang.Object r6) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer
            if (r0 == 0) goto L2c
            X.46h r6 = (X.C46h) r6
            boolean r0 = r6 instanceof X.C4JL
            if (r0 == 0) goto L24
            java.lang.Object r2 = r6.A03()
        Le:
            if (r2 == 0) goto L24
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A01
            if (r1 != 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A03(r5, r0)
        L1c:
            X.Sar r0 = r3.A02
            if (r0 == 0) goto L33
            r1.A09(r4, r5, r0, r2)
        L23:
            return
        L24:
            X.SXY r0 = r3.A03
            if (r0 != 0) goto L23
            r5.A0T(r4)
            return
        L2c:
            java.util.concurrent.atomic.AtomicReference r6 = (java.util.concurrent.atomic.AtomicReference) r6
            java.lang.Object r2 = r6.get()
            goto Le
        L33:
            r1.A0A(r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A0A(X.182, X.45m, java.lang.Object):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        Object obj2;
        boolean z = this instanceof GuavaOptionalSerializer;
        if (z) {
            if (!(((C46h) obj) instanceof C4JL)) {
                return true;
            }
        } else if (!AbstractC167007dF.A1W(((AtomicReference) obj).get())) {
            return true;
        }
        if (z) {
            obj2 = ((C46h) obj).A03();
        } else {
            obj2 = ((AtomicReference) obj).get();
        }
        if (obj2 == null) {
            return this.A05;
        }
        Object obj3 = this.A04;
        if (obj3 == null) {
            return false;
        }
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = A03(abstractC913345m, obj2.getClass());
            } catch (C102314j6 e) {
                throw new RuntimeException(e);
            }
        }
        if (obj3 == A08) {
            return jsonSerializer.A0B(abstractC913345m, obj2);
        }
        return obj3.equals(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r3 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r7.A06.A02() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0057, code lost:
    
        if (r1 == X.EnumC61059ReY.A01) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c2, code lost:
    
        if (r2.A08(X.C45Y.A0U) != false) goto L64;
     */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r8, X.AbstractC913345m r9) {
        /*
            r7 = this;
            X.Sar r5 = r7.A02
            r4 = r5
            if (r5 == 0) goto L9
            X.Sar r5 = r5.A05(r8)
        L9:
            if (r8 == 0) goto L23
            X.RBL r1 = r8.BSA()
            X.45R r0 = r9.A05
            X.44W r0 = r0.A00()
            if (r1 == 0) goto L23
            java.lang.Object r0 = r0.A0X(r1)
            if (r0 == 0) goto L23
            com.fasterxml.jackson.databind.JsonSerializer r3 = r9.A0M(r1, r0)
            if (r3 != 0) goto L59
        L23:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r7.A01
            if (r3 != 0) goto Lc9
            X.44l r6 = r7.A06
            java.lang.Class r1 = r6.A00
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L59
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto Lc4
            boolean r0 = r6.A03
            if (r0 != 0) goto Lc4
            X.45R r2 = r9.A05
            X.44W r1 = r2.A00()
            if (r1 == 0) goto Lbc
            if (r8 == 0) goto Lbc
            X.RBL r0 = r8.BSA()
            if (r0 == 0) goto Lbc
            X.ReY r1 = r1.A0F(r0)
            X.ReY r0 = X.EnumC61059ReY.A02
            if (r1 == r0) goto Lc4
            X.ReY r0 = X.EnumC61059ReY.A01
            if (r1 != r0) goto Lbc
        L59:
            X.ToB r0 = r7.A00
            if (r0 != r8) goto Lb5
            if (r4 != r5) goto Lb5
            com.fasterxml.jackson.databind.JsonSerializer r0 = r7.A01
            if (r0 != r3) goto Lb5
            r3 = r7
        L64:
            if (r8 == 0) goto L95
            X.45R r1 = r9.A05
            java.lang.Class r0 = r7.A00
            X.45H r5 = r8.AVa(r1, r0)
            X.45I r1 = r5.A00
            X.45I r0 = X.C45I.USE_DEFAULTS
            if (r1 == r0) goto L95
            int r4 = r1.ordinal()
            r2 = 0
            r1 = 1
            r0 = 4
            if (r4 == r0) goto Lae
            r0 = 2
            if (r4 == r0) goto La3
            r0 = 3
            if (r4 == r0) goto Lab
            r0 = 5
            if (r4 == r0) goto L96
            if (r4 == r1) goto L89
            r1 = 0
        L89:
            java.lang.Object r0 = r7.A04
            if (r0 != r2) goto L91
            boolean r0 = r7.A05
            if (r0 == r1) goto L95
        L91:
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r3 = r3.A0F(r2, r1)
        L95:
            return r3
        L96:
            java.lang.Class r0 = r5.A02
            java.lang.Object r2 = r9.A0R(r0)
            if (r2 == 0) goto L89
            boolean r1 = r9.A0V(r2)
            goto L89
        La3:
            X.44l r0 = r7.A06
            boolean r0 = r0.A02()
            if (r0 == 0) goto L89
        Lab:
            java.lang.Object r2 = com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A08
            goto L89
        Lae:
            X.44l r0 = r7.A06
            java.lang.Object r2 = X.C63241Sfv.A00(r0)
            goto L89
        Lb5:
            X.SXY r0 = r7.A03
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r3 = r7.A0E(r8, r3, r5, r0)
            goto L64
        Lbc:
            X.45Y r0 = X.C45Y.A0U
            boolean r0 = r2.A08(r0)
            if (r0 == 0) goto L59
        Lc4:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r9.A0D(r8, r6)
            goto L59
        Lc9:
            boolean r0 = r3 instanceof X.C46K
            com.fasterxml.jackson.databind.JsonSerializer r3 = X.AbstractC58322PtE.A0b(r8, r3, r9, r0)
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public ReferenceTypeSerializer(JsonSerializer jsonSerializer, AbstractC63023Sar abstractC63023Sar, C102414jI c102414jI) {
        super(c102414jI);
        this.A06 = c102414jI.A01;
        this.A00 = null;
        this.A02 = abstractC63023Sar;
        this.A01 = jsonSerializer;
        this.A03 = null;
        this.A04 = null;
        this.A05 = false;
        this.A07 = RC9.A00;
    }

    public ReferenceTypeSerializer(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, AbstractC63023Sar abstractC63023Sar, ReferenceTypeSerializer referenceTypeSerializer, SXY sxy, Object obj, boolean z) {
        super(referenceTypeSerializer);
        this.A06 = referenceTypeSerializer.A06;
        this.A07 = RC9.A00;
        this.A00 = interfaceC65620ToB;
        this.A02 = abstractC63023Sar;
        this.A01 = jsonSerializer;
        this.A03 = sxy;
        this.A04 = obj;
        this.A05 = z;
    }
}
