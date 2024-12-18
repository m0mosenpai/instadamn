package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1l3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1l3 implements InterfaceC29301b7 {
    public static final C0KV A02 = C35231l4.A00;
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
        C1l1 c1l1 = (C1l1) c1ow;
        C14360o3.A0B(c1l1, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c1l1.C7R();
        C14360o3.A07(C7R);
        JTa jTa = ((C1OW) c1l1).A02;
        if (C7R.size() == 1) {
            UserSession userSession = this.A00;
            DirectThreadKey directThreadKey = (DirectThreadKey) c1l1.C7R().get(0);
            C44996Jvm A00 = AbstractC46912Kot.A00(jTa);
            String str = c1l1.A00;
            String str2 = c1l1.A01;
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("wall_post_igid", str2);
                } catch (JSONException unused) {
                    C0w9.A03("DirectMessageApi", "Error forming json for wall post reply");
                }
                C25621Ms A002 = LLX.A00(userSession, AbstractC47211Ktk.A0I, A00, directThreadKey, jSONObject);
                A002.A9s("text", str);
                A002.A0S(C40781ul.class, C55702hA.class);
                C1ON A0N = A002.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            C14360o3.A0F("wallPostId");
            throw C00O.createAndThrow();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C1l3(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
