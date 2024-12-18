package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.EnumC912645f;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;

/* loaded from: classes2.dex */
public class UnknownSerializer extends ToEmptyObjectSerializer {
    public UnknownSerializer() {
        super(Object.class, false);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        if (abstractC913345m.A05.A0C(EnumC912645f.FAIL_ON_EMPTY_BEANS)) {
            abstractC913345m.A09(String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", obj.getClass().getName()), this.A00);
            throw C00O.createAndThrow();
        }
        super.A09(anonymousClass182, abstractC913345m, abstractC63023Sar, obj);
    }
}
