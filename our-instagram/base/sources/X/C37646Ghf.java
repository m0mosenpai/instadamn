package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ghf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37646Ghf implements InterfaceC669630n {
    public final UserSession A01;
    public C37702Gid A00 = null;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C57537PgB(this, 48));

    public C37646Ghf(UserSession userSession) {
        this.A01 = userSession;
    }

    @Override // X.InterfaceC669630n
    public final String B5L() {
        return "reels_iaa";
    }

    @Override // X.InterfaceC669630n
    public final void CKM(C206209Bd c206209Bd, List list) {
        EnumC71153Hb enumC71153Hb;
        Integer num;
        double d;
        java.util.Set set;
        Map map;
        Integer num2;
        int intValue;
        String Brx;
        String str;
        Object obj;
        boolean A1R = AbstractC167007dF.A1R(0, c206209Bd, list);
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36319209822821414L) && Bts().contains(c206209Bd) && list.size() == A1R) {
            C9C7 c9c7 = (C9C7) ((C9BW) list.get(0)).A01;
            switch (((AnonymousClass317) c9c7.A04).ordinal()) {
                case 0:
                    enumC71153Hb = EnumC71153Hb.A05;
                    break;
                case 1:
                    enumC71153Hb = EnumC71153Hb.A06;
                    break;
                case 2:
                    enumC71153Hb = EnumC71153Hb.A07;
                    break;
                case 7:
                    enumC71153Hb = EnumC71153Hb.A0H;
                    break;
                case 11:
                    enumC71153Hb = EnumC71153Hb.A0L;
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    enumC71153Hb = EnumC71153Hb.A0F;
                    break;
                case 30:
                    enumC71153Hb = EnumC71153Hb.A08;
                    break;
                default:
                    return;
            }
            C37702Gid c37702Gid = this.A00;
            if (c37702Gid == null) {
                return;
            }
            String str2 = ((C9CQ) c9c7.A02).A04;
            C14360o3.A0B(str2, 0);
            UserSession userSession2 = c37702Gid.A07;
            C38321qM A0h = AbstractC25229BEm.A0h(userSession2, str2);
            if (A0h == null) {
                return;
            }
            String A07 = AbstractC41071vF.A07(userSession2, A0h);
            if (A07 != null) {
                String A0F = AbstractC41071vF.A0F(userSession2, A0h);
                if (A0F != null) {
                    AbstractC39459Hbl abstractC39459Hbl = c37702Gid.A0A;
                    int A0D = abstractC39459Hbl.A0D(A0h);
                    Integer valueOf = Integer.valueOf(A0D);
                    if (A0D == -1 || valueOf == null) {
                        return;
                    }
                    int A0D2 = abstractC39459Hbl.A0D(A0h);
                    Integer valueOf2 = Integer.valueOf(A0D2);
                    if (A0D2 == -1) {
                        valueOf2 = null;
                    }
                    String str3 = null;
                    if (valueOf2 != null) {
                        Iterator it = AbstractC001800i.A0c(abstractC39459Hbl.A0J(), valueOf2.intValue() + 1).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (AbstractC37647Ghg.A00((C120985dq) obj)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        C120985dq c120985dq = (C120985dq) obj;
                        if (c120985dq != null) {
                            str3 = AbstractC41071vF.A06(userSession2, c120985dq.A06());
                        }
                    }
                    boolean A0O = AbstractC41071vF.A0O(userSession2, A0h);
                    String A00 = c37702Gid.A06.A00();
                    if (!C18U.A06(C06090Tz.A05, userSession2, 2342155871076222258L)) {
                        num = C05F.A0Y;
                    } else if (!A0O) {
                        num = C05F.A00;
                    } else if (C37702Gid.A0C) {
                        num = C05F.A0C;
                    } else {
                        Integer num3 = c37702Gid.A01;
                        num = C05F.A01;
                        if (num3 == num) {
                            num = C05F.A0N;
                        } else {
                            List A0J = abstractC39459Hbl.A0J();
                            ArrayList A1E = AbstractC166987dD.A1E();
                            Iterator it2 = A0J.iterator();
                            while (it2.hasNext()) {
                                IntentAwareAdsInfoIntf A002 = AbstractC37300Gc1.A0A(it2).A00();
                                if (A002 != null && (Brx = A002.Brx()) != null) {
                                    A1E.add(Brx);
                                }
                            }
                            if (A1E.contains(A07)) {
                                num = C05F.A0j;
                            } else {
                                List A0J2 = abstractC39459Hbl.A0J();
                                ArrayList A1E2 = AbstractC166987dD.A1E();
                                for (Object obj2 : A0J2) {
                                    IntentAwareAdsInfoIntf A003 = ((C120985dq) obj2).A00();
                                    if (A003 != null) {
                                        num2 = A003.BVJ();
                                    } else {
                                        num2 = null;
                                    }
                                    Integer A004 = C71113Gx.A00(num2);
                                    if (A004 != null && ((intValue = A004.intValue()) == 7 || intValue == 11)) {
                                        A1E2.add(obj2);
                                    }
                                }
                                if (A1E2.size() < AbstractC25225BEi.A07(c06090Tz, userSession2, 36600684799660004L)) {
                                    if (enumC71153Hb.ordinal() == 12) {
                                        d = C18U.A01(c06090Tz, userSession2, 36600684803461095L) / 100.0d;
                                    } else {
                                        d = 1.0d;
                                    }
                                    if (d < Math.random()) {
                                        num = C05F.A0u;
                                    } else {
                                        InterfaceC116925Qy interfaceC116925Qy = c37702Gid.A05;
                                        Map map2 = null;
                                        Map AUS = interfaceC116925Qy.AUS("ads/intent_aware_ads/reels/");
                                        if (AUS != null) {
                                            set = AbstractC85703rz.A01(AUS);
                                        } else {
                                            set = null;
                                        }
                                        c37702Gid.A02 = set;
                                        Context context = c37702Gid.A04;
                                        String moduleName = c37702Gid.A08.getModuleName();
                                        if (AUS != null) {
                                            map = AbstractC85703rz.A00(AUS);
                                        } else {
                                            map = null;
                                        }
                                        InterfaceC670130s interfaceC670130s = c37702Gid.A00;
                                        if (interfaceC670130s != null) {
                                            map2 = interfaceC670130s.Bkt();
                                        }
                                        C14360o3.A0B(moduleName, 7);
                                        C25621Ms A0q = AbstractC25228BEl.A0q(userSession2);
                                        A0q.A09(num);
                                        A0q.A0B("ads/intent_aware_ads/reels/");
                                        A0q.A0R(H93.class, IOO.class);
                                        AbstractC37300Gc1.A0y(A0q, moduleName);
                                        A0q.A9s("seed_ad_id", A07);
                                        A0q.A9s("seed_ad_token", A0F);
                                        A0q.A0H(AbstractC111324zv.A00(1127), str3);
                                        A0q.A0D("position", A0D);
                                        A0q.A9s("trigger_type", enumC71153Hb.A00);
                                        A0q.A0H("client_view_state_media_list", A00);
                                        if (map != null) {
                                            Iterator A15 = AbstractC166997dE.A15(map);
                                            while (A15.hasNext()) {
                                                AbstractC37303Gc4.A16(A0q, A15);
                                            }
                                        }
                                        if (map2 != null) {
                                            A0q.AA6("ad_and_netego_request_information", C85753s4.A00(map2));
                                        }
                                        A0q.A0R = A1R;
                                        AbstractC37301Gc2.A0t(context, A0q, userSession2);
                                        C1ON A0N = A0q.A0N();
                                        A0N.A00 = new HGX(enumC71153Hb, c37702Gid, A07, A0F, A0D, A0O);
                                        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A06;
                                        java.util.Set set2 = c37702Gid.A02;
                                        if (set2 != null) {
                                            interfaceC116925Qy.FCF(enumC74603Ws, set2);
                                        }
                                        C1GJ.A06(A0N, 1272817059, 2, A1R, A1R);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    C37526Gfi c37526Gfi = c37702Gid.A09;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c37526Gfi.A01, AbstractC111324zv.A00(2551));
                    if (!A0f.isSampled()) {
                        return;
                    }
                    C37526Gfi.A00(A0f, c37526Gfi, 0L);
                    AbstractC37301Gc2.A15(A0f, c37526Gfi.A00);
                    A0f.AAP("trigger_type", enumC71153Hb.A00);
                    A0f.A9K("multi_ads_type_number", 9L);
                    switch (num.intValue()) {
                        case 0:
                            str = "seed_ad_not_multi_ads_eligible";
                            break;
                        case 1:
                            str = AbstractC111324zv.A00(246);
                            break;
                        case 2:
                            str = "clips_async_ads_request_in_flight";
                            break;
                        case 3:
                            str = "clips_iaa_fetch_in_progress";
                            break;
                        case 4:
                            str = "clips_iaa_litho_disabled";
                            break;
                        case 5:
                            str = AbstractC111324zv.A00(439);
                            break;
                        default:
                            str = "coin_flip_failed";
                            break;
                    }
                    A0f.AAP("invalidation_reason", str);
                    A0f.A9K("hscroll_seed_ad_id", AbstractC166997dE.A0j(A07));
                    A0f.A9K("hscroll_seed_ad_position", AbstractC31171DnF.A0V(A0D));
                    A0f.A7v("is_seed_ad_multi_ads_eligible", AbstractC31173DnH.A0e(A0f, "hscroll_seed_ad_tracking_token", A0F, A0O));
                    A0f.Cht();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        return (java.util.Set) this.A02.getValue();
    }
}
