package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.26N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26N implements InterfaceC449925e {
    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "appearance_theme_state";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "ThemeStateLogCollector";
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (AbstractC72723Nt.A00(context)) {
                str = "dark";
            } else {
                str = "light";
            }
            jSONObject.put("system_theme", str);
            jSONObject.put("in_app_theme", AbstractC19730y1.A00(AbstractC12960li.A00).A00());
        } catch (JSONException e) {
            C0K8.A0F("ThemeStateLogCollector", "Unable to create log", e);
        }
        return jSONObject.toString();
    }
}
