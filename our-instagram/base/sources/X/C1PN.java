package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1PN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1PN implements C1PO {
    public final C13920nI A00;
    public final LinkedList A01;
    public final Map A02;

    @Override // X.C1PO
    public final void DrE(C38687GzS c38687GzS) {
        IML iml = (IML) this.A02.get(c38687GzS);
        if (iml != null) {
            iml.A02 = false;
            long j = iml.A00;
            if (j > 0) {
                iml.A01 += System.currentTimeMillis() - j;
                iml.A00 = 0L;
            }
        }
    }

    public C1PN() {
        C13920nI c13920nI = C13920nI.A00;
        C14360o3.A0B(c13920nI, 1);
        this.A00 = c13920nI;
        this.A02 = new LinkedHashMap();
        this.A01 = new LinkedList();
    }

    @Override // X.C1PO
    public final void Dxv(C38687GzS c38687GzS) {
        String str;
        DrE(c38687GzS);
        LinkedList linkedList = this.A01;
        IML iml = (IML) AbstractC001800i.A0L(linkedList);
        Object remove = this.A02.remove(c38687GzS);
        if (iml != null && remove != null && C2I7.A00(iml, remove)) {
            linkedList.removeLast();
            IML iml2 = (IML) AbstractC001800i.A0L(linkedList);
            if (iml2 != null) {
                List list = iml2.A05;
                list.add(iml);
                AnonymousClass016.A16(iml.A05, list);
                Iterator it = iml2.A06.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
            return;
        }
        C0f5 AEp = C18950wb.A00.AEp("CROSS_SURFACE_DISCOVERY_INVALID_SURFACE_LEAVE", 817903741);
        String str2 = null;
        if (iml != null) {
            str = iml.toString();
        } else {
            str = null;
        }
        AEp.ABW("exiting_surface", str);
        if (remove != null) {
            str2 = remove.toString();
        }
        AEp.ABW("calling_surface", str2);
        AEp.report();
    }
}
