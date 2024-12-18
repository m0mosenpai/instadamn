package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC63023Sar;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.SX7;
import java.util.TimeZone;

/* loaded from: classes10.dex */
public class TimeZoneSerializer extends StdScalarSerializer {
    public TimeZoneSerializer() {
        super(TimeZone.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        TimeZone timeZone = (TimeZone) obj;
        SX7 A00 = SX7.A00(anonymousClass182, abstractC63023Sar, TimeZone.class, timeZone);
        anonymousClass182.A0u(timeZone.getID());
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        anonymousClass182.A0u(((TimeZone) obj).getID());
    }
}
