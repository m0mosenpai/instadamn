package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDA {
    public static Map A00(InterfaceC109864xE interfaceC109864xE) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC109864xE.AYQ() != null) {
            A1I.put("action", interfaceC109864xE.AYQ());
        }
        if (interfaceC109864xE.getActionUrl() != null) {
            A1I.put(AbstractC111324zv.A00(1889), interfaceC109864xE.getActionUrl());
        }
        if (interfaceC109864xE.AjC() != null) {
            A1I.put("button_type", interfaceC109864xE.AjC());
        }
        if (interfaceC109864xE.BBL() != null) {
            A1I.put("has_chevron", interfaceC109864xE.BBL());
        }
        if (interfaceC109864xE.BDO() != null) {
            A1I.put(AbstractC111324zv.A00(975), interfaceC109864xE.BDO());
        }
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (interfaceC109864xE.BEg() != null) {
            InterfaceC109884xG BEg = interfaceC109864xE.BEg();
            if (BEg != null) {
                treeUpdaterJNI2 = BEg.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, treeUpdaterJNI2);
        }
        if (interfaceC109864xE.CeI() != null) {
            A1I.put(AbstractC111324zv.A00(4787), interfaceC109864xE.CeI());
        }
        if (interfaceC109864xE.getSecondaryText() != null) {
            A1I.put(AbstractC58317Pt9.A00(365), interfaceC109864xE.getSecondaryText());
        }
        if (interfaceC109864xE.Brd() != null) {
            InterfaceC31126Dm9 Brd = interfaceC109864xE.Brd();
            if (Brd != null) {
                treeUpdaterJNI = Brd.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC43591JPw.A00(1304), treeUpdaterJNI);
        }
        if (interfaceC109864xE.getText() != null) {
            A1I.put("text", interfaceC109864xE.getText());
        }
        if (interfaceC109864xE.C6A() != null) {
            InterfaceC31126Dm9 C6A = interfaceC109864xE.C6A();
            if (C6A != null) {
                treeUpdaterJNI3 = C6A.F7o();
            }
            A1I.put(AbstractC111324zv.A00(3226), treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
