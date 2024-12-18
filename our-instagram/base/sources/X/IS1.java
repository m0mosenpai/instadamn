package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IS1 {
    public static final C1ON A00(Location location, UserSession userSession, String str, String str2) {
        String str3;
        C14360o3.A0C(userSession, AbstractC58317Pt9.A00(46));
        String str4 = null;
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B(AbstractC111324zv.A00(2351));
        A0M.A9s("query", str);
        A0M.A0D("count", 30);
        AbstractC37303Gc4.A15(A0M);
        A0M.A9s(MSV.A00(62), str2);
        if (location != null) {
            str3 = Double.valueOf(location.getLatitude()).toString();
        } else {
            str3 = null;
        }
        A0M.A0H("lat", str3);
        if (location != null) {
            str4 = Double.valueOf(location.getLongitude()).toString();
        }
        A0M.A0H("lng", str4);
        return AbstractC25227BEk.A0e(A0M, C33137Ejg.class, FXO.class);
    }

    public static final void A01(C25621Ms c25621Ms, C41171IKk c41171IKk) {
        String str;
        String str2;
        Integer num;
        c25621Ms.A06();
        c25621Ms.A0B(c41171IKk.A08);
        c25621Ms.A9s("query", c41171IKk.A0B);
        c25621Ms.A9s("count", String.valueOf(30));
        AbstractC37303Gc4.A15(c25621Ms);
        c25621Ms.A9s(MSV.A00(62), c41171IKk.A0C);
        c25621Ms.A0H("rank_token", c41171IKk.A09);
        String str3 = c41171IKk.A07;
        c25621Ms.A0H("next_max_id", str3);
        c25621Ms.A0H("page_token", str3);
        Location location = c41171IKk.A05;
        String str4 = null;
        if (location != null) {
            str = Double.valueOf(location.getLatitude()).toString();
        } else {
            str = null;
        }
        c25621Ms.A0H("lat", str);
        if (location != null) {
            str2 = Double.valueOf(location.getLongitude()).toString();
        } else {
            str2 = null;
        }
        c25621Ms.A0H("lng", str2);
        c25621Ms.A0H("reels_max_id", c41171IKk.A0A);
        String str5 = c41171IKk.A02;
        c25621Ms.A0H("reels_page_index", str5);
        if (str5 != null) {
            num = AbstractC003100w.A0i(str5);
        } else {
            num = null;
        }
        c25621Ms.A0A(num, "page_index");
        c25621Ms.A0H("has_more_reels", c41171IKk.A01);
        c25621Ms.A0H("paging_token", c41171IKk.A00);
        List list = c41171IKk.A03;
        if (list != null) {
            str4 = list.toString();
        }
        c25621Ms.A0H("displaced_organic_media_ids", str4);
    }
}
