package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I9U {
    public static Map A00(InterfaceC38021pm interfaceC38021pm) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38021pm.AmV() != null) {
            A1I.put("carry_over_highest_position_rule", interfaceC38021pm.AmV());
        }
        if (interfaceC38021pm.AqU() != null) {
            A1I.put("consumed_media_gap_to_previous_ad", interfaceC38021pm.AqU());
        }
        if (interfaceC38021pm.AqV() != null) {
            A1I.put("consumed_media_gap_to_previous_netego", interfaceC38021pm.AqV());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC38021pm.Ayp() != null) {
            List<JK6> Ayp = interfaceC38021pm.Ayp();
            if (Ayp != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JK6 jk6 : Ayp) {
                    if (jk6 != null) {
                        arrayList.add(jk6.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("dnf", arrayList);
        }
        if (interfaceC38021pm.BDy() != null) {
            A1I.put("highest_ad_position_rule_value", interfaceC38021pm.BDy());
        }
        if (interfaceC38021pm.BDz() != null) {
            A1I.put(AbstractC111324zv.A00(4571), interfaceC38021pm.BDz());
        }
        if (interfaceC38021pm.CY6() != null) {
            A1I.put("is_media_based_hp_enabled", interfaceC38021pm.CY6());
        }
        if (interfaceC38021pm.BQ0() != null) {
            A1I.put(AbstractC111324zv.A00(4869), interfaceC38021pm.BQ0());
        }
        if (interfaceC38021pm.BTp() != null) {
            A1I.put("min_container_gap_to_previous_ad", interfaceC38021pm.BTp());
        }
        if (interfaceC38021pm.BTq() != null) {
            A1I.put("min_container_gap_to_previous_overlay_ad", interfaceC38021pm.BTq());
        }
        if (interfaceC38021pm.BTt() != null) {
            A1I.put(AbstractC111324zv.A00(4928), interfaceC38021pm.BTt());
        }
        if (interfaceC38021pm.BeS() != null) {
            A1I.put("pool_refresh_ttl_in_sec", interfaceC38021pm.BeS());
        }
        if (interfaceC38021pm.BjE() != null) {
            InterfaceC39571se BjE = interfaceC38021pm.BjE();
            if (BjE != null) {
                treeUpdaterJNI = BjE.F7o();
            }
            A1I.put("push_up_client_gap_rules", treeUpdaterJNI);
        }
        if (interfaceC38021pm.BlU() != null) {
            A1I.put("reel_gap_to_previous_ad", interfaceC38021pm.BlU());
        }
        if (interfaceC38021pm.BlV() != null) {
            A1I.put("reel_gap_to_previous_netego", interfaceC38021pm.BlV());
        }
        if (interfaceC38021pm.Bsy() != null) {
            A1I.put("self_pog_chaining_highest_position_rule", interfaceC38021pm.Bsy());
        }
        if (interfaceC38021pm.C5S() != null) {
            A1I.put("target_insertion_position", interfaceC38021pm.C5S());
        }
        if (interfaceC38021pm.C8P() != null) {
            A1I.put(AbstractC111324zv.A00(5495), AbstractC166997dE.A0f(interfaceC38021pm.C8P()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
