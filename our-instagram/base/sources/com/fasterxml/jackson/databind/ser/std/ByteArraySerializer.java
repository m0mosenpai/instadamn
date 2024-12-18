package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC167007dF;
import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C16R;
import X.C45T;
import X.SX7;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class ByteArraySerializer extends StdSerializer {
    public ByteArraySerializer() {
        super(byte[].class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        byte[] bArr = (byte[]) obj;
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0E, abstractC63023Sar, bArr);
        anonymousClass182.A0j(((C45T) abstractC913345m.A05).A01.A00, bArr, 0, bArr.length);
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        byte[] bArr = (byte[]) obj;
        anonymousClass182.A0j(((C45T) abstractC913345m.A05).A01.A00, bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return AbstractC167007dF.A1N(((byte[]) obj).length);
    }
}
