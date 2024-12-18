package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1jT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34291jT implements InterfaceC29301b7 {
    public static final C0KV A02 = C34301jU.A00;
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
        C34271jR c34271jR = (C34271jR) c1ow;
        C14360o3.A0B(c34271jR, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c34271jR.C7R();
        C14360o3.A07(C7R);
        JTa jTa = ((C1OW) c34271jR).A02;
        if (C7R.size() == 1) {
            UserSession userSession = this.A00;
            DirectThreadKey directThreadKey = (DirectThreadKey) c34271jR.C7R().get(0);
            String str = c34271jR.A00;
            if (str != null) {
                String A06 = c34271jR.A06();
                String str2 = c34271jR.A05;
                boolean z = jTa.A09;
                String str3 = jTa.A04;
                L1W l1w = jTa.A00;
                boolean z2 = jTa.A07;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("fbid", str);
                } catch (JSONException unused) {
                    C0w9.A03("DirectMessageApi", "Error accessing creator id");
                }
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A05();
                EnumEntries enumEntries = C2EY.A0D;
                c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
                c25621Ms.A0S(C40781ul.class, C55702hA.class);
                LLX.A06(c25621Ms, AbstractC47211Ktk.A0O, jSONObject);
                AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str2, str3, z, z2, false);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            C14360o3.A0F("mediaKitId");
            throw C00O.createAndThrow();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C34291jT(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
