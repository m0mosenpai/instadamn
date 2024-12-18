package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I2V {
    public static Map A00(InterfaceC38551qj interfaceC38551qj) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38551qj.AZE() != null) {
            A1I.put("ad_id", interfaceC38551qj.AZE());
        }
        if (interfaceC38551qj.CSW() != null) {
            A1I.put("is_demo", interfaceC38551qj.CSW());
        }
        ArrayList arrayList = null;
        if (interfaceC38551qj.BMt() != null) {
            JLF BMt = interfaceC38551qj.BMt();
            if (BMt != null) {
                treeUpdaterJNI = BMt.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("learn_more", treeUpdaterJNI);
        }
        if (interfaceC38551qj.BgS() != null) {
            A1I.put("primer_message", interfaceC38551qj.BgS());
        }
        if (interfaceC38551qj.Bjh() != null) {
            List<InterfaceC43565JLz> Bjh = interfaceC38551qj.Bjh();
            if (Bjh != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43565JLz interfaceC43565JLz : Bjh) {
                    if (interfaceC43565JLz != null) {
                        arrayList.add(interfaceC43565JLz.F7o());
                    }
                }
            }
            A1I.put("questions", arrayList);
        }
        if (interfaceC38551qj.Bwi() != null) {
            A1I.put("show_primer", interfaceC38551qj.Bwi());
        }
        if (interfaceC38551qj.Bwo() != null) {
            A1I.put("show_results", interfaceC38551qj.Bwo());
        }
        if (interfaceC38551qj.C4U() != null) {
            A1I.put("survey_id", interfaceC38551qj.C4U());
        }
        if (interfaceC38551qj.C4V() != null) {
            A1I.put("survey_type", interfaceC38551qj.C4V());
        }
        if (interfaceC38551qj.CAR() != null) {
            A1I.put("tracking_token", interfaceC38551qj.CAR());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
