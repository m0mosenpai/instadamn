package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC911444q;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.InterfaceC911544r;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes3.dex */
public class SerializableSerializer extends StdSerializer {
    public static final SerializableSerializer A00 = new SerializableSerializer();

    public SerializableSerializer() {
        super(InterfaceC911544r.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        ((InterfaceC911544r) obj).EOv(anonymousClass182, abstractC913345m, abstractC63023Sar);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        ((InterfaceC911544r) obj).EOr(anonymousClass182, abstractC913345m);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        InterfaceC911544r interfaceC911544r = (InterfaceC911544r) obj;
        if (interfaceC911544r instanceof AbstractC911444q) {
            return ((AbstractC911444q) interfaceC911544r).A01(abstractC913345m);
        }
        return false;
    }
}
