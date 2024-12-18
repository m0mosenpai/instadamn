package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7xT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179177xT implements InterfaceC179187xU, InterfaceC179117xN {
    public final C179197xV A00 = new C179197xV();
    public final C179207xW A01 = new C179207xW();
    public final HashMap A02 = new HashMap();

    @Override // X.InterfaceC179187xU, X.InterfaceC179117xN
    public final void E6H(InterfaceC179247xa interfaceC179247xa) {
        E6I(interfaceC179247xa, null);
    }

    @Override // X.InterfaceC179187xU
    public final void EDH(InterfaceC179577y7 interfaceC179577y7, EnumC179217xX enumC179217xX) {
        C179197xV c179197xV = this.A00;
        C180097yz A00 = C179197xV.A00(c179197xV, interfaceC179577y7);
        if (A00 == null) {
            A00 = new C180097yz(interfaceC179577y7);
            c179197xV.A00.A01(A00);
        }
        A00.A01.add(enumC179217xX);
        C179207xW c179207xW = this.A01;
        if (enumC179217xX.A02) {
            int ordinal = enumC179217xX.ordinal();
            c179207xW.A02[ordinal] = true;
            InterfaceC179227xY[] interfaceC179227xYArr = c179207xW.A01;
            if (interfaceC179227xYArr[ordinal] != null && c179207xW.A00.get()) {
                interfaceC179227xYArr[ordinal].ARQ();
            }
        }
        InterfaceC179247xa interfaceC179247xa = (InterfaceC179247xa) this.A02.get(enumC179217xX);
        if (interfaceC179247xa != null) {
            interfaceC179577y7.DfO(interfaceC179247xa);
        }
    }

    @Override // X.InterfaceC179187xU
    public final void F9X(InterfaceC179577y7 interfaceC179577y7) {
        int ordinal;
        InterfaceC179227xY interfaceC179227xY;
        C179197xV c179197xV = this.A00;
        C180097yz A00 = C179197xV.A00(c179197xV, interfaceC179577y7);
        if (A00 != null) {
            A00.A01.clear();
            c179197xV.A00.A02(A00);
        }
        for (EnumC179217xX enumC179217xX : EnumC179217xX.values()) {
            List list = c179197xV.A00.A00;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!((C180097yz) list.get(i)).A01.contains(enumC179217xX)) {
                        i++;
                    }
                } else {
                    C179207xW c179207xW = this.A01;
                    if (enumC179217xX.A02 && (interfaceC179227xY = c179207xW.A01[(ordinal = enumC179217xX.ordinal())]) != null) {
                        boolean[] zArr = c179207xW.A02;
                        if (zArr[ordinal]) {
                            zArr[ordinal] = false;
                            interfaceC179227xY.APM();
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC179187xU
    public final void F9Y(InterfaceC179577y7 interfaceC179577y7, EnumC179217xX enumC179217xX) {
        int ordinal;
        InterfaceC179227xY interfaceC179227xY;
        C179197xV c179197xV = this.A00;
        C180097yz A00 = C179197xV.A00(c179197xV, interfaceC179577y7);
        if (A00 != null) {
            HashSet hashSet = A00.A01;
            hashSet.remove(enumC179217xX);
            if (hashSet.isEmpty()) {
                c179197xV.A00.A02(A00);
            }
        }
        List list = c179197xV.A00.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C180097yz) list.get(i)).A01.contains(enumC179217xX)) {
                return;
            }
        }
        C179207xW c179207xW = this.A01;
        if (enumC179217xX.A02 && (interfaceC179227xY = c179207xW.A01[(ordinal = enumC179217xX.ordinal())]) != null) {
            boolean[] zArr = c179207xW.A02;
            if (zArr[ordinal]) {
                zArr[ordinal] = false;
                interfaceC179227xY.APM();
            }
        }
    }

    @Override // X.InterfaceC179117xN
    public final void E6I(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        EnumC179217xX CBM = interfaceC179247xa.CBM();
        if (CBM.A00) {
            this.A02.put(CBM, interfaceC179247xa);
        }
        C179197xV c179197xV = this.A00;
        if (c179197xV.A01.get()) {
            List list = c179197xV.A00.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C180097yz c180097yz = (C180097yz) list.get(i);
                if ((interfaceC179577y7 == null || interfaceC179577y7 == c180097yz.A00) && c180097yz.A01.contains(CBM)) {
                    c180097yz.A00.DfO(interfaceC179247xa);
                }
            }
        }
    }
}
