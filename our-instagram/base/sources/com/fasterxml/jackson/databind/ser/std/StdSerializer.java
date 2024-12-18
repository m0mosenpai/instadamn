package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC64180T2m;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.C00O;
import X.C44V;
import X.C44W;
import X.C45R;
import X.C45U;
import X.C912745g;
import X.C914045z;
import X.InterfaceC65620ToB;
import X.RBL;
import X.TmN;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class StdSerializer extends JsonSerializer implements Serializable {
    public static final Object A01 = new Object();
    public final Class A00;

    public static final C45U A00(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m, Class cls) {
        if (interfaceC65620ToB != null) {
            return interfaceC65620ToB.AVZ(abstractC913345m.A05, cls);
        }
        return C45U.A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2.A05.A0C(X.EnumC912645f.WRAP_EXCEPTIONS) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AbstractC913345m r2, java.lang.Object r3, java.lang.String r4, java.lang.Throwable r5) {
        /*
        L0:
            boolean r0 = r5 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r5 = r5.getCause()
            goto L0
        Lf:
            X.460[] r0 = X.C914045z.A01
            boolean r0 = r5 instanceof java.lang.Error
            if (r0 != 0) goto L2d
            if (r2 == 0) goto L22
            X.45f r1 = X.EnumC912645f.WRAP_EXCEPTIONS
            X.45R r0 = r2.A05
            boolean r0 = r0.A0C(r1)
            r1 = 0
            if (r0 == 0) goto L23
        L22:
            r1 = 1
        L23:
            boolean r0 = r5 instanceof java.io.IOException
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L2d
            boolean r0 = r5 instanceof X.AnonymousClass401
            if (r0 != 0) goto L33
        L2d:
            throw r5
        L2e:
            if (r1 != 0) goto L33
            X.C914045z.A0F(r5)
        L33:
            X.4j6 r0 = X.C102314j6.A02(r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A01(X.45m, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2.A05.A0C(X.EnumC912645f.WRAP_EXCEPTIONS) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.AbstractC913345m r2, java.lang.Object r3, java.lang.Throwable r4, int r5) {
        /*
        L0:
            boolean r0 = r4 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r4 = r4.getCause()
            goto L0
        Lf:
            X.460[] r0 = X.C914045z.A01
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 != 0) goto L2d
            if (r2 == 0) goto L22
            X.45f r1 = X.EnumC912645f.WRAP_EXCEPTIONS
            X.45R r0 = r2.A05
            boolean r0 = r0.A0C(r1)
            r1 = 0
            if (r0 == 0) goto L23
        L22:
            r1 = 1
        L23:
            boolean r0 = r4 instanceof java.io.IOException
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L2d
            boolean r0 = r4 instanceof X.AnonymousClass401
            if (r0 != 0) goto L33
        L2d:
            throw r4
        L2e:
            if (r1 != 0) goto L33
            X.C914045z.A0F(r4)
        L33:
            X.4j6 r0 = X.C102314j6.A03(r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(X.45m, java.lang.Object, java.lang.Throwable, int):void");
    }

    public final JsonSerializer A0C(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, AbstractC913345m abstractC913345m) {
        RBL BSA;
        JsonSerialize jsonSerialize;
        Class contentConverter;
        Object obj = A01;
        Map map = (Map) abstractC913345m.A0S(obj);
        if (map != null) {
            if (map.get(interfaceC65620ToB) != null) {
                return jsonSerializer;
            }
        } else {
            map = new IdentityHashMap();
            C912745g c912745g = abstractC913345m.A0B;
            Map map2 = c912745g.A01;
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(obj, map);
                c912745g = new C912745g(c912745g.A00, hashMap);
            } else {
                map2.put(obj, map);
            }
            abstractC913345m.A0B = c912745g;
        }
        map.put(interfaceC65620ToB, Boolean.TRUE);
        try {
            C44W A00 = abstractC913345m.A05.A00();
            if (A00 != null && interfaceC65620ToB != null && (BSA = interfaceC65620ToB.BSA()) != null && (A00 instanceof C44V) && (jsonSerialize = (JsonSerialize) BSA.A06(JsonSerialize.class)) != null && (contentConverter = jsonSerialize.contentConverter()) != null && !C914045z.A0I(contentConverter) && contentConverter != AbstractC64180T2m.class) {
                TmN A06 = abstractC913345m.A06(contentConverter);
                AbstractC910944l BaK = A06.BaK(abstractC913345m.A05());
                if (jsonSerializer == null && BaK.A00 != Object.class) {
                    jsonSerializer = abstractC913345m.A0K(BaK);
                }
                jsonSerializer = new StdDelegatingSerializer(BaK, jsonSerializer, A06);
            } else if (jsonSerializer == null) {
                return jsonSerializer;
            }
            return abstractC913345m.A0F(interfaceC65620ToB, jsonSerializer);
        } finally {
            map.remove(interfaceC65620ToB);
        }
    }

    public final void A0D(AbstractC913345m abstractC913345m, Object obj) {
        int i = C45R.A06;
        Class cls = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot resolve PropertyFilter with id '");
        sb.append(obj);
        sb.append("'; no FilterProvider configured");
        abstractC913345m.A09(sb.toString(), cls);
        throw C00O.createAndThrow();
    }

    public StdSerializer(AbstractC910944l abstractC910944l) {
        this.A00 = abstractC910944l.A00;
    }

    public StdSerializer(Class cls, boolean z) {
        this.A00 = cls;
    }

    public StdSerializer(StdSerializer stdSerializer) {
        this.A00 = stdSerializer.A00;
    }

    public StdSerializer(Class cls) {
        this.A00 = cls;
    }
}
