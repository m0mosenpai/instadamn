package X;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.Sfv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63241Sfv {
    public static Object A01(AbstractC910944l abstractC910944l) {
        Class cls = abstractC910944l.A00;
        Class A01 = C914045z.A01(cls);
        if (A01 != null) {
            if (A01 == Integer.TYPE) {
                return 0;
            }
            if (A01 == Long.TYPE) {
                return AbstractC167007dF.A0d();
            }
            if (A01 == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (A01 == Double.TYPE) {
                return MSY.A0Y();
            }
            if (A01 == Float.TYPE) {
                return AbstractC25227BEk.A0l();
            }
            if (A01 == Byte.TYPE) {
                return (byte) 0;
            }
            if (A01 == Short.TYPE) {
                return (short) 0;
            }
            if (A01 == Character.TYPE) {
                return (char) 0;
            }
            throw AbstractC58320PtC.A0l("Class ", A01.getName(), " is not a primitive type");
        }
        if (!abstractC910944l.A0N() && !abstractC910944l.A02()) {
            if (cls == String.class) {
                return "";
            }
            if (abstractC910944l.A0Q(Date.class)) {
                return new Date(0L);
            }
            if (abstractC910944l.A0Q(Calendar.class)) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTimeInMillis(0L);
                return gregorianCalendar;
            }
            return null;
        }
        return C45I.NON_EMPTY;
    }

    public static String A02(AbstractC910944l abstractC910944l) {
        String str;
        String str2;
        String name = abstractC910944l.A00.getName();
        if (name.startsWith("java.time.")) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!name.startsWith("org.joda.time.")) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, C914045z.A04(abstractC910944l), str2);
    }

    public static Object A00(AbstractC910944l abstractC910944l) {
        Object A01 = A01(abstractC910944l);
        if (A01 != null) {
            Class<?> cls = A01.getClass();
            if (cls.isArray()) {
                return new C62677SLq(cls, A01, Array.getLength(A01));
            }
        }
        return A01;
    }
}
