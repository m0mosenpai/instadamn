package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.AnonymousClass188;
import X.C16R;
import X.SX7;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class NumberSerializers$DoubleSerializer extends NumberSerializers$Base {
    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        String[] strArr = AnonymousClass188.A04;
        if (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue)) {
            anonymousClass182.A0f(doubleValue);
            return;
        }
        SX7 A02 = abstractC63023Sar.A02(anonymousClass182, abstractC63023Sar.A04(C16R.A0H, obj));
        anonymousClass182.A0f(doubleValue);
        abstractC63023Sar.A03(anonymousClass182, A02);
    }
}
