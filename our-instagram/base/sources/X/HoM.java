package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HoM {
    public static Map A00(InterfaceC104914o3 interfaceC104914o3) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI4 = null;
        if (interfaceC104914o3.B6f() != null) {
            InterfaceC108024tl B6f = interfaceC104914o3.B6f();
            if (B6f != null) {
                treeUpdaterJNI3 = B6f.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("first_question_data", treeUpdaterJNI3);
        }
        if (interfaceC104914o3.BMn() != null) {
            InterfaceC115285Iz BMn = interfaceC104914o3.BMn();
            if (BMn != null) {
                treeUpdaterJNI2 = BMn.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("lead_gen_incentive_data", treeUpdaterJNI2);
        }
        if (interfaceC104914o3.BeF() != null) {
            C5L5 BeF = interfaceC104914o3.BeF();
            if (BeF != null) {
                treeUpdaterJNI = BeF.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(5063), treeUpdaterJNI);
        }
        if (interfaceC104914o3.CB8() != null) {
            IGLeadGenSubheaderTrustSignalDataDict CB8 = interfaceC104914o3.CB8();
            if (CB8 != null) {
                treeUpdaterJNI4 = CB8.F7o();
            }
            A1I.put("trust_signal_data", treeUpdaterJNI4);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
