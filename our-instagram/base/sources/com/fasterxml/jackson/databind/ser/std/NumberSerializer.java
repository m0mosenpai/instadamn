package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC58318PtA;
import X.AbstractC913245l;
import X.AbstractC913345m;
import X.AnonymousClass160;
import X.AnonymousClass182;
import X.C102314j6;
import X.C45U;
import X.C46K;
import X.InterfaceC65620ToB;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class NumberSerializer extends StdScalarSerializer implements C46K {
    public static final NumberSerializer A00 = new StdSerializer(Number.class);

    /* loaded from: classes10.dex */
    public final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        public static final BigDecimalAsStringSerializer A00 = new BigDecimalAsStringSerializer();

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
            return false;
        }

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class, false);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            String obj2;
            if (anonymousClass182.A0X(AnonymousClass160.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                int scale = bigDecimal.scale();
                if (scale >= -9999 && scale <= 9999) {
                    obj2 = bigDecimal.toPlainString();
                } else {
                    throw new C102314j6(((AbstractC913245l) abstractC913345m).A00, String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), null);
                }
            } else {
                obj2 = obj.toString();
            }
            anonymousClass182.A0u(obj2);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
        public final String A0E(Object obj) {
            throw AbstractC58318PtA.A0Z();
        }
    }

    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        Class cls = this.A00;
        C45U A002 = StdSerializer.A00(interfaceC65620ToB, abstractC913345m, cls);
        if (A002 != null && A002.A00.ordinal() == 8) {
            if (cls == BigDecimal.class) {
                return BigDecimalAsStringSerializer.A00;
            }
            return ToStringSerializer.A00;
        }
        return this;
    }
}
