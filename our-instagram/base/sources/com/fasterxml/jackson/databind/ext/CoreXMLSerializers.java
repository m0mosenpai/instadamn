package com.fasterxml.jackson.databind.ext;

import X.AbstractC58322PtE;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C102394jE;
import X.C45B;
import X.C45R;
import X.C46K;
import X.InterfaceC65620ToB;
import X.SX7;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.GregorianCalendar;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* loaded from: classes10.dex */
public final class CoreXMLSerializers extends C102394jE {

    /* loaded from: classes10.dex */
    public class XMLGregorianCalendarSerializer extends StdSerializer implements C46K {
        public static final XMLGregorianCalendarSerializer A01 = new XMLGregorianCalendarSerializer();
        public final JsonSerializer A00;

        public XMLGregorianCalendarSerializer(JsonSerializer jsonSerializer) {
            super(XMLGregorianCalendar.class);
            this.A00 = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
            GregorianCalendar gregorianCalendar;
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            SX7 A00 = SX7.A00(anonymousClass182, abstractC63023Sar, XMLGregorianCalendar.class, xMLGregorianCalendar);
            JsonSerializer jsonSerializer = this.A00;
            if (xMLGregorianCalendar == null) {
                gregorianCalendar = null;
            } else {
                gregorianCalendar = xMLGregorianCalendar.toGregorianCalendar();
            }
            jsonSerializer.A0A(anonymousClass182, abstractC913345m, gregorianCalendar);
            abstractC63023Sar.A03(anonymousClass182, A00);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            GregorianCalendar gregorianCalendar;
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            JsonSerializer jsonSerializer = this.A00;
            if (xMLGregorianCalendar == null) {
                gregorianCalendar = null;
            } else {
                gregorianCalendar = xMLGregorianCalendar.toGregorianCalendar();
            }
            jsonSerializer.A0A(anonymousClass182, abstractC913345m, gregorianCalendar);
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
            GregorianCalendar gregorianCalendar;
            XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) obj;
            JsonSerializer jsonSerializer = this.A00;
            if (xMLGregorianCalendar == null) {
                gregorianCalendar = null;
            } else {
                gregorianCalendar = xMLGregorianCalendar.toGregorianCalendar();
            }
            return jsonSerializer.A0B(abstractC913345m, gregorianCalendar);
        }

        @Override // X.C46K
        public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
            JsonSerializer jsonSerializer = this.A00;
            JsonSerializer jsonSerializer2 = jsonSerializer;
            if (jsonSerializer != null) {
                jsonSerializer2 = AbstractC58322PtE.A0b(interfaceC65620ToB, jsonSerializer, abstractC913345m, jsonSerializer instanceof C46K ? 1 : 0);
            }
            if (jsonSerializer2 != jsonSerializer) {
                return new XMLGregorianCalendarSerializer(jsonSerializer2);
            }
            return this;
        }

        public XMLGregorianCalendarSerializer() {
            this(CalendarSerializer.A00);
        }
    }

    @Override // X.C102394jE, X.C46e
    public final JsonSerializer AVc(AbstractC910944l abstractC910944l, C45R c45r, C45B c45b) {
        Class cls = abstractC910944l.A00;
        if (!Duration.class.isAssignableFrom(cls) && !QName.class.isAssignableFrom(cls)) {
            if (XMLGregorianCalendar.class.isAssignableFrom(cls)) {
                return XMLGregorianCalendarSerializer.A01;
            }
            return null;
        }
        return ToStringSerializer.A00;
    }
}
