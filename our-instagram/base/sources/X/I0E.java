package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I0E {
    public static Map A00(InterfaceC1124155t interfaceC1124155t) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC1124155t.getCanViewerReshare();
        A1I.put("can_viewer_reshare", Boolean.valueOf(interfaceC1124155t.getCanViewerReshare()));
        if (interfaceC1124155t.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, interfaceC1124155t.getDescription());
        }
        interfaceC1124155t.B63();
        A1I.put("feedback_enabled", Boolean.valueOf(interfaceC1124155t.B63()));
        interfaceC1124155t.BF4();
        AbstractC37300Gc1.A12(Long.valueOf(interfaceC1124155t.BF4()), A1I);
        interfaceC1124155t.CSj();
        A1I.put("is_draft", Boolean.valueOf(interfaceC1124155t.CSj()));
        if (interfaceC1124155t.BUE() != null) {
            JLE BUE = interfaceC1124155t.BUE();
            if (BUE != null) {
                treeUpdaterJNI = BUE.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("mixed_cover_media", treeUpdaterJNI);
        }
        interfaceC1124155t.BXg();
        A1I.put("num_items", Integer.valueOf(interfaceC1124155t.BXg()));
        if (interfaceC1124155t.Bah() != null) {
            A1I.put("owner", interfaceC1124155t.Bah().A07());
        }
        if (interfaceC1124155t.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC1124155t.getTitle(), A1I);
        }
        if (interfaceC1124155t.CBT() != null) {
            GuideTypeStr CBT = interfaceC1124155t.CBT();
            C14360o3.A0B(CBT, 0);
            AbstractC37300Gc1.A16(CBT.A00, A1I);
        }
        interfaceC1124155t.CDE();
        return AbstractC37301Gc2.A0r("updated_timestamp", Long.valueOf(interfaceC1124155t.CDE()), A1I);
    }
}
