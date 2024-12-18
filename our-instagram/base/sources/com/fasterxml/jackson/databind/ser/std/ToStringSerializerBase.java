package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.SX7;

/* loaded from: classes2.dex */
public abstract class ToStringSerializerBase extends StdSerializer {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        SX7 A02 = abstractC63023Sar.A02(anonymousClass182, abstractC63023Sar.A04(C16R.A0J, obj));
        A0A(anonymousClass182, abstractC913345m, obj);
        abstractC63023Sar.A03(anonymousClass182, A02);
    }

    public String A0E(Object obj) {
        return obj.toString();
    }
}
