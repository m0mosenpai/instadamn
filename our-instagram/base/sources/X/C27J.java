package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.27J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27J implements InterfaceC449925e, InterfaceC13000lm {
    public final UserSession A00;

    public C27J(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        C14360o3.A0B(context, 0);
        UserSession userSession = this.A00;
        C27F A00 = C27D.A00(userSession);
        C2DS A002 = C2JD.A00(userSession);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            List<C2ED> list = A00.A07;
            if (list != null) {
                for (C2ED c2ed : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    ArrayList Ab7 = A002.Ab7(c2ed.BKb(), true);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = Ab7.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        boolean z = false;
                        if (((C83403nh) next).A10 == C2EY.A0n) {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        jSONObject2.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c2ed.BKb().A00);
                        jSONObject2.put("message_ids", AbstractC001800i.A0P(", ", "", "", arrayList, C50300MJe.A00));
                        jSONObject2.put("message_timestamps", AbstractC001800i.A0P(", ", "", "", arrayList, C50301MJf.A00));
                        jSONObject2.put("message_error_messages", AbstractC001800i.A0P(", ", "", "", arrayList, C50302MJg.A00));
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("Cache_layer_missing_messages", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            C0K8.A0F("ArmadilloExpressPlaceholdersReportLogCollector", "Unable to create log due to JSONException", e);
            return null;
        }
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "ArmadilloExpressPlaceholdersReportLogCollector";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_armadillo_express_placeholders";
    }
}
