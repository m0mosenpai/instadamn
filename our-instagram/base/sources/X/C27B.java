package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.27B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27B implements InterfaceC449925e {
    public C7DC A00;
    public final UserSession A01;

    public C27B(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        C7DI c7di;
        Long l;
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer num2;
        EnumC81843l3 enumC81843l3;
        if (this.A00 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                C7DC c7dc = this.A00;
                if (c7dc != null) {
                    c7di = c7dc.A02;
                } else {
                    c7di = null;
                }
                jSONObject2.put("direct_composer_mode", c7di);
                C7DC c7dc2 = this.A00;
                if (c7dc2 != null) {
                    l = Long.valueOf(c7dc2.A01);
                } else {
                    l = null;
                }
                jSONObject2.put("time_to_feature_limit", l);
                JSONObject jSONObject3 = new JSONObject();
                C7DC c7dc3 = this.A00;
                if (c7dc3 != null) {
                    C2EE c2ee = c7dc3.A03;
                    if (c2ee != null) {
                        num = Integer.valueOf(c2ee.C7g());
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    num = null;
                }
                jSONObject3.put("thread_subtype", num);
                C7DC c7dc4 = this.A00;
                if (c7dc4 != null) {
                    C2EE c2ee2 = c7dc4.A03;
                    if (c2ee2 != null) {
                        bool = Boolean.valueOf(c2ee2.CVQ());
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    bool = null;
                }
                jSONObject3.put("is_group", bool);
                C7DC c7dc5 = this.A00;
                if (c7dc5 != null) {
                    C2EE c2ee3 = c7dc5.A03;
                    if (c2ee3 != null) {
                        bool2 = Boolean.valueOf(c2ee3.CWj(this.A01));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    bool2 = null;
                }
                jSONObject3.put("is_instamadillo_ttlc", bool2);
                C7DC c7dc6 = this.A00;
                if (c7dc6 != null) {
                    C2EE c2ee4 = c7dc6.A03;
                    if (c2ee4 != null) {
                        bool3 = Boolean.valueOf(c2ee4.CWl());
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    bool3 = null;
                }
                jSONObject3.put("is_instamadillo_tlc", bool3);
                C7DC c7dc7 = this.A00;
                if (c7dc7 != null) {
                    C2EE c2ee5 = c7dc7.A03;
                    if (c2ee5 != null) {
                        num2 = Integer.valueOf(c2ee5.BT2());
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    num2 = null;
                }
                jSONObject3.put("recipient_connected_status", num2);
                C7DC c7dc8 = this.A00;
                if (c7dc8 != null) {
                    C2EE c2ee6 = c7dc8.A03;
                    if (c2ee6 != null) {
                        enumC81843l3 = c2ee6.Aiu();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    enumC81843l3 = null;
                }
                jSONObject3.put("business_thread_throttling_type", enumC81843l3);
                jSONObject.put("threadView_state", jSONObject3);
                jSONObject.put("composer_state", jSONObject2);
                return jSONObject.toString();
            } catch (JSONException e) {
                C0K8.A0F("DirectThreadViewBugReportLog", "Unable to create thread View Log log", e);
            } catch (Exception e2) {
                C0K8.A0F("DirectThreadViewBugReportLog", "Unable to create thread View Log log", e2);
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "DirectThreadViewBugReportLog";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_thread_view";
    }
}
