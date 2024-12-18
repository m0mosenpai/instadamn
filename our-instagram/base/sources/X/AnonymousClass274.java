package X;

import android.content.Context;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Synchronized$SynchronizedObject;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.274, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass274 implements InterfaceC449925e {
    public final C13920nI A00;
    public final Queue A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.collect.Synchronized$SynchronizedObject, java.util.Queue] */
    public AnonymousClass274(C13920nI c13920nI) {
        C14360o3.A0B(c13920nI, 1);
        this.A00 = c13920nI;
        this.A01 = new Synchronized$SynchronizedObject(new EvictingQueue(25));
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        String str = null;
        try {
            Queue<CSE> queue = this.A01;
            synchronized (queue) {
                JSONObject jSONObject = new JSONObject();
                int i = 0;
                for (CSE cse : queue) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("event", cse.A01);
                    jSONObject2.put("time", cse.A00);
                    jSONObject2.put("timeFormatted", cse.A02);
                    jSONObject2.put("extra", cse.A03);
                    jSONObject.put(String.valueOf(i), jSONObject2);
                    i++;
                }
                str = jSONObject.toString();
            }
            return str;
        } catch (JSONException e) {
            C0K8.A0F("DirectNotificationBugReport", "Unable to create log", e);
            return str;
        }
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "DirectNotificationBugReport";
    }

    public static final void A00(AnonymousClass274 anonymousClass274, String str, String str2, String str3) {
        Object c09540e5;
        String str4;
        try {
            c09540e5 = AbstractC08820cl.A03(AnonymousClass001.A0R("ig://", str2));
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        Throwable A00 = C09550e6.A00(c09540e5);
        String str5 = null;
        if (A00 != null) {
            C0K8.A0F("DirectNotificationBugReport", AnonymousClass001.A0R("Unable to parse notification action uri: ", str2), A00);
            c09540e5 = null;
        }
        android.net.Uri uri = (android.net.Uri) c09540e5;
        if (uri != null) {
            str5 = AbstractC43609JQq.A01(uri);
            str4 = AbstractC43609JQq.A00(uri);
        } else {
            str4 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss", Locale.ENGLISH).format(Long.valueOf(currentTimeMillis));
        C14360o3.A07(format);
        Queue queue = anonymousClass274.A01;
        C09530e4 c09530e4 = new C09530e4("is_e2ee", Boolean.valueOf(AbstractC47881LDb.A00(str2)));
        if (str5 == null) {
            str5 = "null thread id";
        }
        C09530e4 c09530e42 = new C09530e4(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
        if (str4 == null) {
            str4 = "null message id";
        }
        C09530e4 c09530e43 = new C09530e4("message_id", str4);
        if (str3 == null) {
            str3 = "null reason";
        }
        queue.add(new CSE(currentTimeMillis, str, format, AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, new C09530e4("reason", str3))));
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_notification_traces";
    }
}
