package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.C914146b;
import X.SX7;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class TokenBufferSerializer extends StdSerializer {
    public TokenBufferSerializer() {
        super(C914146b.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        C914146b c914146b = (C914146b) obj;
        SX7 A02 = abstractC63023Sar.A02(anonymousClass182, abstractC63023Sar.A04(C16R.A0E, c914146b));
        c914146b.A13(anonymousClass182);
        abstractC63023Sar.A03(anonymousClass182, A02);
    }
}
