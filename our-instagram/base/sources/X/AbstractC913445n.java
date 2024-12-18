package X;

/* renamed from: X.45n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC913445n {
    public final TmN A06(Object obj) {
        if (obj instanceof TmN) {
            return (TmN) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (cls == AbstractC64180T2m.class || C914045z.A0I(cls)) {
                return null;
            }
            if (TmN.class.isAssignableFrom(cls)) {
                return (TmN) C914045z.A03(cls, A03().A05());
            }
            throw new IllegalStateException(AnonymousClass001.A0g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(AnonymousClass001.A0g("AnnotationIntrospector returned Converter definition of type ", obj.getClass().getName(), "; expected type Converter or Class<Converter> instead"));
    }

    public final TI2 A02(SZ3 sz3) {
        return ((TI2) C914045z.A03(sz3.A01, A03().A05())).A00(sz3.A03);
    }

    public final C45T A03() {
        if (this instanceof AbstractC913345m) {
            return ((AbstractC913345m) this).A05;
        }
        return ((AnonymousClass469) this).A02;
    }

    public final RB8 A04(AbstractC910944l abstractC910944l, String str, String str2) {
        if (this instanceof AbstractC913345m) {
            String format = String.format("Could not resolve type id '%s' as a subtype of %s", str, C914045z.A04(abstractC910944l));
            if (str2 != null) {
                format = AnonymousClass001.A0g(format, ": ", str2);
            }
            return new RB8(null, abstractC910944l, format);
        }
        String format2 = String.format("Could not resolve type id '%s' as a subtype of %s", str, C914045z.A04(abstractC910944l));
        C16L c16l = ((AnonymousClass469) this).A07;
        if (str2 != null) {
            format2 = AnonymousClass001.A0g(format2, ": ", str2);
        }
        return new RB8(c16l, abstractC910944l, format2);
    }

    public final C910844k A05() {
        C45T c45t;
        if (this instanceof AnonymousClass469) {
            c45t = ((AnonymousClass469) this).A02;
        } else {
            c45t = ((AbstractC913345m) this).A05;
        }
        return c45t.A01.A07;
    }

    public final String A07(String str) {
        if (str == null) {
            return "[N/A]";
        }
        int length = str.length();
        if (length > 500) {
            str = AnonymousClass001.A0g(str.substring(0, 500), "]...[", str.substring(length - 500));
        }
        return String.format("\"%s\"", str);
    }

    public final void A08(AbstractC910944l abstractC910944l, String str) {
        if (this instanceof AbstractC913345m) {
            throw new R9A(((AbstractC913245l) ((AbstractC913345m) this)).A00, abstractC910944l, str);
        }
        throw new R9A(((AnonymousClass469) this).A07, abstractC910944l, str);
    }

    public final void A09(String str, Class cls) {
        AbstractC910944l A09;
        if (cls == null) {
            A09 = null;
        } else {
            A09 = A05().A09(cls);
        }
        A08(A09, str);
        throw C00O.createAndThrow();
    }
}
