package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFW {
    public static Map A00(InterfaceC87803vo interfaceC87803vo) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        TreeUpdaterJNI treeUpdaterJNI6;
        TreeUpdaterJNI treeUpdaterJNI7;
        TreeUpdaterJNI treeUpdaterJNI8;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI9 = null;
        if (interfaceC87803vo.AtW() != null) {
            InterfaceC107114sH AtW = interfaceC87803vo.AtW();
            if (AtW != null) {
                treeUpdaterJNI8 = AtW.F7o();
            } else {
                treeUpdaterJNI8 = null;
            }
            A1I.put("cta", treeUpdaterJNI8);
        }
        if (interfaceC87803vo.B20() != null) {
            InterfaceC107114sH B20 = interfaceC87803vo.B20();
            if (B20 != null) {
                treeUpdaterJNI7 = B20.F7o();
            } else {
                treeUpdaterJNI7 = null;
            }
            A1I.put("end_scene", treeUpdaterJNI7);
        }
        if (interfaceC87803vo.B7j() != null) {
            InterfaceC107114sH B7j = interfaceC87803vo.B7j();
            if (B7j != null) {
                treeUpdaterJNI6 = B7j.F7o();
            } else {
                treeUpdaterJNI6 = null;
            }
            A1I.put("footer", treeUpdaterJNI6);
        }
        if (interfaceC87803vo.BA0() != null) {
            InterfaceC107114sH BA0 = interfaceC87803vo.BA0();
            if (BA0 != null) {
                treeUpdaterJNI5 = BA0.F7o();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1I.put("glados", treeUpdaterJNI5);
        }
        if (interfaceC87803vo.BDB() != null) {
            InterfaceC107114sH BDB = interfaceC87803vo.BDB();
            if (BDB != null) {
                treeUpdaterJNI4 = BDB.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("header", treeUpdaterJNI4);
        }
        if (interfaceC87803vo.BEW() != null) {
            InterfaceC107114sH BEW = interfaceC87803vo.BEW();
            if (BEW != null) {
                treeUpdaterJNI3 = BEW.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("iab", treeUpdaterJNI3);
        }
        if (interfaceC87803vo.BTf() != null) {
            InterfaceC107114sH BTf = interfaceC87803vo.BTf();
            if (BTf != null) {
                treeUpdaterJNI2 = BTf.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("mid_card", treeUpdaterJNI2);
        }
        if (interfaceC87803vo.BhY() != null) {
            InterfaceC107114sH BhY = interfaceC87803vo.BhY();
            if (BhY != null) {
                treeUpdaterJNI = BhY.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(2916), treeUpdaterJNI);
        }
        if (interfaceC87803vo.C9F() != null) {
            InterfaceC107114sH C9F = interfaceC87803vo.C9F();
            if (C9F != null) {
                treeUpdaterJNI9 = C9F.F7o();
            }
            A1I.put("tool_tip", treeUpdaterJNI9);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
