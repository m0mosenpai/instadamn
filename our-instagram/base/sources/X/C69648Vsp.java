package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Vsp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69648Vsp {
    public final Context A00;
    public final VG4 A01;
    public final C70399WUb A02;
    public final KEF A03;
    public final PromoteData A04;
    public final C67892V0z A05;
    public final InterfaceC11380iw A06;
    public final FragmentActivity A07;
    public final UserSession A08;

    public final String A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            PromoteData promoteData = this.A04;
            JSONObject put = jSONObject2.put("currency", promoteData.A1j.getCurrencyCode());
            E71 e71 = promoteData.A0N;
            if (e71 != null) {
                jSONObject.put("payment_amount", put.put("amount", e71.A00));
                return jSONObject.toString();
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public C69648Vsp(Context context, FragmentActivity fragmentActivity, VG4 vg4, KEF kef, PromoteData promoteData, C67892V0z c67892V0z, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A03 = kef;
        this.A04 = promoteData;
        this.A07 = fragmentActivity;
        this.A05 = c67892V0z;
        this.A06 = interfaceC11380iw;
        this.A01 = vg4;
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        this.A08 = userSession;
        C70399WUb A00 = C70399WUb.A00(userSession);
        C14360o3.A07(A00);
        this.A02 = A00;
    }
}
