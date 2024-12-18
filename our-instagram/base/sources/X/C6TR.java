package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6TR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TR {
    public static final C6TR A00 = new Object();

    public static final ViewGroup A00(ViewGroup viewGroup, C80673iw c80673iw, UserSession userSession, InterfaceC59152nG interfaceC59152nG, C3G2 c3g2) {
        ViewGroup viewGroup2;
        Object obj;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        C1OU c1ou = C1OU.$redex_init_class;
        C14360o3.A0B(context, 0);
        ComponentCallbacks2C142736cZ componentCallbacks2C142736cZ = ComponentCallbacks2C142736cZ.A09;
        if (componentCallbacks2C142736cZ == null) {
            componentCallbacks2C142736cZ = new ComponentCallbacks2C142736cZ(context, userSession);
            context.registerComponentCallbacks(componentCallbacks2C142736cZ);
            ComponentCallbacks2C142736cZ.A09 = componentCallbacks2C142736cZ;
        }
        C14360o3.A07(componentCallbacks2C142736cZ);
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        if (!C18U.A06(C06090Tz.A05, userSession, 36323255681952878L)) {
            View view = (View) componentCallbacks2C142736cZ.A08.poll();
            if (view == null) {
                view = from.inflate(R.layout.layout_sponsored_reel_item, viewGroup, false);
            }
            C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) view;
            viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            View A002 = C50802Vb.A00(from, new ViewGroup.LayoutParams(-1, -1), viewGroup, R.layout.layout_sponsored_reel_item, 0, false, true);
            C14360o3.A0C(A002, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) A002;
        }
        try {
            C140436Wx c140436Wx = new C140436Wx(viewGroup2, userSession, componentCallbacks2C142736cZ);
            if (interfaceC59152nG != null) {
                c140436Wx.A0L.setPostProcessor(interfaceC59152nG);
            }
            if (c80673iw != null) {
                c140436Wx.A0L.setProgressiveImageConfig(c80673iw);
            }
            c140436Wx.A0Z.A00.setLayerType(1, null);
            viewGroup2.setTag(c140436Wx);
            return viewGroup2;
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append("\n|- Sponsored item View Hierarchy on ");
            if (c3g2 == null || (obj = c3g2.name()) == null) {
                obj = C3G2.A23;
            }
            sb.append(obj);
            sb.append(" -|\n");
            C14360o3.A0B(viewGroup2, 0);
            StringBuilder sb2 = new StringBuilder();
            VWH.A00(viewGroup2, sb2, 0);
            String obj2 = sb2.toString();
            C14360o3.A07(obj2);
            sb.append(obj2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final void A01(Context context, InterfaceC62872tQ interfaceC62872tQ, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, C41551w4 c41551w4, ReelViewerConfig reelViewerConfig, C3G2 c3g2, C141596ac c141596ac, InterfaceC146046i1 interfaceC146046i1, C140436Wx c140436Wx, InterfaceC145416h0 interfaceC145416h0, int i, int i2) {
        View igImageView;
        C14360o3.A0B(c140436Wx, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c41181vS, 4);
        C14360o3.A0B(interfaceC145416h0, 8);
        C14360o3.A0B(interfaceC146046i1, 9);
        C14360o3.A0B(reelViewerConfig, 10);
        C14360o3.A0B(c3g2, 11);
        C14360o3.A0B(interfaceC60442pS, 12);
        C14360o3.A0B(interfaceC62872tQ, 13);
        c140436Wx.A0k.A0A.A05 = C6TU.A00(context, userSession, c41181vS);
        c140436Wx.A06.A0A.A05 = C6TU.A00(context, userSession, c41181vS);
        A00.A02(interfaceC62872tQ, userSession, interfaceC60442pS, c41181vS, c41551w4, reelViewerConfig, c3g2, c141596ac, interfaceC146046i1, c140436Wx, interfaceC145416h0, i, i2, false, A04(userSession, c41181vS, c41551w4, c140436Wx));
        interfaceC145416h0.Dng(context, c41181vS, c41551w4, c140436Wx, false);
        C71313Hs A002 = C71313Hs.A00(userSession);
        C14360o3.A07(A002);
        ReelViewGroup reelViewGroup = c140436Wx.A0S;
        EnumC71343Hv enumC71343Hv = EnumC71343Hv.A05;
        int i3 = -1;
        if (i > 1) {
            i3 = i2;
        }
        A002.A06(reelViewGroup, enumC71343Hv, i3);
        C38321qM c38321qM = c41181vS.A0b;
        C40I c40i = null;
        if (c38321qM != null) {
            Context context2 = c140436Wx.A0q.getContext();
            A002.A0A(reelViewGroup, new C79623hD(new C139726Ub(context2, userSession, c38321qM), userSession, c38321qM, interfaceC60442pS));
            if (A04(userSession, c41181vS, c41551w4, c140436Wx) && !C5Hu.A03(userSession)) {
                C79623hD c79623hD = new C79623hD(new C139726Ub(context2, userSession, c38321qM), userSession, c38321qM, interfaceC60442pS, "in_app_browser_v2", C16910sj.A00);
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36320446773207554L);
                C139566Tl c139566Tl = c140436Wx.A0Y;
                if (A06) {
                    A002.A0A(c139566Tl.A03, c79623hD);
                } else {
                    A002.A0A(c139566Tl.A04, c79623hD);
                }
            } else {
                C79623hD c79623hD2 = new C79623hD(null, userSession, c38321qM, interfaceC60442pS);
                C139566Tl c139566Tl2 = c140436Wx.A0Y;
                A002.A0A(c139566Tl2.A07, c79623hD2);
                A002.A0A(c139566Tl2.A0F, c79623hD2);
            }
        }
        String str = c41181vS.A0j;
        C14360o3.A07(str);
        ArrayList A003 = AbstractC139736Uc.A00(userSession, c41181vS, c41551w4, c3g2, c141596ac);
        Map A0P = c41551w4.A0H.A0P(c41551w4.A04(userSession, str));
        C14360o3.A07(A0P);
        if (c38321qM != null) {
            c40i = c38321qM.A0C.C1S();
        }
        List list = c41181vS.A0M;
        Map map = C115775Lq.A01;
        if (!map.containsKey(str)) {
            map.put(str, new HashMap());
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : A0P.entrySet()) {
            Object key = entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            if (key == EnumC41091vH.A05) {
                if (!map.containsKey(str)) {
                    map.put(str, new HashMap());
                }
                AbstractMap abstractMap = (AbstractMap) map.get(str);
                if (abstractMap != null) {
                    abstractMap.put("is_end_scene_in_server_options", true);
                }
            }
            if (key == EnumC41091vH.A0Q) {
                if (!map.containsKey(str)) {
                    map.put(str, new HashMap());
                }
                AbstractMap abstractMap2 = (AbstractMap) map.get(str);
                if (abstractMap2 != null) {
                    abstractMap2.put("is_v2c_in_server_options", true);
                }
            }
            arrayList.add(String.valueOf(intValue));
        }
        AbstractMap abstractMap3 = (AbstractMap) map.get(str);
        if (abstractMap3 != null) {
            abstractMap3.put("server_cop_options", arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = A003.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            Object obj = ((AbstractMap) next).get("option_value");
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        if (!map.containsKey(str)) {
            map.put(str, new HashMap());
        }
        AbstractMap abstractMap4 = (AbstractMap) map.get(str);
        if (abstractMap4 != null) {
            abstractMap4.put("client_cop_options", arrayList2);
        }
        if (c40i != null && c40i.B21() != null) {
            if (!map.containsKey(str)) {
                map.put(str, new HashMap());
            }
            Integer B21 = c40i.B21();
            C14360o3.A0C(B21, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = B21.intValue();
            AbstractMap abstractMap5 = (AbstractMap) map.get(str);
            if (abstractMap5 != null) {
                abstractMap5.put("end_scene_duration", Double.valueOf(intValue2));
            }
        }
        if (list != null) {
            if (!map.containsKey(str)) {
                map.put(str, new HashMap());
            }
            AbstractMap abstractMap6 = (AbstractMap) map.get(str);
            if (abstractMap6 != null) {
                abstractMap6.put("video_to_carousel_start_times", list);
            }
        }
        if (AbstractC130925vf.A0N(userSession, c41181vS, c41551w4)) {
            IgProgressImageView igProgressImageView = c140436Wx.A0U.A02;
            if (igProgressImageView != null) {
                igImageView = igProgressImageView.getIgImageView();
            } else {
                return;
            }
        } else {
            if (c41181vS.A1o()) {
                return;
            }
            if (AbstractC130925vf.A0f(c41551w4.A08(userSession))) {
                igImageView = c140436Wx.A0n.A01.getView().getRootView();
            } else {
                igImageView = c140436Wx.A0L.getIgImageView();
            }
            C14360o3.A0A(igImageView);
        }
        AbstractC77703du.A05(igImageView, EnumC77673dr.A0K);
    }

    public static final void A03(InterfaceC62872tQ interfaceC62872tQ, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, ReelViewerConfig reelViewerConfig, C3G2 c3g2, C140436Wx c140436Wx, int i, int i2) {
        C14360o3.A0B(c140436Wx, 0);
        C14360o3.A0B(interfaceC62872tQ, 2);
        C14360o3.A0B(c41181vS, 5);
        C14360o3.A0B(c3g2, 6);
        C6TR c6tr = A00;
        C141596ac c141596ac = new C141596ac(true);
        InterfaceC145416h0 interfaceC145416h0 = C28152Caz.A00;
        c6tr.A02(interfaceC62872tQ, userSession, new P2S(), c41181vS, c41551w4, reelViewerConfig, c3g2, c141596ac, InterfaceC146046i1.A01, c140436Wx, interfaceC145416h0, i, i2, true, false);
    }

    public static final boolean A04(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C140436Wx c140436Wx) {
        int i;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM == null) {
            return false;
        }
        User user = c41181vS.A0i;
        if (user != null && user.A2N()) {
            if (AbstractC141736aq.A02(c41551w4)) {
                i = c41551w4.A01();
            } else {
                i = -1;
                if (c38321qM.A5M()) {
                    i = 0;
                }
            }
            Context context = c140436Wx.A0q.getContext();
            C14360o3.A07(context);
            if (!C6Qi.A01(context, userSession, c38321qM, i) || C18U.A06(C06090Tz.A05, userSession, 36318818981190152L)) {
                return false;
            }
            return true;
        }
        return C5Hu.A01(c38321qM.A0C.AqQ(), userSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:1027:0x2fc9, code lost:
    
        if (X.C18U.A06(r35, r69, 36327524880366232L) == false) goto L1858;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1044:0x3004, code lost:
    
        if (X.C18U.A06(r35, r69, r4) == false) goto L1876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1056:0x3021, code lost:
    
        if (r49 == null) goto L1889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1065:0x3035, code lost:
    
        if (r3.A2s() != null) goto L1899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1099:0x3098, code lost:
    
        if (r12 != false) goto L1933;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1100:0x309a, code lost:
    
        r26 = java.lang.Integer.valueOf((int) X.C18U.A01(r35, r69, 36608999857329975L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:1101:0x30aa, code lost:
    
        r4 = X.AbstractC84863qa.A05(r33, r69, r71, java.lang.Boolean.valueOf(r52), r26, r42).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:1108:0x310f, code lost:
    
        if (X.AbstractC001900j.A08(r4, r2, 0, false) != 0) goto L1942;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1112:0x3118, code lost:
    
        if (r58 != false) goto L1947;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1116:0x312b, code lost:
    
        if (X.C14360o3.A0K(r11, true) == false) goto L1952;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1190:0x3232, code lost:
    
        if (((r2 == null || (r2 = r2.AtW()) == null) ? null : r2.Atk()) == com.instagram.api.schemas.MoreInfoStickerCTAType.A0A) goto L2001;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1293:0x3c60, code lost:
    
        if (r2.Atk() == com.instagram.api.schemas.MoreInfoStickerCTAType.A04) goto L2366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1294:0x3c62, code lost:
    
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1366:0x3e42, code lost:
    
        if (r2.booleanValue() != false) goto L2366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1443:0x3681, code lost:
    
        if (r4 != 4) goto L2140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1457:0x3096, code lost:
    
        if (r13 != false) goto L1933;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1478:0x3078, code lost:
    
        if (r2.isEmpty() != false) goto L1921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1480:0x37cc, code lost:
    
        if (r5 != com.instagram.api.schemas.MoreInfoStickerCTAType.A04) goto L1911;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1514:0x3e88, code lost:
    
        if (X.AbstractC130925vf.A0a(r71) != false) goto L2438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1521:0x3ea0, code lost:
    
        if (r3 != false) goto L2446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04a3, code lost:
    
        if (X.C18U.A06(r35, r2, 36320850500330431L) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1569:0x4012, code lost:
    
        if (r4.A05.CWW() != false) goto L2490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1600:0x2abf, code lost:
    
        if (X.C18U.A06(r35, r2, 36326859159386277L) == false) goto L1656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1611:0x2b1f, code lost:
    
        if (r14 != false) goto L1668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1619:0x2b3d, code lost:
    
        if (r14 != false) goto L1677;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1700:0x05c6, code lost:
    
        if (r3 != null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1702:0x05c1, code lost:
    
        if (r3 != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1767:0x088b, code lost:
    
        if (r3 != null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1975:0x0cf0, code lost:
    
        if (r10 == 6) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2094:0x1077, code lost:
    
        if (r4.isCancelled() == false) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2098:0x1083, code lost:
    
        if (r4.isDone() == false) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2229:0x138c, code lost:
    
        if (r4.length() == 0) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2553:0x188a, code lost:
    
        if (r9.isVerified() != true) goto L952;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2558:0x189c, code lost:
    
        if (r5.isVerified() != true) goto L958;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2580:0x1935, code lost:
    
        if (r5.getUsername().length() == 0) goto L981;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2592:0x1a57, code lost:
    
        if (r15 != false) goto L1028;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2645:0x1ab2, code lost:
    
        if (r9 == false) goto L1042;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2686:0x1af5, code lost:
    
        if (r9 != null) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x1ef3, code lost:
    
        if (r14 != null) goto L1212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x20ee, code lost:
    
        if (r4 != null) goto L1274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x2251, code lost:
    
        if (r4 != null) goto L1274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x4064, code lost:
    
        r0 = "subtitleEnlargedView";
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x1fdf, code lost:
    
        if (r14 != null) goto L1212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r71.A0g == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x26ce, code lost:
    
        if (r9 != null) goto L1492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x2a8f, code lost:
    
        if (r38 != null) goto L1561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:972:0x3ab6, code lost:
    
        if (r11 != null) goto L2313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:979:0x3ae9, code lost:
    
        if (r33 != false) goto L1764;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1015:0x2f5b  */
    /* JADX WARN: Removed duplicated region for block: B:1046:0x3009  */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x302e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1067:0x303a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x3044 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1088:0x3086  */
    /* JADX WARN: Removed duplicated region for block: B:1139:0x31d0  */
    /* JADX WARN: Removed duplicated region for block: B:1146:0x31e5  */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x369e  */
    /* JADX WARN: Removed duplicated region for block: B:1149:0x36a6  */
    /* JADX WARN: Removed duplicated region for block: B:1297:0x3c6c  */
    /* JADX WARN: Removed duplicated region for block: B:1302:0x3c8d  */
    /* JADX WARN: Removed duplicated region for block: B:1343:0x3dc9  */
    /* JADX WARN: Removed duplicated region for block: B:1487:0x37e3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:1513:0x3e83  */
    /* JADX WARN: Removed duplicated region for block: B:1520:0x3e9b  */
    /* JADX WARN: Removed duplicated region for block: B:1524:0x3ead  */
    /* JADX WARN: Removed duplicated region for block: B:1527:0x3ebe  */
    /* JADX WARN: Removed duplicated region for block: B:1531:0x3ecd  */
    /* JADX WARN: Removed duplicated region for block: B:1550:0x3f69  */
    /* JADX WARN: Removed duplicated region for block: B:1558:0x3fb8  */
    /* JADX WARN: Removed duplicated region for block: B:1568:0x400c  */
    /* JADX WARN: Removed duplicated region for block: B:1578:0x29b5  */
    /* JADX WARN: Removed duplicated region for block: B:1597:0x2aa1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:1837:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:2042:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:2056:0x411e  */
    /* JADX WARN: Removed duplicated region for block: B:2058:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:2187:0x1238  */
    /* JADX WARN: Removed duplicated region for block: B:2195:0x1273  */
    /* JADX WARN: Removed duplicated region for block: B:2198:0x12ae  */
    /* JADX WARN: Removed duplicated region for block: B:2205:0x131c  */
    /* JADX WARN: Removed duplicated region for block: B:2208:0x1327  */
    /* JADX WARN: Removed duplicated region for block: B:2225:0x1382  */
    /* JADX WARN: Removed duplicated region for block: B:2228:0x1387  */
    /* JADX WARN: Removed duplicated region for block: B:2238:0x13a4  */
    /* JADX WARN: Removed duplicated region for block: B:2241:0x13af  */
    /* JADX WARN: Removed duplicated region for block: B:2249:0x13d4  */
    /* JADX WARN: Removed duplicated region for block: B:2251:0x1426  */
    /* JADX WARN: Removed duplicated region for block: B:2271:0x145c  */
    /* JADX WARN: Removed duplicated region for block: B:2287:0x4178  */
    /* JADX WARN: Removed duplicated region for block: B:2291:0x148d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x1c54  */
    /* JADX WARN: Removed duplicated region for block: B:2332:0x41ce  */
    /* JADX WARN: Removed duplicated region for block: B:2338:0x41ef  */
    /* JADX WARN: Removed duplicated region for block: B:2347:0x422d  */
    /* JADX WARN: Removed duplicated region for block: B:2349:0x423d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:2353:0x42ee  */
    /* JADX WARN: Removed duplicated region for block: B:2360:0x432c  */
    /* JADX WARN: Removed duplicated region for block: B:2365:0x433c  */
    /* JADX WARN: Removed duplicated region for block: B:2367:0x4335  */
    /* JADX WARN: Removed duplicated region for block: B:2369:0x4346  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x1d0e  */
    /* JADX WARN: Removed duplicated region for block: B:2381:0x1563 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:2425:0x16a7  */
    /* JADX WARN: Removed duplicated region for block: B:2428:0x16ac  */
    /* JADX WARN: Removed duplicated region for block: B:2458:0x175f  */
    /* JADX WARN: Removed duplicated region for block: B:2500:0x1be8  */
    /* JADX WARN: Removed duplicated region for block: B:2514:0x1c37  */
    /* JADX WARN: Removed duplicated region for block: B:2521:0x17d1  */
    /* JADX WARN: Removed duplicated region for block: B:2649:0x167f  */
    /* JADX WARN: Removed duplicated region for block: B:2653:0x4392  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x1da1  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x1e5b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x1e72  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x1ef1  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x1f14  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x1f4a  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x1fdd  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x2176  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x23a5  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x23bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x24b2  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x24d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x2675  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x2a8c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x2845  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x293f  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x2d2f  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x2dc1  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x2dce  */
    /* JADX WARN: Removed duplicated region for block: B:843:0x2e10  */
    /* JADX WARN: Removed duplicated region for block: B:992:0x2f21  */
    /* JADX WARN: Type inference failed for: r10v153, types: [X.6RN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r13v72, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v1, types: [X.0pO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r41v36, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r42v13, types: [X.6RZ] */
    /* JADX WARN: Type inference failed for: r45v3, types: [X.6RZ] */
    /* JADX WARN: Type inference failed for: r4v1174, types: [X.6RN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v250, types: [X.6UT] */
    /* JADX WARN: Type inference failed for: r4v315, types: [X.6R3] */
    /* JADX WARN: Type inference failed for: r5v309, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v310, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v590, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(X.InterfaceC62872tQ r68, com.instagram.common.session.UserSession r69, final X.InterfaceC60442pS r70, final X.C41181vS r71, final X.C41551w4 r72, com.instagram.model.reels.ReelViewerConfig r73, X.C3G2 r74, final X.C141596ac r75, X.InterfaceC146046i1 r76, X.C140436Wx r77, final X.InterfaceC145416h0 r78, int r79, int r80, boolean r81, boolean r82) {
        /*
            Method dump skipped, instructions count: 17348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6TR.A02(X.2tQ, com.instagram.common.session.UserSession, X.2pS, X.1vS, X.1w4, com.instagram.model.reels.ReelViewerConfig, X.3G2, X.6ac, X.6i1, X.6Wx, X.6h0, int, int, boolean, boolean):void");
    }
}
