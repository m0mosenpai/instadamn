package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1jV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34311jV implements InterfaceC29301b7 {
    public static final C0KV A02 = C34321jW.A00;
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C29201ax c29201ax = (C29201ax) c1ow;
        C14360o3.A0B(c29201ax, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        C32226EDz A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        DirectThreadKey C7Q = c29201ax.C7Q();
        String A06 = c29201ax.A06();
        String str = c29201ax.A05;
        JTa jTa = ((C1OW) c29201ax).A02;
        boolean z = jTa.A09;
        String str2 = jTa.A04;
        L1W l1w = jTa.A00;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fbid", C7Q.A00);
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "join");
        } catch (JSONException unused) {
            C0w9.A03("DirectMessageApi", "Error creating JSON params for standard dynamic xma message");
        }
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        LLX.A06(c25621Ms, AbstractC47211Ktk.A0N, jSONObject);
        AbstractC47995LLh.A0D(c25621Ms, l1w, C7Q, A06, str, str2, z, false, false);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = A00;
        C1GJ.A03(A0N);
    }

    public C34311jV(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
