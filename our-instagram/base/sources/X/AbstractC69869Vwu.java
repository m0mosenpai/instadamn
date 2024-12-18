package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vwu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC69869Vwu {
    public static InterfaceC109094vY A00(InterfaceC109094vY interfaceC109094vY, InterfaceC109094vY interfaceC109094vY2) {
        C69728VuN c69728VuN = new C69728VuN(interfaceC109094vY);
        if (interfaceC109094vY2.AfL() != null) {
            c69728VuN.A00 = interfaceC109094vY2.AfL();
        }
        C914346k AfM = interfaceC109094vY2.AfM();
        if (AfM != null) {
            c69728VuN.A02 = AfM;
        }
        C914346k AgU = interfaceC109094vY2.AgU();
        if (AgU != null) {
            c69728VuN.A03 = AgU;
        }
        if (interfaceC109094vY2.AjH() != null) {
            c69728VuN.A0D = interfaceC109094vY2.AjH();
        }
        if (interfaceC109094vY2.getDescription() != null) {
            c69728VuN.A08 = interfaceC109094vY2.getDescription();
        }
        if (interfaceC109094vY2.BEg() != null) {
            c69728VuN.A01 = interfaceC109094vY2.BEg();
        }
        if (interfaceC109094vY2.BUD() != null) {
            c69728VuN.A05 = interfaceC109094vY2.BUD();
        }
        if (interfaceC109094vY2.BaV() != null) {
            c69728VuN.A06 = interfaceC109094vY2.BaV();
        }
        C914346k BaW = interfaceC109094vY2.BaW();
        if (BaW != null) {
            c69728VuN.A04 = BaW;
        }
        if (interfaceC109094vY2.BaY() != null) {
            c69728VuN.A07 = interfaceC109094vY2.BaY();
        }
        if (interfaceC109094vY2.getOverlayType() != null) {
            c69728VuN.A09 = interfaceC109094vY2.getOverlayType();
        }
        if (interfaceC109094vY2.getSessionId() != null) {
            c69728VuN.A0A = interfaceC109094vY2.getSessionId();
        }
        if (interfaceC109094vY2.getSubCategory() != null) {
            c69728VuN.A0B = interfaceC109094vY2.getSubCategory();
        }
        if (interfaceC109094vY2.getTitle() != null) {
            c69728VuN.A0C = interfaceC109094vY2.getTitle();
        }
        return c69728VuN.A01();
    }

    public static Map A01(InterfaceC109094vY interfaceC109094vY) {
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC109094vY.AfL() != null) {
            InterfaceC109864xE AfL = interfaceC109094vY.AfL();
            if (AfL != null) {
                treeUpdaterJNI = AfL.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("banner", treeUpdaterJNI);
        }
        C914346k AfM = interfaceC109094vY.AfM();
        if (AfM != null) {
            linkedHashMap.put("banner_bloks_data", AfM.A00());
        }
        C914346k AgU = interfaceC109094vY.AgU();
        if (AgU != null) {
            linkedHashMap.put("bloks_data", AgU.A00());
        }
        if (interfaceC109094vY.AjH() != null) {
            List<InterfaceC109864xE> AjH = interfaceC109094vY.AjH();
            if (AjH != null) {
                arrayList = new ArrayList();
                for (InterfaceC109864xE interfaceC109864xE : AjH) {
                    if (interfaceC109864xE != null) {
                        arrayList.add(interfaceC109864xE.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("buttons", arrayList);
        }
        if (interfaceC109094vY.getDescription() != null) {
            linkedHashMap.put(DevServerEntity.COLUMN_DESCRIPTION, interfaceC109094vY.getDescription());
        }
        if (interfaceC109094vY.BEg() != null) {
            InterfaceC109884xG BEg = interfaceC109094vY.BEg();
            if (BEg != null) {
                treeUpdaterJNI2 = BEg.F7o();
            }
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, treeUpdaterJNI2);
        }
        if (interfaceC109094vY.BUD() != null) {
            linkedHashMap.put("misinformation_type", interfaceC109094vY.BUD());
        }
        if (interfaceC109094vY.BaV() != null) {
            linkedHashMap.put("overlay_applied_timestamp", interfaceC109094vY.BaV());
        }
        C914346k BaW = interfaceC109094vY.BaW();
        if (BaW != null) {
            linkedHashMap.put("overlay_bloks_data", BaW.A00());
        }
        if (interfaceC109094vY.BaY() != null) {
            linkedHashMap.put("overlay_layout", interfaceC109094vY.BaY());
        }
        if (interfaceC109094vY.getOverlayType() != null) {
            linkedHashMap.put("overlay_type", interfaceC109094vY.getOverlayType());
        }
        if (interfaceC109094vY.getSessionId() != null) {
            linkedHashMap.put(AbstractC37310GcC.A01(0, 10, 123), interfaceC109094vY.getSessionId());
        }
        if (interfaceC109094vY.getSubCategory() != null) {
            linkedHashMap.put("sub_category", interfaceC109094vY.getSubCategory());
        }
        if (interfaceC109094vY.getTitle() != null) {
            linkedHashMap.put(DialogModule.KEY_TITLE, interfaceC109094vY.getTitle());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
