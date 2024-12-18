package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C46K;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public final class TypeWrappedSerializer extends JsonSerializer implements C46K {
    public final JsonSerializer A00;
    public final AbstractC63023Sar A01;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final Class A05() {
        return Object.class;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        this.A00.A09(anonymousClass182, abstractC913345m, abstractC63023Sar, obj);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        this.A00.A09(anonymousClass182, abstractC913345m, this.A01, obj);
    }

    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        JsonSerializer jsonSerializer = this.A00;
        if (jsonSerializer instanceof C46K) {
            jsonSerializer = abstractC913345m.A0F(interfaceC65620ToB, jsonSerializer);
        }
        if (jsonSerializer == jsonSerializer) {
            return this;
        }
        return new TypeWrappedSerializer(jsonSerializer, this.A01);
    }

    public TypeWrappedSerializer(JsonSerializer jsonSerializer, AbstractC63023Sar abstractC63023Sar) {
        this.A01 = abstractC63023Sar;
        this.A00 = jsonSerializer;
    }
}
