package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2DP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DP extends AbstractC28641a0 {
    public final Context A00;
    public final C25671My A01;
    public final InterfaceC41501vz A02;
    public final InterfaceC41501vz A03;
    public final UserSession A04;
    public final C2DK A05;
    public final InterfaceC09390do A06;
    public final InterfaceC16820sZ A07;
    public final C2DO A08;

    public C2DP(Context context, C25671My c25671My, UserSession userSession, C2DO c2do, C2DK c2dk, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c25671My, 3);
        C14360o3.A0B(c2dk, 4);
        this.A04 = userSession;
        this.A00 = context;
        this.A01 = c25671My;
        this.A05 = c2dk;
        this.A07 = interfaceC16820sZ;
        this.A08 = c2do;
        this.A06 = AbstractC09440dt.A01(new C206869Dr(this, 1));
        this.A03 = new InterfaceC41501vz() { // from class: X.2DQ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                Long l;
                List list;
                Integer num;
                Long l2;
                long j;
                Context context2;
                EnumC47122Ee enumC47122Ee;
                String str2;
                String A0h;
                String id;
                int intValue;
                C45127Jxw c45127Jxw;
                int A03 = C0f9.A03(535593845);
                C2Io c2Io = (C2Io) obj;
                int A032 = C0f9.A03(1297310538);
                C14360o3.A0B(c2Io, 0);
                C2DP c2dp = C2DP.this;
                UserSession userSession2 = c2dp.A04;
                if (!C50C.A02(userSession2.userId) && (str = c2Io.A00.A00) != null) {
                    InterfaceC09390do interfaceC09390do = c2dp.A06;
                    C81663kb A0N = ((C2DU) ((C2DS) interfaceC09390do.getValue())).A0N(str);
                    C2DU c2du = (C2DU) ((C2DS) interfaceC09390do.getValue());
                    synchronized (c2du) {
                        l = c2du.A04;
                    }
                    if (l != null && A0N != null && (list = c2Io.A02) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!((C83403nh) obj2).A1S() || !C18U.A06(C06090Tz.A05, userSession2, 36320326514581875L)) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C83403nh c83403nh = (C83403nh) it.next();
                            MRU A00 = JQX.A00(userSession2.userId);
                            if (c83403nh.A1S()) {
                                num = C05F.A0Y;
                            } else {
                                num = C05F.A0N;
                            }
                            long Enf = A00.Enf(num);
                            A00.EWo("DirectInAppNotificationManagerImpl", Enf);
                            String str3 = c83403nh.A1h;
                            if (str3 != null) {
                                A00.EZ8(str3, Enf);
                            }
                            A00.EcB(userSession2.userId, Enf);
                            String C7I = A0N.C7I();
                            if (C7I != null) {
                                A00.ES0(C7I, Enf);
                            }
                            A00.Efm(Enf, A0N.CVQ());
                            A00.Efl(C4GR.A00(A0N.C7g()), Enf);
                            if (c83403nh.A1j(C08730cb.A00(userSession2).A00())) {
                                synchronized (c83403nh) {
                                    c45127Jxw = c83403nh.A0E;
                                }
                                if (c45127Jxw != null) {
                                    if (!C14360o3.A0K(c45127Jxw.A00, true)) {
                                    }
                                }
                                JQX.A00(userSession2.userId).DW4(Enf, -1, "message ineligible for in-app notification");
                            }
                            long C8i = c83403nh.C8i();
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            C2DU c2du2 = (C2DU) ((C2DS) interfaceC09390do.getValue());
                            synchronized (c2du2) {
                                l2 = c2du2.A04;
                            }
                            if (l2 != null) {
                                j = l2.longValue();
                            } else {
                                j = 0;
                            }
                            if (C8i > timeUnit.toMicros(j) && c83403nh.A10 != C2EY.A1k) {
                                C2DK c2dk2 = c2dp.A05;
                                if (!A0N.isMuted() && c2dk2.A01(A0N.C7I())) {
                                    if (c83403nh.A10 == C2EY.A1i) {
                                        UserSession userSession3 = c2dk2.A01;
                                        if (AbstractC23021Ah.A00(userSession3).A1m() && C18U.A06(C06090Tz.A05, userSession3, 36316254885253317L)) {
                                        }
                                    }
                                    if (AbstractC31224Do7.A01(A0N)) {
                                        UserSession userSession4 = c2dk2.A01;
                                        C23031Ai A002 = AbstractC23021Ah.A00(userSession4);
                                        if (!((Boolean) A002.A10.CES(A002, C23031Ai.A8c[336])).booleanValue() || !C18U.A06(C06090Tz.A05, userSession4, 36316254885187780L)) {
                                            context2 = c2dk2.A00;
                                            enumC47122Ee = EnumC47122Ee.A09;
                                        }
                                    } else {
                                        context2 = c2dk2.A00;
                                        enumC47122Ee = EnumC47122Ee.A08;
                                    }
                                    if ((!C14360o3.A0K(AbstractC47112Ed.A00(context2, enumC47122Ee, false), true) || !AbstractC47112Ed.A03(context2) || !AbstractC14480oK.A01(context2)) && ((str2 = c83403nh.A1p) == null || !str2.equals("click_to_direct_ad_interaction"))) {
                                        if (((Boolean) FEQ.A01.getValue()).booleanValue()) {
                                            if (C18U.A06(C06090Tz.A05, c2dk2.A01, 36321872702351225L)) {
                                            }
                                        }
                                        ImageUrl A003 = C2DP.A00(c2dp, c83403nh, A0N);
                                        if (A003 != null) {
                                            long j2 = AbstractC23021Ah.A00(userSession2).A01.getLong("odnc_last_opt_in_timestamp_ms", 0L);
                                            C83693oE c83693oE = new C83693oE(str);
                                            int C7g = A0N.C7g();
                                            String url = A003.getUrl();
                                            C14360o3.A07(url);
                                            Long valueOf = Long.valueOf(Enf);
                                            if (C4GR.A06(C7g) && c83403nh.A0W() == EnumC40111tc.A0Q) {
                                                long C8i2 = c83403nh.C8i();
                                                boolean A1S = c83403nh.A1S();
                                                if (j2 != 0 && C8i2 / 1000 > j2 && JUW.A03(userSession2, A1S) && C18U.A06(C06090Tz.A05, userSession2, 36325824072856992L)) {
                                                    C38321qM c38321qM = c83403nh.A0s;
                                                    if (c38321qM != null && valueOf != null && (A0h = c83403nh.A0h()) != null && (id = c38321qM.getId()) != null) {
                                                        boolean A1S2 = c83403nh.A1S();
                                                        Integer A0c = c83403nh.A0c(id);
                                                        C2r0 A004 = AbstractC61362qy.A00(userSession2);
                                                        if ((A0c == null || ((intValue = A0c.intValue()) != 0 && intValue != 1)) && !A004.A06(url) && !id.equals("0")) {
                                                            A004.A02(new C45061Jwq(c83693oE, valueOf, A0h, id, null, 1, A1S2, true), url);
                                                        }
                                                    }
                                                    if (AbstractC61362qy.A00(userSession2).A01.get(url) != null) {
                                                        C38321qM c38321qM2 = c83403nh.A0s;
                                                        if (c38321qM2 != null) {
                                                            C1OG A0J = C25821No.A00().A0J(A003, "Direct");
                                                            A0J.A05 = userSession2;
                                                            A0J.A0I = true;
                                                            A0J.A0F = true;
                                                            c38321qM2.A18();
                                                            A0J.A01();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C2DP.A01(c2dp, c83403nh, A0N, Enf, false);
                                    }
                                }
                                JQX.A00(userSession2.userId).DWA(C05F.A01, "notification ineligible for in-app filter", 1025, Enf);
                            }
                            JQX.A00(userSession2.userId).DW4(Enf, -1, "message ineligible for in-app notification");
                        }
                    }
                }
                C0f9.A0A(1164493318, A032);
                C0f9.A0A(-549468360, A03);
            }
        };
        this.A02 = new InterfaceC41501vz() { // from class: X.2DR
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                int A03 = C0f9.A03(-875153827);
                C4dX c4dX = (C4dX) obj;
                int A032 = C0f9.A03(229528435);
                C14360o3.A0B(c4dX, 0);
                C2DP c2dp = C2DP.this;
                boolean z = false;
                if (c4dX.A00 == 1) {
                    z = true;
                }
                C83693oE A00 = AbstractC140956Yx.A00(AbstractC140946Yw.A01(c4dX.A03));
                if (A00 != null && (str = A00.A00) != null) {
                    C81663kb A0N = ((C2DU) ((C2DS) c2dp.A06.getValue())).A0N(str);
                    long j = c4dX.A01;
                    if (A0N != null) {
                        C2DP.A01(c2dp, c4dX.A02, A0N, j, z);
                    }
                }
                C0f9.A0A(-454803336, A032);
                C0f9.A0A(749016464, A03);
            }
        };
        if (!C18U.A06(C06090Tz.A05, userSession, 36318475383216284L)) {
            this.A06.getValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if ((r33.BXP() & 1) != 1) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C2DP r31, X.C83403nh r32, X.C2EC r33, long r34, boolean r36) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DP.A01(X.2DP, X.3nh, X.2EC, long, boolean):void");
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (this.A05.A00()) {
            C25671My c25671My = this.A01;
            c25671My.A02(this.A03, C2Io.class);
            c25671My.A02(this.A02, C4dX.class);
        }
    }

    public static final ImageUrl A00(C2DP c2dp, C83403nh c83403nh, C2EC c2ec) {
        C38321qM A0T;
        ExtendedImageUrl extendedImageUrl = null;
        if (!c2ec.CXo()) {
            int dimensionPixelOffset = c2dp.A00.getResources().getDimensionPixelOffset(R.dimen.album_preview_add_item_margin);
            C2EY c2ey = c83403nh.A10;
            F3O f3o = F3O.$redex_init_class;
            int ordinal = c2ey.ordinal();
            if (ordinal != 20) {
                if (ordinal == 3) {
                    A0T = (C38321qM) c83403nh.A1T;
                }
            } else {
                A0T = c83403nh.A0T();
            }
            if (A0T != null && (extendedImageUrl = A0T.A1o(dimensionPixelOffset)) != null) {
                Integer valueOf = Integer.valueOf(c2ec.C7g());
                UserSession userSession = c2dp.A04;
                if (c83403nh.A0Z(userSession, valueOf).booleanValue()) {
                    C14360o3.A0B(userSession, 0);
                    C69580Vrj c69580Vrj = C69580Vrj.A03;
                    if (c69580Vrj == null) {
                        c69580Vrj = new C69580Vrj(userSession);
                        C69580Vrj.A03 = c69580Vrj;
                    }
                    return c69580Vrj.A00(extendedImageUrl, dimensionPixelOffset, dimensionPixelOffset);
                }
            }
        }
        return extendedImageUrl;
    }
}
