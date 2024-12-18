package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VP8 {
    public static InterfaceC223716s A00(InterfaceC223716s interfaceC223716s, C5F2 c5f2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Integer num, Integer num2, String str, String str2, List list) {
        Object c223616r;
        if (interfaceC223716s instanceof C68068V8y) {
            C09530e4 c09530e4 = new C09530e4("daily_time_limit_without_extensions_seconds", num);
            C09530e4 c09530e42 = new C09530e4("fc_url", str);
            C09530e4 c09530e43 = new C09530e4("has_guardian", bool);
            C09530e4 c09530e44 = new C09530e4("has_stated_age", bool2);
            C09530e4 c09530e45 = new C09530e4("is_blocked_list_enabled", bool3);
            C09530e4 c09530e46 = new C09530e4("is_daily_limit_non_blocking", bool4);
            C09530e4 c09530e47 = new C09530e4("is_eligible_for_supervision", bool5);
            C09530e4 c09530e48 = new C09530e4("is_guardian_of_viewer", bool6);
            C09530e4 c09530e49 = new C09530e4("is_guardian_user", bool7);
            C09530e4 c09530e410 = new C09530e4("is_modify_privacy_settings_enabled", bool8);
            C09530e4 c09530e411 = new C09530e4("is_quiet_time_feature_enabled", bool9);
            C09530e4 c09530e412 = new C09530e4("is_quiet_time_non_blocking", bool10);
            C09530e4 c09530e413 = new C09530e4("is_supervised_by_viewer", bool11);
            C09530e4 c09530e414 = new C09530e4("is_supervised_or_in_cooldown", bool12);
            C09530e4 c09530e415 = new C09530e4("is_supervised_user", bool13);
            ArrayList arrayList = null;
            C09530e4 c09530e416 = new C09530e4("latest_valid_time_limit_extension_request", c5f2 != null ? c5f2.F7o() : null);
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    XG6 xg6 = (XG6) it.next();
                    if (xg6 != null) {
                        arrayList.add(xg6.F7o());
                    }
                }
            }
            c223616r = AbstractC37303Gc4.A06(interfaceC223716s, new C09530e4[]{c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, c09530e49, c09530e410, c09530e411, c09530e412, c09530e413, c09530e414, c09530e415, c09530e416, new C09530e4("quiet_time_intervals", arrayList), new C09530e4("screen_time_daily_limit_description", str2), new C09530e4("screen_time_daily_limit_seconds", num2)});
        } else {
            ArrayList arrayList2 = null;
            E8G F3N = c5f2 != null ? c5f2.F3N() : null;
            if (list != null) {
                arrayList2 = AbstractC167017dG.A0q(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((XG6) it2.next()).Eyv());
                }
            }
            c223616r = new C223616r(F3N, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, num, num2, str, str2, arrayList2);
        }
        return (InterfaceC223716s) c223616r;
    }
}
