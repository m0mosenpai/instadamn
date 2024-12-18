package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC102324j7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.C16R;
import X.C45I;
import X.C46K;
import X.C63242Sfw;
import X.C64523THw;
import X.C910844k;
import X.C914045z;
import X.InterfaceC65620ToB;
import X.RC9;
import X.SX7;
import X.SZV;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class MapSerializer extends ContainerSerializer implements C46K {
    public JsonSerializer A00;
    public JsonSerializer A01;
    public SZV A02;
    public final InterfaceC65620ToB A03;
    public final AbstractC910944l A04;
    public final AbstractC63023Sar A05;
    public final C64523THw A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;
    public final boolean A0A;
    public final AbstractC910944l A0B;
    public final Set A0C;
    public final Set A0D;
    public final boolean A0E;
    public static final AbstractC910944l A0G = C910844k.A07;
    public static final Object A0F = C45I.NON_EMPTY;

    public MapSerializer(AbstractC63023Sar abstractC63023Sar, MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.A0C = mapSerializer.A0C;
        this.A0D = mapSerializer.A0D;
        this.A0B = mapSerializer.A0B;
        this.A04 = mapSerializer.A04;
        this.A0E = mapSerializer.A0E;
        this.A05 = abstractC63023Sar;
        this.A00 = mapSerializer.A00;
        this.A01 = mapSerializer.A01;
        this.A02 = mapSerializer.A02;
        this.A03 = mapSerializer.A03;
        this.A07 = mapSerializer.A07;
        this.A09 = mapSerializer.A09;
        this.A08 = obj;
        this.A0A = z;
        this.A06 = mapSerializer.A06;
    }

    public static MapSerializer A04(AbstractC910944l abstractC910944l, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC63023Sar abstractC63023Sar, Object obj, Set set, Set set2, boolean z) {
        AbstractC910944l A04;
        AbstractC910944l A03;
        if (abstractC910944l == null) {
            A04 = A0G;
            A03 = A04;
        } else {
            A04 = abstractC910944l.A04();
            if (abstractC910944l.A00 == Properties.class) {
                A03 = C910844k.A07;
            } else {
                A03 = abstractC910944l.A03();
            }
        }
        boolean z2 = false;
        if (!z) {
            if (A03 != null && Modifier.isFinal(A03.A00.getModifiers())) {
                z2 = true;
            }
        } else {
            z2 = true;
            if (A03.A00 == Object.class) {
                z2 = false;
            }
        }
        MapSerializer mapSerializer = new MapSerializer(A04, A03, jsonSerializer, jsonSerializer2, abstractC63023Sar, set, set2, z2);
        if (obj != null && mapSerializer.A07 != obj) {
            C914045z.A0E(MapSerializer.class, mapSerializer, "withFilterId");
            return new MapSerializer(mapSerializer, obj, mapSerializer.A09);
        }
        return mapSerializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        Map map = (Map) obj;
        anonymousClass182.A0F(map);
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0D, abstractC63023Sar, map);
        A0F(anonymousClass182, abstractC913345m, map);
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        Map map = (Map) obj;
        anonymousClass182.A0p(map);
        A0F(anonymousClass182, abstractC913345m, map);
        anonymousClass182.A0a();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        boolean equals;
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Object obj2 = this.A08;
            if (obj2 == null && !this.A0A) {
                return false;
            }
            JsonSerializer jsonSerializer = this.A01;
            boolean A1X = AbstractC167007dF.A1X(A0F, obj2);
            Iterator A16 = AbstractC166997dE.A16(map);
            if (jsonSerializer != null) {
                while (A16.hasNext()) {
                    Object next = A16.next();
                    if (next == null) {
                        if (!this.A0A) {
                            return false;
                        }
                    } else {
                        if (A1X) {
                            equals = jsonSerializer.A0B(abstractC913345m, next);
                        } else {
                            if (obj2 == null) {
                                return false;
                            }
                            equals = obj2.equals(map);
                        }
                        if (!equals) {
                            return false;
                        }
                    }
                }
                return true;
            }
            while (A16.hasNext()) {
                Object next2 = A16.next();
                if (next2 == null) {
                    if (!this.A0A) {
                        return false;
                    }
                } else {
                    try {
                        JsonSerializer A03 = A03(abstractC913345m, next2);
                        if (A1X) {
                            if (!A03.A0B(abstractC913345m, next2)) {
                                return false;
                            }
                        } else if (obj2 == null || !obj2.equals(map)) {
                            return false;
                        }
                    } catch (AbstractC102324j7 unused) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }

    public final void A0E(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj, Map map) {
        JsonSerializer jsonSerializer;
        JsonSerializer jsonSerializer2;
        boolean equals;
        boolean A1X = AbstractC167007dF.A1X(A0F, obj);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            if (key == null) {
                jsonSerializer = abstractC913345m.A00;
            } else {
                C64523THw c64523THw = this.A06;
                if (c64523THw == null || !c64523THw.A00(key)) {
                    jsonSerializer = this.A00;
                }
            }
            Object value = A1K.getValue();
            if (value == null) {
                if (this.A0A) {
                    continue;
                } else {
                    jsonSerializer2 = abstractC913345m.A01;
                    jsonSerializer.A0A(anonymousClass182, abstractC913345m, key);
                    try {
                        jsonSerializer2.A09(anonymousClass182, abstractC913345m, this.A05, value);
                    } catch (Exception e) {
                        StdSerializer.A01(abstractC913345m, map, String.valueOf(key), e);
                        throw C00O.createAndThrow();
                    }
                }
            } else {
                jsonSerializer2 = this.A01;
                if (jsonSerializer2 == null) {
                    jsonSerializer2 = A03(abstractC913345m, value);
                }
                if (A1X) {
                    equals = jsonSerializer2.A0B(abstractC913345m, value);
                } else if (obj == null) {
                    jsonSerializer.A0A(anonymousClass182, abstractC913345m, key);
                    jsonSerializer2.A09(anonymousClass182, abstractC913345m, this.A05, value);
                } else {
                    equals = obj.equals(value);
                }
                if (equals) {
                    continue;
                } else {
                    jsonSerializer.A0A(anonymousClass182, abstractC913345m, key);
                    jsonSerializer2.A09(anonymousClass182, abstractC913345m, this.A05, value);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x008f, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0129, code lost:
    
        if (r6 != 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0147, code lost:
    
        if (r18.A04.A02() != false) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c0  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r19, X.AbstractC913345m r20) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    private final JsonSerializer A03(AbstractC913345m abstractC913345m, Object obj) {
        SZV A01;
        Class<?> cls = obj.getClass();
        SZV szv = this.A02;
        JsonSerializer A00 = szv.A00(cls);
        if (A00 == null) {
            AbstractC910944l abstractC910944l = this.A04;
            if (abstractC910944l.A0J()) {
                AbstractC910944l A0A = abstractC913345m.A0A(abstractC910944l, cls);
                A00 = abstractC913345m.A0B(this.A03, A0A);
                A01 = szv.A01(A00, A0A.A00);
            } else {
                A00 = abstractC913345m.A0G(this.A03, cls);
                A01 = szv.A01(A00, cls);
            }
            if (szv != A01) {
                this.A02 = A01;
            }
        }
        return A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r10.A05.A0C(X.EnumC912645f.ORDER_MAP_ENTRIES_BY_KEYS) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.AnonymousClass182 r9, X.AbstractC913345m r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.A0F(X.182, X.45m, java.util.Map):void");
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this.A0C = mapSerializer.A0C;
        this.A0D = mapSerializer.A0D;
        this.A0B = mapSerializer.A0B;
        this.A04 = mapSerializer.A04;
        this.A0E = mapSerializer.A0E;
        this.A05 = mapSerializer.A05;
        this.A00 = mapSerializer.A00;
        this.A01 = mapSerializer.A01;
        this.A02 = RC9.A00;
        this.A03 = mapSerializer.A03;
        this.A07 = obj;
        this.A09 = z;
        this.A08 = mapSerializer.A08;
        this.A0A = mapSerializer.A0A;
        this.A06 = mapSerializer.A06;
    }

    public MapSerializer(AbstractC910944l abstractC910944l, AbstractC910944l abstractC910944l2, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC63023Sar abstractC63023Sar, Set set, Set set2, boolean z) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.A0C = set;
        this.A0D = set2;
        this.A0B = abstractC910944l;
        this.A04 = abstractC910944l2;
        this.A0E = z;
        this.A05 = abstractC63023Sar;
        this.A00 = jsonSerializer;
        this.A01 = jsonSerializer2;
        this.A02 = RC9.A00;
        this.A03 = null;
        this.A07 = null;
        this.A09 = false;
        this.A08 = null;
        this.A0A = false;
        this.A06 = C63242Sfw.A00(set, set2);
    }

    public MapSerializer(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, MapSerializer mapSerializer, Set set, Set set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.A0C = set;
        this.A0D = set2;
        this.A0B = mapSerializer.A0B;
        this.A04 = mapSerializer.A04;
        this.A0E = mapSerializer.A0E;
        this.A05 = mapSerializer.A05;
        this.A00 = jsonSerializer;
        this.A01 = jsonSerializer2;
        this.A02 = RC9.A00;
        this.A03 = interfaceC65620ToB;
        this.A07 = mapSerializer.A07;
        this.A09 = mapSerializer.A09;
        this.A08 = mapSerializer.A08;
        this.A0A = mapSerializer.A0A;
        this.A06 = C63242Sfw.A00(set, set2);
    }
}
