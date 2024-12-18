package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GdV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37389GdV {
    public static Map A00(InterfaceC39421sN interfaceC39421sN) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI3;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI4;
        TreeUpdaterJNI treeUpdaterJNI5;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI6 = null;
        if (interfaceC39421sN.AjI() != null) {
            C5FV AjI = interfaceC39421sN.AjI();
            if (AjI != null) {
                treeUpdaterJNI5 = AjI.F7o();
            } else {
                treeUpdaterJNI5 = null;
            }
            A1I.put("buyWithIntegrationIABPostClickDataExtension", treeUpdaterJNI5);
        }
        if (interfaceC39421sN.AjN() != null) {
            C5FW AjN = interfaceC39421sN.AjN();
            if (AjN != null) {
                treeUpdaterJNI4 = AjN.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put("buyWithPrimeIABPostClickDataExtension", treeUpdaterJNI4);
        }
        if (interfaceC39421sN.B15() != null) {
            List<IGPostClickEligibleExperienceTypes> B15 = interfaceC39421sN.B15();
            if (B15 != null) {
                arrayList2 = AbstractC167017dG.A0q(B15);
                for (IGPostClickEligibleExperienceTypes iGPostClickEligibleExperienceTypes : B15) {
                    C14360o3.A0B(iGPostClickEligibleExperienceTypes, 0);
                    arrayList2.add(iGPostClickEligibleExperienceTypes.A00);
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("eligibleExperienceTypes", arrayList2);
        }
        if (interfaceC39421sN.BEX() != null) {
            C5FX BEX = interfaceC39421sN.BEX();
            if (BEX != null) {
                treeUpdaterJNI3 = BEX.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("iabAutofillAdsPersonalizationPostClickDataExtension", treeUpdaterJNI3);
        }
        if (interfaceC39421sN.BEb() != null) {
            List<InterfaceC43534JKu> BEb = interfaceC39421sN.BEb();
            if (BEb != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43534JKu interfaceC43534JKu : BEb) {
                    if (interfaceC43534JKu != null) {
                        arrayList.add(interfaceC43534JKu.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("iabPostClickDisclaimers", arrayList);
        }
        if (interfaceC39421sN.BHC() != null) {
            A1I.put("impressionTime", interfaceC39421sN.BHC());
        }
        if (interfaceC39421sN.BTG() != null) {
            C5FY BTG = interfaceC39421sN.BTG();
            if (BTG != null) {
                treeUpdaterJNI2 = BTG.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("metaCheckoutIABPostClickDataExtension", treeUpdaterJNI2);
        }
        if (interfaceC39421sN.BTK() != null) {
            C5FZ BTK = interfaceC39421sN.BTK();
            if (BTK != null) {
                treeUpdaterJNI = BTK.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("metaPaymentsSDKIABPostClickDataExtension", treeUpdaterJNI);
        }
        if (interfaceC39421sN.BiV() != null) {
            AnonymousClass536 BiV = interfaceC39421sN.BiV();
            if (BiV != null) {
                treeUpdaterJNI6 = BiV.F7o();
            }
            A1I.put("promoAdsAutofillPostClickDataExtension", treeUpdaterJNI6);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
