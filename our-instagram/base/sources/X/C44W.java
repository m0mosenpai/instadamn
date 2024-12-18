package X;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: X.44W, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C44W implements Serializable {
    public final SZ3 A0I(AnonymousClass455 anonymousClass455, SZ3 sz3) {
        SZ3 sz32 = sz3;
        if (this instanceof C44V) {
            JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) anonymousClass455.A06(JsonIdentityReference.class);
            if (jsonIdentityReference != null) {
                if (sz3 == null) {
                    sz32 = SZ3.A05;
                }
                boolean alwaysAsId = jsonIdentityReference.alwaysAsId();
                if (sz32.A04 != alwaysAsId) {
                    return new SZ3(sz32.A00, sz32.A03, sz32.A01, sz32.A02, alwaysAsId);
                }
                return sz32;
            }
            return sz32;
        }
        return sz3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.TIB A02(X.RBL r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C44V
            if (r0 == 0) goto L6a
            java.lang.Class<com.fasterxml.jackson.annotation.JacksonInject> r0 = com.fasterxml.jackson.annotation.JacksonInject.class
            java.lang.annotation.Annotation r0 = r5.A06(r0)
            com.fasterxml.jackson.annotation.JacksonInject r0 = (com.fasterxml.jackson.annotation.JacksonInject) r0
            if (r0 == 0) goto L6a
            java.lang.String r2 = r0.value()
            X.ReX r1 = r0.useInput()
            X.ReX r0 = X.EnumC61058ReX.A00
            if (r1 != r0) goto L60
            r1 = 0
        L1b:
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L57
            r2 = 0
        L24:
            if (r1 != 0) goto L5a
            X.TIB r3 = X.TIB.A02
        L28:
            java.lang.Object r2 = r3.A01
            if (r2 != 0) goto L51
            boolean r0 = r5 instanceof X.RBK
            if (r0 == 0) goto L52
            r1 = r5
            X.RBH r1 = (X.RBH) r1
            int r0 = r1.A0F()
            if (r0 == 0) goto L52
            r0 = 0
            java.lang.Class r0 = r1.A0I(r0)
        L3e:
            java.lang.String r1 = r0.getName()
            if (r1 == 0) goto L51
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L51
            java.lang.Boolean r0 = r3.A00
            X.TIB r3 = new X.TIB
            r3.<init>(r0, r1)
        L51:
            return r3
        L52:
            java.lang.Class r0 = r5.A04()
            goto L3e
        L57:
            if (r2 != 0) goto L5a
            goto L24
        L5a:
            X.TIB r3 = new X.TIB
            r3.<init>(r1, r2)
            goto L28
        L60:
            X.ReX r0 = X.EnumC61058ReX.A01
            if (r1 != r0) goto L67
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L1b
        L67:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L1b
        L6a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44W.A02(X.RBL):X.TIB");
    }

    public final EnumC61114RfU A03(AnonymousClass455 anonymousClass455) {
        JsonCreator jsonCreator;
        if ((this instanceof C44V) && (jsonCreator = (JsonCreator) anonymousClass455.A06(JsonCreator.class)) != null) {
            return jsonCreator.mode();
        }
        return null;
    }

    public final C45U A04(AnonymousClass455 anonymousClass455) {
        Boolean bool;
        Locale locale;
        if (this instanceof C44V) {
            JsonFormat jsonFormat = (JsonFormat) anonymousClass455.A06(JsonFormat.class);
            if (jsonFormat == null) {
                return null;
            }
            C45U c45u = C45U.A07;
            String pattern = jsonFormat.pattern();
            C45V shape = jsonFormat.shape();
            String locale2 = jsonFormat.locale();
            String timezone = jsonFormat.timezone();
            EnumC61060ReZ[] with = jsonFormat.with();
            EnumC61060ReZ[] without = jsonFormat.without();
            int i = 0;
            for (EnumC61060ReZ enumC61060ReZ : with) {
                i |= 1 << enumC61060ReZ.ordinal();
            }
            int i2 = 0;
            for (EnumC61060ReZ enumC61060ReZ2 : without) {
                i2 |= 1 << enumC61060ReZ2.ordinal();
            }
            C45W c45w = new C45W(i, i2);
            EnumC61058ReX lenient = jsonFormat.lenient();
            if (lenient == EnumC61058ReX.A00) {
                bool = null;
            } else if (lenient == EnumC61058ReX.A01) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            if (locale2 != null && locale2.length() != 0 && !"##default".equals(locale2)) {
                locale = new Locale(locale2);
            } else {
                locale = null;
            }
            if (timezone == null || timezone.length() == 0 || "##default".equals(timezone)) {
                timezone = null;
            }
            return new C45U(c45w, shape, bool, pattern, timezone, locale, null);
        }
        return C45U.A07;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet, java.util.AbstractCollection] */
    public final TII A05(AnonymousClass455 anonymousClass455) {
        JsonIgnoreProperties jsonIgnoreProperties;
        ?? emptySet;
        int length;
        if ((this instanceof C44V) && (jsonIgnoreProperties = (JsonIgnoreProperties) anonymousClass455.A06(JsonIgnoreProperties.class)) != null) {
            TII tii = TII.A05;
            String[] value = jsonIgnoreProperties.value();
            if (value != null && (length = value.length) != 0) {
                emptySet = new HashSet(length);
                int i = 0;
                do {
                    emptySet.add(value[i]);
                    i++;
                } while (i < length);
            } else {
                emptySet = Collections.emptySet();
            }
            return TII.A00(emptySet, jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters());
        }
        return TII.A05;
    }

    public final C45H A06(AnonymousClass455 anonymousClass455) {
        C45H c45h;
        JsonSerialize jsonSerialize;
        C45I c45i;
        if (this instanceof C44V) {
            JsonInclude jsonInclude = (JsonInclude) anonymousClass455.A06(JsonInclude.class);
            if (jsonInclude != null) {
                C45I value = jsonInclude.value();
                C45I content = jsonInclude.content();
                C45I c45i2 = C45I.USE_DEFAULTS;
                if (value != c45i2 || content != c45i2) {
                    Class valueFilter = jsonInclude.valueFilter();
                    Class cls = null;
                    if (valueFilter == Void.class) {
                        valueFilter = null;
                    }
                    Class contentFilter = jsonInclude.contentFilter();
                    if (contentFilter != Void.class) {
                        cls = contentFilter;
                    }
                    c45h = new C45H(value, content, valueFilter, cls);
                    if (c45h.A01 != C45I.USE_DEFAULTS && (jsonSerialize = (JsonSerialize) anonymousClass455.A06(JsonSerialize.class)) != null) {
                        int ordinal = jsonSerialize.include().ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        c45i = C45I.NON_EMPTY;
                                    } else {
                                        return c45h;
                                    }
                                } else {
                                    c45i = C45I.NON_DEFAULT;
                                }
                            } else {
                                c45i = C45I.NON_NULL;
                            }
                        } else {
                            c45i = C45I.ALWAYS;
                        }
                        return new C45H(c45i, c45h.A00, c45h.A03, c45h.A02);
                    }
                }
            }
            c45h = C45H.A04;
            return c45h.A01 != C45I.USE_DEFAULTS ? c45h : c45h;
        }
        return C45H.A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashSet, java.util.AbstractCollection] */
    public final TIA A07(AnonymousClass455 anonymousClass455) {
        JsonIncludeProperties jsonIncludeProperties;
        ?? emptySet;
        int length;
        if ((this instanceof C44V) && (jsonIncludeProperties = (JsonIncludeProperties) anonymousClass455.A06(JsonIncludeProperties.class)) != null) {
            String[] value = jsonIncludeProperties.value();
            if (value != null && (length = value.length) != 0) {
                emptySet = new HashSet(length);
                int i = 0;
                do {
                    emptySet.add(value[i]);
                    i++;
                } while (i < length);
            } else {
                emptySet = Collections.emptySet();
            }
            return new TIA(emptySet);
        }
        return TIA.A01;
    }

    public final EnumC61085Rez A08(AnonymousClass455 anonymousClass455) {
        JsonProperty jsonProperty;
        if ((this instanceof C44V) && (jsonProperty = (JsonProperty) anonymousClass455.A06(JsonProperty.class)) != null) {
            return jsonProperty.access();
        }
        return null;
    }

    public final C45J A09(AnonymousClass455 anonymousClass455) {
        JsonSetter jsonSetter;
        if ((this instanceof C44V) && (jsonSetter = (JsonSetter) anonymousClass455.A06(JsonSetter.class)) != null) {
            C45K nulls = jsonSetter.nulls();
            C45K contentNulls = jsonSetter.contentNulls();
            if (nulls == null) {
                nulls = C45K.DEFAULT;
            }
            if (contentNulls == null) {
                contentNulls = C45K.DEFAULT;
            }
            C45K c45k = C45K.DEFAULT;
            if (nulls != c45k || contentNulls != c45k) {
                return new C45J(nulls, contentNulls);
            }
        }
        return C45J.A02;
    }

    public final C62494SDw A0A(RBL rbl) {
        String value;
        Integer num;
        if (this instanceof C44V) {
            JsonManagedReference jsonManagedReference = (JsonManagedReference) rbl.A06(JsonManagedReference.class);
            if (jsonManagedReference != null) {
                value = jsonManagedReference.value();
                num = C05F.A00;
            } else {
                JsonBackReference jsonBackReference = (JsonBackReference) rbl.A06(JsonBackReference.class);
                if (jsonBackReference != null) {
                    value = jsonBackReference.value();
                    num = C05F.A01;
                } else {
                    return null;
                }
            }
            return new C62494SDw(num, value);
        }
        return null;
    }

    public final AbstractC910944l A0B(AbstractC910944l abstractC910944l, C45T c45t, AnonymousClass455 anonymousClass455) {
        Class as;
        Class contentAs;
        Object[] objArr;
        String str;
        Class keyAs;
        if (this instanceof C44V) {
            C910844k c910844k = c45t.A01.A07;
            JsonDeserialize jsonDeserialize = (JsonDeserialize) anonymousClass455.A06(JsonDeserialize.class);
            if (jsonDeserialize == null) {
                as = null;
            } else {
                as = jsonDeserialize.as();
                if (as == null || C914045z.A0I(as)) {
                    as = null;
                }
            }
            if (as != null && abstractC910944l.A00 != as && !C44V.A00(abstractC910944l, as)) {
                try {
                    abstractC910944l = c910844k.A05(abstractC910944l, as, false);
                } catch (IllegalArgumentException e) {
                    e = e;
                    objArr = new Object[]{abstractC910944l, as.getName(), anonymousClass455.A05(), e.getMessage()};
                    str = "Failed to narrow type %s with annotation (value %s), from '%s': %s";
                    throw new C102314j6(null, String.format(str, objArr), e);
                }
            }
            if (abstractC910944l.A0O()) {
                AbstractC910944l A04 = abstractC910944l.A04();
                if (jsonDeserialize != null && (keyAs = jsonDeserialize.keyAs()) != null && !C914045z.A0I(keyAs) && !C44V.A00(A04, keyAs)) {
                    try {
                        abstractC910944l = ((AnonymousClass558) abstractC910944l).A0T(c910844k.A05(A04, keyAs, false));
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        objArr = new Object[]{abstractC910944l, keyAs.getName(), anonymousClass455.A05(), e.getMessage()};
                        str = "Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s";
                        throw new C102314j6(null, String.format(str, objArr), e);
                    }
                }
            }
            AbstractC910944l A03 = abstractC910944l.A03();
            if (A03 != null && jsonDeserialize != null && (contentAs = jsonDeserialize.contentAs()) != null && !C914045z.A0I(contentAs) && !C44V.A00(A03, contentAs)) {
                try {
                    abstractC910944l = abstractC910944l.A08(c910844k.A05(A03, contentAs, false));
                    return abstractC910944l;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    objArr = new Object[]{abstractC910944l, contentAs.getName(), anonymousClass455.A05(), e.getMessage()};
                    str = "Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s";
                    throw new C102314j6(null, String.format(str, objArr), e);
                }
            }
        }
        return abstractC910944l;
    }

    public final AbstractC910944l A0C(AbstractC910944l abstractC910944l, C45T c45t, AnonymousClass455 anonymousClass455) {
        Class<?> as;
        Class<?> contentAs;
        Object[] objArr;
        String str;
        AbstractC910944l A06;
        Class<?> keyAs;
        AbstractC910944l A062;
        if (this instanceof C44V) {
            C910844k c910844k = c45t.A01.A07;
            JsonSerialize jsonSerialize = (JsonSerialize) anonymousClass455.A06(JsonSerialize.class);
            if (jsonSerialize == null) {
                as = null;
            } else {
                as = jsonSerialize.as();
                if (as == null || C914045z.A0I(as)) {
                    as = null;
                }
            }
            if (as != null) {
                Class cls = abstractC910944l.A00;
                if (cls == as) {
                    abstractC910944l = abstractC910944l.A06();
                } else {
                    try {
                        if (as.isAssignableFrom(cls)) {
                            abstractC910944l = C910844k.A00(abstractC910944l, as);
                        } else if (cls.isAssignableFrom(as)) {
                            abstractC910944l = c910844k.A05(abstractC910944l, as, false);
                        } else if (C44V.A01(cls, as)) {
                            abstractC910944l = abstractC910944l.A06();
                        } else {
                            throw new C102314j6(null, String.format("Cannot refine serialization type %s into %s; types not related", abstractC910944l, as.getName()));
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        objArr = new Object[]{abstractC910944l, as.getName(), anonymousClass455.A05(), e.getMessage()};
                        str = "Failed to widen type %s with annotation (value %s), from '%s': %s";
                        throw new C102314j6(null, String.format(str, objArr), e);
                    }
                }
            }
            if (abstractC910944l.A0O()) {
                AbstractC910944l A04 = abstractC910944l.A04();
                if (jsonSerialize != null && (keyAs = jsonSerialize.keyAs()) != null && !C914045z.A0I(keyAs)) {
                    Class cls2 = A04.A00;
                    if (cls2 == keyAs) {
                        A062 = A04.A06();
                    } else {
                        try {
                            if (keyAs.isAssignableFrom(cls2)) {
                                A062 = C910844k.A00(A04, keyAs);
                            } else if (cls2.isAssignableFrom(keyAs)) {
                                A062 = c910844k.A05(A04, keyAs, false);
                            } else if (C44V.A01(cls2, keyAs)) {
                                A062 = A04.A06();
                            } else {
                                throw new C102314j6(null, String.format("Cannot refine serialization key type %s into %s; types not related", A04, keyAs.getName()));
                            }
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            objArr = new Object[]{abstractC910944l, keyAs.getName(), anonymousClass455.A05(), e.getMessage()};
                            str = "Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s";
                            throw new C102314j6(null, String.format(str, objArr), e);
                        }
                    }
                    abstractC910944l = ((AnonymousClass558) abstractC910944l).A0T(A062);
                }
            }
            AbstractC910944l A03 = abstractC910944l.A03();
            if (A03 != null && jsonSerialize != null && (contentAs = jsonSerialize.contentAs()) != null && !C914045z.A0I(contentAs)) {
                Class cls3 = A03.A00;
                if (cls3 == contentAs) {
                    A06 = A03.A06();
                } else {
                    try {
                        if (contentAs.isAssignableFrom(cls3)) {
                            A06 = C910844k.A00(A03, contentAs);
                        } else if (cls3.isAssignableFrom(contentAs)) {
                            A06 = c910844k.A05(A03, contentAs, false);
                        } else if (C44V.A01(cls3, contentAs)) {
                            A06 = A03.A06();
                        } else {
                            throw new C102314j6(null, String.format("Cannot refine serialization content type %s into %s; types not related", A03, contentAs.getName()));
                        }
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        objArr = new Object[]{abstractC910944l, contentAs.getName(), anonymousClass455.A05(), e.getMessage()};
                        str = "Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s";
                        throw new C102314j6(null, String.format(str, objArr), e);
                    }
                }
                return abstractC910944l.A08(A06);
            }
            return abstractC910944l;
        }
        return abstractC910944l;
    }

    public final C913945y A0D(AnonymousClass455 anonymousClass455) {
        boolean z;
        if (this instanceof C44V) {
            JsonSetter jsonSetter = (JsonSetter) anonymousClass455.A06(JsonSetter.class);
            if (jsonSetter != null) {
                String value = jsonSetter.value();
                if (value.isEmpty()) {
                    z = true;
                } else {
                    return C913945y.A00(value);
                }
            } else {
                z = false;
            }
            JsonProperty jsonProperty = (JsonProperty) anonymousClass455.A06(JsonProperty.class);
            String str = null;
            if (jsonProperty != null) {
                String namespace = jsonProperty.namespace();
                if (namespace == null || !namespace.isEmpty()) {
                    str = namespace;
                }
                return C913945y.A01(jsonProperty.value(), str);
            }
            if (!z && !anonymousClass455.A08(C44V.A01)) {
                return null;
            }
            return C913945y.A04;
        }
        return null;
    }

    public final C913945y A0E(AnonymousClass455 anonymousClass455) {
        boolean z;
        if (this instanceof C44V) {
            JsonGetter jsonGetter = (JsonGetter) anonymousClass455.A06(JsonGetter.class);
            if (jsonGetter != null) {
                String value = jsonGetter.value();
                if (!value.isEmpty()) {
                    return C913945y.A00(value);
                }
                z = true;
            } else {
                z = false;
            }
            JsonProperty jsonProperty = (JsonProperty) anonymousClass455.A06(JsonProperty.class);
            String str = null;
            if (jsonProperty != null) {
                String namespace = jsonProperty.namespace();
                if (namespace == null || !namespace.isEmpty()) {
                    str = namespace;
                }
                return C913945y.A01(jsonProperty.value(), str);
            }
            if (!z && !anonymousClass455.A08(C44V.A02)) {
                return null;
            }
            return C913945y.A04;
        }
        return null;
    }

    public final EnumC61059ReY A0F(AnonymousClass455 anonymousClass455) {
        JsonSerialize jsonSerialize;
        if ((this instanceof C44V) && (jsonSerialize = (JsonSerialize) anonymousClass455.A06(JsonSerialize.class)) != null) {
            return jsonSerialize.typing();
        }
        return null;
    }

    public final RBK A0G(RBK rbk, RBK rbk2) {
        if (this instanceof C44V) {
            Class A0I = rbk.A0I(0);
            Class A0I2 = rbk2.A0I(0);
            if (A0I.isPrimitive()) {
                if (!A0I2.isPrimitive()) {
                    return rbk;
                }
            } else if (!A0I2.isPrimitive()) {
                if (A0I == String.class) {
                    if (A0I2 != String.class) {
                        return rbk;
                    }
                } else if (A0I2 == String.class) {
                    return rbk2;
                }
            } else {
                return rbk2;
            }
            return null;
        }
        return null;
    }

    public final SZ3 A0H(AnonymousClass455 anonymousClass455) {
        JsonIdentityInfo jsonIdentityInfo;
        Class generator;
        if ((this instanceof C44V) && (jsonIdentityInfo = (JsonIdentityInfo) anonymousClass455.A06(JsonIdentityInfo.class)) != null && (generator = jsonIdentityInfo.generator()) != R8a.class) {
            C913945y A00 = C913945y.A00(jsonIdentityInfo.property());
            SZ3 sz3 = SZ3.A05;
            return new SZ3(A00, jsonIdentityInfo.scope(), generator, jsonIdentityInfo.resolver(), false);
        }
        return null;
    }

    public final InterfaceC65505Tla A0J(AbstractC910944l abstractC910944l, C45T c45t, RBL rbl) {
        if (this instanceof C44V) {
            C44V c44v = (C44V) this;
            if (abstractC910944l.A03() != null) {
                return c44v.A0q(c45t, rbl);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Must call method with a container or reference type (got ");
            sb.append(abstractC910944l);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        return null;
    }

    public final InterfaceC65505Tla A0K(C45T c45t, AnonymousClass454 anonymousClass454) {
        if (this instanceof C44V) {
            return ((C44V) this).A0q(c45t, anonymousClass454);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r4.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SXY A0L(X.RBL r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C44V
            if (r0 == 0) goto L4e
            java.lang.Class<com.fasterxml.jackson.annotation.JsonUnwrapped> r0 = com.fasterxml.jackson.annotation.JsonUnwrapped.class
            java.lang.annotation.Annotation r1 = r6.A06(r0)
            com.fasterxml.jackson.annotation.JsonUnwrapped r1 = (com.fasterxml.jackson.annotation.JsonUnwrapped) r1
            if (r1 == 0) goto L4e
            boolean r0 = r1.enabled()
            if (r0 == 0) goto L4e
            java.lang.String r4 = r1.prefix()
            java.lang.String r3 = r1.suffix()
            X.SXY r0 = X.SXY.A00
            r2 = 1
            if (r4 == 0) goto L28
            boolean r0 = r4.isEmpty()
            r1 = 1
            if (r0 == 0) goto L29
        L28:
            r1 = 0
        L29:
            if (r3 == 0) goto L3b
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L3b
        L31:
            if (r1 == 0) goto L43
            if (r2 == 0) goto L3d
            X.RDA r0 = new X.RDA
            r0.<init>(r4, r3)
            return r0
        L3b:
            r2 = 0
            goto L31
        L3d:
            X.RD8 r0 = new X.RD8
            r0.<init>(r4)
            return r0
        L43:
            if (r2 == 0) goto L4b
            X.RD9 r0 = new X.RD9
            r0.<init>(r3)
            return r0
        L4b:
            X.SXY r0 = X.SXY.A00
            return r0
        L4e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44W.A0L(X.RBL):X.SXY");
    }

    public final Boolean A0M(AnonymousClass455 anonymousClass455) {
        JsonMerge jsonMerge;
        EnumC61058ReX value;
        if ((this instanceof C44V) && (jsonMerge = (JsonMerge) anonymousClass455.A06(JsonMerge.class)) != null && (value = jsonMerge.value()) != EnumC61058ReX.A00) {
            if (value == EnumC61058ReX.A01) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return null;
    }

    public final Boolean A0N(AnonymousClass455 anonymousClass455) {
        JsonPropertyOrder jsonPropertyOrder;
        if ((this instanceof C44V) && (jsonPropertyOrder = (JsonPropertyOrder) anonymousClass455.A06(JsonPropertyOrder.class)) != null && jsonPropertyOrder.alphabetic()) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final Boolean A0O(AnonymousClass455 anonymousClass455) {
        JsonAnyGetter jsonAnyGetter;
        if ((this instanceof C44V) && (jsonAnyGetter = (JsonAnyGetter) anonymousClass455.A06(JsonAnyGetter.class)) != null) {
            return Boolean.valueOf(jsonAnyGetter.enabled());
        }
        return null;
    }

    public final Boolean A0P(AnonymousClass455 anonymousClass455) {
        JsonAnySetter jsonAnySetter;
        if ((this instanceof C44V) && (jsonAnySetter = (JsonAnySetter) anonymousClass455.A06(JsonAnySetter.class)) != null) {
            return Boolean.valueOf(jsonAnySetter.enabled());
        }
        return null;
    }

    public final Boolean A0Q(AnonymousClass455 anonymousClass455) {
        JsonKey jsonKey;
        if ((this instanceof C44V) && (jsonKey = (JsonKey) anonymousClass455.A06(JsonKey.class)) != null) {
            return Boolean.valueOf(jsonKey.value());
        }
        return null;
    }

    public final Boolean A0R(AnonymousClass455 anonymousClass455) {
        JsonValue jsonValue;
        if ((this instanceof C44V) && (jsonValue = (JsonValue) anonymousClass455.A06(JsonValue.class)) != null) {
            return Boolean.valueOf(jsonValue.value());
        }
        return null;
    }

    public final Boolean A0S(RBL rbl) {
        JsonProperty jsonProperty;
        if ((this instanceof C44V) && (jsonProperty = (JsonProperty) rbl.A06(JsonProperty.class)) != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    public final Boolean A0T(RBL rbl) {
        if (this instanceof C44V) {
            return Boolean.valueOf(rbl.A0E());
        }
        return null;
    }

    public final Enum A0U(Class cls) {
        if (this instanceof C44V) {
            AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant() && field.getAnnotation(JsonEnumDefaultValue.class) != null) {
                    String name = field.getName();
                    for (Enum r1 : (Enum[]) cls.getEnumConstants()) {
                        if (name.equals(r1.name())) {
                            return r1;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final Integer A0V(AnonymousClass455 anonymousClass455) {
        JsonProperty jsonProperty;
        int index;
        if ((this instanceof C44V) && (jsonProperty = (JsonProperty) anonymousClass455.A06(JsonProperty.class)) != null && (index = jsonProperty.index()) != -1) {
            return Integer.valueOf(index);
        }
        return null;
    }

    public final Object A0W(AnonymousClass455 anonymousClass455) {
        JsonDeserialize jsonDeserialize;
        Class contentUsing;
        if ((this instanceof C44V) && (jsonDeserialize = (JsonDeserialize) anonymousClass455.A06(JsonDeserialize.class)) != null && (contentUsing = jsonDeserialize.contentUsing()) != JsonDeserializer.None.class) {
            return contentUsing;
        }
        return null;
    }

    public final Object A0X(AnonymousClass455 anonymousClass455) {
        JsonSerialize jsonSerialize;
        Class contentUsing;
        if ((this instanceof C44V) && (jsonSerialize = (JsonSerialize) anonymousClass455.A06(JsonSerialize.class)) != null && (contentUsing = jsonSerialize.contentUsing()) != JsonSerializer.None.class) {
            return contentUsing;
        }
        return null;
    }

    public final Object A0Y(AnonymousClass455 anonymousClass455) {
        JsonDeserialize jsonDeserialize;
        Class converter;
        if (!(this instanceof C44V) || (jsonDeserialize = (JsonDeserialize) anonymousClass455.A06(JsonDeserialize.class)) == null || (converter = jsonDeserialize.converter()) == null || C914045z.A0I(converter) || converter == AbstractC64180T2m.class) {
            return null;
        }
        return converter;
    }

    public final Object A0Z(AnonymousClass455 anonymousClass455) {
        JsonDeserialize jsonDeserialize;
        Class using;
        if ((this instanceof C44V) && (jsonDeserialize = (JsonDeserialize) anonymousClass455.A06(JsonDeserialize.class)) != null && (using = jsonDeserialize.using()) != JsonDeserializer.None.class) {
            return using;
        }
        return null;
    }

    public final Object A0a(AnonymousClass455 anonymousClass455) {
        JsonFilter jsonFilter;
        if ((this instanceof C44V) && (jsonFilter = (JsonFilter) anonymousClass455.A06(JsonFilter.class)) != null) {
            String value = jsonFilter.value();
            if (!value.isEmpty()) {
                return value;
            }
            return null;
        }
        return null;
    }

    public final Object A0b(AnonymousClass455 anonymousClass455) {
        JsonDeserialize jsonDeserialize;
        Class keyUsing;
        if ((this instanceof C44V) && (jsonDeserialize = (JsonDeserialize) anonymousClass455.A06(JsonDeserialize.class)) != null && (keyUsing = jsonDeserialize.keyUsing()) != R9S.class) {
            return keyUsing;
        }
        return null;
    }

    public final Object A0c(AnonymousClass455 anonymousClass455) {
        JsonSerialize jsonSerialize;
        Class keyUsing;
        if ((this instanceof C44V) && (jsonSerialize = (JsonSerialize) anonymousClass455.A06(JsonSerialize.class)) != null && (keyUsing = jsonSerialize.keyUsing()) != JsonSerializer.None.class) {
            return keyUsing;
        }
        return null;
    }

    public final Object A0d(AnonymousClass455 anonymousClass455) {
        JsonSerialize jsonSerialize;
        Class converter;
        if (!(this instanceof C44V) || (jsonSerialize = (JsonSerialize) anonymousClass455.A06(JsonSerialize.class)) == null || (converter = jsonSerialize.converter()) == null || C914045z.A0I(converter) || converter == AbstractC64180T2m.class) {
            return null;
        }
        return converter;
    }

    public final Object A0e(AnonymousClass454 anonymousClass454) {
        JsonNaming jsonNaming;
        if ((this instanceof C44V) && (jsonNaming = (JsonNaming) anonymousClass454.A06(JsonNaming.class)) != null) {
            return jsonNaming.value();
        }
        return null;
    }

    public final String A0f(AnonymousClass455 anonymousClass455) {
        JsonProperty jsonProperty;
        if ((this instanceof C44V) && (jsonProperty = (JsonProperty) anonymousClass455.A06(JsonProperty.class)) != null) {
            String defaultValue = jsonProperty.defaultValue();
            if (!defaultValue.isEmpty()) {
                return defaultValue;
            }
        }
        return null;
    }

    public final String A0g(AnonymousClass455 anonymousClass455) {
        JsonPropertyDescription jsonPropertyDescription;
        if ((this instanceof C44V) && (jsonPropertyDescription = (JsonPropertyDescription) anonymousClass455.A06(JsonPropertyDescription.class)) != null) {
            return jsonPropertyDescription.value();
        }
        return null;
    }

    public final String A0h(AnonymousClass454 anonymousClass454) {
        JsonTypeName jsonTypeName;
        if ((this instanceof C44V) && (jsonTypeName = (JsonTypeName) anonymousClass454.A06(JsonTypeName.class)) != null) {
            return jsonTypeName.value();
        }
        return null;
    }

    public final List A0i(AnonymousClass455 anonymousClass455) {
        JsonAlias jsonAlias;
        if ((this instanceof C44V) && (jsonAlias = (JsonAlias) anonymousClass455.A06(JsonAlias.class)) != null) {
            String[] value = jsonAlias.value();
            int length = value.length;
            if (length == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            do {
                arrayList.add(C913945y.A00(value[i]));
                i++;
            } while (i < length);
            return arrayList;
        }
        return null;
    }

    public final List A0j(AnonymousClass455 anonymousClass455) {
        JsonSubTypes jsonSubTypes;
        if ((this instanceof C44V) && (jsonSubTypes = (JsonSubTypes) anonymousClass455.A06(JsonSubTypes.class)) != null) {
            JsonSubTypes.Type[] value = jsonSubTypes.value();
            ArrayList arrayList = new ArrayList(value.length);
            for (JsonSubTypes.Type type : value) {
                arrayList.add(new TI3(type.value(), type.name()));
                for (String str : type.names()) {
                    arrayList.add(new TI3(type.value(), str));
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void A0k(Class cls, Enum[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        if (this instanceof C44V) {
            HashMap hashMap = null;
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                    String value = jsonProperty.value();
                    if (!value.isEmpty()) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(field.getName(), value);
                    }
                }
            }
            if (hashMap != null) {
                int length = enumArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = hashMap.get(enumArr[i].name());
                    if (obj != null) {
                        strArr[i] = obj;
                    }
                }
            }
        }
    }

    public final void A0l(Class cls, Enum[] enumArr, String[][] strArr) {
        JsonAlias jsonAlias;
        if (this instanceof C44V) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant() && (jsonAlias = (JsonAlias) field.getAnnotation(JsonAlias.class)) != null) {
                    String[] value = jsonAlias.value();
                    if (value.length != 0) {
                        String name = field.getName();
                        int length = enumArr.length;
                        for (int i = 0; i < length; i++) {
                            if (name.equals(enumArr[i].name())) {
                                strArr[i] = value;
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean A0m(RBL rbl) {
        JsonIgnore jsonIgnore;
        if ((this instanceof C44V) && (jsonIgnore = (JsonIgnore) rbl.A06(JsonIgnore.class)) != null) {
            return jsonIgnore.value();
        }
        return false;
    }

    public final boolean A0n(Annotation annotation) {
        if (this instanceof C44V) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            C910644i c910644i = ((C44V) this).A00;
            Boolean bool = (Boolean) c910644i.A00.get(annotationType);
            if (bool == null) {
                boolean z = false;
                if (annotationType.getAnnotation(JacksonAnnotationsInside.class) != null) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                c910644i.putIfAbsent(annotationType, bool);
            }
            return bool.booleanValue();
        }
        return false;
    }

    public final Class[] A0o(AnonymousClass455 anonymousClass455) {
        JsonView jsonView;
        if ((this instanceof C44V) && (jsonView = (JsonView) anonymousClass455.A06(JsonView.class)) != null) {
            return jsonView.value();
        }
        return null;
    }

    public final String[] A0p(AnonymousClass454 anonymousClass454) {
        JsonPropertyOrder jsonPropertyOrder;
        if ((this instanceof C44V) && (jsonPropertyOrder = (JsonPropertyOrder) anonymousClass454.A06(JsonPropertyOrder.class)) != null) {
            return jsonPropertyOrder.value();
        }
        return null;
    }
}
