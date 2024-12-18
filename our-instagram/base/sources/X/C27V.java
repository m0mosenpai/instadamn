package X;

import android.content.Context;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Synchronized$SynchronizedObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.27V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27V implements InterfaceC449925e, InterfaceC13000lm {
    public final UserSession A00;
    public final Queue A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.collect.Synchronized$SynchronizedObject, java.util.Queue] */
    public C27V(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new Synchronized$SynchronizedObject(new EvictingQueue(5));
    }

    public final void A01(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(str4, 3);
        C14360o3.A0B(str5, 4);
        C14360o3.A0B(str6, 5);
        C14360o3.A0B(str7, 6);
        A00(this, new MEI(this, str4, str5, str2, str6, str, str3, str7, i, 1));
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        JsonElement A01;
        try {
            Queue<AbstractC46606Kjj> queue = this.A01;
            synchronized (queue) {
                if (queue.isEmpty()) {
                    return null;
                }
                C58579Pxx c58579Pxx = new C58579Pxx();
                c58579Pxx.A06 = true;
                Gson A00 = c58579Pxx.A00();
                JSONArray jSONArray = new JSONArray();
                for (AbstractC46606Kjj abstractC46606Kjj : queue) {
                    if (abstractC46606Kjj == null) {
                        A01 = RVZ.A00;
                    } else {
                        A01 = A00.A01(abstractC46606Kjj, abstractC46606Kjj.getClass());
                    }
                    jSONArray.put(A01);
                }
                return A00.A0B(jSONArray);
            }
        } catch (JSONException e) {
            C0w9.A02(EnumC12410kj.A03, "AppreciationReportLogsProviderImpl", "Unable to create log", e);
            return null;
        }
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public static final void A00(C27V c27v, InterfaceC16820sZ interfaceC16820sZ) {
        if (C2TN.A00(c27v.A00)) {
            interfaceC16820sZ.invoke();
        }
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "AppreciationReportLogsProviderImpl";
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "content_appreciation_debug_info";
    }
}
