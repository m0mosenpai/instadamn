package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.45m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC913345m extends AbstractC913445n {
    public static final JsonSerializer A0C = new FailingSerializer();
    public static final JsonSerializer A0D = new UnknownSerializer();
    public JsonSerializer A00;
    public JsonSerializer A01;
    public JsonSerializer A02;
    public DateFormat A03;
    public JsonSerializer A04;
    public final C45R A05;
    public final C46D A06;
    public final Class A07;
    public final boolean A08;
    public final C913545u A09;
    public final C55E A0A;
    public transient C912745g A0B;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r3 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer(r3, r0.A05(null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r7.put(new X.C55G(r10, true), r3) != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        r4.A01.set(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0014, code lost:
    
        if (r1 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r1.A03 != r10) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        r1 = r1.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        if (r1.A04 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        r0 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        if (r0 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0016, code lost:
    
        r4 = r8.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        r7 = r4.A00;
        r0 = (com.fasterxml.jackson.databind.JsonSerializer) r7.get(new X.C55G(r10, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r3 = A0I(null, r10);
        r2 = r8.A06;
        r1 = r8.A05;
        r0 = r2.A02(((X.C45T) r1).A01.A07.A09(r10), r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonSerializer A0J(X.InterfaceC65620ToB r9, java.lang.Class r10, boolean r11) {
        /*
            r8 = this;
            r5 = 0
            X.55E r3 = r8.A0A
            X.55F[] r2 = r3.A01
            java.lang.String r0 = r10.getName()
            int r0 = r0.hashCode()
            int r1 = r0 + 1
            int r0 = r3.A00
            r1 = r1 & r0
            r1 = r2[r1]
            if (r1 != 0) goto L50
        L16:
            X.45u r4 = r8.A09
            monitor-enter(r4)
            java.util.HashMap r7 = r4.A00     // Catch: java.lang.Throwable -> L72
            r6 = 1
            X.55G r0 = new X.55G     // Catch: java.lang.Throwable -> L72
            r0.<init>(r10, r6)     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Throwable -> L72
            com.fasterxml.jackson.databind.JsonSerializer r0 = (com.fasterxml.jackson.databind.JsonSerializer) r0     // Catch: java.lang.Throwable -> L72
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L5c
            com.fasterxml.jackson.databind.JsonSerializer r3 = r8.A0I(r5, r10)
            X.46D r2 = r8.A06
            X.45R r1 = r8.A05
            X.451 r0 = r1.A01
            X.44k r0 = r0.A07
            X.44l r0 = r0.A09(r10)
            X.RBe r0 = r2.A02(r0, r1)
            if (r0 == 0) goto L4a
            X.Sar r1 = r0.A05(r5)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer r0 = new com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer
            r0.<init>(r3, r1)
            r3 = r0
        L4a:
            monitor-enter(r4)
            goto L5d
        L4c:
            X.55F r1 = r1.A02
            if (r1 == 0) goto L16
        L50:
            java.lang.Class r0 = r1.A03
            if (r0 != r10) goto L4c
            boolean r0 = r1.A04
            if (r0 == 0) goto L4c
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.A01
            if (r0 == 0) goto L16
        L5c:
            return r0
        L5d:
            X.55G r0 = new X.55G     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r10, r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r7.put(r0, r3)     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L6d
            java.util.concurrent.atomic.AtomicReference r0 = r4.A01     // Catch: java.lang.Throwable -> L6f
            r0.set(r5)     // Catch: java.lang.Throwable -> L6f
        L6d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            return r3
        L6f:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            throw r0
        L72:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC913345m.A0J(X.ToB, java.lang.Class, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer A0M(AnonymousClass455 anonymousClass455, Object obj) {
        AbstractC910944l A03;
        StringBuilder sb;
        String str;
        JsonSerializer jsonSerializer = null;
        jsonSerializer = null;
        if (!(obj instanceof JsonSerializer)) {
            if (!(obj instanceof Class)) {
                A03 = anonymousClass455.A03();
                sb = new StringBuilder();
                sb.append("AnnotationIntrospector returned serializer definition of type ");
                sb.append(obj.getClass().getName());
                str = "; expected type JsonSerializer or Class<JsonSerializer> instead";
            } else {
                Class cls = (Class) obj;
                if (cls != JsonSerializer.None.class && !C914045z.A0I(cls)) {
                    if (!JsonSerializer.class.isAssignableFrom(cls)) {
                        A03 = anonymousClass455.A03();
                        sb = new StringBuilder();
                        sb.append("AnnotationIntrospector returned Class ");
                        sb.append(cls.getName());
                        str = "; expected Class<JsonSerializer>";
                    } else {
                        obj = C914045z.A03(cls, this.A05.A05());
                    }
                }
                return jsonSerializer;
            }
            sb.append(str);
            A08(A03, sb.toString());
            throw C00O.createAndThrow();
        }
        JsonSerializer jsonSerializer2 = (JsonSerializer) obj;
        boolean z = jsonSerializer2 instanceof C55I;
        jsonSerializer = jsonSerializer2;
        if (z) {
            ((C55I) jsonSerializer2).EK9(this);
            jsonSerializer = jsonSerializer2;
        }
        return jsonSerializer;
    }

    public final C62724SNo A0Q(TI2 ti2, Object obj) {
        Map identityHashMap;
        AbstractC913245l abstractC913245l = (AbstractC913245l) this;
        Map map = abstractC913245l.A02;
        if (map == null) {
            if (abstractC913245l.A05.A0C(EnumC912645f.USE_EQUALITY_FOR_OBJECT_ID)) {
                identityHashMap = new HashMap();
            } else {
                identityHashMap = new IdentityHashMap();
            }
            abstractC913245l.A02 = identityHashMap;
        } else {
            C62724SNo c62724SNo = (C62724SNo) map.get(obj);
            if (c62724SNo != null) {
                return c62724SNo;
            }
        }
        ArrayList arrayList = abstractC913245l.A01;
        if (arrayList == null) {
            arrayList = new ArrayList(8);
            abstractC913245l.A01 = arrayList;
        } else {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TI2 ti22 = (TI2) arrayList.get(i);
                if (ti22.A02(ti2)) {
                    ti2 = ti22;
                    break;
                }
            }
        }
        arrayList.add(ti2);
        C62724SNo c62724SNo2 = new C62724SNo(ti2);
        abstractC913245l.A02.put(obj, c62724SNo2);
        return c62724SNo2;
    }

    public final Object A0R(Class cls) {
        if (cls != null) {
            return C914045z.A03(cls, this.A05.A05());
        }
        return null;
    }

    public final boolean A0V(Object obj) {
        AbstractC910944l A09;
        AbstractC913245l abstractC913245l = (AbstractC913245l) this;
        try {
            return obj.equals(null);
        } catch (Throwable th) {
            Class<?> cls = obj.getClass();
            String format = String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", cls.getName(), th.getClass().getName(), C914045z.A09(th));
            AnonymousClass182 anonymousClass182 = abstractC913245l.A00;
            if (cls == null) {
                A09 = null;
            } else {
                A09 = abstractC913245l.A05().A09(cls);
            }
            R9A r9a = new R9A(anonymousClass182, A09, format);
            r9a.initCause(th);
            throw r9a;
        }
    }

    public final AbstractC910944l A0A(AbstractC910944l abstractC910944l, Class cls) {
        if (abstractC910944l.A00 != cls) {
            return ((C45T) this.A05).A01.A07.A05(abstractC910944l, cls, true);
        }
        return abstractC910944l;
    }

    public final JsonSerializer A0B(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l) {
        JsonSerializer A00 = this.A0A.A00(abstractC910944l);
        if (A00 == null && (A00 = this.A09.A00(abstractC910944l)) == null && (A00 = A0L(abstractC910944l)) == null) {
            return A0O(abstractC910944l.A00);
        }
        return A0F(interfaceC65620ToB, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer A0C(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l) {
        JsonSerializer A00 = this.A06.A00(abstractC910944l, this.A04, this);
        if (A00 instanceof C55I) {
            ((C55I) A00).EK9(this);
        }
        return A0F(interfaceC65620ToB, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer A0D(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l) {
        JsonSerializer A00 = this.A0A.A00(abstractC910944l);
        JsonSerializer jsonSerializer = A00;
        if (A00 == null) {
            JsonSerializer A002 = this.A09.A00(abstractC910944l);
            jsonSerializer = A002;
            if (A002 == null) {
                JsonSerializer A0L = A0L(abstractC910944l);
                jsonSerializer = A0L;
                if (A0L == null) {
                    return A0O(abstractC910944l.A00);
                }
            }
        }
        if (!(jsonSerializer instanceof C46K)) {
            return jsonSerializer;
        }
        return ((C46K) jsonSerializer).ALs(interfaceC65620ToB, this);
    }

    public final JsonSerializer A0E(InterfaceC65620ToB interfaceC65620ToB, AbstractC910944l abstractC910944l) {
        if (abstractC910944l == null) {
            throw new C102314j6(((AbstractC913245l) this).A00, "Null passed for `valueType` of `findValueSerializer()`", null);
        }
        JsonSerializer A00 = this.A0A.A00(abstractC910944l);
        if (A00 == null && (A00 = this.A09.A00(abstractC910944l)) == null && (A00 = A0L(abstractC910944l)) == null) {
            return A0O(abstractC910944l.A00);
        }
        return A0F(interfaceC65620ToB, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer A0F(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer) {
        if (jsonSerializer != 0 && (jsonSerializer instanceof C46K)) {
            return ((C46K) jsonSerializer).ALs(interfaceC65620ToB, this);
        }
        return jsonSerializer;
    }

    public final JsonSerializer A0G(InterfaceC65620ToB interfaceC65620ToB, Class cls) {
        C913545u c913545u;
        JsonSerializer A01 = this.A0A.A01(cls);
        if (A01 == null && (A01 = (c913545u = this.A09).A01(cls)) == null && (A01 = c913545u.A00(((C45T) this.A05).A01.A07.A09(cls))) == null && (A01 = A0P(cls)) == null) {
            return A0O(cls);
        }
        return A0F(interfaceC65620ToB, A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer A0H(InterfaceC65620ToB interfaceC65620ToB, Class cls) {
        JsonSerializer A01 = this.A0A.A01(cls);
        JsonSerializer jsonSerializer = A01;
        if (A01 == null) {
            C913545u c913545u = this.A09;
            JsonSerializer A012 = c913545u.A01(cls);
            jsonSerializer = A012;
            if (A012 == null) {
                JsonSerializer A00 = c913545u.A00(((C45T) this.A05).A01.A07.A09(cls));
                jsonSerializer = A00;
                if (A00 == null) {
                    JsonSerializer A0P = A0P(cls);
                    jsonSerializer = A0P;
                    if (A0P == null) {
                        return A0O(cls);
                    }
                }
            }
        }
        if (!(jsonSerializer instanceof C46K)) {
            return jsonSerializer;
        }
        return ((C46K) jsonSerializer).ALs(interfaceC65620ToB, this);
    }

    public final JsonSerializer A0I(InterfaceC65620ToB interfaceC65620ToB, Class cls) {
        C913545u c913545u;
        JsonSerializer A01 = this.A0A.A01(cls);
        if (A01 == null && (A01 = (c913545u = this.A09).A01(cls)) == null && (A01 = c913545u.A00(((C45T) this.A05).A01.A07.A09(cls))) == null && (A01 = A0P(cls)) == null) {
            return A0O(cls);
        }
        return A0F(interfaceC65620ToB, A01);
    }

    public final JsonSerializer A0K(AbstractC910944l abstractC910944l) {
        JsonSerializer A00 = this.A0A.A00(abstractC910944l);
        if (A00 == null) {
            JsonSerializer A002 = this.A09.A00(abstractC910944l);
            if (A002 == null) {
                JsonSerializer A0L = A0L(abstractC910944l);
                if (A0L == null) {
                    return A0O(abstractC910944l.A00);
                }
                return A0L;
            }
            return A002;
        }
        return A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer A0L(AbstractC910944l abstractC910944l) {
        try {
            JsonSerializer A01 = this.A06.A01(abstractC910944l, this);
            if (A01 != 0) {
                C913545u c913545u = this.A09;
                synchronized (c913545u) {
                    if (c913545u.A00.put(new C55G(abstractC910944l), A01) == null) {
                        c913545u.A01.set(null);
                    }
                    if (A01 instanceof C55I) {
                        ((C55I) A01).EK9(this);
                    }
                }
                return A01;
            }
            return A01;
        } catch (IllegalArgumentException e) {
            throw new C102314j6(((AbstractC913245l) this).A00, C914045z.A09(e), e);
        }
    }

    public final JsonSerializer A0N(Class cls) {
        JsonSerializer A01 = this.A0A.A01(cls);
        if (A01 == null) {
            C913545u c913545u = this.A09;
            JsonSerializer A012 = c913545u.A01(cls);
            if (A012 == null) {
                JsonSerializer A00 = c913545u.A00(((C45T) this.A05).A01.A07.A09(cls));
                if (A00 == null) {
                    JsonSerializer A0P = A0P(cls);
                    if (A0P == null) {
                        return A0O(cls);
                    }
                    return A0P;
                }
                return A00;
            }
            return A012;
        }
        return A01;
    }

    public final JsonSerializer A0O(Class cls) {
        if (cls == Object.class) {
            return this.A02;
        }
        return new StdSerializer(cls, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonSerializer A0P(Class cls) {
        AbstractC910944l A09 = ((C45T) this.A05).A01.A07.A09(cls);
        try {
            JsonSerializer A01 = this.A06.A01(A09, this);
            if (A01 != 0) {
                C913545u c913545u = this.A09;
                synchronized (c913545u) {
                    HashMap hashMap = c913545u.A00;
                    Object put = hashMap.put(new C55G(cls, false), A01);
                    Object put2 = hashMap.put(new C55G(A09), A01);
                    if (put == null || put2 == null) {
                        c913545u.A01.set(null);
                    }
                    if (A01 instanceof C55I) {
                        ((C55I) A01).EK9(this);
                    }
                }
                return A01;
            }
            return A01;
        } catch (IllegalArgumentException e) {
            A08(A09, C914045z.A09(e));
            throw C00O.createAndThrow();
        }
    }

    public final Object A0S(Object obj) {
        Object obj2;
        C912745g c912745g = this.A0B;
        Map map = c912745g.A01;
        if (map != null && (obj2 = map.get(obj)) != null) {
            if (obj2 == C912745g.A03) {
                return null;
            }
            return obj2;
        }
        return c912745g.A00.get(obj);
    }

    public final void A0T(AnonymousClass182 anonymousClass182) {
        if (this.A08) {
            anonymousClass182.A0b();
        } else {
            this.A01.A0A(anonymousClass182, this, null);
        }
    }

    public AbstractC913345m(C45R c45r, AbstractC913345m abstractC913345m, C46D c46d) {
        this.A02 = A0D;
        this.A01 = NullSerializer.A00;
        JsonSerializer jsonSerializer = A0C;
        this.A00 = jsonSerializer;
        this.A06 = c46d;
        this.A05 = c45r;
        C913545u c913545u = abstractC913345m.A09;
        this.A09 = c913545u;
        this.A02 = abstractC913345m.A02;
        this.A04 = abstractC913345m.A04;
        JsonSerializer jsonSerializer2 = abstractC913345m.A01;
        this.A01 = jsonSerializer2;
        this.A00 = abstractC913345m.A00;
        this.A08 = jsonSerializer2 == jsonSerializer;
        this.A07 = ((C45S) c45r).A05;
        this.A0B = ((C45S) c45r).A02;
        AtomicReference atomicReference = c913545u.A01;
        C55E c55e = (C55E) atomicReference.get();
        if (c55e == null) {
            synchronized (c913545u) {
                c55e = (C55E) atomicReference.get();
                if (c55e == null) {
                    c55e = new C55E(c913545u.A00);
                    atomicReference.set(c55e);
                }
            }
        }
        this.A0A = c55e;
    }

    public final void A0U(AnonymousClass182 anonymousClass182, Object obj, String str) {
        anonymousClass182.A0r(str);
        if (obj == null) {
            if (this.A08) {
                anonymousClass182.A0b();
                return;
            } else {
                this.A01.A0A(anonymousClass182, this, null);
                return;
            }
        }
        A0J(null, obj.getClass(), true).A0A(anonymousClass182, this, obj);
    }

    public AbstractC913345m() {
        this.A02 = A0D;
        this.A01 = NullSerializer.A00;
        this.A00 = A0C;
        this.A05 = null;
        this.A06 = null;
        this.A09 = new C913545u();
        this.A0A = null;
        this.A07 = null;
        this.A0B = null;
        this.A08 = true;
    }
}
