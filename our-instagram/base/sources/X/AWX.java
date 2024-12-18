package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AWX implements InterfaceC1815083d, BCI {
    public final List A01 = AbstractC166987dD.A1E();
    public final C1814883b A00 = new C1814883b();

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        BDB bdb;
        String string;
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 1) {
                if (bundle.containsKey("jsonObject") && (string = bundle.getString("jsonObject")) != null) {
                    try {
                        this.A00.A00(new JSONObject(string));
                    } catch (JSONException e) {
                        C0K8.A0C("PlatformEventsDataProvider", AbstractC167017dG.A0n(e, "Invalid json events from platform events host: ", AbstractC166987dD.A1C()));
                    }
                }
            } else if (i == 2 && (bdb = this.A00.A00) != null) {
                bdb.stop();
            }
        }
        List list = this.A01;
        ArrayList A0U = AbstractC001800i.A0U(list);
        list.clear();
        return A0U;
    }

    @Override // X.InterfaceC1815083d
    public final void APG(JSONObject jSONObject) {
        AbstractC167027dH.A14("jsonObject", jSONObject.toString(), this.A01, AbstractC167007dF.A0o("serviceType", 67), AbstractC167027dH.A0Y(C05F.A00));
    }
}
