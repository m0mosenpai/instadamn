package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.EyH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33915EyH {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        HashMap A1G = AbstractC166987dD.A1G();
        Map map = (Map) c6fw.A03(0);
        for (Object obj2 : map.keySet()) {
            String str = (String) obj2;
            if (str.equals("step_data")) {
                Object obj3 = map.get(obj2);
                obj3.getClass();
                obj = C6BQ.A0H((Map) obj3);
            } else {
                boolean equals = str.equals("flow_render_type");
                obj = map.get(obj2);
                if (equals) {
                    obj.getClass();
                    obj = obj.toString();
                }
            }
            A1G.put(str, obj);
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        G06 A00 = FTX.A00(A0B);
        String A0h = AbstractC31171DnF.A0h("flow_render_type", A1G);
        String A0h2 = AbstractC31171DnF.A0h("step_name", A1G);
        Object obj4 = A1G.get("step_data");
        obj4.getClass();
        HashMap hashMap = (HashMap) obj4;
        String A0h3 = AbstractC31171DnF.A0h("challenge_context", A1G);
        if (A0h != null) {
            if (A0h.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                A00.A04(C1LZ.A00().A00, A0h2, A0h3, hashMap);
                return null;
            }
            if (!A0h.equals("4") && !A0h.equals("5") && !A0h.equals("6")) {
                return null;
            }
            String A0h4 = AbstractC31171DnF.A0h("url", A1G);
            C14360o3.A0B(A04, 0);
            if (A04 instanceof ChallengeActivity) {
                A04.finish();
            }
            SimpleWebViewActivity.A00(A04, A0B, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, true, true, false, false, true, false, false, false, (String) null, A0h4));
            return null;
        }
        return null;
    }
}
