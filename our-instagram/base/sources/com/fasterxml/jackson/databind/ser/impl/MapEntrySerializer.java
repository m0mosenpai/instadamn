package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.C102314j6;
import X.C16R;
import X.C45I;
import X.C46K;
import X.InterfaceC65620ToB;
import X.RC9;
import X.SX7;
import X.SZV;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Map;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class MapEntrySerializer extends ContainerSerializer implements C46K {
    public static final Object A0B = C45I.NON_EMPTY;
    public JsonSerializer A00;
    public JsonSerializer A01;
    public SZV A02;
    public final InterfaceC65620ToB A03;
    public final AbstractC910944l A04;
    public final AbstractC63023Sar A05;
    public final Object A06;
    public final boolean A07;
    public final AbstractC910944l A08;
    public final AbstractC910944l A09;
    public final boolean A0A;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        anonymousClass182.A0F(entry);
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0D, abstractC63023Sar, entry);
        A0E(anonymousClass182, abstractC913345m, entry);
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        anonymousClass182.A0p(entry);
        A0E(anonymousClass182, abstractC913345m, entry);
        anonymousClass182.A0a();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        Class<?> cls;
        SZV szv;
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this.A07;
        }
        Object obj2 = this.A06;
        if (obj2 == null) {
            return false;
        }
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer == null && (jsonSerializer = (szv = this.A02).A00((cls = value.getClass()))) == null) {
            try {
                jsonSerializer = abstractC913345m.A0G(this.A03, cls);
                SZV A01 = szv.A01(jsonSerializer, cls);
                if (szv != A01) {
                    this.A02 = A01;
                }
            } catch (C102314j6 unused) {
                return false;
            }
        }
        if (obj2 == A0B) {
            return jsonSerializer.A0B(abstractC913345m, value);
        }
        return obj2.equals(value);
    }

    public final void A0E(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Map.Entry entry) {
        JsonSerializer jsonSerializer;
        JsonSerializer jsonSerializer2;
        Class<?> cls;
        SZV szv;
        SZV A01;
        AbstractC63023Sar abstractC63023Sar = this.A05;
        Object key = entry.getKey();
        if (key == null) {
            jsonSerializer = abstractC913345m.A00;
        } else {
            jsonSerializer = this.A00;
        }
        Object value = entry.getValue();
        if (value == null) {
            if (!this.A07) {
                jsonSerializer2 = abstractC913345m.A01;
            } else {
                return;
            }
        } else {
            jsonSerializer2 = this.A01;
            if (jsonSerializer2 == null && (jsonSerializer2 = (szv = this.A02).A00((cls = value.getClass()))) == null) {
                AbstractC910944l abstractC910944l = this.A04;
                if (abstractC910944l.A0J()) {
                    AbstractC910944l A0A = abstractC913345m.A0A(abstractC910944l, cls);
                    jsonSerializer2 = abstractC913345m.A0B(this.A03, A0A);
                    A01 = szv.A01(jsonSerializer2, A0A.A00);
                } else {
                    jsonSerializer2 = abstractC913345m.A0G(this.A03, cls);
                    A01 = szv.A01(jsonSerializer2, cls);
                }
                if (szv != A01) {
                    this.A02 = A01;
                }
            }
            Object obj = this.A06;
            if (obj != null && ((obj == A0B && jsonSerializer2.A0B(abstractC913345m, value)) || obj.equals(value))) {
                return;
            }
        }
        jsonSerializer.A0A(anonymousClass182, abstractC913345m, key);
        try {
            if (abstractC63023Sar == null) {
                jsonSerializer2.A0A(anonymousClass182, abstractC913345m, value);
            } else {
                jsonSerializer2.A09(anonymousClass182, abstractC913345m, abstractC63023Sar, value);
            }
        } catch (Exception e) {
            StdSerializer.A01(abstractC913345m, entry, AbstractC167017dG.A0n(key, "", AbstractC166987dD.A1C()), e);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r1 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008a, code lost:
    
        if (r10.A04.A02() != false) goto L48;
     */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r11, X.AbstractC913345m r12) {
        /*
            r10 = this;
            X.45R r2 = r12.A05
            X.44W r3 = r2.A00()
            r8 = 0
            r7 = r10
            if (r11 == 0) goto La0
            X.RBL r1 = r11.BSA()
            if (r1 == 0) goto La0
            if (r3 == 0) goto La0
            java.lang.Object r0 = r3.A0c(r1)
            if (r0 == 0) goto L9d
            com.fasterxml.jackson.databind.JsonSerializer r4 = r12.A0M(r1, r0)
        L1c:
            java.lang.Object r0 = r3.A0X(r1)
            if (r0 == 0) goto L28
            com.fasterxml.jackson.databind.JsonSerializer r0 = r12.A0M(r1, r0)
            if (r0 != 0) goto L2a
        L28:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r10.A01
        L2a:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r10.A0C(r11, r0, r12)
            if (r6 != 0) goto L40
            boolean r0 = r10.A0A
            if (r0 == 0) goto L40
            X.44l r3 = r10.A04
            java.lang.Class r1 = r3.A00
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L40
            com.fasterxml.jackson.databind.JsonSerializer r6 = r12.A0B(r11, r3)
        L40:
            if (r4 != 0) goto L98
            com.fasterxml.jackson.databind.JsonSerializer r4 = r10.A00
            if (r4 != 0) goto L98
            X.44l r0 = r10.A09
            com.fasterxml.jackson.databind.JsonSerializer r5 = r12.A0C(r11, r0)
        L4c:
            java.lang.Object r4 = r10.A06
            boolean r9 = r10.A07
            r3 = 4
            if (r11 == 0) goto L96
            X.45H r2 = r11.AVa(r2, r8)
            X.45I r1 = r2.A00
            X.45I r0 = X.C45I.USE_DEFAULTS
            if (r1 == r0) goto L96
            int r1 = r1.ordinal()
            if (r1 == r3) goto L8f
            r0 = 2
            if (r1 == r0) goto L84
            r0 = 3
            if (r1 == r0) goto L8c
            r0 = 5
            if (r1 == r0) goto L77
            r0 = 1
            r9 = 0
            if (r1 != r0) goto L71
        L70:
            r9 = 1
        L71:
            com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer r4 = new com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L77:
            java.lang.Class r0 = r2.A02
            java.lang.Object r8 = r12.A0R(r0)
            if (r8 == 0) goto L70
            boolean r9 = r12.A0V(r8)
            goto L71
        L84:
            X.44l r0 = r10.A04
            boolean r0 = r0.A02()
            if (r0 == 0) goto L70
        L8c:
            java.lang.Object r8 = com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.A0B
            goto L70
        L8f:
            X.44l r0 = r10.A04
            java.lang.Object r8 = X.C63241Sfv.A00(r0)
            goto L70
        L96:
            r8 = r4
            goto L71
        L98:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r12.A0F(r11, r4)
            goto L4c
        L9d:
            r4 = r8
            goto L1c
        La0:
            r4 = r8
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public MapEntrySerializer(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, AbstractC910944l abstractC910944l3, AbstractC63023Sar abstractC63023Sar, boolean z) {
        super(abstractC910944l);
        this.A08 = abstractC910944l;
        this.A09 = abstractC910944l2;
        this.A04 = abstractC910944l3;
        this.A0A = z;
        this.A05 = abstractC63023Sar;
        this.A03 = interfaceC65620ToB;
        this.A02 = RC9.A00;
        this.A06 = null;
        this.A07 = false;
    }

    public MapEntrySerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, MapEntrySerializer mapEntrySerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.A08 = mapEntrySerializer.A08;
        this.A09 = mapEntrySerializer.A09;
        this.A04 = mapEntrySerializer.A04;
        this.A0A = mapEntrySerializer.A0A;
        this.A05 = mapEntrySerializer.A05;
        this.A00 = jsonSerializer;
        this.A01 = jsonSerializer2;
        this.A02 = RC9.A00;
        this.A03 = mapEntrySerializer.A03;
        this.A06 = obj;
        this.A07 = z;
    }
}
