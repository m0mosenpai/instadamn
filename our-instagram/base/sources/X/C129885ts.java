package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.follow.GraphQLFollowRequestApiKt;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.5ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129885ts {
    public String A00;
    public final Context A01;
    public final UserSession A02;
    public final int A03;
    public final C1GL A04;
    public final Map A05;
    public final boolean A06;

    public C129885ts(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A04 = C1GJ.A01();
        this.A05 = new HashMap();
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        this.A01 = context;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A06 = C18U.A06(c06090Tz, userSession, 36328117585460415L);
        this.A03 = (int) C18U.A01(c06090Tz, userSession, 36609592563537846L);
    }

    public final C1ON A05(EnumC33402EpZ enumC33402EpZ, User user) {
        String str;
        Integer B7X;
        C14360o3.A0B(user, 0);
        C14360o3.A0B(enumC33402EpZ, 1);
        Map map = this.A05;
        synchronized (map) {
            String id = user.getId();
            str = enumC33402EpZ.A00;
            map.put(id, str);
        }
        UserSession userSession = this.A02;
        User A02 = AnonymousClass189.A00(userSession).A02(userSession.userId);
        if (A02 != null && (B7X = A02.A03.B7X()) != null && B7X.intValue() >= 2000 && (enumC33402EpZ == EnumC33402EpZ.A06 || enumC33402EpZ == EnumC33402EpZ.A0A)) {
            C18U.A06(C06090Tz.A05, userSession, 36323466136399131L);
        }
        return AbstractC151506rw.A00(this.A01, userSession, null, null, null, null, null, null, user.getId(), str, A00(), null, null, null, null, null);
    }

    public final void A08(Activity activity, C1P1 c1p1, UserSession userSession, User user) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(user, 2);
        A01(activity, new C52219N9i(c1p1, userSession, this, user), null, null, null, this, EnumC33402EpZ.A08, user, null, null, null, null, null, null, null, null, null, true);
    }

    public final void A0B(C07X c07x, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c07x, 0);
        C57312k6 A00 = AbstractC57302k5.A00(c07x.getLifecycle());
        C206719Dc c206719Dc = new C206719Dc(null, interfaceC16660sJ, this, str, null, 1);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206719Dc, A00);
    }

    public final void A0C(C151516rx c151516rx, User user, String str) {
        C14360o3.A0B(user, 0);
        C14360o3.A0B(c151516rx, 1);
        user.A0z(c151516rx.A0E);
        user.A1E(c151516rx.A0F);
        Boolean bool = c151516rx.A02;
        if (bool != null) {
            user.A10(bool.booleanValue());
        }
        Boolean bool2 = c151516rx.A07;
        if (bool2 != null) {
            user.A16(bool2.booleanValue());
        }
        Boolean bool3 = c151516rx.A0A;
        if (bool3 != null) {
            user.A0m(bool3);
        }
        Boolean bool4 = c151516rx.A00;
        if (bool4 != null) {
            user.A0v(bool4.booleanValue());
        }
        Boolean bool5 = c151516rx.A01;
        if (bool5 != null) {
            user.A0w(bool5.booleanValue());
        }
        Boolean bool6 = c151516rx.A05;
        if (bool6 != null) {
            user.A14(bool6.booleanValue());
        }
        Boolean bool7 = c151516rx.A06;
        if (bool7 != null) {
            user.A15(bool7.booleanValue());
        }
        Boolean bool8 = c151516rx.A04;
        if (bool8 != null) {
            user.A13(bool8.booleanValue());
        }
        Boolean bool9 = c151516rx.A03;
        if (bool9 != null) {
            user.A11(bool9.booleanValue());
        }
        Boolean bool10 = c151516rx.A0B;
        if (bool10 != null) {
            user.A1F(bool10.booleanValue());
        }
        Boolean bool11 = c151516rx.A09;
        if (bool11 != null) {
            user.A0x(bool11.booleanValue());
        }
        Boolean bool12 = c151516rx.A0C;
        if (bool12 != null) {
            user.A1D(bool12.booleanValue());
        }
        Boolean bool13 = c151516rx.A08;
        if (bool13 != null) {
            C17P c17p = user.A03;
            C17R c17r = new C17R(c17p.B8n());
            c17r.A04 = bool13;
            c17p.EUq(c17r.A00());
        }
        Boolean bool14 = c151516rx.A0D;
        if (bool14 != null) {
            C17P c17p2 = user.A03;
            C17R c17r2 = new C17R(c17p2.B8n());
            c17r2.A0N = bool14;
            c17p2.EUq(c17r2.A00());
        }
        A0F(user, str, c151516rx.A0E, c151516rx.A0F);
    }

    public final void A0D(FollowStatus followStatus, User user, boolean z) {
        C14360o3.A0B(user, 0);
        A04(C57582kX.A00(this.A02).A0N(user), followStatus, user, z);
    }

    public final void A0E(User user) {
        C14360o3.A0B(user, 0);
        user.A0F();
        A0D(user.A0F(), user, false);
        user.A03.EWv(null);
    }

    public final void A0F(User user, String str, boolean z, boolean z2) {
        FollowStatus followStatus;
        if (z2) {
            followStatus = FollowStatus.A07;
        } else if (z) {
            followStatus = FollowStatus.A05;
        } else {
            followStatus = FollowStatus.A06;
        }
        Map map = this.A05;
        synchronized (map) {
            String str2 = (String) map.get(user.getId());
            if (str2 != null && !str2.equals(str)) {
                user.A03.EWv(followStatus);
            } else {
                map.remove(user.getId());
                A04(user.B7L(), followStatus, user, false);
            }
        }
    }

    public final void A0G(final User user, boolean z) {
        C14360o3.A0B(user, 0);
        UserSession userSession = this.A02;
        if (C57582kX.A00(userSession).A0N(user) == FollowStatus.A08) {
            A0D(FollowStatus.A04, user, false);
        }
        C1ON A02 = AbstractC151506rw.A02(userSession, user.getId(), z);
        A02.A00 = new C1P1() { // from class: X.6r7
            @Override // X.C1P1
            public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-1052888802);
                C129885ts c129885ts = C129885ts.this;
                C57582kX A00 = C57582kX.A00(c129885ts.A02);
                User user2 = user;
                if (A00.A0N(user2) == FollowStatus.A04) {
                    c129885ts.A0E(user2);
                }
                C0f9.A0A(-67160185, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                int A03 = C0f9.A03(-854529338);
                C151516rx c151516rx = (C151516rx) obj;
                int A032 = C0f9.A03(1935105997);
                C14360o3.A0B(c151516rx, 0);
                C129885ts.this.A0C(c151516rx, user, null);
                C0f9.A0A(663984267, A032);
                C0f9.A0A(-505627464, A03);
            }
        };
        A03(A02, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r2.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String A00() {
        /*
            r3 = this;
            java.lang.String r2 = r3.A00
            if (r2 == 0) goto Lb
            int r0 = r2.length()
            r1 = 0
            if (r0 != 0) goto Lc
        Lb:
            r1 = 1
        Lc:
            java.lang.String r0 = "follow_unknown"
            if (r1 != 0) goto L13
            if (r2 == 0) goto L26
            return r2
        L13:
            X.1Rh r2 = X.C26771Rh.A00()
            X.C14360o3.A07(r2)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L26
            java.lang.String r0 = r2.A00
            X.C14360o3.A07(r0)
            return r0
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129885ts.A00():java.lang.String");
    }

    public static final void A02(Context context, C1P1 c1p1, EDR edr, C129885ts c129885ts) {
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0s(true);
        c193328hC.A0t(true);
        c193328hC.A05 = edr.A04;
        c193328hC.A0r(edr.A03);
        c193328hC.A0J(null, 2131954754);
        String string = context.getString(2131965990);
        C14360o3.A07(string);
        c193328hC.A0c(new DialogInterfaceOnClickListenerC35351FiS(context, c1p1, edr, c129885ts), string);
        String string2 = context.getString(2131954754);
        C14360o3.A07(string2);
        c193328hC.A0Y(DialogInterfaceOnClickListenerC28560Cis.A00, EnumC193348hE.A03, string2, true);
        c193328hC.A0C(new DialogInterfaceOnCancelListenerC35295FhU(c1p1, edr));
        C0fJ.A00(c193328hC.A02());
    }

    public static final void A03(C1ON c1on, C129885ts c129885ts) {
        if (c129885ts.A06) {
            c129885ts.A04.schedule(new JZT(c1on, Integer.valueOf(c129885ts.A03)), c1on.A04.runnableId, 3, true, false);
        } else {
            c129885ts.A04.schedule(c1on);
        }
    }

    private final void A04(FollowStatus followStatus, FollowStatus followStatus2, User user, boolean z) {
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A02;
        User A01 = c08730cb.A01(userSession);
        if (followStatus2 != null) {
            int ordinal = followStatus2.ordinal();
            if (ordinal != 3) {
                if (ordinal == 4) {
                    FollowStatus A0F = user.A0F();
                    FollowStatus followStatus3 = FollowStatus.A06;
                    if (((A0F == followStatus3 && followStatus == FollowStatus.A04 && user.A25()) || followStatus == FollowStatus.A07 || followStatus == followStatus3) && z) {
                        user.A0f(userSession);
                        A01.A0g(userSession);
                    }
                }
            } else if (followStatus == FollowStatus.A05 && z) {
                user.A0d(userSession);
                A01.A0e(userSession);
            }
        }
        user.A03.EWv(followStatus);
        user.A0k(followStatus2);
        if (followStatus2 != FollowStatus.A08) {
            AbstractC25651Mw.A00(userSession).E4s(new C70073Cr(user, z));
        }
    }

    public final Object A06(String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        this.A00 = str2;
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36330703155119072L)) {
            return GraphQLFollowRequestApiKt.A03(userSession, str, AbstractC15820qc.A09(this.A01), interfaceC23621Ds);
        }
        return AbstractC151506rw.A00(this.A01, userSession, null, null, null, null, null, null, str, "ignore", A00(), null, null, null, null, null).A02(interfaceC23621Ds, 414639935, 3, false);
    }

    public final Object A07(String str, InterfaceC23621Ds interfaceC23621Ds) {
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36330703155119072L)) {
            return GraphQLFollowRequestApiKt.A02(userSession, str, AbstractC15820qc.A09(this.A01), interfaceC23621Ds);
        }
        return AbstractC151506rw.A00(this.A01, userSession, null, null, null, null, null, null, str, "approve", A00(), null, null, null, null, null).A02(interfaceC23621Ds, 1712513969, 3, false);
    }

    public final void A0A(C07X c07x, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C57312k6 A00 = C07Y.A00(c07x);
        C206749Df c206749Df = new C206749Df(this, interfaceC16660sJ2, interfaceC16660sJ, str2, str, null, 3);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206749Df, A00);
    }

    public static final void A01(Context context, C1P1 c1p1, C38321qM c38321qM, C75113Zb c75113Zb, SearchContext searchContext, C129885ts c129885ts, EnumC33402EpZ enumC33402EpZ, User user, Boolean bool, Boolean bool2, Integer num, Long l, String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        C104024mO c104024mO;
        Integer B7X;
        Map map = c129885ts.A05;
        synchronized (map) {
            if (z) {
                map.put(user.getId(), enumC33402EpZ.A00);
            }
        }
        if (AbstractC129875tr.A02(enumC33402EpZ)) {
            c104024mO = C57582kX.A00(c129885ts.A02).A0L(enumC33402EpZ, user, AbstractC15820qc.A09(context));
        } else {
            c104024mO = null;
        }
        UserSession userSession = c129885ts.A02;
        User A02 = AnonymousClass189.A00(userSession).A02(userSession.userId);
        if (A02 != null && (B7X = A02.A03.B7X()) != null && B7X.intValue() >= 2000 && (enumC33402EpZ == EnumC33402EpZ.A06 || enumC33402EpZ == EnumC33402EpZ.A0A)) {
            C18U.A06(C06090Tz.A05, userSession, 36323466136399131L);
        }
        String id = user.getId();
        String str5 = enumC33402EpZ.A00;
        C1ON A00 = AbstractC151506rw.A00(context, userSession, c38321qM, c75113Zb, searchContext, bool, bool2, l, id, str5, c129885ts.A00(), str, str2, str3, str4, jSONObject);
        A00.A00 = new C33277EnY(context, c1p1, userSession, c38321qM, c75113Zb, searchContext, c104024mO, c129885ts, enumC33402EpZ, user, bool, num, str, str2, str3, str4, str5, c129885ts.A00(), jSONObject, z);
        A03(A00, c129885ts);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(android.content.Context r35, X.C19260xA r36, X.C1P1 r37, X.C38321qM r38, X.C75113Zb r39, com.instagram.profile.intf.UserDetailEntryInfo r40, com.instagram.search.common.analytics.SearchContext r41, X.EnumC77563dg r42, com.instagram.user.model.User r43, java.lang.Boolean r44, java.lang.Double r45, java.lang.Integer r46, java.lang.Long r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, org.json.JSONObject r56) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129885ts.A09(android.content.Context, X.0xA, X.1P1, X.1qM, X.3Zb, com.instagram.profile.intf.UserDetailEntryInfo, com.instagram.search.common.analytics.SearchContext, X.3dg, com.instagram.user.model.User, java.lang.Boolean, java.lang.Double, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
