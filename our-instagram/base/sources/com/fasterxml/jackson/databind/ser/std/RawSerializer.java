package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.SX7;

/* loaded from: classes10.dex */
public class RawSerializer extends StdSerializer {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0E, abstractC63023Sar, obj);
        anonymousClass182.A0N(obj.toString());
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        anonymousClass182.A0N(obj.toString());
    }
}
