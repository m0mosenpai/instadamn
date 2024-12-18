package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC58318PtA;
import X.AbstractC63023Sar;
import X.AbstractC910944l;
import X.AbstractC911744t;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C00O;
import X.C102314j6;
import X.C16R;
import X.C44W;
import X.C45B;
import X.C45V;
import X.C46K;
import X.C55I;
import X.C62579SHe;
import X.C62724SNo;
import X.C63242Sfw;
import X.C913945y;
import X.C914045z;
import X.InterfaceC65620ToB;
import X.MSY;
import X.RBL;
import X.RC7;
import X.SIM;
import X.SX7;
import X.TmN;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public abstract class BeanSerializerBase extends StdSerializer implements C46K, C55I {
    public static final RC7[] A08;
    public final C62579SHe A00;
    public final SIM A01;
    public final Object A02;
    public final RC7[] A03;
    public final RC7[] A04;
    public final C45V A05;
    public final AbstractC910944l A06;
    public final RBL A07;

    public BeanSerializerBase(AbstractC910944l abstractC910944l, RBL rbl, C45B c45b, C62579SHe c62579SHe, SIM sim, Object obj, RC7[] rc7Arr, RC7[] rc7Arr2) {
        super(abstractC910944l);
        this.A06 = abstractC910944l;
        this.A04 = rc7Arr;
        this.A03 = rc7Arr2;
        this.A07 = rbl;
        this.A00 = c62579SHe;
        this.A02 = obj;
        this.A01 = sim;
        this.A05 = c45b.A00().A00;
    }

    static {
        C913945y c913945y = C913945y.A03;
        Iterator it = C914045z.A00;
        A08 = new RC7[0];
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set set, Set set2) {
        super(((StdSerializer) beanSerializerBase).A00);
        ArrayList A17;
        this.A06 = beanSerializerBase.A06;
        RC7[] rc7Arr = beanSerializerBase.A04;
        RC7[] rc7Arr2 = beanSerializerBase.A03;
        int length = rc7Arr.length;
        ArrayList A172 = AbstractC25225BEi.A17(length);
        if (rc7Arr2 == null) {
            A17 = null;
        } else {
            A17 = AbstractC25225BEi.A17(length);
        }
        for (int i = 0; i < length; i++) {
            RC7 rc7 = rc7Arr[i];
            if (!C63242Sfw.A02(rc7.A04.A03, set, set2)) {
                A172.add(rc7);
                if (rc7Arr2 != null) {
                    A17.add(rc7Arr2[i]);
                }
            }
        }
        this.A04 = (RC7[]) A172.toArray(new RC7[A172.size()]);
        this.A03 = A17 != null ? (RC7[]) A17.toArray(new RC7[A17.size()]) : null;
        this.A07 = beanSerializerBase.A07;
        this.A00 = beanSerializerBase.A00;
        this.A01 = beanSerializerBase.A01;
        this.A02 = beanSerializerBase.A02;
        this.A05 = beanSerializerBase.A05;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final boolean A06() {
        return AbstractC167007dF.A1W(this.A01);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A09(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        if (this.A01 != null) {
            A0G(anonymousClass182, abstractC913345m, abstractC63023Sar, obj);
            return;
        }
        SX7 A0E = A0E(C16R.A0D, abstractC63023Sar, obj);
        abstractC63023Sar.A02(anonymousClass182, A0E);
        anonymousClass182.A0F(obj);
        Object obj2 = this.A02;
        if (obj2 != null) {
            A0D(abstractC913345m, obj2);
            throw C00O.createAndThrow();
        }
        A0H(anonymousClass182, abstractC913345m, obj);
        abstractC63023Sar.A03(anonymousClass182, A0E);
    }

    public final SX7 A0E(C16R c16r, AbstractC63023Sar abstractC63023Sar, Object obj) {
        RBL rbl = this.A07;
        if (rbl == null) {
            return abstractC63023Sar.A04(c16r, obj);
        }
        Object A0A = rbl.A0A(obj);
        if (A0A == null) {
            A0A = "";
        }
        SX7 A04 = abstractC63023Sar.A04(c16r, obj);
        A04.A04 = A0A;
        return A04;
    }

    public final BeanSerializerBase A0F(SIM sim) {
        if (this instanceof UnwrappingBeanSerializer) {
            return new UnwrappingBeanSerializer(sim, (UnwrappingBeanSerializer) this);
        }
        if (this instanceof BeanAsArraySerializer) {
            return ((BeanAsArraySerializer) this).A00.A0F(sim);
        }
        return new BeanSerializerBase(sim, this, this.A02);
    }

    public final void A0G(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar, Object obj) {
        SIM sim = this.A01;
        C62724SNo A0Q = abstractC913345m.A0Q(sim.A00, obj);
        if (!A0Q.A01(anonymousClass182, abstractC913345m, sim)) {
            Object obj2 = A0Q.A00;
            if (obj2 == null) {
                obj2 = A0Q.A02.A01(obj);
                A0Q.A00 = obj2;
            }
            if (sim.A04) {
                sim.A03.A0A(anonymousClass182, abstractC913345m, obj2);
                return;
            }
            SX7 A0E = A0E(C16R.A0D, abstractC63023Sar, obj);
            abstractC63023Sar.A02(anonymousClass182, A0E);
            anonymousClass182.A0F(obj);
            A0Q.A00(anonymousClass182, abstractC913345m, sim);
            Object obj3 = this.A02;
            if (obj3 != null) {
                A0D(abstractC913345m, obj3);
                throw C00O.createAndThrow();
            }
            A0H(anonymousClass182, abstractC913345m, obj);
            abstractC63023Sar.A03(anonymousClass182, A0E);
        }
    }

    public final void A0H(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        RBL rbl;
        Object A0A;
        RC7[] rc7Arr = this.A03;
        if (rc7Arr == null || abstractC913345m.A07 == null) {
            rc7Arr = this.A04;
        }
        try {
            for (RC7 rc7 : rc7Arr) {
                if (rc7 != null) {
                    rc7.A04(anonymousClass182, abstractC913345m, obj);
                }
            }
            C62579SHe c62579SHe = this.A00;
            if (c62579SHe != null && (A0A = (rbl = c62579SHe.A03).A0A(obj)) != null) {
                if (!(A0A instanceof Map)) {
                    AbstractC58318PtA.A1N(abstractC913345m, c62579SHe.A02.CBP(), "Value returned by 'any-getter' %s() not java.util.Map but %s", new Object[]{rbl.A05(), MSY.A0h(A0A)});
                    throw C00O.createAndThrow();
                }
                MapSerializer mapSerializer = c62579SHe.A01;
                if (mapSerializer != null) {
                    mapSerializer.A0F(anonymousClass182, abstractC913345m, (Map) A0A);
                } else {
                    c62579SHe.A00.A0A(anonymousClass182, abstractC913345m, A0A);
                }
            }
        } catch (Exception e) {
            StdSerializer.A01(abstractC913345m, obj, 0 != rc7Arr.length ? rc7Arr[0].A04.A03 : "[anySetter]", e);
            throw C00O.createAndThrow();
        } catch (StackOverflowError e2) {
            C102314j6 c102314j6 = new C102314j6(anonymousClass182, "Infinite recursion (StackOverflowError)", e2);
            c102314j6.A08(obj, 0 != rc7Arr.length ? rc7Arr[0].A04.A03 : "[anySetter]");
            throw c102314j6;
        }
    }

    public final void A0I(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj, boolean z) {
        SIM sim = this.A01;
        C62724SNo A0Q = abstractC913345m.A0Q(sim.A00, obj);
        if (!A0Q.A01(anonymousClass182, abstractC913345m, sim)) {
            Object obj2 = A0Q.A00;
            if (obj2 == null) {
                obj2 = A0Q.A02.A01(obj);
                A0Q.A00 = obj2;
            }
            if (sim.A04) {
                sim.A03.A0A(anonymousClass182, abstractC913345m, obj2);
                return;
            }
            if (z) {
                anonymousClass182.A0p(obj);
            }
            A0Q.A00(anonymousClass182, abstractC913345m, sim);
            Object obj3 = this.A02;
            if (obj3 != null) {
                A0D(abstractC913345m, obj3);
                throw C00O.createAndThrow();
            }
            A0H(anonymousClass182, abstractC913345m, obj);
            if (!z) {
                return;
            }
            anonymousClass182.A0a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014b  */
    @Override // X.C46K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer ALs(X.InterfaceC65620ToB r25, X.AbstractC913345m r26) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.ALs(X.ToB, X.45m):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C55I
    public final void EK9(AbstractC913345m abstractC913345m) {
        int length;
        JsonSerializer A0E;
        AbstractC63023Sar abstractC63023Sar;
        JsonSerializer asArraySerializerBase;
        JsonSerializer jsonSerializer;
        RC7 rc7;
        RBL rbl;
        Object A0d;
        JsonSerializer jsonSerializer2;
        RC7 rc72;
        RC7[] rc7Arr = this.A03;
        if (rc7Arr == null) {
            length = 0;
        } else {
            length = rc7Arr.length;
        }
        RC7[] rc7Arr2 = this.A04;
        int length2 = rc7Arr2.length;
        for (int i = 0; i < length2; i++) {
            RC7 rc73 = rc7Arr2[i];
            if (!rc73.A0A && rc73.A01 == null && (jsonSerializer2 = abstractC913345m.A01) != null) {
                rc73.A05(jsonSerializer2);
                if (i < length && (rc72 = rc7Arr[i]) != null) {
                    rc72.A05(jsonSerializer2);
                }
            }
            if (rc73.A02 == null) {
                C44W A00 = abstractC913345m.A05.A00();
                JsonSerializer jsonSerializer3 = null;
                if (A00 != null && (rbl = rc73.A08) != null && (A0d = A00.A0d(rbl)) != null) {
                    TmN A06 = abstractC913345m.A06(A0d);
                    AbstractC910944l BaK = A06.BaK(abstractC913345m.A05());
                    if (BaK.A00 != Object.class) {
                        jsonSerializer3 = abstractC913345m.A0E(rc73, BaK);
                    }
                    A0E = new StdDelegatingSerializer(BaK, jsonSerializer3, A06);
                } else {
                    AbstractC910944l abstractC910944l = rc73.A05;
                    if (abstractC910944l == null) {
                        abstractC910944l = rc73.A06;
                        if (!Modifier.isFinal(abstractC910944l.A00.getModifiers())) {
                            if (abstractC910944l.A0N() || ((AbstractC911744t) abstractC910944l).A01.A01.length > 0) {
                                rc73.A00 = abstractC910944l;
                            }
                        }
                    }
                    A0E = abstractC913345m.A0E(rc73, abstractC910944l);
                    if (abstractC910944l.A0N() && (abstractC63023Sar = (AbstractC63023Sar) abstractC910944l.A03().A01) != null && (A0E instanceof ContainerSerializer)) {
                        JsonSerializer jsonSerializer4 = (ContainerSerializer) A0E;
                        if (jsonSerializer4 instanceof TableSerializer) {
                            asArraySerializerBase = new TableSerializer(abstractC63023Sar, (TableSerializer) jsonSerializer4);
                        } else if (jsonSerializer4 instanceof MultimapSerializer) {
                            MultimapSerializer multimapSerializer = (MultimapSerializer) jsonSerializer4;
                            asArraySerializerBase = new MultimapSerializer(multimapSerializer.A01, multimapSerializer.A02, multimapSerializer.A03, abstractC63023Sar, multimapSerializer, multimapSerializer.A04, multimapSerializer.A05, multimapSerializer.A06);
                        } else if (jsonSerializer4 instanceof MapSerializer) {
                            MapSerializer mapSerializer = (MapSerializer) jsonSerializer4;
                            AbstractC63023Sar abstractC63023Sar2 = mapSerializer.A05;
                            jsonSerializer = mapSerializer;
                            if (abstractC63023Sar2 != abstractC63023Sar) {
                                C914045z.A0E(MapSerializer.class, mapSerializer, "_withValueTypeSerializer");
                                asArraySerializerBase = new MapSerializer(abstractC63023Sar, mapSerializer, mapSerializer.A08, mapSerializer.A0A);
                            }
                            asArraySerializerBase = jsonSerializer;
                        } else {
                            boolean z = jsonSerializer4 instanceof StdArraySerializers$TypedPrimitiveArraySerializer;
                            jsonSerializer = jsonSerializer4;
                            if (!z) {
                                boolean z2 = jsonSerializer4 instanceof StdArraySerializers$IntArraySerializer;
                                jsonSerializer = jsonSerializer4;
                                if (!z2) {
                                    boolean z3 = jsonSerializer4 instanceof StdArraySerializers$DoubleArraySerializer;
                                    jsonSerializer = jsonSerializer4;
                                    if (!z3) {
                                        boolean z4 = jsonSerializer4 instanceof StdArraySerializers$BooleanArraySerializer;
                                        jsonSerializer = jsonSerializer4;
                                        if (!z4) {
                                            if (jsonSerializer4 instanceof ObjectArraySerializer) {
                                                ObjectArraySerializer objectArraySerializer = (ObjectArraySerializer) jsonSerializer4;
                                                asArraySerializerBase = new ObjectArraySerializer(objectArraySerializer.A02, objectArraySerializer.A00, abstractC63023Sar, objectArraySerializer.A04);
                                            } else {
                                                boolean z5 = jsonSerializer4 instanceof StringArraySerializer;
                                                jsonSerializer = jsonSerializer4;
                                                if (!z5) {
                                                    if (jsonSerializer4 instanceof MapEntrySerializer) {
                                                        MapEntrySerializer mapEntrySerializer = (MapEntrySerializer) jsonSerializer4;
                                                        asArraySerializerBase = new MapEntrySerializer(mapEntrySerializer.A00, mapEntrySerializer.A01, mapEntrySerializer, mapEntrySerializer.A06, mapEntrySerializer.A07);
                                                    } else if (jsonSerializer4 instanceof IterableSerializer) {
                                                        AsArraySerializerBase asArraySerializerBase2 = (AsArraySerializerBase) jsonSerializer4;
                                                        asArraySerializerBase = new AsArraySerializerBase(asArraySerializerBase2.A01, asArraySerializerBase2.A03, abstractC63023Sar, asArraySerializerBase2, asArraySerializerBase2.A05);
                                                    } else {
                                                        boolean z6 = jsonSerializer4 instanceof EnumSetSerializer;
                                                        jsonSerializer = jsonSerializer4;
                                                        if (!z6) {
                                                            if (jsonSerializer4 instanceof CollectionSerializer) {
                                                                AsArraySerializerBase asArraySerializerBase3 = (AsArraySerializerBase) jsonSerializer4;
                                                                asArraySerializerBase = new AsArraySerializerBase(asArraySerializerBase3.A01, asArraySerializerBase3.A03, abstractC63023Sar, asArraySerializerBase3, asArraySerializerBase3.A05);
                                                            } else {
                                                                boolean z7 = jsonSerializer4 instanceof IteratorSerializer;
                                                                AsArraySerializerBase asArraySerializerBase4 = (AsArraySerializerBase) jsonSerializer4;
                                                                InterfaceC65620ToB interfaceC65620ToB = asArraySerializerBase4.A01;
                                                                JsonSerializer jsonSerializer5 = asArraySerializerBase4.A03;
                                                                Boolean bool = asArraySerializerBase4.A05;
                                                                if (z7) {
                                                                    asArraySerializerBase = new AsArraySerializerBase(interfaceC65620ToB, jsonSerializer5, abstractC63023Sar, asArraySerializerBase4, bool);
                                                                } else {
                                                                    asArraySerializerBase = new AsArraySerializerBase(interfaceC65620ToB, jsonSerializer5, abstractC63023Sar, asArraySerializerBase4, bool);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            asArraySerializerBase = jsonSerializer;
                        }
                        A0E = asArraySerializerBase;
                    }
                }
                if (i < length && (rc7 = rc7Arr[i]) != null) {
                    rc7.A06(A0E);
                } else {
                    rc73.A06(A0E);
                }
            }
        }
        C62579SHe c62579SHe = this.A00;
        if (c62579SHe != null) {
            JsonSerializer jsonSerializer6 = c62579SHe.A00;
            if (jsonSerializer6 instanceof C46K) {
                InterfaceC65620ToB interfaceC65620ToB2 = c62579SHe.A02;
                JsonSerializer jsonSerializer7 = jsonSerializer6;
                if (jsonSerializer6 != 0) {
                    jsonSerializer7 = ((C46K) jsonSerializer6).ALs(interfaceC65620ToB2, abstractC913345m);
                }
                c62579SHe.A00 = jsonSerializer7;
                if (jsonSerializer7 instanceof MapSerializer) {
                    c62579SHe.A01 = (MapSerializer) jsonSerializer7;
                }
            }
        }
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, RC7[] rc7Arr, RC7[] rc7Arr2) {
        super(((StdSerializer) beanSerializerBase).A00);
        this.A06 = beanSerializerBase.A06;
        this.A04 = rc7Arr;
        this.A03 = rc7Arr2;
        this.A07 = beanSerializerBase.A07;
        this.A00 = beanSerializerBase.A00;
        this.A01 = beanSerializerBase.A01;
        this.A02 = beanSerializerBase.A02;
        this.A05 = beanSerializerBase.A05;
    }

    public BeanSerializerBase(SIM sim, BeanSerializerBase beanSerializerBase, Object obj) {
        super(((StdSerializer) beanSerializerBase).A00);
        this.A06 = beanSerializerBase.A06;
        this.A04 = beanSerializerBase.A04;
        this.A03 = beanSerializerBase.A03;
        this.A07 = beanSerializerBase.A07;
        this.A00 = beanSerializerBase.A00;
        this.A01 = sim;
        this.A02 = obj;
        this.A05 = beanSerializerBase.A05;
    }
}
