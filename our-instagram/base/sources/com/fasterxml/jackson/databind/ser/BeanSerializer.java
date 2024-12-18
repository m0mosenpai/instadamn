package com.fasterxml.jackson.databind.ser;

import X.AbstractC58319PtB;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.SXY;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes10.dex */
public class BeanSerializer extends BeanSerializerBase {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final JsonSerializer A07(SXY sxy) {
        return new UnwrappingBeanSerializer(this, sxy);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        if (this.A01 != null) {
            anonymousClass182.A0F(obj);
            A0I(anonymousClass182, abstractC913345m, obj, true);
            return;
        }
        anonymousClass182.A0p(obj);
        Object obj2 = this.A02;
        if (obj2 != null) {
            A0D(abstractC913345m, obj2);
            throw C00O.createAndThrow();
        }
        A0H(anonymousClass182, abstractC913345m, obj);
        anonymousClass182.A0a();
    }

    public final String toString() {
        return AbstractC58319PtB.A0t(((StdSerializer) this).A00, "BeanSerializer for ");
    }
}
