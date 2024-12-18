package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class J4M implements Runnable {
    public final /* synthetic */ C43301yx A00;
    public final /* synthetic */ C213219ci A01;

    public J4M(C43301yx c43301yx, C213219ci c213219ci) {
        this.A00 = c43301yx;
        this.A01 = c213219ci;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        String str;
        String str2;
        C105824pt c105824pt;
        String str3;
        C213219ci c213219ci = this.A01;
        if (c213219ci.A0C("payload") != null) {
            try {
                IKA parseFromJson = IAP.parseFromJson(C16V.A00(c213219ci.A0C("payload")));
                switch (parseFromJson.A01.ordinal()) {
                    case 0:
                    case 1:
                        if (parseFromJson.A00 == null) {
                            return;
                        }
                        C4M5.A00();
                        C43301yx c43301yx = this.A00;
                        UserSession userSession = c43301yx.A01;
                        Context context = c43301yx.A00;
                        String str4 = parseFromJson.A03;
                        String id = parseFromJson.A00.getId();
                        boolean z = parseFromJson.A06;
                        boolean z2 = parseFromJson.A05;
                        C3KX A01 = C3KW.A01(context, userSession);
                        UserSession userSession2 = A01.A01;
                        if (userSession2 == null) {
                            return;
                        }
                        Reel reel = null;
                        for (Reel reel2 : AbstractC37301Gc2.A0M(userSession2).A0U(false)) {
                            if (reel2.A0d()) {
                                C1NB c1nb = reel2.A0W;
                                if (c1nb != null) {
                                    num = c1nb.CBs();
                                } else {
                                    num = null;
                                }
                                if (num == C05F.A01) {
                                    if (c1nb != null) {
                                        str = c1nb.getId();
                                    } else {
                                        str = null;
                                    }
                                    if (C14360o3.A0K(str, id)) {
                                        C105824pt c105824pt2 = reel2.A0H;
                                        if (c105824pt2 != null) {
                                            str2 = c105824pt2.A0X;
                                            str2.getClass();
                                        } else {
                                            str2 = null;
                                        }
                                        if (C14360o3.A0K(str2, str4)) {
                                            reel = reel2;
                                        } else {
                                            C105824pt c105824pt3 = reel2.A0H;
                                            if (c105824pt3 != null) {
                                                EnumC109104va enumC109104va = c105824pt3.A06;
                                                if (enumC109104va == null) {
                                                    enumC109104va = EnumC109104va.A0E;
                                                }
                                                if (!enumC109104va.A00()) {
                                                    C3KW.A03(userSession2, AbstractC37301Gc2.A0i(reel2));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (C92M.A00(A01.A00, userSession2)) {
                            return;
                        }
                        if (reel != null) {
                            C105824pt c105824pt4 = reel.A0H;
                            if (c105824pt4 != null) {
                                c105824pt4.A0N = C05F.A01;
                            }
                            C3KX.A03(reel, null, A01, "ig_live_broadcast_start_notification_type", z);
                            return;
                        }
                        C3KX.A05(new C43053J1t(A01, z), A01, C05F.A01, str4, z2);
                        return;
                    case 2:
                        C4M5.A00();
                        C43301yx c43301yx2 = this.A00;
                        UserSession userSession3 = c43301yx2.A01;
                        Context context2 = c43301yx2.A00;
                        String str5 = parseFromJson.A03;
                        C3KX A012 = C3KW.A01(context2, userSession3);
                        UserSession userSession4 = A012.A01;
                        if (userSession4 == null || A012.A00 == null) {
                            return;
                        }
                        for (Reel reel3 : C1OU.A04(userSession4).A0U(false)) {
                            if (reel3.A0d()) {
                                C105824pt c105824pt5 = reel3.A0H;
                                if (c105824pt5 != null) {
                                    str3 = c105824pt5.A0X;
                                    str3.getClass();
                                } else {
                                    str3 = null;
                                }
                                if (C14360o3.A0K(str3, str5)) {
                                    C3KW.A03(userSession4, AbstractC37301Gc2.A0i(reel3));
                                }
                            }
                        }
                        return;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        C4M5.A00();
                        C43301yx c43301yx3 = this.A00;
                        UserSession userSession5 = c43301yx3.A01;
                        Context context3 = c43301yx3.A00;
                        String str6 = parseFromJson.A03;
                        java.util.Set set = parseFromJson.A04;
                        boolean z3 = parseFromJson.A06;
                        Long l = parseFromJson.A02;
                        C3KX A013 = C3KW.A01(context3, userSession5);
                        if (set == null) {
                            set = C16910sj.A00;
                        }
                        C14360o3.A0B(set, 1);
                        UserSession userSession6 = A013.A01;
                        if (userSession6 == null || A013.A00 == null) {
                            return;
                        }
                        ReelStore A04 = C1OU.A04(userSession6);
                        Reel A0M = A04.A0M(str6);
                        if (A0M != null && (c105824pt = A0M.A0H) != null) {
                            if (!c105824pt.A07()) {
                                c105824pt.A06 = EnumC109104va.A06;
                            } else {
                                java.util.Set set2 = c105824pt.A0n;
                                if (set2 == null) {
                                    c105824pt.A0n = AbstractC166987dD.A1H();
                                } else {
                                    set2.clear();
                                }
                                c105824pt.A0n.addAll(set);
                                if (l != null) {
                                    c105824pt.A0U = l;
                                }
                                if (set.size() == 1) {
                                    C3KX.A03(A0M, AbstractC25226BEj.A15(set.iterator()), A013, "ig_live_co_broadcast_notification_type", z3);
                                }
                                EnumC109104va enumC109104va2 = EnumC109104va.A06;
                                EnumC109104va enumC109104va3 = c105824pt.A06;
                                if (enumC109104va3 != null && enumC109104va2 == enumC109104va3) {
                                    c105824pt.A06 = EnumC109104va.A04;
                                    A04.A0Y(A0M);
                                }
                            }
                            A0M.A0R(userSession6);
                            return;
                        }
                        C3KX.A05(new C43054J1u(A013, set, z3), A013, C05F.A01, str6, true);
                        return;
                    default:
                        return;
                }
            } catch (IOException e) {
                C0K8.A0G("RequestStreamClientInitializer", "Error deserializing Subscription.xdt_live_notify_subscribe.payload", e);
            }
        }
    }
}
