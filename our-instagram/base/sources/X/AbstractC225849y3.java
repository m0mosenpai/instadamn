package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9y3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225849y3 {
    public static Map A00(InterfaceC110214xq interfaceC110214xq) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList = null;
        if (interfaceC110214xq.AdG() != null) {
            InterfaceC110104xf AdG = interfaceC110214xq.AdG();
            if (AdG != null) {
                treeUpdaterJNI6 = AdG.F7o();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1I.put("attribution_info", treeUpdaterJNI6);
        }
        if (interfaceC110214xq.B0l() != null) {
            InterfaceC110134xi B0l = interfaceC110214xq.B0l();
            if (B0l != null) {
                treeUpdaterJNI5 = B0l.F7o();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1I.put(AbstractC111324zv.A00(4358), treeUpdaterJNI5);
        }
        if (interfaceC110214xq.BTu() != null) {
            A1I.put(AbstractC111324zv.A00(4929), interfaceC110214xq.BTu());
        }
        if (interfaceC110214xq.Bp4() != null) {
            InterfaceC43505JJr Bp4 = interfaceC110214xq.Bp4();
            if (Bp4 != null) {
                treeUpdaterJNI4 = Bp4.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put(AbstractC111324zv.A00(519), treeUpdaterJNI4);
        }
        if (interfaceC110214xq.BsT() != null) {
            List<InterfaceC110074xc> BsT = interfaceC110214xq.BsT();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC110074xc interfaceC110074xc : BsT) {
                if (interfaceC110074xc != null) {
                    A1E.add(interfaceC110074xc.F7o());
                }
            }
            A1I.put(AbstractC111324zv.A00(5270), A1E);
        }
        if (interfaceC110214xq.Bv7() != null) {
            A1I.put(AbstractC111324zv.A00(3092), interfaceC110214xq.Bv7());
        }
        if (interfaceC110214xq.Bxu() != null) {
            InterfaceC43503JJp Bxu = interfaceC110214xq.Bxu();
            if (Bxu != null) {
                treeUpdaterJNI3 = Bxu.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put(AbstractC111324zv.A00(3116), treeUpdaterJNI3);
        }
        interfaceC110214xq.getTemplateClipsMediaId();
        A1I.put("template_clips_media_id", Long.valueOf(interfaceC110214xq.getTemplateClipsMediaId()));
        if (interfaceC110214xq.C8X() != null) {
            JK2 C8X = interfaceC110214xq.C8X();
            if (C8X != null) {
                treeUpdaterJNI2 = C8X.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put(AbstractC111324zv.A00(544), treeUpdaterJNI2);
        }
        if (interfaceC110214xq.C8Y() != null) {
            InterfaceC110164xl C8Y = interfaceC110214xq.C8Y();
            if (C8Y != null) {
                treeUpdaterJNI = C8Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(5498), treeUpdaterJNI);
        }
        if (interfaceC110214xq.CAa() != null) {
            List<C5J2> CAa = interfaceC110214xq.CAa();
            if (CAa != null) {
                arrayList = AbstractC166987dD.A1E();
                for (C5J2 c5j2 : CAa) {
                    if (c5j2 != null) {
                        arrayList.add(c5j2.F7o());
                    }
                }
            }
            A1I.put(AbstractC111324zv.A00(5506), arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
