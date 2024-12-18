package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class LX6 implements InterfaceC449925e, InterfaceC13000lm {
    public final UserSession A00;
    public final Map A01;

    public LX6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC166987dD.A1I();
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        Object obj;
        Object obj2;
        String str;
        int i;
        String str2;
        String str3;
        C2DS A00 = C2JD.A00(this.A00);
        Iterator it = A00.Bkz().iterator();
        while (it.hasNext()) {
            DirectThreadKey directThreadKey = (DirectThreadKey) it.next();
            C81663kb B3U = A00.B3U(directThreadKey);
            if (B3U != null) {
                this.A01.put(B3U, A00.Bkx(directThreadKey, true));
            }
        }
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            JSONArray jSONArray = new JSONArray();
            Iterator A15 = AbstractC166997dE.A15(this.A01);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                C2EC c2ec = (C2EC) A1K.getKey();
                List list = (List) A1K.getValue();
                JSONObject A0q2 = AbstractC31171DnF.A0q();
                A0q2.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c2ec.C7I());
                A0q2.put(AbstractC111324zv.A00(1338), c2ec.C7l());
                A0q2.put("is_in_shh_mode", c2ec.CWO());
                C1118752z Ay9 = c2ec.Ay9();
                if (Ay9 != null) {
                    A0q2.put("is_in_dm_mode", Ay9.A08);
                    A0q2.put("last_set_timestamp_ms_for_dm", String.valueOf(Ay9.A05));
                }
                C133205zm BIW = c2ec.BIW();
                if (BIW != null) {
                    obj = BIW.A00;
                } else {
                    obj = null;
                }
                A0q2.put("cutover_timestamp", obj);
                C133205zm BIW2 = c2ec.BIW();
                if (BIW2 != null) {
                    obj2 = BIW2.A01;
                } else {
                    obj2 = null;
                }
                A0q2.put("undo_cutover_timestamp", obj2);
                JSONArray jSONArray2 = new JSONArray();
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C83403nh A0e = AbstractC43592JPx.A0e(it2);
                        JSONObject A0q3 = AbstractC31171DnF.A0q();
                        A0q3.put("offline_threading_id", A0e.A0g());
                        A0q3.put("message_id", A0e.A0h());
                        A0q3.put("timestamp", A0e.C8i());
                        String str4 = A0e.A1u;
                        C14360o3.A07(str4);
                        A0q3.put("sender_id", AbstractC166997dE.A0j(str4));
                        C2EY c2ey = A0e.A10;
                        if (c2ey != null) {
                            str = c2ey.A00;
                        } else {
                            str = null;
                        }
                        A0q3.put("direct_message_content_type", str);
                        if (A0e.A2P) {
                            i = 1;
                        } else {
                            i = 0;
                            if (A0e.A1K == null) {
                                i = 2;
                            }
                        }
                        A0q3.put("send_mode", i);
                        C45120Jxp c45120Jxp = A0e.A0D;
                        if (c45120Jxp != null) {
                            if (c45120Jxp.A05) {
                                str2 = "xplat reverb";
                            } else {
                                str2 = "eb server directly";
                            }
                            A0q3.put("is_restored_by_reverb_api", str2);
                            if (c45120Jxp.A04) {
                                str3 = "restored payload";
                            } else {
                                str3 = "realtime payload";
                            }
                            A0q3.put("is_from_eb_server", str3);
                        }
                        jSONArray2.put(A0q3);
                    }
                }
                A0q2.put("messages_in_the_thread", jSONArray2);
                jSONArray.put(A0q2);
                A0q.put("thread_records_in_inbox", jSONArray);
            }
            return A0q.toString();
        } catch (JSONException e) {
            C0K8.A0F("ArmadilloExpressUiCacheReportLogCollectorV2", "Unable to create log due to JSONException", e);
            return AbstractC167017dG.A0n(e, "Unable to create log due to JSONException: ", AbstractC166987dD.A1C());
        }
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_instamadillo_ui_cache_report";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "ArmadilloExpressUiCacheReportLogCollectorV2";
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }
}
