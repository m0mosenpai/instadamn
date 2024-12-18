package X;

import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IbA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41620IbA {
    public HB9 A00;
    public C1ON A01;
    public Integer A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final J1D A06;
    public final RecentAdActivityFragment A07;
    public final UserSession A08;
    public final C61972ry A09;
    public final List A0A;

    public C41620IbA(RecentAdActivityFragment recentAdActivityFragment, C61972ry c61972ry, UserSession userSession, List list) {
        C14360o3.A0B(userSession, 1);
        this.A08 = userSession;
        this.A07 = recentAdActivityFragment;
        this.A09 = c61972ry;
        this.A0A = list;
        this.A02 = C05F.A01;
        this.A06 = new J1D(this);
    }

    public final void A01() {
        this.A02 = C05F.A00;
        A00(this, true);
        for (IEA iea : this.A0A) {
            AbstractC192798gL A06 = C192108fB.A06(iea.A01, "com.instagram.ads.ad_activity.ad_activity_entrypoint", AbstractC06930Yk.A0E());
            A06.A00(new C38949HDb(iea, 0));
            C1GJ.A03(A06);
        }
    }

    public static final void A00(C41620IbA c41620IbA, boolean z) {
        String str;
        if (!z) {
            c41620IbA.A02 = C05F.A00;
        }
        UserSession userSession = c41620IbA.A08;
        String str2 = null;
        if (z) {
            str = null;
        } else {
            str = c41620IbA.A04;
            str2 = c41620IbA.A03;
        }
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        A0q.A05();
        A0q.A0B("ads/ads_history/");
        A0q.A9s("ig_user_id", userSession.userId);
        A0q.A9s("page_type", "35");
        A0q.A0H("next_max_id", str);
        A0q.A0H("last_item_timestamp", str2);
        A0q.A02 = new C25591Mp(new C07510aQ(userSession), new C25611Mr(null), INX.class, false);
        C1ON A0N = A0q.A0N();
        A0N.A00 = new C37476Geu(1, c41620IbA, z);
        if (z) {
            c41620IbA.A01 = A0N;
        }
        c41620IbA.A09.schedule(A0N);
    }
}
