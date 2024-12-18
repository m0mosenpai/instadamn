package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC116765Qf {
    public static final String A00(UserSession userSession, Collection collection, boolean z) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C116755Qe c116755Qe = (C116755Qe) it.next();
                A0A.A0d();
                A0A.A0S("item_id", c116755Qe.A04);
                A0A.A0Q("item_type", c116755Qe.A00);
                A0A.A0S(AbstractC65709Tsi.A02(42, 10, 99), c116755Qe.A05);
                A0A.A0S("container_module", c116755Qe.A02);
                A0A.A0S("inventory_source", c116755Qe.A03);
                A0A.A0Q("multi_ads_type", c116755Qe.A01);
                A0A.A0r("seen_states");
                List<C116745Qd> list = c116755Qe.A06;
                A0A.A0c();
                for (C116745Qd c116745Qd : list) {
                    A0A.A0d();
                    A0A.A0S("media_id", c116745Qd.A09);
                    A0A.A0M("media_time_spent");
                    Iterator it2 = c116745Qd.A0B.iterator();
                    while (it2.hasNext()) {
                        A0A.A0i(((Number) it2.next()).longValue());
                    }
                    A0A.A0Z();
                    A0A.A0R("impression_timestamp", c116745Qd.A00);
                    A0A.A0P("media_percent_visible", c116745Qd.A01);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36320635751768861L) && (z || C18U.A06(c06090Tz, userSession, 36320635751899935L))) {
                        A0A.A0Q("gap_to_last_ad", c116745Qd.A04);
                        A0A.A0Q("gap_to_last_netego", c116745Qd.A05);
                        A0A.A0Q("client_insertion_position", c116745Qd.A03);
                    }
                    if (C18U.A06(c06090Tz, userSession, 36320635751834398L)) {
                        if (z || C18U.A06(c06090Tz, userSession, 36320635751965472L)) {
                            A0A.A0Q("reel_gap_to_last_ad", c116745Qd.A08);
                            A0A.A0Q("ad_consumed_media_gap", c116745Qd.A02);
                            A0A.A0Q("num_media_consumed_in_ad", c116745Qd.A07);
                        } else {
                            A0A.A0a();
                        }
                    }
                    if (z) {
                        if (C18U.A06(c06090Tz, userSession, 36321279996863775L)) {
                            A0A.A0S("tracking_token", c116745Qd.A0A);
                        }
                        A0A.A0Q("imp_signature", c116745Qd.A06);
                    }
                    A0A.A0a();
                }
                A0A.A0Z();
                A0A.A0a();
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0K8.A0H("SeenStateItemRealtimeInfo", "Unable to serialize collection.", e);
            return "";
        }
    }
}
