package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Time;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class SqlTimeSerializer extends StdScalarSerializer {
    public SqlTimeSerializer() {
        super(Time.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        anonymousClass182.A0u(obj.toString());
    }
}
