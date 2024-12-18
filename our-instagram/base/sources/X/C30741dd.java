package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1dd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30741dd implements InterfaceC29301b7 {
    public static final C0KV A01 = C30751de.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C30711da c30711da = (C30711da) c1ow;
        C14360o3.A0B(c30711da, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        List C7R = c30711da.C7R();
        C14360o3.A07(C7R);
        DirectThreadKey directThreadKey = (DirectThreadKey) AbstractC001800i.A0I(C7R);
        String str = c30711da.A00;
        if (str != null) {
            String A06 = c30711da.A06();
            String str2 = c30711da.A05;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("repost_id", str);
            } catch (JSONException unused) {
                C0w9.A03("DirectMessageApi", "Error accessing repost id for post");
            }
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
            c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
            c25621Ms.A9s("client_context", A06);
            c25621Ms.A9s("mutation_token", str2);
            c25621Ms.A0S(C40781ul.class, C55702hA.class);
            LLX.A06(c25621Ms, AbstractC47211Ktk.A0R, jSONObject);
            LLX.A0A(c25621Ms, directThreadKey);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            return;
        }
        C14360o3.A0F("repostId");
        throw C00O.createAndThrow();
    }

    public C30741dd(UserSession userSession) {
        this.A00 = userSession;
    }
}
