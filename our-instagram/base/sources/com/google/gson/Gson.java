package com.google.gson;

import X.AbstractC47652Gq;
import X.AbstractC47692Ha;
import X.AnonymousClass001;
import X.C05F;
import X.C177847vJ;
import X.C2Gy;
import X.C2HP;
import X.C2HQ;
import X.C2HT;
import X.C2HU;
import X.C2HX;
import X.C2HY;
import X.C2IC;
import X.C40O;
import X.C47602Gl;
import X.C47642Gp;
import X.C47672Gt;
import X.C47682Gu;
import X.C47762Hh;
import X.C47802Hl;
import X.C5MW;
import X.C60841RVb;
import X.C61056ReV;
import X.EnumC47532Ge;
import X.EnumC47562Gh;
import X.EnumC47622Gn;
import X.InterfaceC47542Gf;
import X.InterfaceC47572Gi;
import X.InterfaceC47612Gm;
import X.RVZ;
import com.google.gson.Gson;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class Gson {
    public final InterfaceC47542Gf A00;
    public final InterfaceC47572Gi A01;
    public final InterfaceC47572Gi A02;
    public final C47602Gl A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C47642Gp A0C;
    public final C47802Hl A0D;
    public final ThreadLocal A0E;
    public final ConcurrentMap A0F;
    public static final InterfaceC47542Gf A0G = EnumC47532Ge.A00;
    public static final InterfaceC47572Gi A0I = EnumC47562Gh.A00;
    public static final InterfaceC47572Gi A0H = EnumC47562Gh.A01;

    public final JsonElement A01(Object obj, Type type) {
        C177847vJ c177847vJ = new C177847vJ();
        A0D(c177847vJ, obj, type);
        List list = c177847vJ.A02;
        if (list.isEmpty()) {
            return c177847vJ.A00;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected one JSON element but was ");
        sb.append(list);
        throw new IllegalStateException(sb.toString());
    }

    public final TypeAdapter A02(InterfaceC47612Gm interfaceC47612Gm, TypeToken typeToken) {
        List<InterfaceC47612Gm> list = this.A06;
        if (!list.contains(interfaceC47612Gm)) {
            interfaceC47612Gm = this.A0D;
        }
        boolean z = false;
        for (InterfaceC47612Gm interfaceC47612Gm2 : list) {
            if (!z) {
                if (interfaceC47612Gm2 == interfaceC47612Gm) {
                    z = true;
                }
            } else {
                TypeAdapter create = interfaceC47612Gm2.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GSON cannot serialize ");
        sb.append(typeToken);
        throw new IllegalArgumentException(sb.toString());
    }

    public final JsonWriter A04(Writer writer) {
        String str;
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.A0A) {
            if ("  ".length() == 0) {
                jsonWriter.A01 = null;
                str = ":";
            } else {
                jsonWriter.A01 = "  ";
                str = ": ";
            }
            jsonWriter.A02 = str;
        }
        jsonWriter.A03 = this.A09;
        jsonWriter.A04 = false;
        jsonWriter.A05 = this.A0B;
        return jsonWriter;
    }

    public final Object A05(JsonElement jsonElement, Class cls) {
        return C2IC.A00(cls).cast(A06(new TypeToken(cls), new C5MW(jsonElement)));
    }

    public final Object A06(TypeToken typeToken, JsonReader jsonReader) {
        Object obj;
        boolean z = jsonReader.A07;
        boolean z2 = true;
        jsonReader.A07 = true;
        try {
            try {
                try {
                    jsonReader.A0G();
                    z2 = false;
                    obj = A03(typeToken).read(jsonReader);
                } catch (EOFException e) {
                    if (z2) {
                        obj = null;
                    } else {
                        throw new RuntimeException(e);
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
                return obj;
            } catch (AssertionError e3) {
                throw new AssertionError(AnonymousClass001.A0R("AssertionError (GSON 2.10.1): ", e3.getMessage()));
            } catch (IllegalStateException e4) {
                throw new RuntimeException(e4);
            }
        } finally {
            jsonReader.A07 = z;
        }
    }

    public final Object A07(TypeToken typeToken, String str) {
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.A07 = false;
        Object A06 = A06(typeToken, jsonReader);
        if (A06 == null) {
            return A06;
        }
        try {
            if (jsonReader.A0G() == C05F.A1I) {
                return A06;
            }
            throw new RuntimeException("JSON document was not fully consumed.");
        } catch (C40O e) {
            throw new RuntimeException(e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final Object A08(String str, Class cls) {
        return C2IC.A00(cls).cast(A07(new TypeToken(cls), str));
    }

    public final Object A09(String str, Type type) {
        return A07(new TypeToken(type), str);
    }

    public final String A0A(JsonElement jsonElement) {
        Writer c61056ReV;
        StringWriter stringWriter = new StringWriter();
        try {
            if (stringWriter instanceof Writer) {
                c61056ReV = stringWriter;
            } else {
                c61056ReV = new C61056ReV(stringWriter);
            }
            JsonWriter A04 = A04(c61056ReV);
            boolean z = A04.A04;
            A04.A04 = true;
            boolean z2 = A04.A03;
            A04.A03 = this.A09;
            boolean z3 = A04.A05;
            A04.A05 = this.A0B;
            try {
                try {
                    AbstractC47652Gq.A0F.write(A04, jsonElement);
                    return stringWriter.toString();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (AssertionError e2) {
                    throw new AssertionError(AnonymousClass001.A0R("AssertionError (GSON 2.10.1): ", e2.getMessage()));
                }
            } finally {
                A04.A04 = z;
                A04.A03 = z2;
                A04.A05 = z3;
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final String A0B(Object obj) {
        if (obj == null) {
            return A0A(RVZ.A00);
        }
        return A0C(obj, obj.getClass());
    }

    public final String A0C(Object obj, Type type) {
        Writer c61056ReV;
        StringWriter stringWriter = new StringWriter();
        try {
            if (stringWriter instanceof Writer) {
                c61056ReV = stringWriter;
            } else {
                c61056ReV = new C61056ReV(stringWriter);
            }
            A0D(A04(c61056ReV), obj, type);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void A0D(JsonWriter jsonWriter, Object obj, Type type) {
        TypeAdapter A03 = A03(new TypeToken(type));
        boolean z = jsonWriter.A04;
        jsonWriter.A04 = true;
        boolean z2 = jsonWriter.A03;
        jsonWriter.A03 = this.A09;
        boolean z3 = jsonWriter.A05;
        jsonWriter.A05 = this.A0B;
        try {
            try {
                A03.write(jsonWriter, obj);
            } catch (IOException e) {
            } catch (AssertionError e2) {
                throw new AssertionError(AnonymousClass001.A0R("AssertionError (GSON 2.10.1): ", e2.getMessage()));
            }
        } finally {
            jsonWriter.A04 = z;
            jsonWriter.A03 = z2;
            jsonWriter.A05 = z3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{serializeNulls:");
        sb.append(this.A0B);
        sb.append(",factories:");
        sb.append(this.A06);
        sb.append(",instanceCreators:");
        sb.append(this.A0C);
        sb.append("}");
        return sb.toString();
    }

    public static void A00(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r6.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r4 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r7.putAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("GSON (2.10.1) cannot handle ");
        r1.append(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.gson.TypeAdapter A03(com.google.gson.reflect.TypeToken r9) {
        /*
            r8 = this;
            java.lang.String r0 = "type must not be null"
            X.AbstractC47832Hr.A00(r9, r0)
            java.util.concurrent.ConcurrentMap r7 = r8.A0F
            java.lang.Object r0 = r7.get(r9)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 != 0) goto L8c
            java.lang.ThreadLocal r6 = r8.A0E
            java.lang.Object r5 = r6.get()
            java.util.Map r5 = (java.util.Map) r5
            r4 = 0
            if (r5 != 0) goto L26
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r6.set(r5)
            r4 = 1
        L24:
            r0 = 0
            goto L2f
        L26:
            java.lang.Object r0 = r5.get(r9)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L24
            return r0
        L2f:
            X.2Hs r3 = new X.2Hs     // Catch: java.lang.Throwable -> L6e
            r3.<init>()     // Catch: java.lang.Throwable -> L6e
            r5.put(r9, r3)     // Catch: java.lang.Throwable -> L6e
            java.util.List r1 = r8.A06     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L3d:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L61
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L6e
            X.2Gm r0 = (X.InterfaceC47612Gm) r0     // Catch: java.lang.Throwable -> L6e
            com.google.gson.TypeAdapter r0 = r0.create(r8, r9)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L3d
            com.google.gson.TypeAdapter r1 = r3.A00     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L59
            r3.A00 = r0     // Catch: java.lang.Throwable -> L6e
            r5.put(r9, r0)     // Catch: java.lang.Throwable -> L6e
            goto L61
        L59:
            java.lang.String r1 = "Delegate is already set"
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L6e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6e
        L61:
            if (r4 == 0) goto L66
            r6.remove()
        L66:
            if (r0 == 0) goto L75
            if (r4 == 0) goto L8c
            r7.putAll(r5)
            return r0
        L6e:
            r0 = move-exception
            if (r4 == 0) goto L8b
            r6.remove()
            throw r0
        L75:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GSON (2.10.1) cannot handle "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
        L8b:
            throw r0
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.A03(com.google.gson.reflect.TypeToken):com.google.gson.TypeAdapter");
    }

    public Gson(final InterfaceC47542Gf interfaceC47542Gf, EnumC47622Gn enumC47622Gn, InterfaceC47572Gi interfaceC47572Gi, InterfaceC47572Gi interfaceC47572Gi2, final C47602Gl c47602Gl, List list, List list2, List list3, final List list4, Map map, boolean z, boolean z2, boolean z3) {
        Object c2hq;
        final TypeAdapter c60841RVb;
        Object c2hu;
        this.A0E = new ThreadLocal();
        this.A0F = new ConcurrentHashMap();
        this.A03 = c47602Gl;
        this.A00 = interfaceC47542Gf;
        this.A08 = map;
        final C47642Gp c47642Gp = new C47642Gp(list4, map);
        this.A0C = c47642Gp;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A04 = list;
        this.A05 = list2;
        this.A02 = interfaceC47572Gi;
        this.A01 = interfaceC47572Gi2;
        this.A07 = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC47652Gq.A0d);
        InterfaceC47612Gm interfaceC47612Gm = C2HP.A02;
        if (interfaceC47572Gi == EnumC47562Gh.A00) {
            c2hq = C2HP.A02;
        } else {
            c2hq = new C2HQ(interfaceC47572Gi);
        }
        arrayList.add(c2hq);
        arrayList.add(c47602Gl);
        arrayList.addAll(list3);
        arrayList.add(AbstractC47652Gq.A0i);
        arrayList.add(AbstractC47652Gq.A0c);
        arrayList.add(AbstractC47652Gq.A0U);
        arrayList.add(AbstractC47652Gq.A0V);
        arrayList.add(AbstractC47652Gq.A0f);
        if (enumC47622Gn == EnumC47622Gn.A00) {
            c60841RVb = AbstractC47652Gq.A0I;
        } else {
            c60841RVb = new C60841RVb();
        }
        arrayList.add(new C2Gy(c60841RVb, Long.TYPE, Long.class));
        arrayList.add(new C2Gy(new TypeAdapter() { // from class: X.2HR
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.A0A();
                    return;
                }
                double doubleValue = number.doubleValue();
                Gson.A00(doubleValue);
                jsonWriter.A0B(doubleValue);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                return Double.valueOf(jsonReader.A0C());
            }
        }, Double.TYPE, Double.class));
        arrayList.add(new C2Gy(new TypeAdapter() { // from class: X.2HS
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.A0A();
                    return;
                }
                float floatValue = number.floatValue();
                Gson.A00(floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                jsonWriter.A0E(number);
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                if (jsonReader.A0G() == C05F.A1F) {
                    jsonReader.A0Q();
                    return null;
                }
                return Float.valueOf((float) jsonReader.A0C());
            }
        }, Float.TYPE, Float.class));
        InterfaceC47612Gm interfaceC47612Gm2 = C2HT.A01;
        if (interfaceC47572Gi2 == EnumC47562Gh.A01) {
            c2hu = C2HT.A01;
        } else {
            c2hu = new C2HU(new C2HT(interfaceC47572Gi2));
        }
        arrayList.add(c2hu);
        arrayList.add(AbstractC47652Gq.A0S);
        arrayList.add(AbstractC47652Gq.A0Q);
        arrayList.add(new C47682Gu(new C47672Gt(new TypeAdapter() { // from class: X.2HV
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                return new AtomicLong(((Number) TypeAdapter.this.read(jsonReader)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                TypeAdapter.this.write(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
            }
        }), AtomicLong.class));
        arrayList.add(new C47682Gu(new C47672Gt(new TypeAdapter() { // from class: X.2HW
            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                ArrayList arrayList2 = new ArrayList();
                jsonReader.A0M();
                while (jsonReader.A0S()) {
                    arrayList2.add(Long.valueOf(((Number) TypeAdapter.this.read(jsonReader)).longValue()));
                }
                jsonReader.A0O();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Number) arrayList2.get(i)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                jsonWriter.A06();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    TypeAdapter.this.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
                }
                jsonWriter.A08();
            }
        }), AtomicLongArray.class));
        arrayList.add(AbstractC47652Gq.A0R);
        arrayList.add(AbstractC47652Gq.A0X);
        arrayList.add(AbstractC47652Gq.A0h);
        arrayList.add(AbstractC47652Gq.A0g);
        arrayList.add(new C47682Gu(AbstractC47652Gq.A03, BigDecimal.class));
        arrayList.add(new C47682Gu(AbstractC47652Gq.A04, BigInteger.class));
        arrayList.add(new C47682Gu(AbstractC47652Gq.A0G, C2HX.class));
        arrayList.add(AbstractC47652Gq.A0k);
        arrayList.add(AbstractC47652Gq.A0j);
        arrayList.add(AbstractC47652Gq.A0l);
        arrayList.add(AbstractC47652Gq.A0Z);
        arrayList.add(AbstractC47652Gq.A0e);
        arrayList.add(AbstractC47652Gq.A0b);
        arrayList.add(AbstractC47652Gq.A0T);
        arrayList.add(C2HY.A01);
        arrayList.add(AbstractC47652Gq.A0W);
        if (AbstractC47692Ha.A03) {
            arrayList.add(AbstractC47692Ha.A02);
            arrayList.add(AbstractC47692Ha.A00);
            arrayList.add(AbstractC47692Ha.A01);
        }
        arrayList.add(C47762Hh.A02);
        arrayList.add(AbstractC47652Gq.A0Y);
        arrayList.add(new InterfaceC47612Gm(c47642Gp) { // from class: X.2Hj
            public final C47642Gp A00;

            @Override // X.InterfaceC47612Gm
            public final TypeAdapter create(final Gson gson, TypeToken typeToken) {
                final Type type;
                Type type2 = typeToken.type;
                Class cls = typeToken.rawType;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                C2I6.A00(Collection.class.isAssignableFrom(cls));
                Type A03 = AbstractC47822Hp.A03(cls, type2, AbstractC47822Hp.A02(cls, Collection.class, type2), new HashMap());
                if (A03 instanceof ParameterizedType) {
                    type = ((ParameterizedType) A03).getActualTypeArguments()[0];
                } else {
                    type = Object.class;
                }
                final TypeAdapter A032 = gson.A03(new TypeToken(type));
                final C2I0 A01 = this.A00.A01(typeToken);
                return new TypeAdapter(gson, A032, A01, type) { // from class: X.2Qi
                    public final TypeAdapter A00;
                    public final C2I0 A01;

                    @Override // com.google.gson.TypeAdapter
                    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                        Collection collection = (Collection) obj;
                        if (collection == null) {
                            jsonWriter.A0A();
                            return;
                        }
                        jsonWriter.A06();
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            this.A00.write(jsonWriter, it.next());
                        }
                        jsonWriter.A08();
                    }

                    {
                        this.A00 = new C2I9(gson, A032, type);
                        this.A01 = A01;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                        if (jsonReader.A0G() == C05F.A1F) {
                            jsonReader.A0Q();
                            return null;
                        }
                        Collection collection = (Collection) this.A01.AJW();
                        jsonReader.A0M();
                        while (jsonReader.A0S()) {
                            collection.add(this.A00.read(jsonReader));
                        }
                        jsonReader.A0O();
                        return collection;
                    }
                };
            }

            {
                this.A00 = c47642Gp;
            }
        });
        arrayList.add(new InterfaceC47612Gm(c47642Gp) { // from class: X.2Hk
            public final C47642Gp A00;

            @Override // X.InterfaceC47612Gm
            public final TypeAdapter create(final Gson gson, TypeToken typeToken) {
                Type[] typeArr;
                Type type;
                Type type2;
                final TypeAdapter typeAdapter;
                Type type3 = typeToken.type;
                Class cls = typeToken.rawType;
                if (!Map.class.isAssignableFrom(cls)) {
                    return null;
                }
                if (type3 == Properties.class) {
                    typeArr = new Type[2];
                    type = String.class;
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    C2I6.A00(Map.class.isAssignableFrom(cls));
                    Type A03 = AbstractC47822Hp.A03(cls, type3, AbstractC47822Hp.A02(cls, Map.class, type3), new HashMap());
                    if (A03 instanceof ParameterizedType) {
                        typeArr = ((ParameterizedType) A03).getActualTypeArguments();
                        type2 = typeArr[0];
                        if (type2 == Boolean.TYPE && type2 != Boolean.class) {
                            typeAdapter = gson.A03(new TypeToken(type2));
                        } else {
                            typeAdapter = AbstractC47652Gq.A07;
                        }
                        final TypeAdapter A032 = gson.A03(new TypeToken(typeArr[1]));
                        final C2I0 A01 = this.A00.A01(typeToken);
                        final Type type4 = typeArr[0];
                        final Type type5 = typeArr[1];
                        return new TypeAdapter(gson, typeAdapter, A032, A01, this, type4, type5) { // from class: X.2I8
                            public final TypeAdapter A00;
                            public final TypeAdapter A01;
                            public final C2I0 A02;
                            public final /* synthetic */ C47792Hk A03;

                            {
                                this.A03 = this;
                                this.A00 = new C2I9(gson, typeAdapter, type4);
                                this.A01 = new C2I9(gson, A032, type5);
                                this.A02 = A01;
                            }

                            @Override // com.google.gson.TypeAdapter
                            public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                                Map map2 = (Map) obj;
                                if (map2 == null) {
                                    jsonWriter.A0A();
                                    return;
                                }
                                jsonWriter.A07();
                                for (Map.Entry entry : map2.entrySet()) {
                                    jsonWriter.A0G(String.valueOf(entry.getKey()));
                                    this.A01.write(jsonWriter, entry.getValue());
                                }
                                jsonWriter.A09();
                            }

                            @Override // com.google.gson.TypeAdapter
                            public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                                int i;
                                Integer A0G2 = jsonReader.A0G();
                                if (A0G2 == C05F.A1F) {
                                    jsonReader.A0Q();
                                    return null;
                                }
                                Map map2 = (Map) this.A02.AJW();
                                if (A0G2 == C05F.A00) {
                                    jsonReader.A0M();
                                    while (jsonReader.A0S()) {
                                        jsonReader.A0M();
                                        Object read = this.A00.read(jsonReader);
                                        if (map2.put(read, this.A01.read(jsonReader)) == null) {
                                            jsonReader.A0O();
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("duplicate key: ");
                                            sb.append(read);
                                            throw new RuntimeException(sb.toString());
                                        }
                                    }
                                    jsonReader.A0O();
                                    return map2;
                                }
                                jsonReader.A0N();
                                while (jsonReader.A0S()) {
                                    if (jsonReader instanceof C5MW) {
                                        C5MW c5mw = (C5MW) jsonReader;
                                        C5MW.A02(c5mw, C05F.A0Y);
                                        Map.Entry entry = (Map.Entry) ((Iterator) c5mw.A01[c5mw.A00 - 1]).next();
                                        C5MW.A03(c5mw, entry.getValue());
                                        C5MW.A03(c5mw, new JsonPrimitive((String) entry.getKey()));
                                    } else {
                                        int i2 = jsonReader.A03;
                                        if (i2 == 0) {
                                            i2 = jsonReader.A0E();
                                        }
                                        if (i2 == 13) {
                                            i = 9;
                                        } else if (i2 == 12) {
                                            i = 8;
                                        } else if (i2 == 14) {
                                            i = 10;
                                        } else {
                                            throw new IllegalStateException(AnonymousClass001.A0g("Expected a name but was ", SSW.A00(jsonReader.A0G()), jsonReader.A0L()));
                                        }
                                        jsonReader.A03 = i;
                                    }
                                    Object read2 = this.A00.read(jsonReader);
                                    if (map2.put(read2, this.A01.read(jsonReader)) != null) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("duplicate key: ");
                                        sb2.append(read2);
                                        throw new RuntimeException(sb2.toString());
                                    }
                                }
                                jsonReader.A0P();
                                return map2;
                            }
                        };
                    }
                    typeArr = new Type[2];
                    type = Object.class;
                }
                typeArr[0] = type;
                typeArr[1] = type;
                type2 = typeArr[0];
                if (type2 == Boolean.TYPE) {
                }
                typeAdapter = AbstractC47652Gq.A07;
                final TypeAdapter A0322 = gson.A03(new TypeToken(typeArr[1]));
                final C2I0 A012 = this.A00.A01(typeToken);
                final Type type42 = typeArr[0];
                final Type type52 = typeArr[1];
                return new TypeAdapter(gson, typeAdapter, A0322, A012, this, type42, type52) { // from class: X.2I8
                    public final TypeAdapter A00;
                    public final TypeAdapter A01;
                    public final C2I0 A02;
                    public final /* synthetic */ C47792Hk A03;

                    {
                        this.A03 = this;
                        this.A00 = new C2I9(gson, typeAdapter, type42);
                        this.A01 = new C2I9(gson, A0322, type52);
                        this.A02 = A012;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
                        Map map2 = (Map) obj;
                        if (map2 == null) {
                            jsonWriter.A0A();
                            return;
                        }
                        jsonWriter.A07();
                        for (Map.Entry entry : map2.entrySet()) {
                            jsonWriter.A0G(String.valueOf(entry.getKey()));
                            this.A01.write(jsonWriter, entry.getValue());
                        }
                        jsonWriter.A09();
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
                        int i;
                        Integer A0G2 = jsonReader.A0G();
                        if (A0G2 == C05F.A1F) {
                            jsonReader.A0Q();
                            return null;
                        }
                        Map map2 = (Map) this.A02.AJW();
                        if (A0G2 == C05F.A00) {
                            jsonReader.A0M();
                            while (jsonReader.A0S()) {
                                jsonReader.A0M();
                                Object read = this.A00.read(jsonReader);
                                if (map2.put(read, this.A01.read(jsonReader)) == null) {
                                    jsonReader.A0O();
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("duplicate key: ");
                                    sb.append(read);
                                    throw new RuntimeException(sb.toString());
                                }
                            }
                            jsonReader.A0O();
                            return map2;
                        }
                        jsonReader.A0N();
                        while (jsonReader.A0S()) {
                            if (jsonReader instanceof C5MW) {
                                C5MW c5mw = (C5MW) jsonReader;
                                C5MW.A02(c5mw, C05F.A0Y);
                                Map.Entry entry = (Map.Entry) ((Iterator) c5mw.A01[c5mw.A00 - 1]).next();
                                C5MW.A03(c5mw, entry.getValue());
                                C5MW.A03(c5mw, new JsonPrimitive((String) entry.getKey()));
                            } else {
                                int i2 = jsonReader.A03;
                                if (i2 == 0) {
                                    i2 = jsonReader.A0E();
                                }
                                if (i2 == 13) {
                                    i = 9;
                                } else if (i2 == 12) {
                                    i = 8;
                                } else if (i2 == 14) {
                                    i = 10;
                                } else {
                                    throw new IllegalStateException(AnonymousClass001.A0g("Expected a name but was ", SSW.A00(jsonReader.A0G()), jsonReader.A0L()));
                                }
                                jsonReader.A03 = i;
                            }
                            Object read2 = this.A00.read(jsonReader);
                            if (map2.put(read2, this.A01.read(jsonReader)) != null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("duplicate key: ");
                                sb2.append(read2);
                                throw new RuntimeException(sb2.toString());
                            }
                        }
                        jsonReader.A0P();
                        return map2;
                    }
                };
            }

            {
                this.A00 = c47642Gp;
            }
        });
        final C47802Hl c47802Hl = new C47802Hl(c47642Gp);
        this.A0D = c47802Hl;
        arrayList.add(c47802Hl);
        arrayList.add(AbstractC47652Gq.A0a);
        arrayList.add(new InterfaceC47612Gm(interfaceC47542Gf, c47642Gp, c47602Gl, c47802Hl, list4) { // from class: X.2Hm
            public final InterfaceC47542Gf A00;
            public final C47642Gp A01;
            public final C47602Gl A02;
            public final C47802Hl A03;
            public final List A04;

            /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
            
                if (r10.isPrimitive() == false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
            
                if (java.lang.reflect.Modifier.isFinal(r13) == false) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
            
                if (r22 == null) goto L49;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x013b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0045 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private java.util.LinkedHashMap A00(com.google.gson.Gson r36, com.google.gson.reflect.TypeToken r37, java.lang.Class r38, boolean r39) {
                /*
                    Method dump skipped, instructions count: 400
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C47812Hm.A00(com.google.gson.Gson, com.google.gson.reflect.TypeToken, java.lang.Class, boolean):java.util.LinkedHashMap");
            }

            private boolean A01(Field field, boolean z4) {
                List list5;
                List list6;
                C47602Gl c47602Gl2 = this.A02;
                if (!C47602Gl.A00(field.getType())) {
                    if (z4) {
                        list5 = c47602Gl2.A01;
                    } else {
                        list5 = c47602Gl2.A00;
                    }
                    Iterator it = list5.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw new NullPointerException("shouldSkipClass");
                    }
                    if ((136 & field.getModifiers()) == 0 && !field.isSynthetic() && !C47602Gl.A00(field.getType())) {
                        if (z4) {
                            list6 = c47602Gl2.A01;
                        } else {
                            list6 = c47602Gl2.A00;
                        }
                        if (!list6.isEmpty()) {
                            Iterator it2 = list6.iterator();
                            if (it2.hasNext()) {
                                it2.next();
                                throw new NullPointerException("shouldSkipField");
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC47612Gm
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class cls = typeToken.rawType;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                AbstractC47862Hv.A00(this.A04);
                if (AbstractC47872Hw.A00.A02(cls)) {
                    Map map2 = C60846RVj.A03;
                    return new C60846RVj(cls, A00(gson, typeToken, cls, true));
                }
                final C2I0 A01 = this.A01.A01(typeToken);
                final LinkedHashMap A00 = A00(gson, typeToken, cls, false);
                return new C2IB(A01, A00) { // from class: X.2IA
                    public final C2I0 A00;

                    @Override // X.C2IB
                    public final Object A01(Object obj) {
                        return obj;
                    }

                    @Override // X.C2IB
                    public final Object A00() {
                        return this.A00.AJW();
                    }

                    @Override // X.C2IB
                    public final void A02(C2I3 c2i3, JsonReader jsonReader, Object obj) {
                        Object read = c2i3.A06.read(jsonReader);
                        if (read != null || !c2i3.A0A) {
                            if (!c2i3.A0B) {
                                c2i3.A02.set(obj, read);
                                return;
                            }
                            throw new RuntimeException(AnonymousClass001.A0R("Cannot set value of 'static final' ", AbstractC47872Hw.A00(c2i3.A02)));
                        }
                    }

                    {
                        super(A00);
                        this.A00 = A01;
                    }
                };
            }

            {
                this.A01 = c47642Gp;
                this.A00 = interfaceC47542Gf;
                this.A02 = c47602Gl;
                this.A03 = c47802Hl;
                this.A04 = list4;
            }
        });
        this.A06 = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Gson() {
        /*
            r14 = this;
            X.2Gl r5 = X.C47602Gl.A02
            X.2Gf r1 = com.google.gson.Gson.A0G
            java.util.Map r10 = java.util.Collections.emptyMap()
            X.2Gn r2 = X.EnumC47622Gn.A00
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.List r8 = java.util.Collections.emptyList()
            X.2Gi r3 = com.google.gson.Gson.A0I
            X.2Gi r4 = com.google.gson.Gson.A0H
            java.util.List r9 = java.util.Collections.emptyList()
            r11 = 0
            r12 = 1
            r0 = r14
            r13 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.<init>():void");
    }
}
