package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.066, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass066 implements C0LR {
    public final C0Mq A00;

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0D;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        C0Mq c0Mq = this.A00;
        if (c0Mq != null) {
            C0Mq c0Mq2 = C04770Mv.A03;
            HashMap A00 = c0Mq.A00();
            if (!A00.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : A00.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    C0M6 c0m62 = C0M6.CRITICAL_REPORT;
                    String str3 = c0m62.A00;
                    if (str.startsWith(str3) || c0m6 != c0m62) {
                        if (!str.startsWith(AnonymousClass001.A0R(str3, "cadm_"))) {
                            String str4 = C0M6.LARGE_REPORT.A00;
                            if (!str.startsWith(AnonymousClass001.A0R(str4, "cadm_"))) {
                                c024209q.A05(str.replaceFirst(str3, "").replaceFirst(str4, "").replaceFirst("cadm_", ""), str2);
                            }
                        }
                        try {
                            jSONObject.put(str.replaceFirst(str3, "").replaceFirst(C0M6.LARGE_REPORT.A00, "").replaceFirst("cadm_", ""), str2);
                        } catch (JSONException e) {
                            C0PC.A00().DEh(C0LX.A00(C05F.A0D), e, null);
                        }
                    }
                }
                c024209q.A03(C0LK.A5J, jSONObject.toString());
            }
        }
    }

    public AnonymousClass066(C0Mq c0Mq) {
        this.A00 = c0Mq;
    }
}
