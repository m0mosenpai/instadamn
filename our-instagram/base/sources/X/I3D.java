package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3D {
    public static Map A00(InterfaceC39751sy interfaceC39751sy) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (interfaceC39751sy.AZB() != null) {
            InterfaceC104764ng AZB = interfaceC39751sy.AZB();
            if (AZB != null) {
                treeUpdaterJNI4 = AZB.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("ad_disclaimer_info", treeUpdaterJNI4);
        }
        if (interfaceC39751sy.getBackgroundColor() != null) {
            A1I.put("background_color", interfaceC39751sy.getBackgroundColor());
        }
        if (interfaceC39751sy.Aeu() != null) {
            A1I.put(AbstractC111324zv.A00(3992), interfaceC39751sy.Aeu());
        }
        if (interfaceC39751sy.Ale() != null) {
            C5FJ Ale = interfaceC39751sy.Ale();
            if (Ale != null) {
                treeUpdaterJNI3 = Ale.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put(AbstractC111324zv.A00(4064), treeUpdaterJNI3);
        }
        if (interfaceC39751sy.AwB() != null) {
            A1I.put(AbstractC111324zv.A00(4243), interfaceC39751sy.AwB());
        }
        if (interfaceC39751sy.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, interfaceC39751sy.getDescription());
        }
        if (interfaceC39751sy.AyD() != null) {
            InterfaceC104764ng AyD = interfaceC39751sy.AyD();
            if (AyD != null) {
                treeUpdaterJNI2 = AyD.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("disclaimer_context", treeUpdaterJNI2);
        }
        if (interfaceC39751sy.BDN() != null) {
            C5FJ BDN = interfaceC39751sy.BDN();
            if (BDN != null) {
                treeUpdaterJNI = BDN.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("headline_position", treeUpdaterJNI);
        }
        if (interfaceC39751sy.BKs() != null) {
            InterfaceC110874yz BKs = interfaceC39751sy.BKs();
            if (BKs != null) {
                treeUpdaterJNI5 = BKs.F7o();
            }
            A1I.put("keyword_highlight_info_list", treeUpdaterJNI5);
        }
        Map BSP = interfaceC39751sy.BSP();
        if (BSP != null) {
            A1I.put(AbstractC111324zv.A00(4905), BSP);
        }
        List BSS = interfaceC39751sy.BSS();
        if (BSS != null) {
            ArrayList A0q = AbstractC167017dG.A0q(BSS);
            Iterator it = BSS.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("mentioned_users", A0q);
        }
        if (interfaceC39751sy.BwS() != null) {
            A1I.put("show_headline", interfaceC39751sy.BwS());
        }
        if (interfaceC39751sy.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC39751sy.getText(), A1I);
        }
        if (interfaceC39751sy.getTextColor() != null) {
            A1I.put("text_color", interfaceC39751sy.getTextColor());
        }
        if (interfaceC39751sy.C6j() != null) {
            A1I.put("text_size", interfaceC39751sy.C6j());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
