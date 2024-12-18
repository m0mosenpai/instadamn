package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class X1J implements MQN {
    public final /* synthetic */ W4T A00;

    @Override // X.MQN
    public final void DG5(String str, Throwable th) {
        C14360o3.A0B(str, 0);
        C70151W8r.A01(C70151W8r.A00("report_adid_failure", str, th, null), "error", this.A00.A04);
    }

    public X1J(W4T w4t) {
        this.A00 = w4t;
    }

    @Override // X.MQN
    public final void onSuccess() {
        C70151W8r c70151W8r = this.A00.A04;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", "report_adid_success");
        C70151W8r.A01(AbstractC166987dD.A19(jSONObject), "info", c70151W8r);
    }
}
