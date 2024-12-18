package X;

import com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.util.HallPassApiUtil;

/* renamed from: X.GFq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36695GFq implements InterfaceC169327h6 {
    public final int A00;
    public final Object A01;

    public static Object A00(C36695GFq c36695GFq, Object obj) {
        C14360o3.A0B(obj, 0);
        return c36695GFq.A01;
    }

    public C36695GFq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        switch (this.A00) {
            case 0:
                return AbstractC35238FgX.A03(((C215219fx) A00(this, str)).A02, "users/search/", str, MSV.A00(261));
            case 1:
                C33152Ejv c33152Ejv = (C33152Ejv) A00(this, str);
                return AudienceListsApiUtil.A01(AbstractC166987dD.A0r(c33152Ejv.A06), c33152Ejv.A05, str);
            case 2:
                return HallPassApiUtil.A00(AbstractC166987dD.A0r(((C33150Ejt) A00(this, str)).A05), str);
            case 3:
                return HallPassApiUtil.A00(AbstractC166987dD.A0r(((C33148Ejr) A00(this, str)).A06), str);
            case 4:
                C25621Ms A0N = AbstractC31173DnH.A0N(((WFL) A00(this, str)).A0D);
                A0N.A0B("fbsearch/profile_link_search/");
                A0N.A9s("q", str);
                A0N.A9s("count", Integer.toString(20));
                return AbstractC31172DnG.A0S(A0N, C67849UzU.class, C69974Vyp.class);
            case 5:
                return AudienceListsApiUtil.A01(AbstractC166987dD.A0r(((C33147Ejq) A00(this, str)).A0C), MSV.A00(475), str);
            case 6:
                C25621Ms A0M = AbstractC31177DnL.A0M((AbstractC12990ll) A00(this, str));
                A0M.A0B(AbstractC111324zv.A00(2169));
                A0M.A0H("query", str);
                return AbstractC25227BEk.A0e(A0M, HBF.class, ISF.class);
            case 7:
                return AbstractC35238FgX.A03(((C50939Mf8) ((OJp) A00(this, str)).A08.getValue()).A02, "users/search/", str, "live_mention_search_page");
            case 8:
                return AbstractC35238FgX.A03((UserSession) A00(this, str), "users/search/", str, "live_mention_search_page");
            default:
                return AbstractC35238FgX.A03(((C53Z) this.A01).getSession(), "users/search/", str, "restricted_accounts_page");
        }
    }
}
