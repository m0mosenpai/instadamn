package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Dre, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31434Dre {
    public Map A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final void A00(Hashtag hashtag, String str, int i) {
        InterfaceC11380iw interfaceC11380iw = this.A01;
        UserSession userSession = this.A02;
        String id = hashtag.getId();
        if (id == null) {
            id = "";
        }
        String str2 = this.A03;
        String str3 = this.A05;
        String A02 = AbstractC1120253r.A02(hashtag);
        Map map = this.A00;
        C14360o3.A0B(A02, 7);
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, str);
        A00.A0C("entity_type", "hashtag");
        A00.A0C("entity_id", id);
        if (str2 != null) {
            A00.A0C("based_on_id", str2);
        }
        A00.A0C("based_on_type", str3);
        A00.A0C(AbstractC111324zv.A00(402), A02);
        A00.A08(Integer.valueOf(i), "entity_ix");
        A00.A0F(map);
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public final void A01(User user, String str, int i) {
        InterfaceC11380iw interfaceC11380iw = this.A01;
        UserSession userSession = this.A02;
        String id = user.getId();
        String str2 = this.A03;
        String str3 = this.A05;
        String A06 = AbstractC38851rI.A06(user.B7L());
        Map map = this.A00;
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, str);
        A00.A0C("entity_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A00.A0C("entity_id", id);
        if (str2 != null) {
            A00.A0C("based_on_id", str2);
        }
        A00.A0C("based_on_type", str3);
        A00.A0C(AbstractC111324zv.A00(402), A06);
        A00.A08(Integer.valueOf(i), "entity_ix");
        A00.A0F(map);
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public C31434Dre(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, Map map) {
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = map == null ? AbstractC166987dD.A1G() : map;
    }
}
