package X;

import com.facebook.common.json.ArrayListDeserializer;
import com.facebook.common.json.ImmutableListDeserializer;
import com.facebook.common.json.ImmutableMapDeserializer;
import com.facebook.common.json.LinkedHashMapDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.4j2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102274j2 extends C44S {
    public static C102274j2 A01;
    public final C102304j5 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.4j9, java.lang.Object] */
    public C102274j2(C102304j5 c102304j5, C222015v c222015v) {
        super(c222015v);
        C912845h c912845h;
        this.A00 = c102304j5;
        A0H(new Object());
        C45N c45n = C45N.NONE;
        C45G c45g = this.A0A;
        c45g.A02 = new C45L(c45n);
        EnumC912945i enumC912945i = EnumC912945i.A0H;
        C912845h c912845h2 = super.A00;
        int i = c912845h2.A00;
        int i2 = i & (enumC912945i.A00 ^ (-1));
        if (i2 == i) {
            c912845h = c912845h2;
        } else {
            c912845h = new C912845h(c912845h2, i2, c912845h2.A03, c912845h2.A04, c912845h2.A01, c912845h2.A02, ((C45T) c912845h2).A00);
        }
        super.A00 = c912845h;
        C45I c45i = C45I.NON_NULL;
        c45g.A00 = new C45H(c45i, c45i, null, null);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.450, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.44z, java.lang.Object] */
    static {
        AnonymousClass452 anonymousClass452 = new AnonymousClass452() { // from class: X.4j3
            @Override // X.AnonymousClass452
            public final C45B A02(C912845h c912845h, AbstractC910944l abstractC910944l, C45F c45f) {
                C45B A00 = AnonymousClass452.A00(abstractC910944l, null);
                if (A00 == null) {
                    JsonDeserialize jsonDeserialize = (JsonDeserialize) abstractC910944l.A00.getAnnotation(JsonDeserialize.class);
                    if (jsonDeserialize != null && jsonDeserialize.using() != null) {
                        return A05(abstractC910944l, c912845h, c45f);
                    }
                    return super.A02(c912845h, abstractC910944l, c45f);
                }
                return A00;
            }

            @Override // X.AnonymousClass452
            public final C45B A03(AbstractC910944l abstractC910944l, C45R c45r, C45F c45f) {
                C45B A00 = AnonymousClass452.A00(abstractC910944l, null);
                if (A00 == null) {
                    JsonSerialize jsonSerialize = (JsonSerialize) abstractC910944l.A00.getAnnotation(JsonSerialize.class);
                    if (jsonSerialize != null && jsonSerialize.using() != null) {
                        return A05(abstractC910944l, c45r, c45f);
                    }
                    return super.A03(abstractC910944l, c45r, c45f);
                }
                return A00;
            }
        };
        C44W c44w = C44S.A0D;
        C910844k c910844k = C910844k.A0A;
        C911844u c911844u = C911844u.A06;
        Locale locale = Locale.getDefault();
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        AnonymousClass451 anonymousClass451 = new AnonymousClass451(C911944v.A01, c44w, null, anonymousClass452, new Object(), new Object(), null, c910844k, c911844u, locale, timeZone);
        try {
            Field declaredField = C44S.class.getDeclaredField("DEFAULT_INTROSPECTOR");
            declaredField.setAccessible(true);
            declaredField.set(null, anonymousClass452);
            Field declaredField2 = C44S.class.getDeclaredField("DEFAULT_BASE");
            declaredField2.setAccessible(true);
            declaredField2.set(null, anonymousClass451);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.4j5, java.lang.Object] */
    public static synchronized C102274j2 A02() {
        C102274j2 c102274j2;
        synchronized (C102274j2.class) {
            c102274j2 = A01;
            if (c102274j2 == null) {
                c102274j2 = new C102274j2(new Object(), new C222015v(null));
                A01 = c102274j2;
            }
        }
        return c102274j2;
    }

    public final JsonDeserializer A0M(AnonymousClass469 anonymousClass469, Type type) {
        if (type instanceof Class) {
            return A0L(anonymousClass469, (Class) type);
        }
        return A0K(anonymousClass469, this.A05.A09(type));
    }

    @Override // X.C44S
    public final JsonDeserializer A07(AnonymousClass469 anonymousClass469, AbstractC910944l abstractC910944l) {
        return A0K(anonymousClass469, abstractC910944l);
    }

    @Override // X.C44S
    public final Object A0A(C16L c16l, C912845h c912845h, AbstractC910944l abstractC910944l) {
        if (c16l.A1K() == null) {
            c16l.A1R(this);
        }
        return super.A0A(c16l, c912845h, abstractC910944l);
    }

    @Override // X.C44S
    public final Object A0B(C16L c16l, AbstractC910944l abstractC910944l) {
        if (c16l.A1K() == null) {
            c16l.A1R(this);
        }
        return super.A0B(c16l, abstractC910944l);
    }

    public final JsonDeserializer A0K(AnonymousClass469 anonymousClass469, AbstractC910944l abstractC910944l) {
        JsonDeserializer A00;
        Class cls;
        JsonDeserializer A002;
        if (abstractC910944l.A0J() || (A002 = AbstractC102434jK.A00(abstractC910944l.A00)) == null) {
            Class cls2 = abstractC910944l.A00;
            if (cls2 != List.class && cls2 != ArrayList.class) {
                if (cls2 == ImmutableList.class) {
                    return new ImmutableListDeserializer(abstractC910944l);
                }
                AbstractC910944l A07 = abstractC910944l.A07(0);
                if (A07 != null && ((cls = A07.A00) == String.class || Enum.class.isAssignableFrom(cls))) {
                    if (cls2 != Map.class && cls2 != HashMap.class && cls2 != LinkedHashMap.class) {
                        if (cls2 == ImmutableMap.class) {
                            return new ImmutableMapDeserializer(abstractC910944l);
                        }
                    } else {
                        return new LinkedHashMapDeserializer(abstractC910944l);
                    }
                }
                try {
                    A00 = super.A07(anonymousClass469, abstractC910944l);
                } catch (NoClassDefFoundError unused) {
                    A00 = C63091Scr.A00(cls2, cls2.getName());
                }
                if (this.A00 == null) {
                    return A00;
                }
                abstractC910944l.toString();
                return A00;
            }
            return new ArrayListDeserializer(abstractC910944l);
        }
        return A002;
    }

    public final JsonDeserializer A0L(AnonymousClass469 anonymousClass469, Class cls) {
        JsonDeserializer A00 = AbstractC102434jK.A00(cls);
        if (A00 == null) {
            A00 = super.A07(anonymousClass469, this.A05.A09(cls));
            if (this.A00 != null) {
                cls.toString();
            }
        }
        return A00;
    }
}
