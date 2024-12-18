package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CIr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC27672CIr {
    public static Map A00(InterfaceC31132DmF interfaceC31132DmF) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC31132DmF.Aoa() != null) {
            List Aoa = interfaceC31132DmF.Aoa();
            ArrayList A0q = AbstractC167017dG.A0q(Aoa);
            Iterator it = Aoa.iterator();
            while (it.hasNext()) {
                A0q.add(((C38321qM) it.next()).A1D());
            }
            A1I.put(AbstractC111324zv.A00(187), A0q);
        }
        interfaceC31132DmF.BV0();
        A1I.put(AbstractC58317Pt9.A00(314), Boolean.valueOf(interfaceC31132DmF.BV0()));
        if (interfaceC31132DmF.Bb8() != null) {
            A1I.put(AbstractC58317Pt9.A00(334), interfaceC31132DmF.Bb8());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
