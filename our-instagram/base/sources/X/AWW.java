package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AWW implements BDB, BE4 {
    public InterfaceC1815083d A00;
    public final List A01 = AbstractC166987dD.A1E();

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
        String string;
        C14360o3.A0B(bundle, 0);
        if (this.A00 != null && bundle.containsKey("commandType") && bundle.getInt("commandType") == 0 && bundle.containsKey("jsonObject") && (string = bundle.getString("jsonObject")) != null) {
            try {
                InterfaceC1815083d interfaceC1815083d = this.A00;
                if (interfaceC1815083d != null) {
                    interfaceC1815083d.APG(new JSONObject(string));
                }
            } catch (JSONException e) {
                C0K8.A0C("PlatformEventsDataProvider", AbstractC167017dG.A0n(e, "Invalid json events from platform events client: ", AbstractC166987dD.A1C()));
            }
        }
    }

    @Override // X.BDB
    public final void enqueueEvent(JSONObject jSONObject) {
        C14360o3.A0B(jSONObject, 0);
        AbstractC167027dH.A14("jsonObject", jSONObject.toString(), this.A01, AbstractC167007dF.A0o("serviceType", 67), AbstractC167027dH.A0Y(C05F.A01));
    }

    @Override // X.BDB
    public final boolean isAlive() {
        return true;
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167027dH.A08(67);
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        C1814883b c1814883b;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C90O.A02;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                C90O c90o = (C90O) anonymousClass904.A02(c203848zt);
                InterfaceC1815083d interfaceC1815083d = null;
                if (c90o != null) {
                    interfaceC1815083d = c90o.A01;
                }
                this.A00 = interfaceC1815083d;
                if (c90o != null && (c1814883b = c90o.A00) != null) {
                    c1814883b.A00 = this;
                }
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        List list = this.A01;
        if (list.isEmpty()) {
            return AbstractC166987dD.A1J(AbstractC167027dH.A08(67));
        }
        ArrayList A1F = AbstractC166987dD.A1F(list);
        list.clear();
        return A1F;
    }

    @Override // X.BDB
    public final void stop() {
        AbstractC167027dH.A15(C05F.A0C, this.A01, AbstractC167007dF.A0o("serviceType", 67));
    }
}
