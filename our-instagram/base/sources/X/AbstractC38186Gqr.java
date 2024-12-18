package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gqr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38186Gqr {
    public static final Integer A00(InterfaceC39521sX interfaceC39521sX) {
        C14360o3.A0B(interfaceC39521sX, 0);
        InterfaceC39501sV BIe = interfaceC39521sX.BIe();
        if (BIe != null) {
            EnumC38187Gqs enumC38187Gqs = (EnumC38187Gqs) EnumC38187Gqs.A01.get(BIe.BxF());
            if (enumC38187Gqs == null) {
                enumC38187Gqs = EnumC38187Gqs.A09;
            }
            int ordinal = enumC38187Gqs.ordinal();
            if (ordinal != 6) {
                if (ordinal == 0) {
                    return C05F.A0C;
                }
            } else {
                return C05F.A00;
            }
        }
        return C05F.A01;
    }

    public static final Integer A01(InterfaceC38221qC interfaceC38221qC) {
        List BOJ;
        List BTJ = interfaceC38221qC.BTJ();
        if (BTJ != null && !BTJ.isEmpty() && (BOJ = interfaceC38221qC.BOJ()) != null && !BOJ.isEmpty()) {
            List BOJ2 = interfaceC38221qC.BOJ();
            if (BOJ2 != null) {
                Iterator it = BOJ2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Integer A00 = A00((InterfaceC39521sX) next);
                    Integer num = C05F.A0C;
                    if (A00 == num) {
                        if (next != null) {
                            return num;
                        }
                    }
                }
            }
            return C05F.A01;
        }
        return C05F.A00;
    }
}
