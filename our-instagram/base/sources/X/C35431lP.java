package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35431lP implements InterfaceC29301b7 {
    public static final C0KV A02 = C35441lQ.A00;
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
        C35411lN c35411lN = (C35411lN) c1ow;
        C14360o3.A0B(c35411lN, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = c35411lN.A02;
        if (directThreadKey != null) {
            C44996Jvm A00 = AbstractC46912Kot.A00(((C1OW) c35411lN).A02);
            Long valueOf = Long.valueOf(c35411lN.A00);
            Long l = c35411lN.A03;
            String str = c35411lN.A04;
            String str2 = c35411lN.A05;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("generation_id", valueOf);
                if (l != null) {
                    jSONObject.put("media_id", l);
                }
                if (str != null) {
                    jSONObject.put("preview_url", str);
                }
                if (str2 != null) {
                    jSONObject.put(TraceFieldType.ContentType, str2);
                }
            } catch (JSONException unused) {
                C0w9.A03("DirectMessageApi", "Error creating pass it on json for direct message");
            }
            C25621Ms A002 = LLX.A00(userSession, AbstractC47211Ktk.A09, A00, directThreadKey, jSONObject);
            A002.A0S(C40781ul.class, C55702hA.class);
            C1ON A0N = A002.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            return;
        }
        C14360o3.A0F("threadKey");
        throw C00O.createAndThrow();
    }

    public C35431lP(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
