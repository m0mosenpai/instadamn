package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gdb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37395Gdb {
    public static Map A00(InterfaceC39571se interfaceC39571se) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC39571se.B1k() != null) {
            A1I.put("enable_user_engagement_base_insertion", interfaceC39571se.B1k());
        }
        if (interfaceC39571se.BQC() != null) {
            A1I.put("max_xout_prediction_threshold", interfaceC39571se.BQC());
        }
        if (interfaceC39571se.Bew() != null) {
            A1I.put("post_gap_to_previous_ad", interfaceC39571se.Bew());
        }
        if (interfaceC39571se.Bex() != null) {
            A1I.put("post_gap_to_previous_netego", interfaceC39571se.Bex());
        }
        if (interfaceC39571se.BfM() != null) {
            A1I.put("predicted_xout_rate", interfaceC39571se.BfM());
        }
        if (interfaceC39571se.BjF() != null) {
            A1I.put("push_up_min_gap", interfaceC39571se.BjF());
        }
        if (interfaceC39571se.C8M() != null) {
            A1I.put("time_based_insertion_gap_in_seconds", interfaceC39571se.C8M());
        }
        if (interfaceC39571se.CDr() != null) {
            List<InterfaceC43522JKi> CDr = interfaceC39571se.CDr();
            ArrayList arrayList = null;
            if (CDr != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43522JKi interfaceC43522JKi : CDr) {
                    if (interfaceC43522JKi != null) {
                        arrayList.add(interfaceC43522JKi.F7o());
                    }
                }
            }
            A1I.put("user_engagement_based_insertion_settings", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
