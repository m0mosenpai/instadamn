package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class HvM {
    public static Map A00(InterfaceC43567JMb interfaceC43567JMb) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43567JMb.B1Y() != null) {
            A1I.put("enable_indexing", interfaceC43567JMb.B1Y());
        }
        if (interfaceC43567JMb.B1b() != null) {
            A1I.put("enable_navigation", interfaceC43567JMb.B1b());
        }
        ArrayList arrayList = null;
        if (interfaceC43567JMb.B3u() != null) {
            JMZ B3u = interfaceC43567JMb.B3u();
            if (B3u != null) {
                treeUpdaterJNI = B3u.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("extra_question", treeUpdaterJNI);
        }
        if (interfaceC43567JMb.BCl() != null) {
            A1I.put("has_submit", interfaceC43567JMb.BCl());
        }
        if (interfaceC43567JMb.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC43567JMb.getId(), A1I);
        }
        if (interfaceC43567JMb.BOW() != null) {
            A1I.put("log_on_each_answer", interfaceC43567JMb.BOW());
        }
        if (interfaceC43567JMb.BUl() != null) {
            A1I.put("module_type", interfaceC43567JMb.BUl());
        }
        if (interfaceC43567JMb.Bjh() != null) {
            List<JMZ> Bjh = interfaceC43567JMb.Bjh();
            if (Bjh != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JMZ jmz : Bjh) {
                    if (jmz != null) {
                        arrayList.add(jmz.F7o());
                    }
                }
            }
            A1I.put("questions", arrayList);
        }
        if (interfaceC43567JMb.CCk() != null) {
            A1I.put("unlock_question", interfaceC43567JMb.CCk());
        }
        if (interfaceC43567JMb.CEt() != null) {
            A1I.put("vertical_padding", interfaceC43567JMb.CEt());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
