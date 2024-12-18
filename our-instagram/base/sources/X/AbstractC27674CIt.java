package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CIt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC27674CIt {
    public static Map A00(InterfaceC31135DmI interfaceC31135DmI) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC31135DmI.AdR();
        A1I.put("audience", Integer.valueOf(interfaceC31135DmI.AdR()));
        if (interfaceC31135DmI.Aqg() != null) {
            A1I.put(AbstractC111324zv.A00(195), interfaceC31135DmI.Aqg());
        }
        if (interfaceC31135DmI.B3E() != null) {
            A1I.put(AbstractC58317Pt9.A00(26), interfaceC31135DmI.B3E());
        }
        interfaceC31135DmI.BQa();
        A1I.put("media_count", Integer.valueOf(interfaceC31135DmI.BQa()));
        if (interfaceC31135DmI.Bfu() != null) {
            List Bfu = interfaceC31135DmI.Bfu();
            ArrayList A0q = AbstractC167017dG.A0q(Bfu);
            Iterator it = Bfu.iterator();
            while (it.hasNext()) {
                A0q.add(((C38321qM) it.next()).A1D());
            }
            A1I.put(AbstractC111324zv.A00(72), A0q);
        }
        if (interfaceC31135DmI.Bie() != null) {
            InterfaceC31134DmH Bie = interfaceC31135DmI.Bie();
            if (Bie != null) {
                treeUpdaterJNI = Bie.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC43591JPw.A00(50), treeUpdaterJNI);
        }
        interfaceC31135DmI.C2Z();
        A1I.put(AbstractC111324zv.A00(271), Integer.valueOf(interfaceC31135DmI.C2Z()));
        return AbstractC06930Yk.A0B(A1I);
    }
}
