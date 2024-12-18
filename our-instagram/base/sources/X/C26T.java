package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.26T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26T implements InterfaceC449925e {
    public List A00 = new ArrayList();

    public final void A00(String str) {
        List list = this.A00;
        if (!C14360o3.A0K(AbstractC001800i.A0J(list), str)) {
            list.add(0, str);
            if (list.size() > 3) {
                AnonymousClass016.A15(list);
            }
        }
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reels_viewer_last_seen_media", AbstractC001800i.A0P(", ", "", "", this.A00, null));
        } catch (JSONException e) {
            C0K8.A0F("ClipsViewerLogCollector", "Unable to create log", e);
        }
        return jSONObject.toString();
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "ClipsViewerLogCollector";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "reels_viewer_last_seen_media";
    }
}
