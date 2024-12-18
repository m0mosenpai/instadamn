package X;

/* loaded from: classes10.dex */
public abstract class S36 {
    public static boolean A00(InterfaceC75173Zi multiset, Object object) {
        if (object != multiset) {
            if (object instanceof InterfaceC75173Zi) {
                InterfaceC75173Zi interfaceC75173Zi = (InterfaceC75173Zi) object;
                if (multiset.size() == interfaceC75173Zi.size() && multiset.entrySet().size() == interfaceC75173Zi.entrySet().size()) {
                    for (AbstractC62759SPq abstractC62759SPq : interfaceC75173Zi.entrySet()) {
                        if (multiset.AL0(abstractC62759SPq.A01()) != abstractC62759SPq.A00()) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
