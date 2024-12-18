package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.44S, reason: invalid class name */
/* loaded from: classes2.dex */
public class C44S extends C44T implements Serializable {
    public static final C44W A0D;
    public static final AnonymousClass451 DEFAULT_BASE;
    public C912845h A00;
    public C45R A01;
    public AnonymousClass468 A02;
    public AbstractC913245l A03;
    public C46D A04;
    public C910844k A05;
    public C45E A06;
    public C45C A07;
    public java.util.Set A08;
    public final C222015v A09;
    public final C45G A0A;
    public final ConcurrentHashMap A0B;
    public final C45O A0C;

    /* JADX WARN: Type inference failed for: r5v0, types: [X.450, java.lang.Object] */
    static {
        C44V c44v = new C44V();
        A0D = c44v;
        C910844k c910844k = C910844k.A0A;
        C911844u c911844u = C911844u.A06;
        Locale locale = Locale.getDefault();
        DEFAULT_BASE = new AnonymousClass451(C911944v.A01, c44v, null, null, new Object(), C44x.A00, null, c910844k, c911844u, locale, null);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.45C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.45E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.45l, X.45m] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.469, X.468] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.453, java.lang.Object] */
    public C44S(C222015v c222015v) {
        this.A0B = new ConcurrentHashMap(64, 0.6f, 2);
        if (c222015v == null) {
            this.A09 = new C222015v(this);
        } else {
            this.A09 = c222015v;
            if (c222015v.A03 == null) {
                c222015v.A03 = this;
            }
        }
        this.A07 = new Object();
        C45D c45d = new C45D();
        this.A05 = C910844k.A0A;
        ?? obj = new Object();
        this.A06 = obj;
        AnonymousClass451 anonymousClass451 = DEFAULT_BASE;
        ?? obj2 = new Object();
        if (anonymousClass451.A03 != obj2) {
            anonymousClass451 = new AnonymousClass451(anonymousClass451.A00, anonymousClass451.A01, anonymousClass451.A02, obj2, anonymousClass451.A04, anonymousClass451.A05, anonymousClass451.A06, anonymousClass451.A07, anonymousClass451.A08, anonymousClass451.A09, anonymousClass451.A0A);
        }
        C45G c45g = new C45G();
        this.A0A = c45g;
        C45O c45o = new C45O();
        this.A0C = c45o;
        C45C c45c = this.A07;
        C45R c45r = new C45R(anonymousClass451, c45g, obj, c45c, c45d);
        this.A01 = c45r;
        C912845h c912845h = new C912845h(anonymousClass451, c45o, c45g, obj, c45c, c45d);
        this.A00 = c912845h;
        C45Y c45y = C45Y.A0Q;
        if (c45r.A08(c45y)) {
            long j = ((C45T) c45r).A00;
            long j2 = j & (new C45Y[]{c45y}[0].A00 ^ (-1));
            this.A01 = j2 != j ? new C45R(c45r, c45r.A04, c45r.A02, c45r.A03, c45r.A00, c45r.A01, j2) : c45r;
            long j3 = ((C45T) c912845h).A00;
            long j4 = j3 & (new C45Y[]{c45y}[0].A00 ^ (-1));
            this.A00 = j4 != j3 ? new C912845h(c912845h, c912845h.A00, c912845h.A03, c912845h.A04, c912845h.A01, c912845h.A02, j4) : c912845h;
        }
        this.A03 = new AbstractC913345m();
        this.A02 = new AnonymousClass469(C913645v.A00);
        this.A04 = C46B.A00;
    }

    public static final void A01(String str, Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    public JsonDeserializer A07(AnonymousClass469 anonymousClass469, AbstractC910944l abstractC910944l) {
        ConcurrentHashMap concurrentHashMap = this.A0B;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(abstractC910944l);
        if (jsonDeserializer == null) {
            jsonDeserializer = anonymousClass469.A0E(abstractC910944l);
            if (jsonDeserializer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC111324zv.A00(3526));
                sb.append(abstractC910944l);
                anonymousClass469.A08(abstractC910944l, sb.toString());
                throw C00O.createAndThrow();
            }
            concurrentHashMap.put(abstractC910944l, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.469, X.468] */
    public final AbstractC911344p A08(String str) {
        AbstractC911344p abstractC911344p;
        try {
            C16L A03 = this.A09.A03(str);
            try {
                AbstractC910944l A09 = this.A05.A09(AbstractC911344p.class);
                C912845h c912845h = this.A00;
                int i = c912845h.A04;
                if (i != 0) {
                    A03.A0l(c912845h.A03, i);
                }
                C16R A10 = A03.A10();
                if (A10 == null && (A10 = A03.A1J()) == null) {
                    abstractC911344p = C60605RBw.A00;
                } else {
                    ?? anonymousClass469 = new AnonymousClass469(A03, c912845h, this.A02);
                    if (A10 == C16R.A0G) {
                        abstractC911344p = C60603RBu.A00;
                    } else {
                        abstractC911344p = (AbstractC911344p) anonymousClass469.A0k(A03, A09, A07(anonymousClass469, A09), null);
                    }
                    if (c912845h.A0C(EnumC912945i.A0G)) {
                        A00(A03, A09);
                    }
                }
                A03.close();
                return abstractC911344p;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        A03.close();
                    } catch (Throwable th3) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (AnonymousClass400 e) {
            throw e;
        } catch (IOException e2) {
            throw C102314j6.A01(e2);
        }
    }

    public final AbstractC913245l A09(C45R c45r) {
        if (this instanceof C102274j2) {
            C102274j2 c102274j2 = (C102274j2) this;
            return new C121555ex(c102274j2.A00, c45r, c102274j2.A03, c102274j2.A04);
        }
        return this.A03.A0W(c45r, this.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.469, X.468] */
    public Object A0A(C16L c16l, C912845h c912845h, AbstractC910944l abstractC910944l) {
        C912845h c912845h2 = this.A00;
        int i = c912845h2.A04;
        if (i != 0) {
            c16l.A0l(c912845h2.A03, i);
        }
        C16R A10 = c16l.A10();
        if (A10 == null && (A10 = c16l.A1J()) == null) {
            C102314j6 c102314j6 = new C102314j6(c16l, "No content to map due to end-of-input");
            AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
            throw c102314j6;
        }
        ?? anonymousClass469 = new AnonymousClass469(c16l, c912845h, this.A02);
        Object obj = null;
        if (A10 == C16R.A0G) {
            obj = A07(anonymousClass469, abstractC910944l).BXX(anonymousClass469);
        } else if (A10 != C16R.A08 && A10 != C16R.A09) {
            obj = anonymousClass469.A0k(c16l, abstractC910944l, A07(anonymousClass469, abstractC910944l), null);
        }
        c16l.A13();
        if (c912845h.A0C(EnumC912945i.A0G)) {
            A00(c16l, abstractC910944l);
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.44S] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.R97] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.R97, X.4j6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.469, X.468] */
    public Object A0B(C16L c16l, AbstractC910944l abstractC910944l) {
        Iterator it;
        try {
            C912845h c912845h = this.A00;
            ?? anonymousClass469 = new AnonymousClass469(c16l, c912845h, this.A02);
            int i = c912845h.A04;
            if (i != 0) {
                c16l.A0l(c912845h.A03, i);
            }
            C16R A10 = c16l.A10();
            if (A10 == null && (A10 = c16l.A1J()) == null) {
                C102314j6 c102314j6 = new C102314j6(c16l, "No content to map due to end-of-input");
                AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
                throw c102314j6;
            }
            Object obj = null;
            if (A10 == C16R.A0G) {
                obj = A07(anonymousClass469, abstractC910944l).BXX(anonymousClass469);
            } else if (A10 != C16R.A08 && A10 != C16R.A09) {
                obj = anonymousClass469.A0k(c16l, abstractC910944l, A07(anonymousClass469, abstractC910944l), null);
                LinkedHashMap linkedHashMap = anonymousClass469.A01;
                if (linkedHashMap != null && anonymousClass469.A0j(EnumC912945i.A0I)) {
                    ?? r6 = 0;
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        SP8 sp8 = (SP8) ((Map.Entry) it2.next()).getValue();
                        LinkedList linkedList = sp8.A02;
                        if (linkedList != null && !linkedList.isEmpty()) {
                            if (r6 == 0) {
                                r6 = new C102314j6(anonymousClass469.A07, "Unresolved forward references for: ");
                                r6.A01 = new ArrayList();
                                r6.A0A();
                            }
                            Object obj2 = sp8.A03.A02;
                            LinkedList linkedList2 = sp8.A02;
                            if (linkedList2 == null) {
                                it = Collections.emptyList().iterator();
                            } else {
                                it = linkedList2.iterator();
                            }
                            while (it.hasNext()) {
                                SW1 sw1 = (SW1) it.next();
                                r6.A01.add(new C62676SLo(((AnonymousClass400) sw1.A00).A00, sw1.A01, obj2));
                            }
                        }
                    }
                    if (r6 != 0) {
                        throw r6;
                    }
                }
            }
            if (c912845h.A0C(EnumC912945i.A0G)) {
                A00(c16l, abstractC910944l);
            }
            c16l.close();
            return obj;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c16l.close();
                    throw th2;
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
                    throw th2;
                }
            }
        }
    }

    public final Object A0C(TIZ tiz, String str) {
        A01("content", str);
        return A0D(this.A05.A07(null, C910844k.A09, tiz.A00), str);
    }

    public final Object A0D(AbstractC910944l abstractC910944l, String str) {
        A01("content", str);
        try {
            return A0B(this.A09.A03(str), abstractC910944l);
        } catch (AnonymousClass400 e) {
            throw e;
        } catch (IOException e2) {
            throw C102314j6.A01(e2);
        }
    }

    public final Object A0E(String str, Class cls) {
        A01("content", str);
        return A0D(this.A05.A09(cls), str);
    }

    public final String A0F(Object obj) {
        C222015v c222015v = this.A09;
        C55D c55d = new C55D(c222015v.A0B());
        try {
            C17z A0A = c222015v.A0A(c55d);
            this.A01.A0B(A0A);
            A0G(A0A, obj);
            C16O c16o = c55d.A00;
            String A06 = c16o.A06();
            c16o.A07();
            return A06;
        } catch (AnonymousClass400 e) {
            throw e;
        } catch (IOException e2) {
            throw C102314j6.A01(e2);
        }
    }

    public final void A0G(AnonymousClass182 anonymousClass182, Object obj) {
        C45R c45r = this.A01;
        if (c45r.A0C(EnumC912645f.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            Closeable closeable = (Closeable) obj;
            try {
                A09(c45r).A0X(anonymousClass182, obj);
                try {
                    closeable.close();
                } catch (Exception e) {
                    e = e;
                    closeable = null;
                    C914045z.A0B(anonymousClass182, closeable, e);
                    throw C00O.createAndThrow();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            try {
                A09(c45r).A0X(anonymousClass182, obj);
            } catch (Exception e3) {
                C914045z.A0C(anonymousClass182, e3);
                throw C00O.createAndThrow();
            }
        }
        anonymousClass182.close();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.469, X.468] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.4jF, java.lang.Object] */
    public final void A0H(AbstractC102344j9 abstractC102344j9) {
        C4jF[] c4jFArr;
        String name;
        A01("module", abstractC102344j9);
        Iterator it = Collections.emptyList().iterator();
        while (it.hasNext()) {
            A0H((AbstractC102344j9) it.next());
        }
        if (this.A01.A08(C45Y.A0I) && (name = abstractC102344j9.getClass().getName()) != null) {
            java.util.Set set = this.A08;
            if (set == null) {
                set = new LinkedHashSet();
                this.A08 = set;
            }
            if (!set.add(name)) {
                return;
            }
        }
        Object obj = new Object();
        AbstractC913745w abstractC913745w = (AbstractC913745w) this.A02.A04;
        AnonymousClass461 anonymousClass461 = abstractC913745w.A00;
        AnonymousClass461 anonymousClass4612 = new AnonymousClass461(anonymousClass461.A00, anonymousClass461.A01, (AnonymousClass462[]) C102374jC.A00(obj, anonymousClass461.A02), anonymousClass461.A03, anonymousClass461.A04);
        if (abstractC913745w.A00 != anonymousClass4612) {
            C914045z.A0E(C913645v.class, abstractC913745w, "withConfig");
            abstractC913745w = new AbstractC913745w(anonymousClass4612);
        }
        this.A02 = new AnonymousClass469(this.A02, abstractC913745w);
        Object obj2 = new Object();
        C46C c46c = (C46C) this.A04;
        C914246d c914246d = c46c.A00;
        this.A04 = c46c.A05(new C914246d((C46e[]) C102374jC.A00(obj2, c914246d.A01), c914246d.A00, c914246d.A02));
        ?? obj3 = new Object();
        C910844k c910844k = this.A05;
        InterfaceC910744j interfaceC910744j = c910844k.A01;
        C4jF[] c4jFArr2 = c910844k.A03;
        if (c4jFArr2 == null) {
            c4jFArr = new C4jF[]{obj3};
            interfaceC910744j = null;
        } else {
            c4jFArr = (C4jF[]) C102374jC.A00(obj3, c4jFArr2);
        }
        C910844k c910844k2 = new C910844k(c910844k.A00, interfaceC910744j, c910844k.A02, c4jFArr);
        this.A05 = c910844k2;
        this.A00 = (C912845h) this.A00.A0A(c910844k2);
        this.A01 = (C45R) this.A01.A0A(c910844k2);
        Object obj4 = new Object();
        C46C c46c2 = (C46C) this.A04;
        C914246d c914246d2 = c46c2.A00;
        this.A04 = c46c2.A05(new C914246d(c914246d2.A01, c914246d2.A00, (C46f[]) C102374jC.A00(obj4, c914246d2.A02)));
    }

    public final void A0I(EnumC912645f enumC912645f) {
        C45R c45r;
        C45R c45r2 = this.A01;
        int i = c45r2.A04;
        int i2 = i & (enumC912645f.A00 ^ (-1));
        if (i2 == i) {
            c45r = c45r2;
        } else {
            c45r = new C45R(c45r2, i2, c45r2.A02, c45r2.A03, c45r2.A00, c45r2.A01, ((C45T) c45r2).A00);
        }
        this.A01 = c45r;
    }

    public final byte[] A0J(Object obj) {
        byte[] bArr;
        try {
            C222015v c222015v = this.A09;
            C61052ReQ c61052ReQ = new C61052ReQ(c222015v.A0B());
            try {
                Integer num = C05F.A00;
                C16H c16h = new C16H(new C16D(true, c61052ReQ), c222015v.A0B(), false);
                c16h.A00 = num;
                C120295cS A06 = c222015v.A06(c16h, c61052ReQ);
                this.A01.A0B(A06);
                A0G(A06, obj);
                byte[] A05 = c61052ReQ.A05();
                c61052ReQ.A01();
                C16G c16g = c61052ReQ.A03;
                if (c16g != null && (bArr = c61052ReQ.A01) != null) {
                    c16g.A00.set(2, bArr);
                    c61052ReQ.A01 = null;
                }
                return A05;
            } finally {
            }
        } catch (AnonymousClass400 e) {
            throw e;
        } catch (IOException e2) {
            throw C102314j6.A01(e2);
        }
    }

    public static final void A00(C16L c16l, AbstractC910944l abstractC910944l) {
        Class cls;
        C16R A1J = c16l.A1J();
        if (A1J != null) {
            AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
            if (abstractC910944l == null) {
                cls = null;
            } else {
                cls = abstractC910944l.A00;
            }
            AnonymousClass469.A00(c16l, A1J, cls);
            throw C00O.createAndThrow();
        }
    }

    public C44S() {
        this(null);
    }
}
