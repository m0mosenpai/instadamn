package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.InterfaceC200458to;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: classes10.dex */
public class CacheSerializer extends StdSerializer {
    public CacheSerializer() {
        super(InterfaceC200458to.class, false);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        anonymousClass182.A0F(obj);
        abstractC63023Sar.A03(anonymousClass182, AbstractC63023Sar.A00(anonymousClass182, C16R.A0D, abstractC63023Sar, obj));
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        anonymousClass182.A0p(obj);
        anonymousClass182.A0a();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return true;
    }
}
