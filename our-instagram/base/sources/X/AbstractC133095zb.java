package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.5zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC133095zb {
    public static final C5Hc A00(Iterable iterable) {
        C5Hc c5Hc;
        C14360o3.A0B(iterable, 0);
        if (!(iterable instanceof C5Hc) || (c5Hc = (C5Hc) iterable) == null) {
            return A03(iterable);
        }
        return c5Hc;
    }

    public static final InterfaceC137486Kt A01(Map map) {
        InterfaceC65695TsH interfaceC65695TsH;
        InterfaceC137486Kt AEV;
        C14360o3.A0B(map, 0);
        if (((map instanceof InterfaceC137486Kt) && (AEV = (InterfaceC137486Kt) map) != null) || ((map instanceof InterfaceC65695TsH) && (interfaceC65695TsH = (InterfaceC65695TsH) map) != null && (AEV = interfaceC65695TsH.AEV()) != null)) {
            return AEV;
        }
        C6LT c6lt = C6LT.A03;
        C14360o3.A0C(c6lt, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
        C58476Pw2 c58476Pw2 = new C58476Pw2(c6lt);
        c58476Pw2.putAll(map);
        return c58476Pw2.AEV();
    }

    public static final InterfaceC65696TsI A02(Iterable iterable) {
        InterfaceC65697TsJ interfaceC65697TsJ;
        InterfaceC65696TsI AEW;
        C14360o3.A0B(iterable, 0);
        if (((iterable instanceof InterfaceC65696TsI) && (AEW = (InterfaceC65696TsI) iterable) != null) || ((iterable instanceof InterfaceC65697TsJ) && (interfaceC65697TsJ = (InterfaceC65697TsJ) iterable) != null && (AEW = interfaceC65697TsJ.AEW()) != null)) {
            return AEW;
        }
        return A06(iterable, C58473Pvy.A03);
    }

    public static final C5Hb A03(Iterable iterable) {
        InterfaceC133105zc interfaceC133105zc;
        C5Hb AEU;
        C5Hb c5Hb;
        C14360o3.A0B(iterable, 0);
        if (!(iterable instanceof C5Hb) || (c5Hb = (C5Hb) iterable) == null) {
            if (!(iterable instanceof InterfaceC133105zc) || (interfaceC133105zc = (InterfaceC133105zc) iterable) == null || (AEU = interfaceC133105zc.AEU()) == null) {
                C5HZ c5hz = C5HZ.A01;
                C14360o3.A0B(c5hz, 0);
                if (iterable instanceof Collection) {
                    return c5hz.A09((Collection) iterable);
                }
                C58484PwA c58484PwA = new C58484PwA(c5hz, c5hz.A00);
                AnonymousClass016.A16(iterable, c58484PwA);
                return c58484PwA.AEU();
            }
            return AEU;
        }
        return c5Hb;
    }

    public static final C5Hb A04(Object... objArr) {
        C14360o3.A0B(objArr, 0);
        C5HZ c5hz = C5HZ.A01;
        List asList = Arrays.asList(objArr);
        C14360o3.A07(asList);
        return c5hz.A09(asList);
    }

    public static final C58473Pvy A05(Iterable iterable) {
        C58479Pw5 c58479Pw5;
        C58473Pvy AEW;
        C14360o3.A0B(iterable, 0);
        if (((iterable instanceof C58473Pvy) && (AEW = (C58473Pvy) iterable) != null) || ((iterable instanceof C58479Pw5) && (c58479Pw5 = (C58479Pw5) iterable) != null && (AEW = c58479Pw5.AEW()) != null)) {
            return AEW;
        }
        return A06(iterable, C58473Pvy.A03);
    }

    public static final C58473Pvy A06(Iterable iterable, C58473Pvy c58473Pvy) {
        C58479Pw5 c58479Pw5;
        C14360o3.A0B(c58473Pvy, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            C14360o3.A0B(collection, 0);
            c58479Pw5 = new C58479Pw5(c58473Pvy);
            c58479Pw5.addAll(collection);
        } else {
            c58479Pw5 = new C58479Pw5(c58473Pvy);
            AnonymousClass016.A16(iterable, c58479Pw5);
        }
        return c58479Pw5.AEW();
    }
}
