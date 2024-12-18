package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31021e5 implements InterfaceC29301b7 {
    public static final C0KV A02 = C31031e6.A00;
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
        C31001e3 c31001e3 = (C31001e3) c1ow;
        C14360o3.A0B(c31001e3, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c31001e3.C7R();
        C14360o3.A07(C7R);
        JTa jTa = ((C1OW) c31001e3).A02;
        String str = c31001e3.A02;
        if (str != null) {
            if (C7R.size() == 1) {
                UserSession userSession = this.A00;
                DirectThreadKey directThreadKey = (DirectThreadKey) c31001e3.C7R().get(0);
                String A06 = c31001e3.A06();
                String str2 = ((C1OW) c31001e3).A05;
                boolean z = jTa.A09;
                String str3 = jTa.A04;
                L1W l1w = jTa.A00;
                boolean z2 = jTa.A07;
                boolean z3 = jTa.A0A;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creator_igid", str);
                } catch (JSONException unused) {
                    C0w9.A03("DirectMessageApi", "Error accessing creator id");
                }
                C25621Ms c25621Ms = new C25621Ms(userSession);
                c25621Ms.A05();
                EnumEntries enumEntries = C2EY.A0D;
                c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
                c25621Ms.A0S(C40781ul.class, C55702hA.class);
                LLX.A06(c25621Ms, AbstractC47211Ktk.A0P, jSONObject);
                AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str2, str3, z, z2, z3);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        C14360o3.A0F("creatorId");
        throw C00O.createAndThrow();
    }

    public C31021e5(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
