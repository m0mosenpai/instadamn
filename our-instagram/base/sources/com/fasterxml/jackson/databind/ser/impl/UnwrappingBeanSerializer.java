package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC58319PtB;
import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.EnumC912645f;
import X.RC7;
import X.SIM;
import X.SXY;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.Serializable;
import java.util.Set;

/* loaded from: classes10.dex */
public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    public final SXY A00;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean A08() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UnwrappingBeanSerializer(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r7, X.SXY r8) {
        /*
            r6 = this;
            X.RC7[] r5 = r7.A04
            if (r5 == 0) goto L1f
            int r3 = r5.length
            if (r3 == 0) goto L1f
            if (r8 == 0) goto L1f
            X.SXY r0 = X.SXY.A00
            if (r8 == r0) goto L1f
            X.RC7[] r2 = new X.RC7[r3]
            r1 = 0
        L10:
            r0 = r5[r1]
            if (r0 == 0) goto L1a
            X.RC7 r0 = r0.A02(r8)
            r2[r1] = r0
        L1a:
            int r1 = r1 + 1
            if (r1 < r3) goto L10
            r5 = r2
        L1f:
            X.RC7[] r4 = r7.A03
            if (r4 == 0) goto L3e
            int r3 = r4.length
            if (r3 == 0) goto L3e
            if (r8 == 0) goto L3e
            X.SXY r0 = X.SXY.A00
            if (r8 == r0) goto L3e
            X.RC7[] r2 = new X.RC7[r3]
            r1 = 0
        L2f:
            r0 = r4[r1]
            if (r0 == 0) goto L39
            X.RC7 r0 = r0.A02(r8)
            r2[r1] = r0
        L39:
            int r1 = r1 + 1
            if (r1 < r3) goto L2f
            r4 = r2
        L3e:
            r6.<init>(r7, r5, r4)
            r6.A00 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer.<init>(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, X.SXY):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final JsonSerializer A07(SXY sxy) {
        return new UnwrappingBeanSerializer(this, sxy);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        if (abstractC913345m.A05.A0C(EnumC912645f.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            abstractC913345m.A09("Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`", ((StdSerializer) this).A00);
        } else {
            anonymousClass182.A0F(obj);
            if (this.A01 != null) {
                A0G(anonymousClass182, abstractC913345m, abstractC63023Sar, obj);
                return;
            }
            Object obj2 = this.A02;
            if (obj2 != null) {
                A0D(abstractC913345m, obj2);
            } else {
                A0H(anonymousClass182, abstractC913345m, obj);
                return;
            }
        }
        throw C00O.createAndThrow();
    }

    public final String toString() {
        return AbstractC58319PtB.A0t(((StdSerializer) this).A00, "UnwrappingBeanSerializer for ");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        anonymousClass182.A0F(obj);
        if (this.A01 != null) {
            A0I(anonymousClass182, abstractC913345m, obj, false);
            return;
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            A0D(abstractC913345m, obj2);
            throw C00O.createAndThrow();
        }
        A0H(anonymousClass182, abstractC913345m, obj);
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, RC7[] rc7Arr, RC7[] rc7Arr2) {
        super(unwrappingBeanSerializer, rc7Arr, rc7Arr2);
        this.A00 = unwrappingBeanSerializer.A00;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set set, Set set2) {
        super(unwrappingBeanSerializer, set, set2);
        this.A00 = unwrappingBeanSerializer.A00;
    }

    public UnwrappingBeanSerializer(SIM sim, UnwrappingBeanSerializer unwrappingBeanSerializer) {
        super(sim, unwrappingBeanSerializer, unwrappingBeanSerializer.A02);
        this.A00 = unwrappingBeanSerializer.A00;
    }

    public UnwrappingBeanSerializer(SIM sim, UnwrappingBeanSerializer unwrappingBeanSerializer, Object obj) {
        super(sim, unwrappingBeanSerializer, obj);
        this.A00 = unwrappingBeanSerializer.A00;
    }
}
