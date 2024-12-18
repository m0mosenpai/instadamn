package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.I2r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40711I2r {
    public static Map A00(InterfaceC37861pP interfaceC37861pP) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37861pP.AYe() != null) {
            A1I.put("action_text", interfaceC37861pP.AYe());
        }
        C914346k AgU = interfaceC37861pP.AgU();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (AgU != null) {
            A1I.put("bloks_data", AgU.A00());
        }
        if (interfaceC37861pP.AsC() != null) {
            A1I.put(AbstractC111324zv.A00(854), interfaceC37861pP.AsC());
        }
        if (interfaceC37861pP.BA3() != null) {
            A1I.put("global_position", interfaceC37861pP.BA3());
        }
        if (interfaceC37861pP.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC37861pP.getId(), A1I);
        }
        if (interfaceC37861pP.BJz() != null) {
            InterfaceC39571se BJz = interfaceC37861pP.BJz();
            if (BJz != null) {
                treeUpdaterJNI = BJz.F7o();
            }
            A1I.put("item_client_gap_rules", treeUpdaterJNI);
        }
        if (interfaceC37861pP.BMP() != null) {
            TreeUpdaterJNI treeUpdaterJNI2 = TreeUpdaterJNI.$redex_init_class;
            A1I.put("layout", AbstractC37300Gc1.A05("", AbstractC06930Yk.A0E()));
        }
        if (interfaceC37861pP.getMessage() != null) {
            A1I.put(DialogModule.KEY_MESSAGE, interfaceC37861pP.getMessage());
        }
        if (interfaceC37861pP.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC37861pP.getTitle(), A1I);
        }
        if (interfaceC37861pP.CAR() != null) {
            A1I.put("tracking_token", interfaceC37861pP.CAR());
        }
        if (interfaceC37861pP.CFr() != null) {
            A1I.put("view_state_item_type", interfaceC37861pP.CFr());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
