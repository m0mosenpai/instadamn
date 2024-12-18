package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.26f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C452226f implements InterfaceC449925e, InterfaceC13000lm {
    public C83403nh A00;
    public final Map A01 = new ConcurrentHashMap();

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = null;
        this.A01.clear();
    }

    public static final void A00(C114675Fx c114675Fx, JSONObject jSONObject) {
        jSONObject.put("send_error", c114675Fx.A03);
        String str = c114675Fx.A04;
        if (str != null) {
            jSONObject.put("error_message", str);
        }
        String str2 = c114675Fx.A06;
        if (str2 == null) {
            str2 = "0";
        }
        jSONObject.put(TraceFieldType.ErrorCode, str2);
        jSONObject.put(TraceFieldType.ErrorDomain, c114675Fx.A01);
        jSONObject.put("send_channel", c114675Fx.A05);
        jSONObject.put("client_facing_error_message", c114675Fx.A02);
        jSONObject.put("is_epd_error", c114675Fx.A0B);
        jSONObject.put("can_see_notes", c114675Fx.A0A);
        jSONObject.put("can_see_broadcast_chats", c114675Fx.A09);
        jSONObject.put("auto_retry_eligible", c114675Fx.A0C);
        jSONObject.put("manual_retry_eligible", c114675Fx.A0D);
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        C7Q5 c7q5;
        C7Q4 c7q4;
        C114675Fx c114675Fx;
        Object obj12;
        if (this.A00 == null && this.A01.isEmpty()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            C83403nh c83403nh = this.A00;
            if (c83403nh != null) {
                obj = c83403nh.A0g();
            } else {
                obj = null;
            }
            jSONObject.put("client_context", obj);
            C83403nh c83403nh2 = this.A00;
            if (c83403nh2 != null) {
                obj2 = c83403nh2.A10;
            } else {
                obj2 = null;
            }
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj2);
            C83403nh c83403nh3 = this.A00;
            if (c83403nh3 != null && (obj12 = c83403nh3.A1f) != null) {
                jSONObject.put("local_send_mutation_id", obj12);
            }
            C83403nh c83403nh4 = this.A00;
            if (c83403nh4 != null && (c114675Fx = c83403nh4.A0r) != null) {
                A00(c114675Fx, jSONObject);
            }
            Map map = this.A01;
            boolean z = true;
            if (!map.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (C1OW c1ow : map.keySet()) {
                    JSONObject jSONObject2 = new JSONObject();
                    C114675Fx c114675Fx2 = (C114675Fx) map.get(c1ow);
                    jSONObject2.put("mutation_id", c1ow.A05);
                    jSONObject2.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c1ow.A02());
                    if (c114675Fx2 != null) {
                        A00(c114675Fx2, jSONObject2);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("mutation_errors", jSONArray);
            }
            C83403nh c83403nh5 = this.A00;
            if (c83403nh5 != null) {
                obj3 = c83403nh5.A1K;
            } else {
                obj3 = null;
            }
            jSONObject.put("disappearing_message_lifetime_ms", obj3);
            C83403nh c83403nh6 = this.A00;
            if (c83403nh6 != null) {
                obj4 = Boolean.valueOf(c83403nh6.A1T());
            } else {
                obj4 = null;
            }
            jSONObject.put("id_disappearing_message_mode", obj4);
            C83403nh c83403nh7 = this.A00;
            if (c83403nh7 != null) {
                obj5 = Boolean.valueOf(c83403nh7.A1S());
            } else {
                obj5 = null;
            }
            jSONObject.put("is_armadillo_express", obj5);
            C83403nh c83403nh8 = this.A00;
            if (c83403nh8 != null) {
                obj6 = c83403nh8.A0z;
            } else {
                obj6 = null;
            }
            jSONObject.put("message_content_type", obj6);
            C83403nh c83403nh9 = this.A00;
            if (c83403nh9 != null) {
                obj7 = Boolean.valueOf(c83403nh9.A2N);
            } else {
                obj7 = null;
            }
            jSONObject.put("is_sent_by_viewer", obj7);
            C83403nh c83403nh10 = this.A00;
            if (c83403nh10 != null) {
                obj8 = Boolean.valueOf(c83403nh10.A2P);
            } else {
                obj8 = null;
            }
            jSONObject.put("is_vanish_mode", obj8);
            C83403nh c83403nh11 = this.A00;
            if (c83403nh11 != null) {
                obj9 = Long.valueOf(c83403nh11.C8i());
            } else {
                obj9 = null;
            }
            jSONObject.put("message_timestamp", obj9);
            C83403nh c83403nh12 = this.A00;
            if (c83403nh12 != null) {
                obj10 = c83403nh12.A0k();
            } else {
                obj10 = null;
            }
            jSONObject.put("view_mode", obj10);
            C83403nh c83403nh13 = this.A00;
            if (c83403nh13 != null) {
                obj11 = c83403nh13.A0h();
            } else {
                obj11 = null;
            }
            jSONObject.put("message_id", obj11);
            C83403nh c83403nh14 = this.A00;
            if (c83403nh14 != null) {
                c7q5 = c83403nh14.A0w;
            } else {
                c7q5 = null;
            }
            if (c7q5 == null) {
                if (c83403nh14 != null) {
                    c7q4 = c83403nh14.A0v;
                } else {
                    c7q4 = null;
                }
                if (c7q4 == null) {
                    z = false;
                }
            }
            jSONObject.put("has_pending_media", z);
            str = jSONObject.toString();
        } catch (JSONException e) {
            C0K8.A0F("DirectSendFailureBugReportLog", "Unable to create log", e);
            str = null;
        }
        this.A00 = null;
        this.A01.clear();
        return str;
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "DirectSendFailureBugReportLog";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_send_failure";
    }
}
