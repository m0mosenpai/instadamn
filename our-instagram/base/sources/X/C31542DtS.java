package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.user.recommended.FollowListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DtS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31542DtS extends C7E1 implements InterfaceC65252xN, InterfaceC161877Mx {
    public int A00;
    public int A01;
    public GraphGuardianContent A02;
    public C47K A03;
    public C34537FJx A04;
    public InterfaceC37287Gbo A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Activity A0N;
    public final Context A0O;
    public final C65662y2 A0P;
    public final C65662y2 A0Q;
    public final C65662y2 A0R;
    public final InterfaceC11380iw A0S;
    public final UserSession A0T;
    public final C26957Buy A0U;
    public final C31369DqY A0V;
    public final ES2 A0W;
    public final C66692zm A0X;
    public final C34531FJr A0Y;
    public final C34531FJr A0Z;
    public final C168737g7 A0a;
    public final C31544DtU A0b;
    public final C31545DtV A0c;
    public final ESJ A0d;
    public final C65842yM A0e;
    public final EQR A0f;
    public final User A0g;
    public final FollowListData A0h;
    public final ESA A0i;
    public final C32450ERc A0j;
    public final C31567Dtt A0k;
    public final ERR A0l;
    public final C32458ERk A0m;
    public final C31566Dts A0n;
    public final C31566Dts A0o;
    public final C32443EQv A0p;
    public final ERT A0q;
    public final C32460ERm A0r;
    public final ERU A0s;
    public final C31568Dtu A0t;
    public final C31538DtO A0u;
    public final String A0v;
    public final List A0w;
    public final java.util.Set A0x;
    public final java.util.Set A0y;
    public final java.util.Set A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final int A14;
    public final int A15;
    public final C31335Dq0 A16;
    public final C31335Dq0 A17;
    public final InterfaceC62602sz A18;
    public final C34686FPx A19;
    public final C31576Du4 A1A;
    public final C32123E9w A1B;
    public final String A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.C47K r5) {
        /*
            r4 = this;
            r3 = 0
            r4.A03 = r5
            java.util.Set r2 = r4.A0y
            r2.clear()
            boolean r0 = r5.A08()
            if (r0 != 0) goto L2c
            java.util.ArrayList r0 = r5.A03()
        L12:
            java.util.Iterator r1 = r0.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r1.next()
            X.47O r0 = (X.C47O) r0
            com.instagram.user.model.User r0 = r0.A03
            java.lang.String r0 = r0.getId()
            r2.add(r0)
            goto L16
        L2c:
            boolean r0 = r5.A07()
            if (r0 != 0) goto L3b
            java.util.List r0 = r5.A0M
            if (r0 != 0) goto L12
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L3b:
            boolean r1 = r4.A1E
            r0 = 1
            if (r1 == 0) goto L42
            r4.A0H = r0
        L42:
            r4.A0G(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31542DtS.A0C(X.47K):void");
    }

    public final void A0D(User user) {
        C14360o3.A0B(user, 0);
        this.A0C.remove(user);
        this.A0w.remove(user);
        A0G(false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(java.util.List r7) {
        /*
            r6 = this;
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            boolean r0 = r6.A0K
            if (r0 == 0) goto L50
            r6.A0K = r5
            com.instagram.common.session.UserSession r3 = r6.A0T
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324673022341479(0x810d1900143167, double:3.035207714822193E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L44
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r7.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            com.instagram.user.model.User r1 = X.AbstractC25226BEj.A15(r2)
            java.util.Set r0 = r6.A0z
            boolean r0 = X.AbstractC31175DnJ.A1Y(r1, r0)
            if (r0 != 0) goto L21
            r3.add(r1)
            goto L21
        L37:
            java.util.ArrayList r1 = X.AbstractC001800i.A0U(r3)
            java.util.List r0 = r6.A0C
            int r0 = r0.size()
            r6.A01 = r0
            goto L51
        L44:
            java.util.List r0 = r6.A0C
            r0.clear()
            java.util.Set r0 = r6.A0z
            r0.clear()
            r6.A01 = r5
        L50:
            r1 = r7
        L51:
            r4 = 1
            r6.A0H = r4
            java.util.List r0 = r6.A0C
            r0.addAll(r1)
            java.util.Iterator r2 = r7.iterator()
            r3 = 0
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A15(r2)
            java.util.Set r1 = r6.A0z
            java.lang.String r0 = r0.getId()
            boolean r0 = r1.add(r0)
            if (r0 != 0) goto L5e
            int r3 = r3 + 1
            goto L5e
        L77:
            if (r3 == 0) goto L91
            X.0wb r2 = X.C18950wb.A01
            r1 = 1001131858(0x3bac0f52, float:0.0052508498)
            java.lang.String r0 = r6.A1C
            X.0f5 r1 = r2.AEp(r0, r1)
            java.lang.String r0 = "duplicate_count"
            r1.ABU(r0, r3)
            java.lang.String r0 = "is_gql_enabled"
            r1.ABX(r0, r4)
            r1.report()
        L91:
            r6.A0G(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31542DtS.A0E(java.util.List):void");
    }

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        if (!this.A0z.contains(str) && !this.A0y.contains(str)) {
            return false;
        }
        return true;
    }

    private final void A00() {
        List list = this.A0B;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A08(this.A0r, it.next());
            }
        }
    }

    private final void A01() {
        InterfaceC62602sz interfaceC62602sz;
        if (C18U.A06(C06090Tz.A05, this.A0T, 36329749672378891L) && (interfaceC62602sz = this.A18) != null) {
            if (!interfaceC62602sz.CLJ() || this.A0D) {
                int i = 0;
                if (!this.A0A.isEmpty()) {
                    A08(this.A0n, this.A16);
                    for (Object obj : this.A0A) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        A09(this.A0U, obj, Integer.valueOf(i));
                        i = i2;
                    }
                    return;
                }
                Context context = this.A0O;
                String A0P = AbstractC167027dH.A0P(context, 2131973020);
                C14360o3.A07(A0P);
                String A0P2 = AbstractC167027dH.A0P(context, 2131973019);
                C14360o3.A07(A0P2);
                A09(this.A0U, new BJF(A0P, A0P2, 4, true), 0);
            }
        }
    }

    private final void A03(boolean z) {
        InterfaceC62602sz interfaceC62602sz;
        if (this.A0M && AbstractC31171DnF.A1b(this.A0y) && (interfaceC62602sz = this.A18) != null) {
            if (!interfaceC62602sz.CLJ() || this.A0D) {
                C47K c47k = this.A03;
                if (c47k != null) {
                    A09(this.A0a, this.A17, this.A0Z);
                    List list = C16930sl.A00;
                    if (!c47k.A08()) {
                        list = c47k.A03();
                    } else if (!c47k.A07() && (list = c47k.A0M) == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    int i = 0;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        A09(this.A0V, list.get(i), Integer.valueOf(i));
                        i = i2;
                    }
                    if (z) {
                        this.A1B.A0E("su_added_to_view");
                    }
                    A08(this.A0t, this.A1A);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }

    private final boolean A04() {
        Context context = this.A0O;
        UserSession userSession = this.A0T;
        boolean A00 = C54P.A00(context, userSession);
        FollowListData followListData = this.A0h;
        if (C2TN.A05(userSession, followListData.A02) && followListData.A00 == EnumC31556Dtg.A05 && !this.A10 && A00) {
            return true;
        }
        return false;
    }

    private final boolean A05() {
        if (!this.A0u.A05()) {
            return false;
        }
        List list = this.A0C;
        if (list.isEmpty() || list.size() > this.A14) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((User) it.next()).B7L() == FollowStatus.A06) {
                return true;
            }
        }
        return false;
    }

    public final void A0F(List list) {
        this.A0C.clear();
        this.A0z.clear();
        A0E(list);
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        this.A0P.A03 = i;
        A0G(false, false);
    }

    @Override // X.C7E1, X.InterfaceC161877Mx
    public final void FAg() {
        if (this.A0G ^ A05()) {
            A0G(false, false);
        }
        super.FAg();
    }

    public static void A02(C31542DtS c31542DtS, C31535DtK c31535DtK, ArrayList arrayList) {
        for (Object obj : arrayList) {
            c31542DtS.A0C.remove(obj);
            c31542DtS.A0w.remove(obj);
        }
        c31542DtS.A0G(false, false);
        C08730cb c08730cb = C17060sy.A01;
        Integer B7S = c08730cb.A01(C31535DtK.A03(c31535DtK)).A03.B7S();
        if (B7S != null) {
            User A01 = c08730cb.A01(C31535DtK.A03(c31535DtK));
            A01.A03.EUj(Integer.valueOf(B7S.intValue() - arrayList.size()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x033a, code lost:
    
        if (r8.equals(r2.getFullName()) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0346, code lost:
    
        if (r7.isEmpty() != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x040c, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.FNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.FNu, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31542DtS.A0G(boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2y2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, X.EQR] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.FJr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.FJr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.2y2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.2y2, java.lang.Object] */
    public C31542DtS(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38O c38o, InterfaceC37216GaR interfaceC37216GaR, GYQ gyq, InterfaceC62602sz interfaceC62602sz, GYX gyx, User user, FollowListData followListData, EVJ evj, InterfaceC37297Gby interfaceC37297Gby, C38M c38m, C34485FHx c34485FHx, C31535DtK c31535DtK, C31535DtK c31535DtK2, C31535DtK c31535DtK3, C31535DtK c31535DtK4, C31535DtK c31535DtK5, C31535DtK c31535DtK6, C31535DtK c31535DtK7, C32123E9w c32123E9w, C31538DtO c31538DtO, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C65662y2 c65662y2;
        long j;
        boolean A1U;
        String str4;
        EnumC31556Dtg enumC31556Dtg;
        EnumC31556Dtg enumC31556Dtg2;
        EnumC31556Dtg enumC31556Dtg3;
        boolean A1a = AbstractC31175DnJ.A1a(userSession);
        C14360o3.A0B(str3, 32);
        this.A0O = context;
        this.A0N = activity;
        this.A0T = userSession;
        this.A0g = user;
        this.A0S = interfaceC11380iw;
        this.A0h = followListData;
        this.A18 = interfaceC62602sz;
        this.A09 = str;
        this.A10 = z;
        this.A13 = z2;
        this.A15 = i;
        this.A0v = str2;
        this.A1F = z4;
        this.A14 = i2;
        this.A08 = str3;
        this.A1E = z5;
        this.A0u = c31538DtO;
        this.A0P = new Object();
        ?? obj = new Object();
        obj.A03 = AbstractC167017dG.A06(context);
        this.A0Q = obj;
        if (z7) {
            ?? obj2 = new Object();
            obj2.A03 = context.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_survey_thanks_vertical_margin);
            c65662y2 = obj2;
        } else {
            c65662y2 = null;
        }
        this.A0R = c65662y2;
        EnumC31556Dtg enumC31556Dtg4 = followListData.A00;
        String str5 = followListData.A02;
        C31567Dtt c31567Dtt = new C31567Dtt(activity, context, interfaceC11380iw, userSession, enumC31556Dtg4, interfaceC37297Gby, c31538DtO, str5, z6);
        c31567Dtt.A01 = A1a;
        c31567Dtt.A00 = z3;
        UserSession userSession2 = this.A0T;
        FollowListData followListData2 = this.A0h;
        c31567Dtt.A02 = C2TN.A05(userSession2, followListData2.A02) && ((enumC31556Dtg3 = followListData2.A00) == EnumC31556Dtg.A05 || enumC31556Dtg3 == EnumC31556Dtg.A04);
        this.A0k = c31567Dtt;
        this.A0d = new ESJ(context, interfaceC11380iw, c31535DtK);
        this.A0i = new ESA(activity, context, null, interfaceC11380iw, userSession, evj, "unknown");
        this.A0X = new C66692zm(context);
        this.A0c = new C31545DtV(context);
        this.A0e = new C65842yM(context);
        this.A0a = new C168737g7(context);
        this.A0p = new C32443EQv(context);
        this.A0b = new C31544DtU(context);
        this.A0m = new C32458ERk(context, interfaceC11380iw, userSession, c31535DtK6);
        FollowListData followListData3 = this.A0h;
        EnumC31556Dtg enumC31556Dtg5 = followListData3.A00;
        EnumC31556Dtg enumC31556Dtg6 = EnumC31556Dtg.A04;
        if (enumC31556Dtg5 == enumC31556Dtg6 || enumC31556Dtg5 == EnumC31556Dtg.A05) {
            UserSession userSession3 = this.A0T;
            boolean A05 = C2TN.A05(userSession3, followListData3.A02);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (A05) {
                j = 36316014367346554L;
            } else {
                j = 36316014367281017L;
            }
            A1U = AbstractC31177DnL.A1U(c06090Tz, userSession3, j);
        } else {
            A1U = false;
        }
        C31369DqY c31369DqY = new C31369DqY(context, interfaceC11380iw, userSession, c38o, interfaceC37216GaR, A1U, A1a, false);
        UserSession userSession4 = this.A0T;
        FollowListData followListData4 = this.A0h;
        if (C2TN.A05(userSession4, followListData4.A02) && ((enumC31556Dtg2 = followListData4.A00) == EnumC31556Dtg.A05 || enumC31556Dtg2 == enumC31556Dtg6)) {
            str4 = interfaceC11380iw.getModuleName();
        } else {
            str4 = null;
        }
        c31369DqY.A00 = str4;
        this.A0V = c31369DqY;
        this.A0U = new C26957Buy(context, c31535DtK7);
        this.A0t = new C31568Dtu(context, c38m);
        this.A0s = new ERU(context, c34485FHx);
        this.A0l = new ERR(context, c31535DtK2);
        if (enumC31556Dtg4 == enumC31556Dtg6) {
            enumC31556Dtg = EnumC31556Dtg.A08;
        } else {
            enumC31556Dtg = EnumC31556Dtg.A09;
        }
        this.A0r = new C32460ERm(context, interfaceC11380iw, enumC31556Dtg, c31535DtK3);
        this.A0q = new ERT(context, c31535DtK5);
        this.A0j = new C32450ERc(context, c31535DtK4, c31538DtO.A06());
        this.A0o = new C31566Dts(context, gyq);
        this.A0n = new C31566Dts(context, null);
        ?? obj3 = new Object();
        obj3.A00 = gyx;
        this.A0f = obj3;
        this.A0W = new ES2(context);
        this.A0Z = new Object();
        this.A0Y = new Object();
        C31335Dq0 A00 = C31335Dq0.A00(2131964646);
        boolean z8 = false;
        A00.A02 = 0;
        A00.A0I = false;
        A00.A0G = AbstractC167027dH.A0P(context, 2131973168);
        A00.A09 = ViewOnClickListenerC35682FpH.A00(c31535DtK7, 31);
        this.A16 = A00;
        C31335Dq0 A002 = C31335Dq0.A00(2131974883);
        A002.A02 = 0;
        A002.A0I = false;
        this.A17 = A002;
        C31576Du4 c31576Du4 = new C31576Du4(C05F.A0C);
        c31576Du4.A02 = A1a;
        this.A1A = c31576Du4;
        this.A0z = AbstractC166987dD.A1H();
        this.A0C = AbstractC166987dD.A1E();
        this.A0y = AbstractC166987dD.A1H();
        this.A0x = AbstractC166987dD.A1H();
        this.A0w = AbstractC166987dD.A1E();
        this.A0A = AbstractC166987dD.A1E();
        this.A0M = A1a;
        this.A0J = A1a;
        this.A1B = c32123E9w;
        this.A1C = interfaceC11380iw.getModuleName();
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC16960so.A1Q(this.A0P, this.A0Q, this.A0s, this.A0p, this.A0k, this.A0d, this.A0i, this.A0V, this.A0X, this.A0c, this.A0e, this.A0t, this.A0a, this.A0l, this.A0o, this.A0r, this.A0q, this.A0W, this.A0b, this.A0m, this.A0U, this.A0n));
        if (z2) {
            A1F.add(this.A0f);
        }
        if (this.A0u.A05()) {
            A1F.add(this.A0j);
        }
        C65662y2 c65662y22 = this.A0R;
        if (c65662y22 != null) {
            A1F.add(c65662y22);
        }
        A0A(A1F);
        this.A11 = enumC31556Dtg4.A01;
        if (!this.A0F && C2TN.A07(userSession.userId, str5)) {
            z8 = true;
        }
        this.A1D = z8;
        C34686FPx c34686FPx = new C34686FPx(C05F.A00);
        c34686FPx.A01 = A1a;
        this.A19 = c34686FPx;
        this.A12 = this.A0C.isEmpty();
    }
}
