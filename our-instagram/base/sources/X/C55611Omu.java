package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Omu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55611Omu implements InterfaceC1815083d {
    public O1J A00;
    public final C90O A01;
    public final C1814883b A02;

    static {
        Map map = C0YZ.A03;
        AbstractC13230m9.A01(C55611Omu.class);
    }

    @Override // X.InterfaceC1815083d
    public final void APG(JSONObject jSONObject) {
        O1J o1j;
        try {
            String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            O1J o1j2 = this.A00;
            if (o1j2 != null) {
                AbstractC167007dF.A1C(string);
                o1j2.A00.A0J.F8m(new C51502Mon(AbstractC166987dD.A1L(string, jSONObject)));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (C14360o3.A0K(string, AbstractC43591JPw.A00(789))) {
                C14360o3.A0A(jSONObject2);
                String string2 = jSONObject2.getString("event_name");
                if (string2 != null && string2.hashCode() == -947300602 && string2.equals(AbstractC43591JPw.A00(996)) && (o1j = this.A00) != null) {
                    C55143Od2.A02(o1j.A00, C05F.A02);
                    return;
                }
                return;
            }
            if (C14360o3.A0K(string, AbstractC43591JPw.A00(787))) {
                C14360o3.A0A(jSONObject2);
                jSONObject2.getString("event_name");
            }
        } catch (JSONException unused) {
        }
    }

    public C55611Omu() {
        C1814883b c1814883b = new C1814883b();
        this.A02 = c1814883b;
        this.A01 = new C90O(this, c1814883b);
    }
}
