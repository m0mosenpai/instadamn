package X;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Sjf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63407Sjf {
    public Map A00 = null;
    public final String A01;

    public static C63200Sf3 A04(EnumC61071Rel enumC61071Rel, C63407Sjf c63407Sjf) {
        c63407Sjf.A0M(new T6A(enumC61071Rel, 1));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0C(EnumC61072Rem enumC61072Rem, C63407Sjf c63407Sjf) {
        c63407Sjf.A0M(new T6E(enumC61072Rem, 1));
        return c63407Sjf.A0L();
    }

    public static C63407Sjf A00() {
        return new C63407Sjf("errorCode");
    }

    public static C63407Sjf A01() {
        return new C63407Sjf("logEventKey");
    }

    public static C63407Sjf A02() {
        return new C63407Sjf("inferenceCommonLogEvent");
    }

    public static C63407Sjf A03(String str) {
        return new C63407Sjf(str);
    }

    public static C63200Sf3 A05(EnumC61071Rel enumC61071Rel, C63407Sjf c63407Sjf, int i) {
        c63407Sjf.A0M(new T6A(enumC61071Rel, i));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A06(EnumC61071Rel enumC61071Rel, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6A(enumC61071Rel, 2));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A07(EnumC61071Rel enumC61071Rel, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6A(enumC61071Rel, 3));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A08(EnumC61071Rel enumC61071Rel, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6A(enumC61071Rel, 4));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A09(EnumC61071Rel enumC61071Rel, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6A(enumC61071Rel, 5));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0A(EnumC61071Rel enumC61071Rel, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6A(enumC61071Rel, 6));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0B(EnumC61071Rel enumC61071Rel, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6A(enumC61071Rel, 7));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0D(EnumC61072Rem enumC61072Rem, C63407Sjf c63407Sjf, int i) {
        c63407Sjf.A0M(new T6E(enumC61072Rem, i));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0E(EnumC61072Rem enumC61072Rem, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6E(enumC61072Rem, 2));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0F(EnumC61072Rem enumC61072Rem, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6E(enumC61072Rem, 3));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0G(EnumC61072Rem enumC61072Rem, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6E(enumC61072Rem, 4));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0H(EnumC61072Rem enumC61072Rem, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6E(enumC61072Rem, 5));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0I(EnumC61072Rem enumC61072Rem, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6E(enumC61072Rem, 6));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0J(EnumC61072Rem enumC61072Rem, String str) {
        C63407Sjf c63407Sjf = new C63407Sjf(str);
        c63407Sjf.A0M(new T6E(enumC61072Rem, 7));
        return c63407Sjf.A0L();
    }

    public static C63200Sf3 A0K(C63407Sjf c63407Sjf, EnumC61088Rf2 enumC61088Rf2, int i) {
        c63407Sjf.A0M(new C64435TDt(enumC61088Rf2, i));
        return c63407Sjf.A0L();
    }

    public final C63200Sf3 A0L() {
        Map unmodifiableMap;
        String str = this.A01;
        Map map = this.A00;
        if (map == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(AbstractC58318PtA.A10(map));
        }
        return new C63200Sf3(str, unmodifiableMap);
    }

    public final void A0M(Annotation annotation) {
        Map map = this.A00;
        if (map == null) {
            map = AbstractC166987dD.A1G();
            this.A00 = map;
        }
        map.put(annotation.annotationType(), annotation);
    }

    public C63407Sjf(String str) {
        this.A01 = str;
    }
}
