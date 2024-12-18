package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes10.dex */
public class UnsupportedTypeSerializer extends StdSerializer {
    public final AbstractC910944l A00;
    public final String A01;

    public UnsupportedTypeSerializer(AbstractC910944l abstractC910944l, String str) {
        super(Object.class);
        this.A00 = abstractC910944l;
        this.A01 = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        abstractC913345m.A08(this.A00, this.A01);
        throw C00O.createAndThrow();
    }
}
