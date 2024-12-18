package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Date;
import java.text.DateFormat;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class SqlDateSerializer extends DateTimeSerializerBase {
    public SqlDateSerializer() {
        super(null, Date.class, null);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        long time;
        java.util.Date date = (java.util.Date) obj;
        if (A0G(abstractC913345m)) {
            if (date == null) {
                time = 0;
            } else {
                time = date.getTime();
            }
            anonymousClass182.A0i(time);
            return;
        }
        if (((DateTimeSerializerBase) this).A00 == null) {
            anonymousClass182.A0u(date.toString());
        } else {
            A0F(anonymousClass182, abstractC913345m, date);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public final /* bridge */ /* synthetic */ DateTimeSerializerBase A0E(Boolean bool, DateFormat dateFormat) {
        return new DateTimeSerializerBase(bool, Date.class, dateFormat);
    }
}
