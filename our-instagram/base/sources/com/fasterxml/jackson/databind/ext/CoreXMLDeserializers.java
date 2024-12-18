package com.fasterxml.jackson.databind.ext;

import X.AbstractC102364jB;
import X.AbstractC58318PtA;
import X.AbstractC910944l;
import X.AnonymousClass451;
import X.AnonymousClass469;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.C45B;
import X.C45T;
import X.C912845h;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/* loaded from: classes10.dex */
public final class CoreXMLDeserializers extends AbstractC102364jB {
    public static final DatatypeFactory A00;

    /* loaded from: classes10.dex */
    public class Std extends FromStringDeserializer {
        public final int A00;

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            if (this.A00 == 2 && c16l.A19(C16R.A0I)) {
                Date A0l = A0l(c16l, anonymousClass469);
                if (A0l == null) {
                    return null;
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(A0l);
                TimeZone timeZone = ((C45T) anonymousClass469.A02).A01.A0A;
                if (timeZone != null || (timeZone = AnonymousClass451.A0B) != null) {
                    gregorianCalendar.setTimeZone(timeZone);
                }
                return CoreXMLDeserializers.A00.newXMLGregorianCalendar(gregorianCalendar);
            }
            return super.A0D(c16l, anonymousClass469);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public final Object A0z(AnonymousClass469 anonymousClass469, String str) {
            int i = this.A00;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return QName.valueOf(str);
                    }
                    throw AbstractC58318PtA.A0Z();
                }
                try {
                    Date A0m = A0m(anonymousClass469, str);
                    if (A0m == null) {
                        return null;
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.setTime(A0m);
                    TimeZone timeZone = ((C45T) anonymousClass469.A02).A01.A0A;
                    if (timeZone == null) {
                        timeZone = AnonymousClass451.A0B;
                    }
                    if (timeZone != null) {
                        gregorianCalendar.setTimeZone(timeZone);
                    }
                    return CoreXMLDeserializers.A00.newXMLGregorianCalendar(gregorianCalendar);
                } catch (C102314j6 unused) {
                    return CoreXMLDeserializers.A00.newXMLGregorianCalendar(str);
                }
            }
            return CoreXMLDeserializers.A00.newDuration(str);
        }

        public Std(Class cls, int i) {
            super(cls);
            this.A00 = i;
        }
    }

    @Override // X.AnonymousClass462
    public final JsonDeserializer AVN(C912845h c912845h, AbstractC910944l abstractC910944l, C45B c45b) {
        int i;
        Class cls = abstractC910944l.A00;
        if (cls == QName.class) {
            i = 3;
        } else if (cls == XMLGregorianCalendar.class) {
            i = 2;
        } else if (cls == Duration.class) {
            i = 1;
        } else {
            return null;
        }
        return new Std(cls, i);
    }

    static {
        try {
            A00 = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}
