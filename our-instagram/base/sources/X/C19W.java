package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.mobileconfig.MobileConfigCxxLogger;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.19W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19W implements MobileConfigCxxLogger {
    public final C18920wW A00;

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public final void logCounter(String str, int i) {
        C14360o3.A0B(str, 0);
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public final void logEvent(String str, final Map map) {
        InterfaceC02590Ai A00;
        Map map2;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        if ("mobile_config_exposure_log".equals(str)) {
            C18920wW c18920wW = this.A00;
            A00 = c18920wW.A00(c18920wW.A00, "ig_launcher_config_exposure");
            String str2 = (String) map.get("unit_id");
            Object obj = map.get("logging_id");
            String str3 = (String) map.get("extra_ids");
            String str4 = (String) map.get("stable_spec");
            if (A00.isSampled()) {
                if (str2 == null) {
                    str2 = "";
                }
                A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                if (str4 == null) {
                    str4 = "";
                }
                A00.AAP("config_name", str4);
                if (obj == null) {
                    obj = "";
                }
                List singletonList = Collections.singletonList(obj);
                C14360o3.A07(singletonList);
                A00.AAk("logging_id", singletonList);
                if (str3 == null) {
                    str3 = "";
                }
                A00.AAP("extra_ids", str3);
            } else {
                return;
            }
        } else {
            if ("mobile_config_error".equals(str)) {
                C18920wW c18920wW2 = this.A00;
                A00 = c18920wW2.A00(c18920wW2.A00, "mobile_config_general_cases");
                if (!A00.isSampled()) {
                    return;
                }
                A00.AAP("mc_event_name", "mobile_config_error");
                map2 = new C25015B4p(map);
            } else if ("mobile_config_sync_request_complete".equals(str)) {
                C18920wW c18920wW3 = this.A00;
                A00 = c18920wW3.A00(c18920wW3.A00, "mobile_config_general_cases");
                if (!A00.isSampled()) {
                    return;
                }
                A00.AAP("mc_event_name", "mobile_config_sync_request_complete");
                map2 = new HashMap<String, String>(map) { // from class: X.5kt
                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ boolean containsKey(Object obj2) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return false;
                        }
                        return super.containsKey(obj2);
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ boolean containsValue(Object obj2) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return false;
                        }
                        return super.containsValue(obj2);
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ /* synthetic */ Object get(Object obj2) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return null;
                        }
                        return super.get(obj2);
                    }

                    @Override // java.util.HashMap, java.util.Map
                    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj2, Object obj3) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return obj3;
                        }
                        return super.getOrDefault(obj2, obj3);
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ /* synthetic */ Object remove(Object obj2) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return null;
                        }
                        return super.remove(obj2);
                    }

                    {
                        put("sync_fetch_success", map.get("sync_fetch_success"));
                        put("sync_fetch_reason", map.get("sync_fetch_reason"));
                        put("sync_fetch_failure_reason", map.get("sync_fetch_failure_reason"));
                        put("time_elapsed", map.get("time_elapsed"));
                        put("prepare_request_latency", map.get("prepare_request_latency"));
                        put("network_latency", map.get("network_latency"));
                        put("handle_response_latency", map.get("handle_response_latency"));
                        put("response_size", map.get("response_size"));
                        put("extend_bln_schema", map.get("extend_bln_schema"));
                        put("manager_name", map.get("manager_name"));
                        put("is_sessionless", map.get("is_sessionless"));
                        put("using_partial_fetch", map.get("using_partial_fetch"));
                        put("extra_data", map.get("extra_data"));
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ java.util.Set entrySet() {
                        return super.entrySet();
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ java.util.Set keySet() {
                        return super.keySet();
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ int size() {
                        return super.size();
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ Collection values() {
                        return super.values();
                    }

                    @Override // java.util.HashMap, java.util.Map
                    public final /* bridge */ boolean remove(Object obj2, Object obj3) {
                        boolean z;
                        if (obj2 == null) {
                            z = true;
                        } else {
                            z = obj2 instanceof String;
                        }
                        if (!z || (obj3 != null && !(obj3 instanceof String))) {
                            return false;
                        }
                        return super.remove(obj2, obj3);
                    }
                };
            } else {
                if (!"mobile_config_param_access_without_exposure".equals(str)) {
                    return;
                }
                C18920wW c18920wW4 = this.A00;
                A00 = c18920wW4.A00(c18920wW4.A00, "mobile_config_general_cases");
                if (!A00.isSampled()) {
                    return;
                }
                A00.AAP("mc_event_name", "mobile_config_param_access_without_exposure");
                map2 = new HashMap<String, String>(map) { // from class: X.1AQ
                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ boolean containsKey(Object obj2) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return false;
                        }
                        return super.containsKey(obj2);
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ boolean containsValue(Object obj2) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return false;
                        }
                        return super.containsValue(obj2);
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ /* synthetic */ Object get(Object obj2) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return null;
                        }
                        return super.get(obj2);
                    }

                    @Override // java.util.HashMap, java.util.Map
                    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj2, Object obj3) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return obj3;
                        }
                        return super.getOrDefault(obj2, obj3);
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ /* synthetic */ Object remove(Object obj2) {
                        if (obj2 != null && !(obj2 instanceof String)) {
                            return null;
                        }
                        return super.remove(obj2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        String str5 = map.get("logging_id");
                        put("logging_id", str5 == null ? "" : str5);
                        String str6 = map.get("unit_id");
                        put("unit_id", str6 == null ? "" : str6);
                        Object obj2 = map.get("unit_type");
                        put("unit_type", obj2 != 0 ? obj2 : "");
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ java.util.Set entrySet() {
                        return super.entrySet();
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ java.util.Set keySet() {
                        return super.keySet();
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ int size() {
                        return super.size();
                    }

                    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                    public final /* bridge */ Collection values() {
                        return super.values();
                    }

                    @Override // java.util.HashMap, java.util.Map
                    public final /* bridge */ boolean remove(Object obj2, Object obj3) {
                        boolean z;
                        if (obj2 == null) {
                            z = true;
                        } else {
                            z = obj2 instanceof String;
                        }
                        if (!z || (obj3 != null && !(obj3 instanceof String))) {
                            return false;
                        }
                        return super.remove(obj2, obj3);
                    }
                };
            }
            A00.A9M("str_data", map2);
        }
        A00.Cht();
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxLogger
    public final void logEventImmediately(String str, Map map) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        logEvent(str, map);
    }

    public C19W(AbstractC12990ll abstractC12990ll) {
        this.A00 = AbstractC12220kQ.A02(abstractC12990ll);
    }
}
