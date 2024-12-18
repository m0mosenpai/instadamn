package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.TKq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64579TKq implements Runnable {
    public final /* synthetic */ C62952SYu A00;

    public RunnableC64579TKq(C62952SYu c62952SYu) {
        this.A00 = c62952SYu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62952SYu c62952SYu = this.A00;
        Executor executor = C62952SYu.A04;
        C62606SIm c62606SIm = c62952SYu.A02;
        Map map = c62606SIm.A04;
        String str = "";
        if (!map.isEmpty()) {
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                long j = c62606SIm.A01;
                c62606SIm.A01 = 1 + j;
                A0q.put("seq", j);
                A0q.put("time", AbstractC62801SRv.A00(System.currentTimeMillis()));
                JSONArray A0p = AbstractC31171DnF.A0p();
                Iterator A16 = AbstractC166997dE.A16(map);
                while (A16.hasNext()) {
                    A0p.put(((SP7) A16.next()).A01());
                }
                A0q.put("data", A0p);
                A0q.put("log_type", "client_event");
                A0q.put("app_id", "567310203415052");
                A0q.put("app_ver", c62606SIm.A02);
                A0q.put("build_num", c62606SIm.A03);
                A0q.put(AbstractC63082Sc5.A00(), c62606SIm.A05);
                str = A0q.toString();
            } catch (JSONException e) {
                C0K8.A0I("CounterSession", "Failed to serialize", e);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                int A00 = c62952SYu.A01.A00(str);
                if (A00 == 200) {
                    map.clear();
                    c62606SIm.A00 = 0;
                } else {
                    C0K8.A0O("CounterAnalytics", "Unsuccessful upload. response code=%d", Integer.valueOf(A00));
                }
            } catch (Exception e2) {
                C0K8.A0H("CounterAnalytics", "Unsuccessful upload.", e2);
            }
        }
    }
}
