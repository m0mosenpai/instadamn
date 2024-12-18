package X;

/* renamed from: X.RqW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61607RqW {
    public final InterfaceC65438TkA A01(Class cls) {
        InterfaceC65438TkA interfaceC65438TkA;
        if (this instanceof RVP) {
            RVP rvp = (RVP) this;
            synchronized (rvp) {
                interfaceC65438TkA = (InterfaceC65438TkA) rvp.A02.get(cls);
            }
            return interfaceC65438TkA;
        }
        RVO rvo = (RVO) this;
        if (rvo.A02.contains(cls)) {
            return rvo.A00.A01(cls);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    public final InterfaceC65438TkA A02(Class cls) {
        InterfaceC65438TkA interfaceC65438TkA;
        if (this instanceof RVP) {
            RVP rvp = (RVP) this;
            synchronized (rvp) {
                interfaceC65438TkA = (C64438TDw) rvp.A03.get(cls);
                if (interfaceC65438TkA == null) {
                    interfaceC65438TkA = RVP.A06;
                }
            }
            return interfaceC65438TkA;
        }
        RVO rvo = (RVO) this;
        if (rvo.A05.contains(cls)) {
            return rvo.A00.A02(cls);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    public final Object A03(Class cls) {
        if (this instanceof RVO) {
            RVO rvo = (RVO) this;
            if (rvo.A01.contains(cls)) {
                Object A03 = rvo.A00.A03(cls);
                if (cls.equals(InterfaceC65284ThH.class)) {
                    return new C64436TDu((InterfaceC65284ThH) A03, rvo.A03);
                }
                return A03;
            }
            throw new RuntimeException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        InterfaceC65438TkA A01 = A01(cls);
        if (A01 == null) {
            return null;
        }
        return A01.get();
    }

    public final java.util.Set A04(Class cls) {
        if (this instanceof RVO) {
            RVO rvo = (RVO) this;
            if (rvo.A04.contains(cls)) {
                return rvo.A00.A04(cls);
            }
            throw new RuntimeException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
        }
        return (java.util.Set) A02(cls).get();
    }
}
