package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.TxD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65961TxD {
    public static Map A00(InterfaceC223716s interfaceC223716s) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC223716s.AvU() != null) {
            linkedHashMap.put("daily_time_limit_without_extensions_seconds", interfaceC223716s.AvU());
        }
        if (interfaceC223716s.B5G() != null) {
            linkedHashMap.put("fc_url", interfaceC223716s.B5G());
        }
        if (interfaceC223716s.BBp() != null) {
            linkedHashMap.put("has_guardian", interfaceC223716s.BBp());
        }
        if (interfaceC223716s.BCi() != null) {
            linkedHashMap.put("has_stated_age", interfaceC223716s.BCi());
        }
        if (interfaceC223716s.CQe() != null) {
            linkedHashMap.put("is_blocked_list_enabled", interfaceC223716s.CQe());
        }
        if (interfaceC223716s.CSI() != null) {
            linkedHashMap.put("is_daily_limit_non_blocking", interfaceC223716s.CSI());
        }
        if (interfaceC223716s.CTX() != null) {
            linkedHashMap.put("is_eligible_for_supervision", interfaceC223716s.CTX());
        }
        if (interfaceC223716s.CVf() != null) {
            linkedHashMap.put("is_guardian_of_viewer", interfaceC223716s.CVf());
        }
        if (interfaceC223716s.CVg() != null) {
            linkedHashMap.put("is_guardian_user", interfaceC223716s.CVg());
        }
        if (interfaceC223716s.CYu() != null) {
            linkedHashMap.put("is_modify_privacy_settings_enabled", interfaceC223716s.CYu());
        }
        if (interfaceC223716s.CbT() != null) {
            linkedHashMap.put("is_quiet_time_feature_enabled", interfaceC223716s.CbT());
        }
        if (interfaceC223716s.CbU() != null) {
            linkedHashMap.put("is_quiet_time_non_blocking", interfaceC223716s.CbU());
        }
        if (interfaceC223716s.Cdz() != null) {
            linkedHashMap.put("is_supervised_by_viewer", interfaceC223716s.Cdz());
        }
        if (interfaceC223716s.Ce0() != null) {
            linkedHashMap.put("is_supervised_or_in_cooldown", interfaceC223716s.Ce0());
        }
        if (interfaceC223716s.Ce1() != null) {
            linkedHashMap.put("is_supervised_user", interfaceC223716s.Ce1());
        }
        ArrayList arrayList = null;
        if (interfaceC223716s.BMG() != null) {
            C5F2 BMG = interfaceC223716s.BMG();
            if (BMG != null) {
                treeUpdaterJNI = BMG.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("latest_valid_time_limit_extension_request", treeUpdaterJNI);
        }
        if (interfaceC223716s.Bjn() != null) {
            List<XG6> Bjn = interfaceC223716s.Bjn();
            if (Bjn != null) {
                arrayList = new ArrayList();
                for (XG6 xg6 : Bjn) {
                    if (xg6 != null) {
                        arrayList.add(xg6.F7o());
                    }
                }
            }
            linkedHashMap.put("quiet_time_intervals", arrayList);
        }
        if (interfaceC223716s.Bqn() != null) {
            linkedHashMap.put("screen_time_daily_limit_description", interfaceC223716s.Bqn());
        }
        if (interfaceC223716s.Bqo() != null) {
            linkedHashMap.put("screen_time_daily_limit_seconds", interfaceC223716s.Bqo());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
