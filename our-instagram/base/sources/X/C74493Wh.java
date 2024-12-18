package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74493Wh {
    public static C18920wW A00;
    public static final C74493Wh A01 = new Object();

    public static final void A03(C9CB c9cb, UserSession userSession, C3XG c3xg) {
        C14360o3.A0B(c9cb, 1);
        C74493Wh c74493Wh = A01;
        List singletonList = Collections.singletonList(c3xg);
        C14360o3.A07(singletonList);
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            c74493Wh.A06(c9cb, userSession, (C3XG) it.next(), null);
        }
    }

    public static final void A04(C9CB c9cb, UserSession userSession, C3XG c3xg, int i) {
        C14360o3.A0B(c9cb, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c3xg, 2);
        A01.A06(c9cb, userSession, c3xg, Integer.valueOf(i));
    }

    public static final void A07(C9CB c9cb, UserSession userSession, List list, List list2) {
        Boolean bool;
        C14360o3.A0B(userSession, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3XG c3xg = (C3XG) it.next();
            C38321qM A02 = C3XH.A02(c3xg.A05);
            if (A02 != null) {
                bool = Boolean.valueOf(A02.CdW());
            } else {
                bool = null;
            }
            boolean A08 = AbstractC61652rS.A08(userSession, AbstractC23021Ah.A00(userSession));
            if (!list2.contains(c3xg) && (C14360o3.A0K(bool, false) || (C14360o3.A0K(bool, true) && !A08))) {
                arrayList.add(c3xg);
            }
        }
        if (!arrayList.isEmpty()) {
            C74493Wh c74493Wh = A01;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c74493Wh.A06(c9cb, userSession, (C3XG) it2.next(), null);
            }
        }
    }

    public static final C9CB A00(C1EU c1eu) {
        return new C9CB(c1eu.A04, c1eu.A0A, c1eu.A09);
    }

    public static final C18920wW A01(UserSession userSession) {
        C18920wW c18920wW = A00;
        if (c18920wW == null) {
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A01 = "feed_timeline";
            C18920wW A002 = c12210kP.A00();
            A00 = A002;
            return A002;
        }
        return c18920wW;
    }

    public static final String A02(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -76555191) {
                if (hashCode != 1756132) {
                    if (hashCode == 1037456052 && str.equals("follow_hashtag_story")) {
                        return "hashtag_connected";
                    }
                    return str;
                }
                if (!str.equals("media_or_ad")) {
                    return str;
                }
                return "user_connected";
            }
            if (!str.equals("explore_story")) {
                return str;
            }
            return "explore_unconnected";
        }
        return str;
    }

    public static final void A05(C9CB c9cb, UserSession userSession, C3XG c3xg, int i) {
        C18920wW A012 = A01(userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "instagram_feed_item_inserted");
        if (A002.isSampled()) {
            A002.AAP(AbstractC31182DnR.A05(374, 10, 34), c9cb.A03);
            A002.AAP("request_type", c9cb.A01.toString());
            A002.AAP("feed_item_type", c3xg.A06.toString());
            A002.A9K("expected_position", Long.valueOf(i));
            C38321qM A02 = C3XH.A02(c3xg.A05);
            if (A02 != null) {
                String A38 = A02.A38();
                if (A38 != null) {
                    A002.A9K("media_id", AbstractC003100w.A0k(10, A38));
                    List list = A02.A0e;
                    A002.AAP("delivery_flags", AbstractC77343dK.A00(list));
                    A002.A7v("is_ad", Boolean.valueOf(A02.CdW()));
                    A002.AAP("inventory_source", A02(A02.A0C.BJN()));
                    if (list.contains(EnumC73363Qm.A05)) {
                        A002.AAP(TraceFieldType.RequestID, c9cb.A02);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            A002.Cht();
        }
    }

    private final void A06(C9CB c9cb, UserSession userSession, C3XG c3xg, Integer num) {
        C18920wW A012 = A01(userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "instagram_feed_item_removed");
        if (A002.isSampled()) {
            A002.AAP(AbstractC31182DnR.A05(374, 10, 34), c9cb.A03);
            A002.AAP(TraceFieldType.RequestID, c9cb.A02);
            A002.AAP("request_type", c9cb.A01.toString());
            C38321qM A02 = C3XH.A02(c3xg.A05);
            if (A02 != null) {
                String A38 = A02.A38();
                if (A38 != null) {
                    A002.A9K("media_id", AbstractC003100w.A0k(10, A38));
                    A002.A7v("is_ad", Boolean.valueOf(A02.CdW()));
                    A002.AAP("delivery_flags", AbstractC77343dK.A00(A02.A0e));
                    A002.AAP("feed_item_type", c3xg.A06.toString());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (num != null) {
                A002.A9K("expected_position", Long.valueOf(num.intValue()));
            }
            A002.Cht();
        }
    }
}
