package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Fgb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35242Fgb {
    public static final long A00 = TimeUnit.DAYS.toMillis(30);

    public static final C1ON A02(UserSession userSession, Integer num, String str, String str2, String str3) {
        AbstractC167017dG.A1R(str2, num);
        C14360o3.A0B(str3, 4);
        int A04 = AbstractC001900j.A04(str2, '_', 0);
        if (A04 > 0) {
            str2 = AbstractC25227BEk.A0w(str2, 0, A04);
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "third_party_sharing/%s/%s/get_story_item_url/", new Object[]{str, str2});
        A0M.A0C = "create_story_item_share_url";
        FXG.A01(A0M, userSession, num, str3);
        AbstractC31179DnN.A1H(A0M, userSession);
        return AbstractC25227BEk.A0e(A0M, EC2.class, FXE.class);
    }

    public static final C1ON A00(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, Integer num, String str) {
        AbstractC167017dG.A1N(userSession, c38321qM);
        C14360o3.A0B(num, 3);
        C14360o3.A0B(str, 4);
        boolean z = false;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "media/%s/permalink/", new Object[]{c38321qM.getId()});
        FXG.A01(A0M, userSession, num, str);
        AbstractC31179DnN.A1H(A0M, userSession);
        A0M.A0H(MSV.A00(225), AbstractC25226BEj.A1G(c38321qM));
        A0M.A0H("inventory_source", c38321qM.A0C.BJN());
        A0M.A0A(Integer.valueOf(c38321qM.BRp().A00), "m_t");
        if (c38321qM.A0C.C6Y() != null) {
            z = true;
        }
        A0M.A0I("is_threads", z);
        if (c75113Zb != null) {
            int i = c75113Zb.A03;
            if (i > 0) {
                A0M.A0D("img_index", i);
            }
            if (c75113Zb.getPosition() != -1) {
                A0M.A0D("m_ix", c75113Zb.getPosition());
            }
            int i2 = c75113Zb.A0W;
            if (i2 != -1) {
                A0M.A0D("recs_ix", i2);
            }
        }
        return AbstractC25227BEk.A0e(A0M, EC0.class, FX9.class);
    }

    public static final C1ON A01(UserSession userSession, Integer num, String str, String str2, String str3) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(str3, 4);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        AbstractC31173DnH.A1Q(A0M, "third_party_sharing/%s/live/%s/get_live_url/", new Object[]{str, str2});
        A0M.A0C = "create_live_link_share_url";
        FXG.A01(A0M, userSession, num, str3);
        AbstractC31179DnN.A1H(A0M, userSession);
        return AbstractC25227BEk.A0e(A0M, C32177EBy.class, FX6.class);
    }

    public static final String A03(UserSession userSession) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        return (String) AbstractC31171DnF.A0Y(A002, A002.A1A, C23031Ai.A8c, 379);
    }

    public static final boolean A04(UserSession userSession) {
        long j = AbstractC166987dD.A0x(userSession).getLong("external_sharing_experiment_exposure_timestamp", 0L);
        if (j > 0 && System.currentTimeMillis() - j <= A00) {
            return true;
        }
        return false;
    }
}
