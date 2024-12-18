package X;

import androidx.fragment.app.Fragment;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AcK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23566AcK implements C53O {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23566AcK(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.C53O
    public final /* synthetic */ void CyY() {
        if (this.A00 != 0) {
            AMp aMp = (AMp) this.A02;
            InterfaceC09390do interfaceC09390do = aMp.A0T;
            C143266dR c143266dR = (C143266dR) interfaceC09390do.getValue();
            if (c143266dR != null && c143266dR.A02()) {
                Fragment fragment = (Fragment) aMp.A0P.get();
                if (fragment != null) {
                    C07S c07s = C07S.STARTED;
                    C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
                    AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, aMp, null, 38), C07Y.A00(viewLifecycleOwner));
                }
                C143266dR c143266dR2 = (C143266dR) interfaceC09390do.getValue();
                if (c143266dR2 != null) {
                    c143266dR2.A00();
                    return;
                }
                return;
            }
            aMp.A0B = true;
            AMp.A04(aMp);
        }
    }

    @Override // X.C53O
    public final /* synthetic */ void Cya() {
    }

    @Override // X.C53O
    public final void Cyb() {
        int i = this.A00;
        C189478aR c189478aR = (C189478aR) this.A01;
        if (i != 0) {
            c189478aR.A0L(null);
            return;
        }
        c189478aR.A0L(null);
        C172007lV c172007lV = (C172007lV) this.A02;
        InterfaceC171077jy interfaceC171077jy = c172007lV.A02;
        if (C20Y.A00(c172007lV.A01).A01.A00 != C125535lz.A00) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("avatar-event", "avatar-status-did-update");
            interfaceC171077jy.EN5(jSONObject);
        } catch (JSONException e) {
            C0K8.A0G("AvatarEventHandler", "Error in creating instance of JSONObject for platform event", e);
        }
    }

    @Override // X.C53O
    public final /* synthetic */ void Cym() {
    }
}
