package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C45U;
import X.C45V;
import X.C46K;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public final class BooleanSerializer extends StdScalarSerializer implements C46K {
    public final boolean A00;

    /* loaded from: classes10.dex */
    public final class AsNumber extends StdScalarSerializer implements C46K {
        public final boolean A00;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AsNumber(boolean r2) {
            /*
                r1 = this;
                if (r2 == 0) goto La
                java.lang.Class r0 = java.lang.Boolean.TYPE
            L4:
                r1.<init>(r0)
                r1.A00 = r2
                return
            La:
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                goto L4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BooleanSerializer.AsNumber.<init>(boolean):void");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
            anonymousClass182.A0y(Boolean.TRUE.equals(obj));
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            anonymousClass182.A0h(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // X.C46K
        public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
            C45U A00 = StdSerializer.A00(interfaceC65620ToB, abstractC913345m, Boolean.class);
            if (A00 != null && !A00.A00.A00()) {
                return new BooleanSerializer(this.A00);
            }
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BooleanSerializer(boolean r2) {
        /*
            r1 = this;
            if (r2 == 0) goto La
            java.lang.Class r0 = java.lang.Boolean.TYPE
        L4:
            r1.<init>(r0)
            r1.A00 = r2
            return
        La:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BooleanSerializer.<init>(boolean):void");
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        anonymousClass182.A0y(Boolean.TRUE.equals(obj));
    }

    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        Class cls = super.A00;
        C45U A00 = StdSerializer.A00(interfaceC65620ToB, abstractC913345m, cls);
        if (A00 != null) {
            C45V c45v = A00.A00;
            if (c45v.A00()) {
                return new AsNumber(this.A00);
            }
            if (c45v == C45V.STRING) {
                return new StdSerializer(cls, false);
            }
        }
        return this;
    }
}
