package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.EwW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33806EwW {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.FNM, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg;
        List list = c6fw.A00;
        if (list.size() >= 1) {
            String A0d = AbstractC31177DnL.A0d(c6fw);
            if (list.get(1) == null) {
                c6fg = C6BQ.A09(c6fq);
            } else {
                Object A03 = c6fw.A03(1);
                C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
                c6fg = (C6FG) A03;
            }
            JSONObject jSONObject = new JSONObject(A0d);
            JSONObject jSONObject2 = jSONObject.getJSONObject("error").getJSONObject("error_data");
            String string = jSONObject2.getString("api_path");
            C07270a1 c07270a1 = (C07270a1) C6BQ.A0A(c6fg);
            String string2 = jSONObject2.getString("challenge_context");
            ?? obj = new Object();
            obj.A00 = string;
            obj.A01 = string2;
            String string3 = jSONObject.getJSONObject("error").getString("uid");
            C17280tP A0y = AbstractC166987dD.A0y();
            if (A0y.A09().contains(string3)) {
                A0y.A0H(AnonymousClass090.A03(string3, A0y.A09()));
            }
            FTX.A00(c07270a1).A02(c07270a1.A00.A06(), obj);
        }
        return null;
    }
}
