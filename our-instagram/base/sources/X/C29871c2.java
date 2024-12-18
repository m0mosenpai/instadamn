package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1c2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29871c2 implements InterfaceC29301b7 {
    public static final C0KV A02 = C29881c3.A00;
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
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        List C7R = abstractC29011ae.C7R();
        C14360o3.A07(C7R);
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        JTa jTa = ((C1OW) abstractC29011ae).A02;
        List list = directThreadKey.A02;
        if (list != null && !list.isEmpty()) {
            Object obj = list.get(0);
            UserSession userSession = this.A00;
            String str = userSession.userId;
            C44996Jvm A00 = AbstractC46912Kot.A00(jTa);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("recipient_id", obj);
                jSONObject.put("sender_id", str);
            } catch (JSONException unused) {
                C0w9.A03("DirectMessageApi", "Error accessing");
            }
            C25621Ms A002 = LLX.A00(userSession, AbstractC47211Ktk.A0J, A00, directThreadKey, jSONObject);
            A002.A0S(C40781ul.class, C55702hA.class);
            C1GJ.A03(A002.A0N());
        }
    }

    public C29871c2(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
