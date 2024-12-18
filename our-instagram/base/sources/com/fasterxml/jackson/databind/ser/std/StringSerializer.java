package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public final class StringSerializer extends StdScalarSerializer {
    public StringSerializer() {
        super(String.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        anonymousClass182.A0u((String) obj);
    }
}
