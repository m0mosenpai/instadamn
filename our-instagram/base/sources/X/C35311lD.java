package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35311lD implements InterfaceC29301b7 {
    public static final C0KV A02 = C35321lE.A00;
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
        C35301lC c35301lC = (C35301lC) c1ow;
        C14360o3.A0B(c35301lC, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c35301lC.C7R();
        C14360o3.A07(C7R);
        JTa jTa = ((C1OW) c35301lC).A02;
        if (C7R.size() == 1) {
            UserSession userSession = this.A00;
            DirectThreadKey directThreadKey = (DirectThreadKey) c35301lC.C7R().get(0);
            C44996Jvm A00 = AbstractC46912Kot.A00(jTa);
            String str = c35301lC.A01;
            String str2 = c35301lC.A00;
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("container_media_igid", str2);
                } catch (JSONException unused) {
                    C0w9.A03("DirectMessageApi", "Error forming json for potato share");
                }
                C25621Ms A002 = LLX.A00(userSession, AbstractC47211Ktk.A02, A00, directThreadKey, jSONObject);
                A002.A9s("text", str);
                A002.A0S(C40781ul.class, C55702hA.class);
                C1ON A0N = A002.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            C14360o3.A0F("containerId");
            throw C00O.createAndThrow();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C35311lD(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
