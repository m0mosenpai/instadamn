package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SP7 {
    public C61566Rpo A00;
    public List A01;
    public final String A02;
    public final long A03 = System.currentTimeMillis();

    public final String A00() {
        List list = this.A01;
        if (list != null && !list.isEmpty()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1C.append(AbstractC166987dD.A1B(it));
                A1C.append("_");
            }
            A1C.setLength(A1C.length() - 1);
            return A1C.toString();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Rpo, java.lang.Object] */
    public SP7(String str, long j) {
        this.A02 = str;
        ?? obj = new Object();
        obj.A00 = 1L;
        obj.A02 = j;
        obj.A01 = j;
        this.A00 = obj;
    }

    public final JSONObject A01() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "fbns_counters");
            A0q.put("time", AbstractC62801SRv.A00(this.A03));
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            A0q2.put("key", this.A02);
            A0q2.put("dims", A00());
            C61566Rpo c61566Rpo = this.A00;
            JSONObject A0q3 = AbstractC31171DnF.A0q();
            A0q3.put("cnt", c61566Rpo.A00);
            A0q3.put("avg", ((float) c61566Rpo.A02) / ((float) c61566Rpo.A00));
            A0q3.put("max", c61566Rpo.A01);
            Iterator<String> keys = A0q3.keys();
            while (keys.hasNext()) {
                String A1B = AbstractC166987dD.A1B(keys);
                A0q2.put(A1B, A0q3.get(A1B));
            }
            A0q.put("extra", A0q2);
            return A0q;
        } catch (JSONException e) {
            C0K8.A0I("CounterEvent", "Failed to serialize", e);
            return A0q;
        }
    }

    public final String toString() {
        return A01().toString();
    }
}
