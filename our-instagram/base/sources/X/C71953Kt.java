package X;

import com.facebook.common.callercontext.CallerContext;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71953Kt {
    public static final int A00(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        int i = 0;
        if ((!z || !AbstractC54472f1.A04(18316910236091634L, true)) && !AbstractC54472f1.A04(18316910236026097L, true) && !AbstractC54472f1.A06(userSession, 36331248615965919L)) {
            Iterator it = C0BQ.A00(userSession).BOf(C08730cb.A00(userSession).A00()).iterator();
            while (it.hasNext()) {
                if (((User) it.next()).A02() > 0) {
                    i++;
                }
            }
        }
        return i;
    }

    public static final int A01(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        if ((z && AbstractC54472f1.A04(18316910236091634L, true)) || AbstractC54472f1.A04(18316910236026097L, true) || AbstractC54472f1.A06(userSession, 36331248615965919L)) {
            return 0;
        }
        return AbstractC71963Ku.A00(userSession);
    }

    public static final boolean A02(String str) {
        C14360o3.A0B(str, 0);
        if (!AbstractC54472f1.A04(18301933687869707L, true)) {
            return false;
        }
        if (System.currentTimeMillis() >= AbstractC19750y3.A01(C1AV.A1V.toString()).getLong(AbstractC71973Kv.A00(str), 0L)) {
            return false;
        }
        return true;
    }

    public final int A03(UserSession userSession, boolean z) {
        InterfaceC19630xq A03;
        String string;
        C71993Kx c71993Kx;
        C14360o3.A0B(userSession, 0);
        if (!A02(userSession.userId) && AbstractC54472f1.A03()) {
            C2Ne A00 = AbstractC49092Nc.A00(userSession);
            boolean A04 = AbstractC54472f1.A04(18301933686558975L, true);
            CallerContext callerContext = C3Ks.A00;
            boolean A08 = AbstractC54472f1.A08(userSession, A00.A00(callerContext, "fx_company_identity_switcher_linking_cache"));
            if (A04 && A08) {
                return 0;
            }
            C40921uz c40921uz = A00.A00;
            C41061vE c41061vE = c40921uz.A07;
            String str = callerContext.A02;
            C14360o3.A07(str);
            c41061vE.A05("cache_access_without_acl_check", "fx_company_identity_switcher_linking_cache", null, AbstractC06930Yk.A02(new C09530e4("caller_class", str)));
            List list = c40921uz.A01.A02;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((FxCalAccount) obj).A04.equalsIgnoreCase("FACEBOOK")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((FxCalAccount) it.next()).A07);
            }
            java.util.Set A0k = AbstractC001800i.A0k(AbstractC001800i.A0X(arrayList2));
            List list2 = c40921uz.A02.A02;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                if (AbstractC001800i.A0u(A0k, ((FxCalAccountWithSwitcherInfo) obj2).A07)) {
                    arrayList3.add(obj2);
                }
            }
            int i = 0;
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                i += ((FxCalAccountWithSwitcherInfo) it2.next()).A00;
            }
            if (z && (string = (A03 = C1AT.A01(userSession).A03(C1AV.A1V)).getString("switcher_aggregate_seen_badge_count", null)) != null && (c71993Kx = (C71993Kx) new Gson().A08(string, C71993Kx.class)) != null) {
                if (c71993Kx.A00 != i) {
                    InterfaceC19610xo ARD = A03.ARD();
                    ARD.EEj("switcher_aggregate_seen_badge_count");
                    ARD.apply();
                }
            }
            return i;
        }
        return 0;
    }

    public final int A04(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        if ((z && AbstractC54472f1.A04(18316910236091634L, true)) || AbstractC54472f1.A04(18316910236026097L, true) || AbstractC54472f1.A04(18316910236157171L, true) || AbstractC54472f1.A06(userSession, 36331248615965919L)) {
            return 0;
        }
        return A03(userSession, true);
    }

    public final int A05(UserSession userSession, boolean z) {
        int i = 0;
        if ((z && AbstractC54472f1.A04(18316910236091634L, true)) || AbstractC54472f1.A04(18316910236026097L, true) || AbstractC54472f1.A06(userSession, 36331248615965919L)) {
            return 0;
        }
        if (AbstractC54472f1.A03()) {
            i = A03(userSession, true);
        }
        return AbstractC71963Ku.A00(userSession) + i;
    }

    public final void A06(UserSession userSession, Integer num) {
        AbstractC54332en.A00(userSession).A00().A00.AHj();
        int A01 = A01(userSession, true);
        int A00 = A00(userSession, true);
        int A04 = A04(userSession, true);
        int i = 0;
        if (A04 > 0) {
            i = 1;
        }
        int i2 = A01 + A04;
        C54432ex c54432ex = new C54432ex(EnumC54222eY.A0b, null, i2, i2);
        if (i2 > 0) {
            C54392et A002 = AbstractC54332en.A00(userSession).A00();
            EnumC58162lY enumC58162lY = EnumC58162lY.A06;
            EnumC58122lU enumC58122lU = EnumC58122lU.A03;
            A002.A04(enumC58122lU, enumC58162lY, c54432ex, num, A00, i, A01, A04);
            C54412ev A012 = AbstractC54332en.A00(userSession).A01();
            C14360o3.A0B(enumC58162lY, 0);
            A012.A02(new C72053Ld(enumC58122lU, enumC58162lY, null, null), c54432ex);
        }
    }
}
