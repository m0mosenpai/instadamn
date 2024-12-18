package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.27F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27F implements InterfaceC449925e {
    public ViewModelListUpdate A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public List A07;
    public final UserSession A08;

    public C27F(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A08 = userSession;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        List list;
        String str;
        String str2;
        String str3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Long l;
        C14360o3.A0B(context, 0);
        InterfaceC16660sJ interfaceC16660sJ = null;
        interfaceC16660sJ = null;
        if (this.A00 == null && this.A07 == null && this.A06 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("inbox_mode", this.A02);
            jSONObject.put("selected_folder", this.A04);
            jSONObject.put("selected_folder_cursor", this.A05);
            jSONObject.put("selected_filter", this.A03);
            jSONObject.put("force_show_empty_state", this.A01);
            UserSession userSession = this.A08;
            jSONObject.put("account_disable_read_receipt", AbstractC31237DoK.A00(userSession).A02.getValue());
            List<C2EC> list2 = this.A07;
            if (list2 != null) {
                for (C2EC c2ec : list2) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("thread_title", c2ec.C7l());
                    jSONObject2.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c2ec.BKb().A00);
                    List list3 = c2ec.BKb().A02;
                    if (list3 != null) {
                        obj = AbstractC001800i.A0P(", ", "", "", list3, interfaceC16660sJ);
                    } else {
                        obj = interfaceC16660sJ;
                    }
                    jSONObject2.put("recipient_ids", obj);
                    jSONObject2.put("model_id", c2ec.BKb().A01());
                    jSONObject2.put("hashcode", c2ec.BKb().hashCode());
                    jSONObject2.put("timestamp", String.valueOf(c2ec.BLF()));
                    C81613kW Aic = c2ec.Aic();
                    if (Aic != null) {
                        obj2 = Integer.valueOf(Aic.A04.A01);
                    } else {
                        obj2 = interfaceC16660sJ;
                    }
                    jSONObject2.put("btv_eligibility_bits_text", obj2);
                    C81613kW Aic2 = c2ec.Aic();
                    if (Aic2 != null) {
                        obj3 = Integer.valueOf(Aic2.A04.A00);
                    } else {
                        obj3 = interfaceC16660sJ;
                    }
                    jSONObject2.put("btv_eligibility_bits_instamadillo_cutover", obj3);
                    C81613kW Aic3 = c2ec.Aic();
                    if (Aic3 != null) {
                        obj4 = Integer.valueOf(Aic3.A01);
                    } else {
                        obj4 = interfaceC16660sJ;
                    }
                    jSONObject2.put("btv_instamadillo_cutover_flag_v2", obj4);
                    C81613kW Aic4 = c2ec.Aic();
                    if (Aic4 != null) {
                        obj5 = Long.valueOf(Aic4.A03);
                    } else {
                        obj5 = interfaceC16660sJ;
                    }
                    jSONObject2.put("btv_ttlc_flag", obj5);
                    C81613kW Aic5 = c2ec.Aic();
                    Object obj6 = interfaceC16660sJ;
                    if (Aic5 != null) {
                        obj6 = Long.valueOf(Aic5.A00(userSession));
                    }
                    jSONObject2.put("client_updated_ttlc_flag", obj6);
                    jSONObject2.put("vanish_mode_active_state", c2ec.CWO());
                    jSONObject2.put("disappearing_messages_active_state", c2ec.Ay8());
                    C1118752z Ay9 = c2ec.Ay9();
                    if (Ay9 != null) {
                        l = Ay9.A04;
                    } else {
                        l = null;
                    }
                    jSONObject2.put("disappearing_messages_e2ee_attribution_timestamp_ms", l);
                    jSONObject2.put("disable_read_receipts", c2ec.Bkp());
                    jSONArray.put(jSONObject2);
                    interfaceC16660sJ = null;
                }
            }
            jSONObject.put("thread_keys_in_system_folder_cache", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            List<C2EC> list4 = this.A06;
            if (list4 != null) {
                for (C2EC c2ec2 : list4) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("thread_title", c2ec2.C7l());
                    jSONObject3.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c2ec2.BKb().A00);
                    List list5 = c2ec2.BKb().A02;
                    if (list5 != null) {
                        str3 = AbstractC001800i.A0P(", ", "", "", list5, interfaceC16660sJ);
                    } else {
                        str3 = null;
                    }
                    jSONObject3.put("recipient_ids", str3);
                    jSONObject3.put("model_id", c2ec2.BKb().A01());
                    jSONObject3.put("hashcode", c2ec2.BKb().hashCode());
                    jSONObject3.put("timestamp", String.valueOf(c2ec2.BLF()));
                    jSONArray2.put(jSONObject3);
                }
            }
            jSONObject.put("thread_keys_filtered_in_selected_folder", jSONArray2);
            JSONArray jSONArray3 = new JSONArray();
            ViewModelListUpdate viewModelListUpdate = this.A00;
            if (viewModelListUpdate != null) {
                list = AbstractC001800i.A0a(viewModelListUpdate.A00);
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList<JRL> arrayList = new ArrayList();
                for (Object obj7 : list) {
                    if (obj7 instanceof JRL) {
                        arrayList.add(obj7);
                    }
                }
                for (JRL jrl : arrayList) {
                    JSONObject jSONObject4 = new JSONObject();
                    AbstractC46441Kh1 abstractC46441Kh1 = jrl.A0D.A01;
                    if (abstractC46441Kh1 instanceof C43652JSk) {
                        C14360o3.A0C(abstractC46441Kh1, "null cannot be cast to non-null type com.instagram.direct.inbox.ui.threadtitle.ThreadTitleViewModel.TitleType.Simple");
                        str = ((C43652JSk) abstractC46441Kh1).A00;
                    } else {
                        C14360o3.A0C(abstractC46441Kh1, "null cannot be cast to non-null type com.instagram.direct.inbox.ui.threadtitle.ThreadTitleViewModel.TitleType.Options");
                        str = (String) AbstractC001800i.A0J(((JSA) abstractC46441Kh1).A00);
                    }
                    jSONObject4.put("thread_title", str);
                    DirectThreadKey directThreadKey = jrl.A0I;
                    jSONObject4.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
                    List list6 = directThreadKey.A02;
                    if (list6 != null) {
                        str2 = AbstractC001800i.A0P(", ", "", "", list6, interfaceC16660sJ);
                    } else {
                        str2 = null;
                    }
                    jSONObject4.put("recipient_ids", str2);
                    jSONObject4.put("model_id", directThreadKey.A01());
                    jSONObject4.put("hashcode", directThreadKey.hashCode());
                    jSONObject4.put("timestamp", String.valueOf(jrl.A05));
                    jSONArray3.put(jSONObject4);
                }
            }
            jSONObject.put("thread_keys", jSONArray3);
            return jSONObject.toString();
        } catch (JSONException | Exception e) {
            C0K8.A0F("DirectInboxBugReportLog", "Unable to create log", e);
            return e.toString();
        }
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "DirectInboxBugReportLog";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_inbox_report";
    }
}
