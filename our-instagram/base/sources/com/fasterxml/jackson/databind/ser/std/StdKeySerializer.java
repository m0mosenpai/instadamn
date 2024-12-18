package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC913345m;
import X.AnonymousClass182;

@Deprecated
/* loaded from: classes10.dex */
public class StdKeySerializer extends StdSerializer {
    public StdKeySerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        anonymousClass182.A0r(obj.toString());
    }
}
