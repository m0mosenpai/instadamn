package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.GFm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36691GFm implements InterfaceC169327h6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C36691GFm(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        UserSession userSession;
        String A06;
        String str2;
        switch (this.A00) {
            case 0:
                userSession = (UserSession) this.A02;
                C14360o3.A0B(userSession, 0);
                A06 = AbstractC13670mt.A06(AbstractC111324zv.A00(416), userSession.userId, "following");
                str2 = "feed_favorites_list_page";
                break;
            case 1:
                userSession = (UserSession) this.A02;
                A06 = "users/search/";
                str2 = "story_user_tag_page";
                break;
            default:
                C25621Ms A0N = AbstractC31173DnH.A0N((AbstractC12990ll) this.A02);
                A0N.A0B("business/account/get_suggested_hashtags/");
                Iterator it = ((FF6) this.A01).A00.A01.iterator();
                String str3 = "";
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (str3.length() > 0) {
                        str3 = AnonymousClass001.A0R(str3, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    str3 = AnonymousClass001.A0R(str3, A1B);
                }
                A0N.A9s("used_hashtags", str3);
                return AbstractC31172DnG.A0S(A0N, C32211EDk.class, FXF.class);
        }
        return AbstractC35238FgX.A04(userSession, A06, str, str2, null);
    }
}
