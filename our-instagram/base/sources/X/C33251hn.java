package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33251hn implements InterfaceC29301b7 {
    public static final C0KV A02 = C33261ho.A00;
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
        String str;
        C33231hl c33231hl = (C33231hl) c1ow;
        C14360o3.A0B(c33231hl, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = c33231hl.A02;
        if (directThreadKey != null) {
            C44996Jvm A00 = AbstractC46912Kot.A00(((C1OW) c33231hl).A02);
            String str2 = c33231hl.A04;
            if (str2 != null) {
                AnonymousClass442 anonymousClass442 = c33231hl.A01;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sticker_id", str2);
                    jSONObject.put("embedded_ent_type", AbstractC47211Ktk.A05);
                } catch (JSONException unused) {
                    C0w9.A03("DirectMessageApi", "Error creating pass it on json for direct message");
                }
                C25621Ms A002 = LLX.A00(userSession, AbstractC47211Ktk.A05, A00, directThreadKey, jSONObject);
                A002.A0S(C40781ul.class, C55702hA.class);
                if (anonymousClass442 != null) {
                    A002.A9s("replied_to_action_source", anonymousClass442.A0Q);
                    A002.A9s("replied_to_client_context", anonymousClass442.A0R);
                    A002.A9s("replied_to_item_id", anonymousClass442.A0T);
                    A002.A9s("replied_to_target_type", anonymousClass442.A0F.A00);
                    A002.A9s("replied_to_user_id", anonymousClass442.A0U);
                }
                C1ON A0N = A002.A0N();
                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                C1GJ.A03(A0N);
                return;
            }
            str = "stickerId";
        } else {
            str = "threadKey";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C33251hn(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
