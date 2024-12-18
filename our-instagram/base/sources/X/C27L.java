package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.27L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27L implements InterfaceC449925e, InterfaceC13000lm {
    public final UserSession A00;

    public C27L(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        AbstractC1351869s abstractC1351869s;
        JSONObject jSONObject = new JSONObject();
        AbstractC207749He.A00();
        K3Q A00 = JVE.A00(JVE.A01(this.A00).A00);
        InterfaceExecutorC135866Co ASj = A00.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        if (!ASj.ELJ(new C48172LTw(A00, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        MailboxNullable mailboxNullable = (MailboxNullable) mailboxFutureImpl.get();
        if (mailboxNullable != null) {
            abstractC1351869s = (AbstractC1351869s) mailboxNullable.value;
        } else {
            abstractC1351869s = null;
        }
        HashMap hashMap = new HashMap();
        if (abstractC1351869s != null) {
            int count = abstractC1351869s.mResultSet.getCount();
            for (int i = 0; i < count; i++) {
                String string = abstractC1351869s.mResultSet.getString(i, 0);
                C14360o3.A07(string);
                if (!hashMap.containsKey(Long.valueOf(Long.parseLong(string)))) {
                    String string2 = abstractC1351869s.mResultSet.getString(i, 0);
                    C14360o3.A07(string2);
                    hashMap.put(Long.valueOf(Long.parseLong(string2)), new ArrayList());
                }
                String string3 = abstractC1351869s.mResultSet.getString(i, 0);
                C14360o3.A07(string3);
                List list = (List) hashMap.get(Long.valueOf(Long.parseLong(string3)));
                if (list != null) {
                    String string4 = abstractC1351869s.mResultSet.getString(i, 1);
                    C14360o3.A07(string4);
                    list.add(Long.valueOf(Long.parseLong(string4)));
                }
            }
        }
        try {
            JSONArray jSONArray = new JSONArray();
            final C30190DRv c30190DRv = new C30190DRv(jSONArray, 14);
            hashMap.forEach(new BiConsumer() { // from class: X.B1m
                @Override // java.util.function.BiConsumer
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    InterfaceC16620sF.this.invoke(obj, obj2);
                }
            });
            jSONObject.put("reverb_toplevel_thread_to_messages_map", jSONArray);
        } catch (JSONException e) {
            C0K8.A0F("ArmadilloExpressReverbToplevelMessageIdsReportLogCollector", "Unable to create log due to JSONException", e);
        }
        return jSONObject.toString();
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "ArmadilloExpressReverbToplevelMessageIdsReportLogCollector";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_armadillo_express_reverb_toplevel_message_ids";
    }
}
