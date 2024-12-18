package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.CUb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27957CUb {
    public final UserSession A00;

    public C27957CUb(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C1ON A00(String str) {
        C25621Ms A0q = AbstractC25228BEl.A0q(this.A00);
        A0q.A06();
        A0q.A03();
        String A11 = AnonymousClass001.A11("api/", "v1/", "creators/", "achievements/", "fetch_toast/");
        C14360o3.A07(A11);
        A0q.A0E = A11;
        A0q.A0R(EAX.class, FSI.class);
        A0q.A9s("media_id", str);
        return A0q.A0N();
    }

    public final C1ON A01(String str, List list, List list2) {
        String obj;
        String str2;
        C25621Ms A0q = AbstractC25228BEl.A0q(this.A00);
        A0q.A05();
        A0q.A03();
        String A11 = AnonymousClass001.A11("api/", "v1/", "creators/", "achievements/", "mark_toast_seen/");
        C14360o3.A07(A11);
        A0q.A0E = A11;
        A0q.A0R(C38830H8e.class, IOT.class);
        A0q.A9s("media_id", str);
        if (list2 != null && AbstractC166987dD.A1b(list2)) {
            obj = new JSONArray((Collection) list2).toString();
            str2 = "challenge_ids";
        } else {
            obj = new JSONArray((Collection) list).toString();
            str2 = "achievement_ids";
        }
        A0q.A9s(str2, obj);
        return A0q.A0N();
    }
}
