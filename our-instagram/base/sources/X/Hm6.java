package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreateModeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Hm6 {
    public static Map A00(InterfaceC120925dk interfaceC120925dk) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (interfaceC120925dk.Am1() != null) {
            List<InterfaceC43527JKn> Am1 = interfaceC120925dk.Am1();
            if (Am1 != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (InterfaceC43527JKn interfaceC43527JKn : Am1) {
                    if (interfaceC43527JKn != null) {
                        arrayList2.add(interfaceC43527JKn.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("cards", arrayList2);
        }
        List B97 = interfaceC120925dk.B97();
        if (B97 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(B97);
            Iterator it = B97.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put(AbstractC111324zv.A00(955), A0q);
        }
        if (interfaceC120925dk.B9p() != null) {
            JLP B9p = interfaceC120925dk.B9p();
            if (B9p != null) {
                treeUpdaterJNI3 = B9p.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("gifs_info", treeUpdaterJNI3);
        }
        if (interfaceC120925dk.BAg() != null) {
            JJO BAg = interfaceC120925dk.BAg();
            if (BAg != null) {
                treeUpdaterJNI2 = BAg.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put(AbstractC111324zv.A00(4520), treeUpdaterJNI2);
        }
        if (interfaceC120925dk.getName() != null) {
            AbstractC37300Gc1.A14(interfaceC120925dk.getName(), A1I);
        }
        if (interfaceC120925dk.BeM() != null) {
            List<JL1> BeM = interfaceC120925dk.BeM();
            if (BeM != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JL1 jl1 : BeM) {
                    if (jl1 != null) {
                        arrayList.add(jl1.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(1172), arrayList);
        }
        if (interfaceC120925dk.C5m() != null) {
            InterfaceC43526JKm C5m = interfaceC120925dk.C5m();
            if (C5m != null) {
                treeUpdaterJNI = C5m.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(1331), treeUpdaterJNI);
        }
        if (interfaceC120925dk.C8B() != null) {
            A1I.put("thumbnail_url", interfaceC120925dk.C8B());
        }
        if (interfaceC120925dk.CBR() != null) {
            CreateModeType CBR = interfaceC120925dk.CBR();
            if (CBR != null) {
                str = CBR.A00;
            }
            AbstractC37300Gc1.A16(str, A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
