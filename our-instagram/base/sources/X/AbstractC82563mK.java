package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3mK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82563mK {
    public static final EnumC64222vh A02(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals("feed_timeline")) {
            return EnumC64222vh.A06;
        }
        if (AbstractC002300n.A0h(str, "reel_", false)) {
            return EnumC64222vh.A09;
        }
        if (AbstractC002300n.A0h(str, "clips_viewer_", false)) {
            return EnumC64222vh.A03;
        }
        return EnumC64222vh.A0A;
    }

    public static final String A03(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 1);
        String A06 = AbstractC41071vF.A06(userSession, c38321qM);
        if (A06 == null) {
            return "";
        }
        return A06;
    }

    public static final String A04(UserSession userSession, InterfaceC38371qR interfaceC38371qR) {
        String A2u;
        C14360o3.A0B(userSession, 1);
        if (interfaceC38371qR == null) {
            return "n/a";
        }
        if (interfaceC38371qR instanceof C40971v4) {
            return ((C40971v4) interfaceC38371qR).A0S;
        }
        boolean CdW = interfaceC38371qR.BQN().CdW();
        C38321qM BQN = interfaceC38371qR.BQN();
        if (CdW) {
            A2u = AbstractC41071vF.A07(userSession, BQN);
        } else {
            A2u = BQN.A2u();
        }
        if (A2u == null) {
            return "n/a";
        }
        return A2u;
    }

    public static final int A00(C38321qM c38321qM) {
        Integer A2T;
        if (c38321qM != null && (A2T = c38321qM.A2T()) != null) {
            return A2T.intValue();
        }
        return -1;
    }

    public static final C9CQ A01(C38321qM c38321qM) {
        if (c38321qM != null) {
            c38321qM.CdW();
            String A2W = c38321qM.A2W();
            if (A2W == null) {
                A2W = "";
            }
            String A2b = c38321qM.A2b();
            if (A2b == null) {
                A2b = "";
            }
            String A2Z = c38321qM.A2Z();
            if (A2Z == null || A2Z.equals("0")) {
                A2Z = "";
            }
            String A2y = c38321qM.A2y();
            if (A2y == null) {
                A2y = "";
            }
            String A2V = c38321qM.A2V();
            if (A2V == null) {
                A2V = "";
            }
            String id = c38321qM.getId();
            if (id != null) {
                return new C9CQ(A2W, A2b, A2Z, 2, A2y, A2V, id);
            }
            throw new IllegalStateException("Required value was null.");
        }
        return new C9CQ(2);
    }

    public static final String A06(String str) {
        if (C14360o3.A0K(str, "media_or_ad")) {
            return "user_connected";
        }
        if (C14360o3.A0K(str, "explore_story")) {
            return "explore_unconnected";
        }
        return "n/a";
    }

    public static final String A05(C38321qM c38321qM, C75113Zb c75113Zb) {
        String id;
        List AmB;
        if ((c38321qM.A5M() && ((AmB = c38321qM.A0C.AmB()) == null || (c38321qM = (C38321qM) AmB.get(c75113Zb.A0B)) == null)) || (id = c38321qM.getId()) == null) {
            return "n/a";
        }
        return id;
    }

    public static final List A07(C38321qM c38321qM) {
        List AmB;
        if (c38321qM.A5M() && (AmB = c38321qM.A0C.AmB()) != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(AmB, 10));
            Iterator it = AmB.iterator();
            while (it.hasNext()) {
                String id = ((C38321qM) it.next()).getId();
                if (id != null) {
                    arrayList.add(id);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }
}
