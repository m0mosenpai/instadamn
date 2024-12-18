package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.3KX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KX implements InterfaceC13000lm {
    public static final InterfaceC11380iw A08 = new C19270xB("live_in_app_notif");
    public Context A00;
    public UserSession A01;
    public InterfaceC147726kx A02;
    public boolean A03;
    public boolean A04;
    public final HashMap A06 = new HashMap();
    public final HashMap A07 = new HashMap();
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public final void A08(String str, String str2) {
        if (this.A01 != null && this.A00 != null) {
            A05(new PJ8(this, str2), this, C05F.A0C, str, false);
        }
    }

    public static final C35129FeW A00(Reel reel, User user, C3KX c3kx, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C105824pt c105824pt;
        String str5;
        User user2;
        java.util.Set A06;
        int i;
        Object[] objArr;
        ImageUrl imageUrl = null;
        if (c3kx.A00 == null || (c105824pt = reel.A0H) == null) {
            return null;
        }
        String username = user.getUsername();
        Context context = c3kx.A00;
        if (context != null) {
            if (str.length() == 0) {
                if (z3) {
                    i = 2131964048;
                    if (z) {
                        i = 2131964126;
                    }
                } else if (z) {
                    i = 2131964125;
                } else {
                    i = 2131964047;
                    if (z2) {
                        i = 2131964041;
                    }
                }
                objArr = new Object[]{username};
            } else {
                if (z3) {
                    i = 2131964049;
                    if (z) {
                        i = 2131964127;
                    }
                } else if (z) {
                    i = 2131964128;
                } else {
                    i = 2131964050;
                    if (z2) {
                        i = 2131964042;
                    }
                }
                objArr = new Object[]{username, str};
            }
            str5 = context.getString(i, objArr);
        } else {
            str5 = null;
        }
        if (!reel.A0d() || ((A06 = c105824pt.A06()) != null && A06.isEmpty())) {
            user2 = null;
        } else {
            user2 = (User) c105824pt.A06().iterator().next();
        }
        C34648FOf A00 = C35129FeW.A00(c3kx.A01.userId);
        A00.A0G = "ig_live_invite_notification_type";
        A00.A0E = str5;
        A00.A04 = user.Bhu();
        if (user2 != null) {
            imageUrl = user2.Bhu();
        }
        A00.A05 = imageUrl;
        A00.A03 = PushChannelType.A09;
        A00.A08 = new C49484Ltx(c105824pt, reel, user, c3kx, str2, str3, str4);
        return new C35129FeW(A00);
    }

    public static final void A03(Reel reel, User user, C3KX c3kx, String str, boolean z) {
        User A0D;
        C105824pt c105824pt;
        C35129FeW c35129FeW;
        UserSession userSession;
        C105824pt c105824pt2;
        boolean z2;
        int i;
        Object[] objArr;
        C109054vU c109054vU;
        InterfaceC108984vN interfaceC108984vN;
        Fragment A0O;
        if (c3kx.A00 != null && (A0D = reel.A0D()) != null && (c105824pt = reel.A0H) != null) {
            String A00 = AbstractC43591JPw.A00(47);
            C14360o3.A0C(A0D, A00);
            String str2 = c105824pt.A0X;
            str2.getClass();
            String str3 = c105824pt.A0e;
            str3.getClass();
            User user2 = user;
            if (C2OG.A01().A0B()) {
                FragmentActivity A002 = C3KW.A00();
                if (A002 != null && (A0O = A002.getSupportFragmentManager().A0O(R.id.layout_container_main)) != null && (A0O instanceof C52154N6e) && A0O.isVisible()) {
                    return;
                }
                InterfaceC147726kx interfaceC147726kx = c3kx.A02;
                if ((interfaceC147726kx != null && !interfaceC147726kx.Ejd(str2)) || !z) {
                    return;
                }
                if (user != null) {
                    HashMap hashMap = c3kx.A06;
                    if (str2.equals(hashMap.get(new String[]{A0D.getId(), user.getId()}))) {
                        return;
                    } else {
                        hashMap.put(new String[]{A0D.getId(), user.getId()}, str2);
                    }
                } else {
                    HashMap hashMap2 = c3kx.A07;
                    if (str2.equals(hashMap2.get(A0D.getId()))) {
                        return;
                    }
                    String id = A0D.getId();
                    UserSession userSession2 = c3kx.A01;
                    InterfaceC11380iw interfaceC11380iw = A08;
                    C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession2);
                    InterfaceC02590Ai A003 = A01.A00(A01.A00, "live_notification_bar_imp");
                    A003.A9K("a_pk", Long.valueOf(Long.parseLong(id)));
                    A003.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str2)));
                    A003.AAP("m_pk", str3);
                    A003.AAP("container_module", interfaceC11380iw.getModuleName());
                    A003.A9K("b_pk", AbstractC003100w.A0k(10, str2));
                    A003.Cht();
                    hashMap2.put(A0D.getId(), str2);
                }
                C2OG A012 = C2OG.A01();
                User A0D2 = reel.A0D();
                C14360o3.A0C(A0D2, A00);
                Context context = c3kx.A00;
                if (context != null && (userSession = c3kx.A01) != null && (c105824pt2 = reel.A0H) != null) {
                    String str4 = c105824pt2.A0Y;
                    if (str4 == null) {
                        str4 = "";
                    }
                    C3PO c3po = c105824pt2.A0A;
                    if (c3po == null) {
                        c3po = C3PO.A08;
                    }
                    boolean z3 = false;
                    if (c3po == C3PO.A0A) {
                        z3 = true;
                    }
                    if (c3po == C3PO.A05 || (c3po == C3PO.A04 && (c109054vU = c105824pt2.A02) != null && (interfaceC108984vN = c109054vU.A0A) != null && interfaceC108984vN.CX2())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C3PO c3po2 = c105824pt2.A0A;
                    if (c3po2 == null) {
                        c3po2 = C3PO.A08;
                    }
                    boolean z4 = false;
                    if (c3po2 == C3PO.A04) {
                        z4 = true;
                    }
                    boolean A0j = reel.A0j();
                    User user3 = A0D2;
                    if (user != null) {
                        if (user.B7L() == FollowStatus.A05 && A0D2.B7L() == FollowStatus.A06) {
                            user2 = A0D2;
                            user3 = user;
                        }
                        if (z3) {
                            i = 2131964129;
                        } else if (z2) {
                            i = 2131964077;
                        } else {
                            i = 2131964081;
                            if (z4) {
                                i = 2131964039;
                            }
                        }
                        objArr = new Object[2];
                        objArr[0] = user3.getUsername();
                        str4 = user2.getUsername();
                    } else if (str4.length() > 0) {
                        if (z3) {
                            i = 2131964132;
                        } else if (z2) {
                            i = 2131964080;
                        } else {
                            i = 2131964150;
                            if (z4) {
                                i = 2131964044;
                            }
                        }
                        objArr = new Object[2];
                        objArr[0] = A0D2.getUsername();
                    } else {
                        if (A0j) {
                            if (z3) {
                                i = 2131964131;
                            } else if (z2) {
                                i = 2131964079;
                            } else {
                                i = 2131964103;
                                if (z4) {
                                    i = 2131964043;
                                }
                            }
                        } else if (z3) {
                            i = 2131964130;
                        } else if (z2) {
                            i = 2131964078;
                        } else {
                            i = 2131964092;
                            if (z4) {
                                i = 2131964040;
                            }
                        }
                        objArr = new Object[]{A0D2.getUsername()};
                        String string = context.getString(i, objArr);
                        C14360o3.A0A(string);
                        C34648FOf A004 = C35129FeW.A00(userSession.userId);
                        A004.A0G = str;
                        A004.A0E = string;
                        A004.A04 = A0D2.Bhu();
                        A004.A03 = PushChannelType.A09;
                        A004.A08 = new C49483Ltw(userSession, c105824pt2, reel, A0D2, c3kx);
                        c35129FeW = new C35129FeW(A004);
                    }
                    objArr[1] = str4;
                    String string2 = context.getString(i, objArr);
                    C14360o3.A0A(string2);
                    C34648FOf A0042 = C35129FeW.A00(userSession.userId);
                    A0042.A0G = str;
                    A0042.A0E = string2;
                    A0042.A04 = A0D2.Bhu();
                    A0042.A03 = PushChannelType.A09;
                    A0042.A08 = new C49483Ltw(userSession, c105824pt2, reel, A0D2, c3kx);
                    c35129FeW = new C35129FeW(A0042);
                } else {
                    c35129FeW = null;
                }
                A012.A0A(c35129FeW);
            }
        }
    }

    public static final void A05(InterfaceC43429JGt interfaceC43429JGt, C3KX c3kx, Integer num, String str, boolean z) {
        UserSession userSession = c3kx.A01;
        if (userSession != null && !C218914p.A08()) {
            C1ON A05 = AbstractC55182Odn.A05(userSession, str, true);
            A05.A00 = new HBW(userSession, interfaceC43429JGt, c3kx, num, str, z);
            C1GJ.A03(A05);
        }
    }

    public static final void A06(C3KX c3kx, String str, String str2, String str3) {
        UserSession userSession = c3kx.A01;
        InterfaceC11380iw interfaceC11380iw = A08;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "live_notification_bar_tapped");
        A00.A9K("a_pk", Long.valueOf(Long.parseLong(str3)));
        A00.A9K(TraceFieldType.BroadcastId, Long.valueOf(Long.parseLong(str2)));
        A00.AAP("m_pk", str);
        A00.AAP("container_module", interfaceC11380iw.getModuleName());
        A00.Cht();
    }

    public static final void A07(C3KX c3kx, String str, String str2, String str3) {
        UserSession userSession = c3kx.A01;
        if (userSession != null) {
            C19280xC A00 = C19280xC.A00(A08, "live_push_notification_fetch_broadcast_result");
            A00.A0C(TraceFieldType.BroadcastId, str);
            A00.A0C("a_pk", str2);
            A00.A0C("request_status", str3);
            AbstractC11060iN.A00(userSession).EHW(A00);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A07.clear();
        this.A00 = null;
    }

    public C3KX(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    public static final void A01(Reel reel, C3G2 c3g2, C3KX c3kx, String str, String str2) {
        boolean z;
        if (C2OG.A01().A0B()) {
            FragmentActivity A00 = C3KW.A00();
            UserSession userSession = c3kx.A01;
            if (A00 != null && userSession != null) {
                C105824pt c105824pt = reel.A0H;
                if (c105824pt != null) {
                    EnumC109104va enumC109104va = c105824pt.A06;
                    if (enumC109104va == null) {
                        enumC109104va = EnumC109104va.A0E;
                    }
                    if (enumC109104va.A00()) {
                        if (c3g2 == C3G2.A1c) {
                            z = true;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(reel);
                            IT4.A01(A00, userSession, reel, c3g2, str, str2, arrayList, 0, z, false);
                        }
                        C9GR.A07(A00, 2131965606);
                        return;
                    }
                }
                z = false;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(reel);
                IT4.A01(A00, userSession, reel, c3g2, str, str2, arrayList2, 0, z, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.6ab] */
    public static final void A02(Reel reel, C3G2 c3g2, C3KX c3kx, String str, String str2) {
        FragmentActivity A00 = C3KW.A00();
        UserSession userSession = c3kx.A01;
        if (A00 != null && userSession != null) {
            C105824pt c105824pt = reel.A0H;
            if (c105824pt != null) {
                EnumC109104va enumC109104va = c105824pt.A06;
                if (enumC109104va == null) {
                    enumC109104va = EnumC109104va.A0E;
                }
                if (enumC109104va.A00()) {
                    C9GR.A07(c3kx.A00, 2131965606);
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(reel);
            C14360o3.A0B(c3g2, 3);
            C1OU c1ou = C1OU.$redex_init_class;
            ?? obj = new Object();
            obj.A02(userSession, reel.getId(), arrayList);
            obj.A0H = str;
            obj.A0J = str2;
            obj.A04 = c3g2;
            obj.A08(UUID.randomUUID().toString());
            obj.A00 = 0;
            IT4.A00(A00, obj.A00(), userSession, reel, c3g2, false, false);
        }
    }

    public static final void A04(Reel reel, C3KX c3kx, String str) {
        Fragment fragment;
        FragmentActivity A00 = C3KW.A00();
        C105824pt c105824pt = reel.A0H;
        UserSession userSession = c3kx.A01;
        if (A00 != null) {
            AbstractC10360h2 supportFragmentManager = A00.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                fragment = supportFragmentManager.A0O(R.id.layout_container_main);
            } else {
                fragment = null;
            }
            if (c105824pt != null && userSession != null && fragment != null) {
                Context requireContext = fragment.requireContext();
                AbstractC018607g.A00(fragment);
                C56139Ovz A002 = MWJ.A00(requireContext, userSession);
                C14360o3.A07(C14250np.A00().A00);
                c105824pt.A0X.getClass();
                C14360o3.A0B(EnumC53123Nea.A02, 1);
                A002.A08(str);
            }
        }
    }
}
