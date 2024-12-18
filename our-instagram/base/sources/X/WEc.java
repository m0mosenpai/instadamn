package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes11.dex */
public final class WEc {
    public int A00;
    public final C3T3 A01;
    public final boolean A02;
    public final boolean A03;

    public WEc(C73783Si c73783Si, C3T3 c3t3) {
        C14360o3.A0B(c3t3, 2);
        this.A01 = c3t3;
        this.A02 = c73783Si.A0C;
        this.A03 = c73783Si.A06;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C71682Wya r11, X.InterfaceC23621Ds r12, X.WEc r13) {
        /*
            r3 = 38
            boolean r0 = X.MAP.A02(r12, r3)
            if (r0 == 0) goto La5
            r5 = r12
            X.MAP r5 = (X.MAP) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A05
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r10 = 6
            r9 = 7
            r8 = 4
            r4 = 1
            if (r0 == 0) goto L50
            if (r0 != r4) goto Lac
            java.lang.Object r0 = r5.A04
            java.lang.Object r7 = r5.A03
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r13 = r5.A02
            X.WEc r13 = (X.WEc) r13
            java.lang.Object r11 = r5.A01
            X.Wya r11 = (X.C71682Wya) r11
            X.AbstractC09560e7.A00(r1)
            r7.put(r0, r1)
            X.3T3 r3 = r13.A01
            byte r0 = r3.A03()
            if (r0 == r8) goto L65
            if (r0 == r9) goto Lb4
            java.lang.String r2 = "Expected end of the object or comma"
        L44:
            int r1 = r3.A00
            java.lang.String r0 = ""
            r3.A0F(r2, r0, r1)
        L4b:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L50:
            X.AbstractC09560e7.A00(r1)
            X.3T3 r3 = r13.A01
            byte r1 = r3.A05(r10)
            byte r0 = r3.A04()
            if (r0 == r8) goto L9e
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            goto L66
        L65:
            r1 = 4
        L66:
            X.3T3 r2 = r13.A01
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L90
            boolean r0 = r13.A02
            if (r0 == 0) goto L8b
            java.lang.String r1 = r2.A0A()
        L76:
            r0 = 5
            r2.A05(r0)
            X.0eB r0 = X.C0eB.A00
            r5.A01 = r11
            r5.A02 = r13
            r5.A03 = r7
            r5.A04 = r1
            r5.A00 = r4
            r11.A02 = r5
            r11.A01 = r0
            return r6
        L8b:
            java.lang.String r1 = r2.A09()
            goto L76
        L90:
            if (r1 == r10) goto Lb1
            if (r1 != r8) goto Lb4
            boolean r0 = r13.A03
            if (r0 != 0) goto Lb1
            java.lang.String r0 = "object"
            X.WG2.A06(r0, r2)
            goto L4b
        L9e:
            r0 = 161(0xa1, float:2.26E-43)
            java.lang.String r2 = X.AbstractC111324zv.A00(r0)
            goto L44
        La5:
            X.MAP r5 = new X.MAP
            r5.<init>(r13, r12, r3)
            goto L16
        Lac:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb1:
            r2.A05(r9)
        Lb4:
            kotlinx.serialization.json.JsonObject r6 = new kotlinx.serialization.json.JsonObject
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WEc.A00(X.Wya, X.1Ds, X.WEc):java.lang.Object");
    }

    public static final JsonArray A01(WEc wEc) {
        C3T3 c3t3 = wEc.A01;
        byte A03 = c3t3.A03();
        if (c3t3.A04() != 4) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (c3t3.A0G()) {
                    arrayList.add(wEc.A03());
                    A03 = c3t3.A03();
                    if (A03 != 4) {
                        boolean A1P = AbstractC167007dF.A1P(A03, 9);
                        int i = c3t3.A00;
                        if (!A1P) {
                            c3t3.A0F(AbstractC111324zv.A00(1618), "", i);
                            break;
                        }
                    }
                } else {
                    if (A03 != 8) {
                        if (A03 == 4) {
                            if (!wEc.A03) {
                                WG2.A06("array", c3t3);
                            }
                        }
                        return new JsonArray(arrayList);
                    }
                    c3t3.A05((byte) 9);
                    return new JsonArray(arrayList);
                }
            }
        } else {
            c3t3.A0F(AbstractC111324zv.A00(161), "", c3t3.A00);
        }
        throw C00O.createAndThrow();
    }

    public static final JsonPrimitive A02(WEc wEc, boolean z) {
        String A0A;
        if (!wEc.A02 && z) {
            A0A = wEc.A01.A09();
        } else {
            A0A = wEc.A01.A0A();
            if (!z && C14360o3.A0K(A0A, "null")) {
                return JsonNull.A00;
            }
        }
        return new JsonLiteral(A0A, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.Wya, X.1Ds, java.lang.Object] */
    public final JsonElement A03() {
        String A0R;
        JsonElement jsonObject;
        String A09;
        Object obj;
        Object x2f;
        C3T3 c3t3 = this.A01;
        byte A04 = c3t3.A04();
        boolean z = true;
        if (A04 != 1) {
            if (A04 == 0) {
                z = false;
            } else {
                if (A04 == 6) {
                    int i = this.A00 + 1;
                    this.A00 = i;
                    if (i == 200) {
                        X2N x2n = new X2N(null, this);
                        C0eB c0eB = C0eB.A00;
                        ?? obj2 = new Object();
                        obj2.A03 = x2n;
                        obj2.A01 = c0eB;
                        obj2.A02 = obj2;
                        Object obj3 = VZ7.A00;
                        obj2.A00 = obj3;
                        while (true) {
                            obj = obj2.A00;
                            InterfaceC23621Ds interfaceC23621Ds = obj2.A02;
                            if (interfaceC23621Ds == null) {
                                break;
                            }
                            if (C14360o3.A0K(obj3, obj)) {
                                try {
                                    InterfaceC16610sE interfaceC16610sE = obj2.A03;
                                    Object obj4 = obj2.A01;
                                    if (!(interfaceC16610sE instanceof C1Dr)) {
                                        C14360o3.A0B(interfaceC16610sE, 0);
                                        C12W context = interfaceC23621Ds.getContext();
                                        if (context == AnonymousClass191.A00) {
                                            x2f = new C29632D3n(interfaceC23621Ds);
                                        } else {
                                            x2f = new X2F(interfaceC23621Ds, context);
                                        }
                                        C15500q5.A06(interfaceC16610sE, 3);
                                        obj = interfaceC16610sE.invoke(obj2, obj4, x2f);
                                    } else {
                                        C15500q5.A06(interfaceC16610sE, 3);
                                        obj = interfaceC16610sE.invoke(obj2, obj4, interfaceC23621Ds);
                                    }
                                } catch (Throwable th) {
                                    interfaceC23621Ds.resumeWith(new C09540e5(th));
                                }
                                if (obj != C1JX.A02) {
                                }
                            } else {
                                obj2.A00 = obj3;
                            }
                            interfaceC23621Ds.resumeWith(obj);
                        }
                        AbstractC09560e7.A00(obj);
                        jsonObject = (JsonElement) obj;
                    } else {
                        byte A05 = c3t3.A05((byte) 6);
                        if (c3t3.A04() != 4) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            while (true) {
                                if (c3t3.A0G()) {
                                    if (this.A02) {
                                        A09 = c3t3.A0A();
                                    } else {
                                        A09 = c3t3.A09();
                                    }
                                    c3t3.A05((byte) 5);
                                    linkedHashMap.put(A09, A03());
                                    A05 = c3t3.A03();
                                    if (A05 != 4) {
                                        if (A05 != 7) {
                                            A0R = "Expected end of the object or comma";
                                        }
                                    }
                                } else {
                                    if (A05 != 6) {
                                        if (A05 == 4) {
                                            if (!this.A03) {
                                                WG2.A06("object", c3t3);
                                            }
                                        }
                                    }
                                    c3t3.A05((byte) 7);
                                }
                            }
                            jsonObject = new JsonObject(linkedHashMap);
                        } else {
                            A0R = AbstractC111324zv.A00(161);
                        }
                    }
                    this.A00--;
                    return jsonObject;
                }
                if (A04 == 8) {
                    return A01(this);
                }
                A0R = AnonymousClass001.A0R("Cannot read Json element because of unexpected ", AbstractC68614VXp.A00(A04));
                c3t3.A0F(A0R, "", c3t3.A00);
                throw C00O.createAndThrow();
            }
        }
        return A02(this, z);
    }
}
