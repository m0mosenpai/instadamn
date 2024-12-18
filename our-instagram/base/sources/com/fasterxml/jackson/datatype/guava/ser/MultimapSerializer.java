package com.fasterxml.jackson.datatype.guava.ser;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.AnonymousClass558;
import X.C00O;
import X.C16R;
import X.C44W;
import X.C45U;
import X.C46K;
import X.C46g;
import X.EnumC61060ReZ;
import X.InterfaceC65620ToB;
import X.RBL;
import X.RC9;
import X.SX7;
import X.SZV;
import X.TII;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public class MultimapSerializer extends ContainerSerializer implements C46K {
    public SZV A00;
    public final InterfaceC65620ToB A01;
    public final JsonSerializer A02;
    public final JsonSerializer A03;
    public final Object A04;
    public final Set A05;
    public final boolean A06;
    public final AbstractC63023Sar A07;
    public final AnonymousClass558 A08;

    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // X.C46K
    public final JsonSerializer ALs(InterfaceC65620ToB interfaceC65620ToB, AbstractC913345m abstractC913345m) {
        RBL BSA;
        JsonSerializer A0F;
        Boolean A01;
        Set set;
        JsonSerializer jsonSerializer = this.A03;
        if (jsonSerializer == null) {
            AbstractC910944l abstractC910944l = this.A08.A01;
            if (Modifier.isFinal(abstractC910944l.A00.getModifiers())) {
                jsonSerializer = abstractC913345m.A0E(interfaceC65620ToB, abstractC910944l);
            }
        } else {
            jsonSerializer = AbstractC58322PtE.A0b(interfaceC65620ToB, jsonSerializer, abstractC913345m, jsonSerializer instanceof C46K ? 1 : 0);
        }
        C44W A00 = abstractC913345m.A05.A00();
        JsonSerializer jsonSerializer2 = null;
        if (interfaceC65620ToB == null) {
            BSA = null;
        } else {
            BSA = interfaceC65620ToB.BSA();
        }
        Object obj = this.A04;
        if (BSA != null && A00 != null) {
            Object A0c = A00.A0c(BSA);
            if (A0c != null) {
                jsonSerializer2 = abstractC913345m.A0M(BSA, A0c);
            }
            Object A0X = A00.A0X(BSA);
            if (A0X != null) {
                jsonSerializer = abstractC913345m.A0M(BSA, A0X);
            }
            obj = A00.A0a(BSA);
        }
        if (jsonSerializer == null) {
            jsonSerializer = jsonSerializer;
        }
        JsonSerializer A0C = A0C(interfaceC65620ToB, jsonSerializer, abstractC913345m);
        if (A0C == null) {
            AbstractC910944l abstractC910944l2 = this.A08.A01;
            if (abstractC910944l2.A03) {
                A0C = abstractC913345m.A0E(interfaceC65620ToB, abstractC910944l2);
            }
        } else {
            A0C = abstractC913345m.A0F(interfaceC65620ToB, A0C);
        }
        if (jsonSerializer2 == null && (jsonSerializer2 = this.A02) == null) {
            A0F = abstractC913345m.A0C(interfaceC65620ToB, this.A08.A00);
        } else {
            A0F = abstractC913345m.A0F(interfaceC65620ToB, jsonSerializer2);
        }
        AbstractC63023Sar abstractC63023Sar = this.A07;
        if (abstractC63023Sar != null) {
            abstractC63023Sar = abstractC63023Sar.A05(interfaceC65620ToB);
        }
        ?? r13 = this.A05;
        boolean z = false;
        Set set2 = r13;
        set2 = r13;
        if (A00 != null && BSA != null) {
            TII A05 = A00.A05(BSA);
            if (A05.A01) {
                set = Collections.emptySet();
            } else {
                set = A05.A00;
            }
            if (set != null && !set.isEmpty()) {
                if (r13 == 0) {
                    r13 = AbstractC166987dD.A1H();
                } else {
                    r13 = AbstractC31171DnF.A0k(r13);
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    AbstractC58318PtA.A1W(r13, it);
                }
            }
            Boolean A0N = A00.A0N(BSA);
            set2 = r13;
            if (A0N != null) {
                set2 = r13;
                if (A0N.booleanValue()) {
                    z = true;
                    set2 = r13;
                }
            }
        }
        C45U A002 = StdSerializer.A00(interfaceC65620ToB, abstractC913345m, super.A00);
        if (A002 != null && (A01 = A002.A01(EnumC61060ReZ.A03)) != null) {
            z = A01.booleanValue();
        }
        return new MultimapSerializer(interfaceC65620ToB, A0F, A0C, abstractC63023Sar, this, obj, set2, z);
    }

    public MultimapSerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC63023Sar abstractC63023Sar, AnonymousClass558 anonymousClass558, Object obj, Set set) {
        super(((AbstractC910944l) anonymousClass558).A00, false);
        this.A08 = anonymousClass558;
        this.A01 = null;
        this.A02 = jsonSerializer;
        this.A07 = abstractC63023Sar;
        this.A03 = jsonSerializer2;
        this.A05 = set;
        this.A04 = obj;
        this.A06 = false;
        this.A00 = RC9.A00;
    }

    private final void A03(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, C46g c46g) {
        Class<?> cls;
        Set set = this.A05;
        SZV szv = this.A00;
        Iterator A15 = AbstractC166997dE.A15(c46g.ACe());
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    abstractC913345m.A00.A0A(anonymousClass182, abstractC913345m, null);
                } else {
                    this.A02.A0A(anonymousClass182, abstractC913345m, key);
                }
                anonymousClass182.A0c();
                for (Object obj : AbstractC58318PtA.A0y(A1K)) {
                    if (obj == null) {
                        abstractC913345m.A0T(anonymousClass182);
                    } else {
                        JsonSerializer jsonSerializer = this.A03;
                        if (jsonSerializer == null && (jsonSerializer = szv.A00((cls = obj.getClass()))) == null) {
                            jsonSerializer = abstractC913345m.A0G(this.A01, cls);
                            SZV A01 = szv.A01(jsonSerializer, cls);
                            if (szv != A01) {
                                this.A00 = A01;
                            }
                            szv = this.A00;
                        }
                        AbstractC58322PtE.A1K(anonymousClass182, jsonSerializer, abstractC913345m, this.A07, obj);
                    }
                }
                anonymousClass182.A0Z();
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        C46g c46g = (C46g) obj;
        anonymousClass182.A0F(c46g);
        SX7 A00 = AbstractC63023Sar.A00(anonymousClass182, C16R.A0D, abstractC63023Sar, c46g);
        if (!c46g.isEmpty()) {
            Object obj2 = this.A04;
            if (obj2 != null) {
                A0D(abstractC913345m, obj2);
                throw C00O.createAndThrow();
            }
            A03(anonymousClass182, abstractC913345m, c46g);
        }
        abstractC63023Sar.A03(anonymousClass182, A00);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        C46g c46g = (C46g) obj;
        anonymousClass182.A0d();
        anonymousClass182.A0F(c46g);
        if (!c46g.isEmpty()) {
            Object obj2 = this.A04;
            if (obj2 != null) {
                A0D(abstractC913345m, obj2);
                throw C00O.createAndThrow();
            }
            A03(anonymousClass182, abstractC913345m, c46g);
        }
        anonymousClass182.A0a();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ boolean A0B(AbstractC913345m abstractC913345m, Object obj) {
        return ((C46g) obj).isEmpty();
    }

    public MultimapSerializer(InterfaceC65620ToB interfaceC65620ToB, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, AbstractC63023Sar abstractC63023Sar, MultimapSerializer multimapSerializer, Object obj, Set set, boolean z) {
        super(((StdSerializer) multimapSerializer).A00, false);
        this.A08 = multimapSerializer.A08;
        this.A01 = interfaceC65620ToB;
        this.A02 = jsonSerializer;
        this.A07 = abstractC63023Sar;
        this.A03 = jsonSerializer2;
        this.A00 = multimapSerializer.A00;
        this.A05 = set;
        this.A04 = obj;
        this.A06 = z;
    }
}
