package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.JTc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43668JTc {
    public static void A00(C119885bm c119885bm, C1OW c1ow, MNP mnp, MNP mnp2, List list) {
        InterfaceC29421bJ interfaceC29421bJ;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC29421bJ) it.next()).DUs(c1ow, mnp, mnp2);
        }
        InterfaceC09390do interfaceC09390do = c119885bm.A01(c1ow.A02()).A06;
        if (interfaceC09390do != null && (interfaceC29421bJ = (InterfaceC29421bJ) interfaceC09390do.getValue()) != null) {
            interfaceC29421bJ.DUs(c1ow, mnp, mnp2);
        }
    }

    public static void A01(C119885bm c119885bm, C1OW c1ow, MNP mnp, List list) {
        InterfaceC29421bJ interfaceC29421bJ;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC29421bJ) it.next()).DUn(c1ow, mnp);
        }
        InterfaceC09390do interfaceC09390do = c119885bm.A01(c1ow.A02()).A06;
        if (interfaceC09390do != null && (interfaceC29421bJ = (InterfaceC29421bJ) interfaceC09390do.getValue()) != null) {
            interfaceC29421bJ.DUn(c1ow, mnp);
        }
    }
}
