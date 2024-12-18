package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: X.SdH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63113SdH {
    public static final java.util.Set A00;
    public static final Logger A02 = AbstractC58319PtB.A17(C63113SdH.class);
    public static final ConcurrentMap A01 = AbstractC58318PtA.A14();

    static {
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add(InterfaceC65518Tln.class);
        A1H.add(InterfaceC65519Tlo.class);
        A1H.add(InterfaceC65272Th2.class);
        A1H.add(InterfaceC65427Tjy.class);
        A1H.add(InterfaceC65269Tgz.class);
        A1H.add(InterfaceC65429Tk0.class);
        A1H.add(InterfaceC65431Tk2.class);
        A1H.add(InterfaceC65270Th0.class);
        A1H.add(InterfaceC65271Th1.class);
        A00 = Collections.unmodifiableSet(A1H);
    }

    public static Object A00(PxG keyData, Class primitiveClass) {
        String str = keyData.typeUrl_;
        AbstractC58536Px4 abstractC58536Px4 = keyData.value_;
        InterfaceC65428Tjz A002 = C63190Ses.A00(C63190Ses.A02, str);
        C64302T8l c64302T8l = (C64302T8l) A002;
        Class cls = c64302T8l.A02;
        if (cls.equals(primitiveClass)) {
            return C62987SaB.A01.A00(C58550PxN.A01.A05(C58551PxO.A00(c64302T8l.A00, PxH.RAW, abstractC58536Px4, null, c64302T8l.A03)), cls);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Primitive type ");
        AbstractC58318PtA.A1Q(primitiveClass, A1C);
        A1C.append(" not supported by key manager of type ");
        AbstractC58318PtA.A1U(A1C, A002);
        throw AbstractC58320PtC.A19(cls, ", which only supports: ", A1C);
    }
}
