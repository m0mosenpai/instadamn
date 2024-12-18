package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.557, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass557 extends C44T implements Serializable {
    public final C912845h A00;
    public final AbstractC910944l A01;
    public final AnonymousClass468 A02;
    public final Object A03;
    public final ConcurrentHashMap A04;
    public final C120495ct A05;
    public final C222015v A06;
    public final JsonDeserializer A07;
    public transient AbstractC910944l A08;

    public AnonymousClass557(C912845h c912845h, AbstractC910944l abstractC910944l, C44S c44s) {
        this.A00 = c912845h;
        this.A02 = c44s.A02;
        this.A04 = c44s.A0B;
        this.A06 = c44s.A09;
        this.A01 = abstractC910944l;
        this.A03 = null;
        this.A07 = A08(abstractC910944l);
        this.A05 = null;
    }

    @Override // X.C44T
    public final Object A05(C16L c16l, TIZ tiz) {
        AnonymousClass557 anonymousClass557;
        C912845h c912845h = this.A00;
        AbstractC910944l A09 = ((C45T) c912845h).A01.A07.A09(tiz.A00);
        if (A09 != null && A09.equals(this.A01)) {
            anonymousClass557 = this;
        } else {
            anonymousClass557 = new AnonymousClass557(c912845h, A09, A08(A09), this, this.A03);
        }
        return anonymousClass557.A09(c16l, anonymousClass557.A03);
    }

    @Override // X.C44T
    public final C222015v A03() {
        return this.A06;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.45n, X.469, X.468] */
    @Override // X.C44T
    public final AbstractC911344p A04(C16L c16l) {
        AbstractC911344p abstractC911344p;
        Object obj = this.A03;
        if (obj != null) {
            return (AbstractC911344p) A09(c16l, obj);
        }
        C912845h c912845h = this.A00;
        int i = c912845h.A04;
        if (i != 0) {
            c16l.A0l(c912845h.A03, i);
        }
        C16R A10 = c16l.A10();
        if (A10 == null && (A10 = c16l.A1J()) == null) {
            return null;
        }
        ?? anonymousClass469 = new AnonymousClass469(c16l, c912845h, this.A02);
        if (A10 == C16R.A0G) {
            abstractC911344p = C60603RBu.A00;
        } else {
            AbstractC910944l abstractC910944l = this.A08;
            if (abstractC910944l == null) {
                abstractC910944l = ((C45T) c912845h).A01.A07.A09(AbstractC911344p.class);
                this.A08 = abstractC910944l;
            }
            AbstractC910944l abstractC910944l2 = abstractC910944l;
            if (abstractC910944l == null) {
                abstractC910944l2 = ((C45T) c912845h).A01.A07.A09(AbstractC911344p.class);
                this.A08 = abstractC910944l2;
            }
            ConcurrentHashMap concurrentHashMap = this.A04;
            JsonDeserializer jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(abstractC910944l2);
            if (jsonDeserializer == null) {
                jsonDeserializer = anonymousClass469.A0E(abstractC910944l2);
                if (jsonDeserializer == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot find a deserializer for type ");
                    sb.append(abstractC910944l2);
                    anonymousClass469.A08(abstractC910944l2, sb.toString());
                    throw C00O.createAndThrow();
                }
                concurrentHashMap.put(abstractC910944l2, jsonDeserializer);
            }
            abstractC911344p = (AbstractC911344p) anonymousClass469.A0k(c16l, abstractC910944l, jsonDeserializer, null);
        }
        c16l.A13();
        if (!c912845h.A0C(EnumC912945i.A0G)) {
            return abstractC911344p;
        }
        AbstractC910944l abstractC910944l3 = this.A08;
        if (abstractC910944l3 == null) {
            abstractC910944l3 = ((C45T) c912845h).A01.A07.A09(AbstractC911344p.class);
            this.A08 = abstractC910944l3;
        }
        A0A(c16l, abstractC910944l3);
        return abstractC911344p;
    }

    @Override // X.C44T
    public final void A06(AnonymousClass182 anonymousClass182, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public final JsonDeserializer A07(AnonymousClass469 anonymousClass469) {
        String obj;
        JsonDeserializer jsonDeserializer = this.A07;
        if (jsonDeserializer == null) {
            AbstractC910944l abstractC910944l = this.A01;
            if (abstractC910944l == null) {
                abstractC910944l = null;
                obj = "No value type configured for ObjectReader";
            } else {
                ConcurrentHashMap concurrentHashMap = this.A04;
                jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(abstractC910944l);
                if (jsonDeserializer == null) {
                    jsonDeserializer = anonymousClass469.A0E(abstractC910944l);
                    if (jsonDeserializer == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot find a deserializer for type ");
                        sb.append(abstractC910944l);
                        obj = sb.toString();
                    } else {
                        concurrentHashMap.put(abstractC910944l, jsonDeserializer);
                    }
                }
            }
            anonymousClass469.A08(abstractC910944l, obj);
            throw C00O.createAndThrow();
        }
        return jsonDeserializer;
    }

    public final JsonDeserializer A08(AbstractC910944l abstractC910944l) {
        if (abstractC910944l != null) {
            C912845h c912845h = this.A00;
            if (c912845h.A0C(EnumC912945i.A07)) {
                ConcurrentHashMap concurrentHashMap = this.A04;
                JsonDeserializer jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(abstractC910944l);
                if (jsonDeserializer == null) {
                    try {
                        jsonDeserializer = new AnonymousClass469(c912845h, this.A02).A0E(abstractC910944l);
                        if (jsonDeserializer != null) {
                            concurrentHashMap.put(abstractC910944l, jsonDeserializer);
                        }
                    } catch (AnonymousClass401 unused) {
                    }
                }
                return jsonDeserializer;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.469, X.468] */
    public final Object A09(C16L c16l, Object obj) {
        AnonymousClass468 anonymousClass468 = this.A02;
        C912845h c912845h = this.A00;
        ?? anonymousClass469 = new AnonymousClass469(c16l, c912845h, anonymousClass468);
        int i = c912845h.A04;
        if (i != 0) {
            c16l.A0l(c912845h.A03, i);
        }
        C16R A10 = c16l.A10();
        if (A10 == null && (A10 = c16l.A1J()) == null) {
            throw R98.A04(anonymousClass469.A07);
        }
        if (A10 == C16R.A0G) {
            if (obj == null) {
                obj = A07(anonymousClass469).BXX(anonymousClass469);
            }
        } else if (A10 != C16R.A08 && A10 != C16R.A09) {
            obj = anonymousClass469.A0k(c16l, this.A01, A07(anonymousClass469), this.A03);
        }
        c16l.A13();
        if (c912845h.A0C(EnumC912945i.A0G)) {
            A0A(c16l, this.A01);
        }
        return obj;
    }

    public final void A0A(C16L c16l, AbstractC910944l abstractC910944l) {
        Class<?> cls;
        Object obj;
        C16R A1J = c16l.A1J();
        if (A1J != null) {
            AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
            if (abstractC910944l == null) {
                cls = null;
            } else {
                cls = abstractC910944l.A00;
            }
            if (cls == null && (obj = this.A03) != null) {
                cls = obj.getClass();
            }
            AnonymousClass469.A00(c16l, A1J, cls);
            throw C00O.createAndThrow();
        }
    }

    public AnonymousClass557(C912845h c912845h, AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, AnonymousClass557 anonymousClass557, Object obj) {
        this.A00 = c912845h;
        this.A02 = anonymousClass557.A02;
        this.A04 = anonymousClass557.A04;
        this.A06 = anonymousClass557.A06;
        this.A01 = abstractC910944l;
        this.A07 = jsonDeserializer;
        this.A03 = obj;
        this.A05 = anonymousClass557.A05;
    }
}
